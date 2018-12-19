package demo20181219.builder_pattern_demo.abstract_model;

import demo20181219.builder_pattern_demo.inteferce.Item;
import demo20181219.builder_pattern_demo.inteferce.Packing;
import demo20181219.builder_pattern_demo.model.Wrapper;

/**
 * 创建 抽象类，汉堡类，提供默认的功能
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
