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

//        getData(1,2,3);

        scanBreakMethod();
    }

    /**
     * 测试一种语法，来源为String.toUpperCase
     * 此语法可以跳出多重循环
     */
    static void scanBreakMethod(){
        System.out.println("START");
        a: {
            for (int i = 0; i < 10; i++ ) {
                System.out.println("START-" + i + "---------------");
                for (int j = 0; j < 10; j++) {
                    System.out.println(j);
                    if (j == 3) {
//                        break a;
                        break ;
                    }
                }
                System.out.println("END-" + i + "---------------");
            }
        }
        System.out.println("END");
    }

    /**
     * 测试 多参数的时候是否可以循环
     * @param numbers
     */
    static void getData(Integer... numbers){
        for (Integer i : numbers){
            System.out.println(i);
        }
    }

}
