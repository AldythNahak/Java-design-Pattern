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
public class Fashion implements Interface {
    @Override
    public void Menu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            System.out.println("Fashion:" 
                    + "\n-> Pria"
                    + "\n-> Wanita" 
                    + "\n-> Anak-anak" 
                    + "\n-> Balita");
    }
}
