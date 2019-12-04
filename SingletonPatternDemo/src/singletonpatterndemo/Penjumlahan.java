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
public class Penjumlahan {
     Scanner operasi = new Scanner(System.in);
    private static Penjumlahan instance = new Penjumlahan();
    private Penjumlahan(){}
    
    public static Penjumlahan getInstance(){
        return instance;
    }
    public void showMessage(){
       float angka1 , angka2,hasil;
        System.out.println("Penjumlahan");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("masukan nilai angka 1:");
        angka1= operasi.nextFloat();
        System.out.println("masukan nilai angka 2:");
        angka2= operasi.nextFloat();
        
        hasil = angka1 + angka2;
        System.out.println("\nHasil penjumlahan = "+hasil+"\n");
    }
}
