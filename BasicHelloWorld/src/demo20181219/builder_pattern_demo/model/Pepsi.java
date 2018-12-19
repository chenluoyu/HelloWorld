package demo20181219.builder_pattern_demo.model;

import demo20181219.builder_pattern_demo.abstract_model.ColdDrink;

/**
 * 冷饮的具体实体：百事可乐
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
