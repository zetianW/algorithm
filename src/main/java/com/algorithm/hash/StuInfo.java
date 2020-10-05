package com.algorithm.hash.map;

/**
 * 直接定址法了解散列表
 * @author Ghost
 *
 */
public class StuInfo {
    private int age;
    private int count;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int hashCode(){
        return age;
    }
    public StuInfo(int age, int count) {
        this.age = age;
        this.count = count;
    }
    public StuInfo(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "StuInfo{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }
}
