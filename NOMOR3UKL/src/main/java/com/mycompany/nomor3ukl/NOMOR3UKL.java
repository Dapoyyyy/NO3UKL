/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nomor3ukl;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class NOMOR3UKL {

   


    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        long faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah: " + faktorial);

        input.close();
    }
}
