package demo20181219.builder_pattern_demo.model;

import demo20181219.builder_pattern_demo.inteferce.Packing;

/**
 * 包装类 实体，瓶装
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
