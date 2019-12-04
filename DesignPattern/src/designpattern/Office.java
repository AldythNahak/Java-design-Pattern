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
public class Office implements Interface{

    @Override
    public void Menu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println("\nOffice & Stationery:" 
           + "\n-> Alat Tulis"
           + "\n-> Alat Kesenian" 
           + "\n-> Kertas" 
           + "\n-> Document Organizer");
    }
    
}
