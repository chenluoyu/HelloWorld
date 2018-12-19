package demo20181219.builder_pattern_demo.abstract_model;

import demo20181219.builder_pattern_demo.inteferce.Item;
import demo20181219.builder_pattern_demo.inteferce.Packing;
import demo20181219.builder_pattern_demo.model.Bottle;

/**
 * 抽象类：冷饮
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
