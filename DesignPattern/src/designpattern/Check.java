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
public class Check {
   public Interface getInterface(String interfaceType){
        if (interfaceType == null){
            return null;
        }
        if (interfaceType.equalsIgnoreCase("Fashion")){
            return new Fashion();
        }else if (interfaceType.equalsIgnoreCase("Buku")){
            return new Buku();
        }else if (interfaceType.equalsIgnoreCase("Com")){
            return new Com();
        }else if (interfaceType.equalsIgnoreCase("Gaming")){
            return new Gaming();
        }else if (interfaceType.equalsIgnoreCase("Olahraga")){
            return new Olahraga();
        }else if (interfaceType.equalsIgnoreCase("Kamera")){
            return new Kamera();
        }else if (interfaceType.equalsIgnoreCase("Office")){
            return new Office();
        }else if (interfaceType.equalsIgnoreCase("Home")){
            return new Home();
        }else if (interfaceType.equalsIgnoreCase("Otomotif")){
            return new Otomotif();
        }else if (interfaceType.equalsIgnoreCase("Handphone")){
            return new Handphone();
        }
        
        
        
        
        return null;
    }
}
