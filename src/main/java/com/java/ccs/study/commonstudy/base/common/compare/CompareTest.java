package com.java.ccs.study.commonstudy.base.common.compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 * @author caocs
 * @date 2021/11/19
 */
public class CompareTest {

    /**
     * String类默认实现了Comparable接口
     */
    @Test
    public void test01() {
        String[] arr = new String[]{"AA", "CC", "JJ", "DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 自定义类实现Comparable接口，重写compareTo方法
     * 自然排序
     */
    @Test
    public void test02() {
        Goods[] goodsArray = new Goods[4];
        goodsArray[0] = new Goods("AA", 2);
        goodsArray[1] = new Goods("CC", 1);
        goodsArray[2] = new Goods("FF", 2);
        goodsArray[3] = new Goods("AA", 20);

        // 由于Goods类实现了Comparable接口，所以才可以被Arrays.sort(goodsArray)直接调用。
        Arrays.sort(goodsArray);
        System.out.println(Arrays.toString(goodsArray));
    }

    /**
     * 使用Comparator接口.
     * 自定义Comparator接口的实现。
     */
    @Test
    public void test03() {
        // 自定义比较器
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

        Goods[] goodsArray = new Goods[4];
        goodsArray[0] = new Goods("AA", 2);
        goodsArray[1] = new Goods("CC", 1);
        goodsArray[2] = new Goods("FF", 2);
        goodsArray[3] = new Goods("AA", 20);

        // 使用自定义的比较器进行排序
        Arrays.sort(goodsArray, goodsComparator);
        System.out.println(Arrays.toString(goodsArray));

        Collection collection;
    }

}
