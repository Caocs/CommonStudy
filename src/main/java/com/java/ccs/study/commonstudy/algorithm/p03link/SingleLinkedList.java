package com.java.ccs.study.commonstudy.algorithm.p03link;

import java.util.Stack;

/**
 * @author caocs
 * @date 2021/12/22
 * 带头结点的单链表
 */
public class SingleLinkedList {

    /**
     * 头结点
     */
    private SingleLinkedNode head;

    public SingleLinkedList() {
        // 初始化头结点，头结点中不存放数据。
        head = new SingleLinkedNode(0, null);
    }

    /**
     * @param node 向该单链表的尾部添加一个节点
     */
    public void addToRear(SingleLinkedNode node) {
        // 首先指向头节点，然后依次遍历直到尾部。
        SingleLinkedNode temp = head;
        while (true) {
            if (temp.getNext() == null) {
                // 到达尾部
                temp.setNext(node);
                break;
            }
            temp = temp.getNext();
        }
    }


    /**
     * @param node 根据排名插入节点
     * @return 插入是否成功
     */
    public boolean addByNo(SingleLinkedNode node) {
        SingleLinkedNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.getNext() == null) {
                // 插入到尾部
                temp.setNext(node);
                flag = true;
                break;
            }
            if (temp.getNext().getNo() > node.getNo()) {
                // temp的下一个节点比node大，则插入在temp后面
                SingleLinkedNode p = temp.getNext();
                temp.setNext(node);
                node.setNext(p);
                flag = true;
                break;
            } else if (temp.getNext().getNo() == node.getNo()) {
                // 有相同的no，插入失败
                break;
            } else {
                // 继续向后遍历查找合适的位置
                temp = temp.getNext();
            }
        }
        return flag;
    }


    /**
     * @param no   需要修改的no
     * @param name 需要修改为的name
     * @return 根据no修改name的值，并返回是否修改成功。
     */
    public boolean updateByNo(int no, String name) {
        SingleLinkedNode temp = head.getNext();
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.getNo() == no) {
                temp.setName(name);
                flag = true;
                break;
            } else {
                // 继续向后遍历查找合适的位置
                temp = temp.getNext();
            }
        }
        return flag;
    }

    /**
     * @param no 需要删除的no对应的节点
     * @return 是否找到并删除成功
     */
    public boolean deleteByNo(int no) {
        SingleLinkedNode temp = head;
        boolean flag = false;
        while (true) {
            SingleLinkedNode p = temp.getNext();
            if (p == null) {
                break;
            }
            if (p.getNo() == no) {
                temp.setNext(p.getNext());
                flag = true;
                break;
            } else {
                temp = temp.getNext();
            }
        }
        return flag;
    }

    /**
     * 遍历该单链表
     */
    public void show() {
        if (head.getNext() == null) {
            System.out.println("this single linkedList is empty");
            return;
        }
        SingleLinkedNode temp = head;
        while (true) {
            temp = temp.getNext();
            if (temp == null) {
                break;
            } else {
                System.out.println(temp.toString());
            }
        }
    }

    /**
     * 有效节点个数
     */
    public int size() {
        SingleLinkedNode temp = head.getNext();
        int count = 0;
        while (true) {
            if (temp == null) {
                break;
            } else {
                count++;
                temp = temp.getNext();
            }
        }
        return count;
    }

    /**
     * 翻转
     * 思路：遍历+头插法
     */
    public void reverse() {
        SingleLinkedNode newHead = new SingleLinkedNode(0, null);
        SingleLinkedNode temp = head.getNext();
        while (true) {
            if (temp == null) {
                break;
            } else {
                SingleLinkedNode oldNext = temp.getNext();
                SingleLinkedNode p = newHead.getNext();
                // 插入到新链表的头部
                newHead.setNext(temp);
                temp.setNext(p);
                // 移动到下一个指针
                temp = oldNext;
            }
        }
        head = newHead;
    }

    /**
     * @return 查找单链表中倒数第k个节点
     * 思路：
     * 1.先从头到尾遍历，得到链表长度size
     * 2.然后再从头遍历，找到(size-k)位置的node
     */
    public SingleLinkedNode getLastKNode(int k) {
        int size = this.size();
        if (k > 0 && k <= size) {
            SingleLinkedNode temp = head;
            for (int i = 0; i < (size - k); i++) {
                temp = temp.getNext();
            }
            return temp;
        } else {
            return null;
        }
    }

    /**
     * 逆序打印单链表
     * 方法一：
     * 先将单链表进行反转，然后再打印。(会改变原有单链表的结构)
     * 方式二：
     * 使用栈暂存，然后再打印。
     */
    public void reverseShow() {
        if (head.getNext() == null) {
            return;
        }
        Stack<SingleLinkedNode> stack = new Stack<>();
        SingleLinkedNode cur = head.getNext();
        while (cur != null) {
            stack.push(cur);
            cur = cur.getNext();
        }
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }

}
