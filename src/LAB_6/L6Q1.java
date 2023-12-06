/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_6;

public class L6Q1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++)
            System.out.print(triangularNumber(i) + " ");
        System.out.println();
    }

    // Return the nth triangular number.
    public static int triangularNumber(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++)
            res += i;
        return res;
    }

}
