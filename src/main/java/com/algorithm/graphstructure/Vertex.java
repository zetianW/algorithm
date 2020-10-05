package com.algorithm.graphstructure;

/**
 * 定义顶点的类
 * @author Ghost
 */
public class Vertex {
    private String value;
    /**
     * 使用该变量来标识它是否已经是访问了的
     */
    public boolean visited;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Vertex(String value) {
        super();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
