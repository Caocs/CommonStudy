package com.java.ccs.study.commonstudy.algorithm.p03link;

/**
 * @author caocs
 * @date 2021/12/22
 * 带头结点的双向链表
 */
public class DoubleLinkedList {

    /**
     * 头结点
     */
    private DoubleLinkedNode head;

    public DoubleLinkedList() {
        // 初始化头结点，头结点中不存放数据。
        head = new DoubleLinkedNode(0, null);
    }

    /**
     * @param node 向该链表的尾部添加一个节点
     */
    public void addToRear(DoubleLinkedNode node) {
        // 首先指向头节点，然后依次遍历直到尾部。
        DoubleLinkedNode temp = head;
        while (true) {
            if (temp.getNext() == null) {
                // 到达尾部
                temp.setNext(node);
                node.setPre(temp);
                break;
            }
            temp = temp.getNext();
        }
    }


    /**
     * @param node 根据排名插入节点
     * @return 插入是否成功
     */
    public boolean addByNo(DoubleLinkedNode node) {
        DoubleLinkedNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.getNext() == null) {
                // 插入到尾部
                temp.setNext(node);
                node.setPre(temp);
                flag = true;
                break;
            }
            if (temp.getNext().getNo() > node.getNo()) {
                // temp的下一个节点比node大，则插入在temp后面
                DoubleLinkedNode p = temp.getNext();
                temp.setNext(node);
                node.setPre(temp);
                node.setNext(p);
                p.setPre(node);
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
        DoubleLinkedNode temp = head.getNext();
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
        DoubleLinkedNode temp = head.getNext();
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.getNo() == no) {
                // 双向链表，只需要找对对应的node就可以直接删除。不需要依赖前一个节点。
                DoubleLinkedNode pre = temp.getPre();
                DoubleLinkedNode next = temp.getNext();
                pre.setNext(next);
                if (next != null) {
                    // 不是尾节点
                    next.setPre(pre);
                }
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
            System.out.println("this double linkedList is empty");
            return;
        }
        DoubleLinkedNode temp = head;
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
        DoubleLinkedNode temp = head.getNext();
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
        DoubleLinkedNode newHead = new DoubleLinkedNode(0, null);
        DoubleLinkedNode temp = head.getNext();
        while (true) {
            if (temp == null) {
                break;
            } else {
                DoubleLinkedNode oldNext = temp.getNext();
                DoubleLinkedNode p = newHead.getNext();
                if (p == null) {
                    newHead.setNext(temp);
                    temp.setPre(newHead);
                    temp.setNext(null);
                } else {
                    newHead.setNext(temp);
                    temp.setPre(newHead);
                    p.setPre(temp);
                    temp.setNext(p);
                }
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
    public DoubleLinkedNode getLastKNode(int k) {
        int size = this.size();
        if (k > 0 && k <= size) {
            DoubleLinkedNode temp = head;
            for (int i = 0; i < (size - k); i++) {
                temp = temp.getNext();
            }
            return temp;
        } else {
            return null;
        }
    }

}
