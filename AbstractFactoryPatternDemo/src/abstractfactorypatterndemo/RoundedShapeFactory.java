/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypatterndemo;

/**
 *
 * @author User
 */
public class RoundedShapeFactory extends AbstractFactory{

    @Override
   public Shape getShape(String shapeType) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      if (shapeType.equalsIgnoreCase("Rectangle")){
         return new RoundedRectangle();
     }else if (shapeType.equalsIgnoreCase("Square")){
         return new RoundedSquare();
     }
        return null;
    }
    
}
