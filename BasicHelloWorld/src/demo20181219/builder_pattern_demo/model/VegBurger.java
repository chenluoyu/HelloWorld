package demo20181219.builder_pattern_demo.model;

import demo20181219.builder_pattern_demo.abstract_model.Burger;

/**
 * 具体的实体类， 蔬菜汉堡
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
