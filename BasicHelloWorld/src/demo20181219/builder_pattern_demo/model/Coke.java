package demo20181219.builder_pattern_demo.model;

import demo20181219.builder_pattern_demo.abstract_model.ColdDrink;

/**
 * 冷饮的具体实体，可乐
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
