package demo20181219.builder_pattern_demo;

import demo20181219.builder_pattern_demo.model.Meal;
import demo20181219.builder_pattern_demo.pattern.MealBuilder;

/**
 * 建造者模式测试实例
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        /*MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());*/

        getData(1,2,3);
    }

    static void getData(Integer... numbers){
        for (Integer i : numbers){
            System.out.println(i);
        }
    }

}
