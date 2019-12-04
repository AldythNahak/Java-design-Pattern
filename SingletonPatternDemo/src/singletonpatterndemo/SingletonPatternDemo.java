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
public class SingletonPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilihan;
        Scanner operasi = new Scanner(System.in);
        do{
        System.out.print("1.Perkalian\n ");
        System.out.print("2.Pembagian\n");
        System.out.print("3.Penjumlahan\n");
        System.out.print("4.Pengurangan\n");
        System.out.print("5.mod\n");
        System.out.print("6.Perpangkatan\n\n");
        System.out.print("(untuk berhenti tekan nomor lain selain yang tertera)\n");
        System.out.print("________________________\n");
        System.out.print("masukan pilihan: ");
        pilihan = operasi.nextInt();
        System.out.print("________________________\n");
        switch(pilihan){
        case 1:
             Perkalian object = Perkalian.getInstance();
             object.showMessage();
            break;
         case 2:
         //pembagian
            Pembagian object1 = Pembagian.getInstance();
            object1.showMessage(); 
             break;
         case 3:
             Penjumlahan object2 = Penjumlahan.getInstance();
            object2.showMessage();    
             break;
         case 4:
            Pengurangan object3 = Pengurangan.getInstance();
            object3.showMessage(); 
             break;
         case 5:
            mod object4 = mod.getInstance();
            object4.showMessage(); 
             break;
         case 6:
            Perpangkatan object5 = Perpangkatan.getInstance();
            object5.showMessage(); 
             break;
        }
       }while(0 < pilihan && pilihan <=6);

    }
    
}
