/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

/**
 *
 * @author User
 */
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Check check = new Check();
        Interface interface1= check.getInterface("Fashion");
        interface1.Menu();
         Interface interface2= check.getInterface("Buku");
        interface2.Menu();
        Interface interface3= check.getInterface("Com");
        interface3.Menu();
        Interface interface4= check.getInterface("Gaming");
        interface4.Menu();
        Interface interface5= check.getInterface("Olahraga");
        interface5.Menu();
        Interface interface6= check.getInterface("Kamera");
        interface6.Menu();
        Interface interface7= check.getInterface("Office");
        interface7.Menu();
        Interface interface8= check.getInterface("Home");
        interface8.Menu();
        Interface interface9= check.getInterface("Otomotif");
        interface9.Menu();
        Interface interface10= check.getInterface("Handphone");
        interface10.Menu();
    }
    
}
