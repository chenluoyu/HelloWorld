package demo20181219.builder_pattern_demo.model;

import demo20181219.builder_pattern_demo.abstract_model.Burger;

/**
 * 具体的堡类实体：鸡肉汉堡
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
