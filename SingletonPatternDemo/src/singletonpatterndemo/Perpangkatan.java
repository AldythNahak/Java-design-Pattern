/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpatterndemo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Perpangkatan {
         Scanner operasi = new Scanner(System.in);
    private static Perpangkatan instance = new Perpangkatan();
    private Perpangkatan(){}
    
    public static Perpangkatan getInstance(){
        return instance;
    }
    public void showMessage(){
       int angka1 , angka2;
        double hasil;
        System.out.println("Perpangkatan");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("masukan nilai angka 1:");
        angka1= operasi.nextInt();
        System.out.println("masukan bilangan pangkat:");
        angka2= operasi.nextInt();
        
        hasil = Math.pow(angka1,angka2);
        System.out.println("\nHasil pangkat =  "+hasil+"\n");
    }
}
