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
public class mod {
     Scanner operasi = new Scanner(System.in);
    private static mod instance = new mod();
    private mod(){}
    
    public static mod getInstance(){
        return instance;
    }
    public void showMessage(){
       float angka1 , angka2,hasil;
        System.out.println("mod");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("masukan nilai angka 1:");
        angka1= operasi.nextFloat();
        System.out.println("masukan bilangan mod:");
        angka2= operasi.nextFloat();
        
        hasil = angka1 % angka2;
        System.out.println("\nHasil mod =  "+hasil+"\n");
    }
}
