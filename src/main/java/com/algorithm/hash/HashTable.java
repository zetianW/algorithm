package com.algorithm.hash.map;

public class HashTable {
    private StuInfo[] data = new StuInfo[50];

    /**
     * 向散列表中添加元素
     * @param stuInfo
     */
    public void put(StuInfo stuInfo){
        //调取散列函数，获取存储位置
        int index = stuInfo.hashCode();
        //添加元素
        data[index] =stuInfo;
    }

    public StuInfo get(StuInfo stuInfo){
        return data[stuInfo.hashCode()];
    }

}
