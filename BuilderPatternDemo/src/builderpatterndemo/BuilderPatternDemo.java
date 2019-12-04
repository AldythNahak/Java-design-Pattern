/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterndemo;

/**
 *
 * @author User
 */
public class BuilderPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal VegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Vegetarian Meal");
        VegMeal.showItems();
        System.out.println("Total Cost: "+VegMeal.getCost());
        
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon Vegetarian Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: "+nonVegMeal.getCost());
    }
    
}
