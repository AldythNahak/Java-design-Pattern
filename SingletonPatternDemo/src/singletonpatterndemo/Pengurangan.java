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
public class Pengurangan {
     Scanner operasi = new Scanner(System.in);
    private static Pengurangan instance = new Pengurangan();
    private Pengurangan(){}
    
    public static Pengurangan getInstance(){
        return instance;
    }
    public void showMessage(){
       float angka1 , angka2,hasil;
        System.out.println("Pengurangan");
        System.out.println("--------------------------");
        System.out.println("masukan nilai angka 1:");
        angka1= operasi.nextFloat();
        System.out.println("masukan nilai angka 2:");
        angka2= operasi.nextFloat();
        
        hasil = angka1 - angka2;
        System.out.println("\nHasil Pengurangan =  "+hasil+"\n");
    }
}
