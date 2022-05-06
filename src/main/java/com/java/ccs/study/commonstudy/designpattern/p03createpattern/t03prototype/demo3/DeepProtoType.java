package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t03prototype.demo3;

import java.io.*;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:22 2022/5/6
 */
public class DeepProtoType implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;


    private String name;
    private DeepClone deepClone;


    /**
     * 深拷贝：
     * 方式1：使用clone方法，需要对引用类型的属性单独处理。
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepProtoType deep = (DeepProtoType) super.clone();
        // 对引用类型的属性，单独处理。
        deep.deepClone = (DeepClone) deepClone.clone();
        return deep;
    }

    /**
     * 深拷贝：
     * 方式2：通过对象的序列化实现(推荐)
     * 该类及成员变量所属的类都必须实现Serializable接口，
     * 使用ObjectOutputStream、ObjectInputStream类进行序列化和反序列化。
     */
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 当前这个对象以对象流的方式输出
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            // 关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
