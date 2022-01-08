package com.java.ccs.study.commonstudy.algorithm.p08hashtable;

/**
 * @author caocs
 * @date 2022/1/7
 */
public class HashTableDemo {

    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable(10);
        myHashTable.put(1, "ccs01");
        myHashTable.put(2, "ccs02");
        myHashTable.put(1, "ccs01-1");
        myHashTable.put(3, "ccs03");
        System.out.println(myHashTable.size());
        myHashTable.show();
    }
}


