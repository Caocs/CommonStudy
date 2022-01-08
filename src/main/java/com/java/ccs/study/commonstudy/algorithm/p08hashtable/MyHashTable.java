package com.java.ccs.study.commonstudy.algorithm.p08hashtable;

/**
 * @author caocs
 * @date 2022/1/7
 * <p>
 * 自定义HashTable
 */
public class MyHashTable {
    /**
     * 用来存放MyEntry链表的table数组
     */
    private MyEntry[] table;
    /**
     * 存放数据总个数
     */
    private int count;
    /**
     * table数组长度
     */
    private int capacity = 10;

    public MyHashTable(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
        table = new MyEntry[capacity];
    }

    public int size() {
        return count;
    }

    public void show() {
        for (int i = 0; i < capacity; i++) {
            MyEntry curr = table[i];
            while (curr != null) {
                System.out.println(curr.key + " -> " + curr.value);
                curr = curr.next;
            }
        }
    }

    /**
     * 首先根据hash找到对应数组位置的链表。
     * 如果key存在则更新value，否则头插法插入。
     *
     * @param key   key
     * @param value value
     */
    public void put(Integer key, String value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("Illegal");
        }
        int hash = key % capacity;
        MyEntry entry = new MyEntry(key, value, null);
        if (table[hash] == null) {
            table[hash] = entry;
            count++;
            return;
        }
        MyEntry curr = table[hash];
        while (curr != null) {
            if (key.equals(curr.key)) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }
        // 头插法
        entry.next = table[hash].next;
        table[hash].next = entry;
        count++;
    }

    public String get(Integer key) {
        if (key == null) {
            return null;
        }
        int hash = key % capacity;
        MyEntry curr = table[hash];
        while (curr != null) {
            if (key.equals(curr.key)) {
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }


    /**
     * Hashtable中的链表结构
     */
    private static class MyEntry {
        final Integer key;
        String value;
        MyEntry next;

        protected MyEntry(Integer key, String value, MyEntry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

}
