package com.java.ccs.study.commonstudy.base.common.compare;

/**
 * @author caocs
 * @date 2021/11/19
 */
public class Goods implements Comparable {
    private String name;
    private int price;

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object object) {
        if (object instanceof Goods) {
            Goods goods = (Goods) object;
            int priceCompare = goods.getPrice() - this.price;
            if (priceCompare == 0) {
                return goods.getName().compareTo(this.name);
            } else {
                return priceCompare;
            }
//            int nameCompare = goods.getName().compareTo(this.name);
//            if (nameCompare == 0) {
//                return goods.getPrice() - this.price;
//            }
//            return nameCompare;
        }
        return 0;
    }
}
