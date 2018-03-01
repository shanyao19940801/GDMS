package com.jianzhi.capter02.c03;

import com.jianzhi.Standard.BinaryTreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2018/3/1.
 * 重建二叉树
 * 根据前序和中序序列（不含有重复的数字），构建一棵二叉树
 */
public class Problem06_重建二叉树 {


    /**
     *
     * @param pre 前序数组
     * @param in  中序数组
     * @param ps 前序开始
     * @param pe    前序结束
     * @param is 中序开始
     * @param ie 中序结束
     * @param point  记录中序位置
     */
    public static BinaryTreeNode rebuild(int[] pre, int[] in, int ps,int pe,int is, int ie, Map<Integer, Integer> point) {

        if (ps > pe) {//前序数组结束
            return null;
        }
        BinaryTreeNode node = new BinaryTreeNode(pre[ps]);//根节点
        int i = point.get(pre[ps]);
        node.left = rebuild(pre,in,ps+1,ps+i-1,is,i-1,point);
        node.right = rebuild(pre,in,ps+1,ps+i-1,is,i-1,point);
    }
    public static void main(String[] args) {
        BinaryTreeNode treeNode = new BinaryTreeNode();

        int[] pre = {1, 2, 4, 5, 3, 6, 7};//前序
        int[] in = {4, 2, 8, 1, 6, 3, 7};//中序
        Map<Integer,Integer> point = new HashMap<Integer,Integer>();
        for (int i = 0; i < in.length; i++) {
            point.put(in[i],i);
        }
        for (int i = 0; i < in.length; i++) {
            if (pre[0] == in[i]) {
                treeNode = rebuild(pre,in,0,pre.length-1,0,in.length-1,point);
            }
        }

    }
}
