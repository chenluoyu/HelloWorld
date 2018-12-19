package demo20181219.builder_pattern_demo.model;

import demo20181219.builder_pattern_demo.inteferce.Packing;

/**
 * 包装类 实体，袋装、纸装等
 */
public class Wrapper implements Packing {


    @Override
    public String pack() {
        return "Wrapper";
    }
}
