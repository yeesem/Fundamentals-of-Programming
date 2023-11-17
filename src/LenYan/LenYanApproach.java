package LenYan;

import java.time.Year;
import java.util.Scanner;

public class LenYanApproach {
    public static void main(String[] args) {
        LenYanApproachClass approach = new LenYanApproachClass();
        approach.result();
    }
}

class LenYanApproachClass {
    double [] netProfit = new double[2];
    String stockName = null;
    double revenue = 0;
    double totalNumShare = 0;
    double dividendYield = 0;
    double currentSharePrice = 0;
    double roe = 0;
    double cashFlow = 0;

    public void header(){
        System.out.println("   Stock's Analysis Program");
        System.out.println("------------------------------");
    }

    public void getData(){
        int currentYear = Year.now().getValue();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter company name            : ");
        stockName = input.nextLine();
        System.out.print("Enter the current share price : RM");
        currentSharePrice = input.nextDouble();
        System.out.print("Enter total number of share   : ");
        totalNumShare = input.nextInt();
        System.out.print("Enter Revenue                 : RM");
        revenue = input.nextDouble();
        System.out.print("Enter dividend yield %        : ");
        dividendYield = input.nextDouble();
        System.out.print("Enter return on equity        : RM");
        roe = input.nextDouble();
        System.out.print("Enter company's cash flow     : RM");
        cashFlow = input.nextDouble();

        int diff = 0;
        for(int i=0;i<2;i++){
            System.out.print("Enter " + (currentYear - diff) + " net profit         : RM");
            netProfit[i] = input.nextDouble();
            diff += 4;
        }

    }
 
    public double CAGR(){
       //[(Ending value / Beginning value) ^ (1/n) - 1] * 100
       int arraySize = netProfit.length;
       double cagr = (Math.pow(netProfit[0]/netProfit[arraySize - 1], (1/5)) -1 ) * 100;
       return cagr;
    }

    public double PERatio(){
        double eps = netProfit[0] / totalNumShare;
        return currentSharePrice / eps;
    }

     public double ProfitMargin(){
        return revenue / netProfit[netProfit.length - 1];
    }

    public int GDP(){
        int GDPMarks = 0;
        double cagr = CAGR();
        double pe = PERatio();

        if(cagr < 1)                    GDPMarks = 0;
        else if(cagr >=1 && cagr <=5)   GDPMarks = 20;
        else if(cagr >=6 && cagr <=9)   GDPMarks = 30;
        else if(cagr >=10 && cagr <=14) GDPMarks = 40;
        else                            GDPMarks = 50;

        if(dividendYield < 1)                             GDPMarks += 0;
        else if(dividendYield >=1 && dividendYield <=2)   GDPMarks += 5;
        else if(dividendYield >=3 && dividendYield <=4)   GDPMarks += 10;
        else if(dividendYield >=5 && dividendYield <=6)   GDPMarks += 15;
        else                                              GDPMarks += 20;

        if(pe < 1)                  GDPMarks += 0;
        else if(pe >=1 && pe <=9)   GDPMarks += 20;
        else if(pe >=10 && pe <=15) GDPMarks += 15;
        else if(pe >=16 && pe <=24) GDPMarks += 10;
        else                        GDPMarks += 5;

        return GDPMarks;

    }

     public int PRC(){
        int PRCMarks = 0;
        double profitMargin = ProfitMargin();
        double profit = netProfit[0];

        if(profitMargin < 1)                             PRCMarks = 0;
        else if(profitMargin >=1  && profitMargin <=5)   PRCMarks = 5;
        else if(profitMargin >=6  && profitMargin <=9)   PRCMarks = 10;
        else if(profitMargin >=10 && profitMargin <=15)  PRCMarks = 15;
        else                                             PRCMarks = 20;

        if(roe < 1)                   PRCMarks += 0;
        else if(roe >=1 && roe <=5)   PRCMarks += 10;
        else if(roe >=6 && roe <=10)  PRCMarks += 20;
        else if(roe >=11 && roe <=15) PRCMarks += 30;
        else                          PRCMarks += 40;

        if(profit > 0 && cashFlow >0)         PRCMarks += 40;
        else if(profit <= 0 && cashFlow > 0)  PRCMarks += 30;
        else if(profit > 0 && cashFlow <= 0)  PRCMarks += 10;
        else if(profit <= 0 && cashFlow <= 0) PRCMarks += 1;

        return PRCMarks;
    }

    public void result(){
        Scanner input = new Scanner(System.in);
        header();
        getData();
        int gdp = GDP();
        int prc = PRC();

        System.out.println("\nCompany Name: " + stockName);
        System.out.println("-----------------------------");
        System.out.println("GDP + PRC = WEALTH");
        System.out.println("GDP : " + gdp + " - " + ((gdp < 50)?"FAIL" : "PASS"));
        System.out.println("PRC : " + prc + " - " + ((prc < 50)? "FAIL" : "PASS"));
        System.out.println("System Recommendation : " + ((gdp >= 50 && prc>=50)? "BUY" : "SELL"));

        System.out.println();

        System.out.print("Enter '1' to show analysis : ");
        char analysis = input.next().charAt(0);
        if(analysis == '1')
           showDetails(gdp,prc);
        
        System.out.println("\nThank you.");
    }

    public void showDetails(int gdp,int prc){
        System.out.println("\nStock Analysis - " + stockName);
        System.out.println("---------------------------------");
        System.out.println("GDP : " + gdp + "(" + ((gdp < 50)?"FAIL" : "PASS") + ")");
        System.out.println("Growth rate      : " + CAGR() + " - " + ((CAGR() < 5)? "Unhealty Growth Rate" : "Healthy Growth Rate"));
        System.out.println("Dividend yield   : " + dividendYield + " - "+ ((dividendYield < 4)? "Lower than Avg Interest Rate" : "High dividend yield"));
        System.out.println("PE Ratio         : " + PERatio() + " - " + ((PERatio() < 25)? "Undervalued" : "Overvalued"));

        System.out.println();

        System.out.println("PRC : " + prc + "(" + ((prc < 50)?"FAIL" : "PASS") + ")");
        System.out.println("Profit Margin    : " + ProfitMargin());
        System.out.println("Return on Equity : " + roe );
        System.out.println("Cash Flow        : " + ((netProfit[0]>0 && cashFlow>0 )? "Healthy Cash Flow" : "Unhealthy Cash Flow"));
    }
    
}
