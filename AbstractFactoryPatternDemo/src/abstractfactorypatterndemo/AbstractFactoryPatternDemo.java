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
public class AbstractFactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();
        
       AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        
       Shape shape3 = shapeFactory1.getShape("Rectangle");
       shape3.draw();
       Shape shape4 = shapeFactory1.getShape("Square");
       shape4.draw();
    }
    
}
