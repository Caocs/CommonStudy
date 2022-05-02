package com.java.ccs.study.commonstudy.base.common.collection;

import com.java.ccs.study.commonstudy.base.common.compare.Goods;
import org.junit.Test;

import java.util.*;

/**
 * @author caocs
 * @date 2021/11/20
 */
public class Main {

    @Test
    public void test01(){
        LinkedList<String> linkedList = new LinkedList<>();
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Goods> treeSet = new TreeSet<>();

        HashMap<String,String> hashMap = new HashMap<>();

    }

    @Test
    public void test02(){
        TreeSet<Goods> set = new TreeSet<>();
        set.add(new Goods("taozi",10));
        set.add(new Goods("lizi",20));
        set.add(new Goods("shizi",13));
        set.add(new Goods("huazi",30));
        set.add(new Goods("guazi",4));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test03(){
        Comparator<Goods> goodsComparator = new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                int nameCompare = o1.getName().compareTo(o2.getName());
                if (nameCompare == 0) {
                    return o1.getPrice() - o2.getPrice();
                } else {
                    return nameCompare;
                }
            }
        };

        TreeSet<Goods> set = new TreeSet<>(goodsComparator); // 使用定制排序
        set.add(new Goods("taozi",10));
        set.add(new Goods("lizi",20));
        set.add(new Goods("shizi",13));
        set.add(new Goods("huazi",30));
        set.add(new Goods("guazi",4));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    @Test
    public void test04(){
        Map<String,String> map = new HashMap<>();
        Map<String,String> linkedHashMap = new LinkedHashMap<>();

    }

}
