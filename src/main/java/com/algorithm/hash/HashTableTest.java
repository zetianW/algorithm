package com.algorithm.hash.map;

public class HashTableTest {
    public static void main(String[] args) {
        StuInfo s1 = new StuInfo(16, 4);
        StuInfo s2 = new StuInfo(19, 12);
        StuInfo s3 = new StuInfo(20, 15);
        StuInfo s4 = new StuInfo(17, 7);
        StuInfo s5 = new StuInfo(18, 5);

        //将数据存入HashTable中
        HashTable ht = new HashTable();
        ht.put(s1);
        ht.put(s2);
        ht.put(s3);
        ht.put(s4);
        ht.put(s5);
        //获取目标数据
        StuInfo target = new StuInfo(18);
        StuInfo info = ht.get(target);
        System.out.println(info);

    }
}
