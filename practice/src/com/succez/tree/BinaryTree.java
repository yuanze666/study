package com.succez.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的遍历
 * <p>Copyright: Copyright (c) 2021</p>
 * <p>succez</p>
 * @author caiyuanq
 * @createdate 2021年5月12日
 */
public class BinaryTree {

	/**
	 * 遍历循环二叉树tree，使用Queue队列对每层的节点数据，然后把每层的节点数据添加到ArrayList集合中
	 * 通过ArrayList.get(level)来获取指定层的节点信息
	 */
	 public static String treeLevel(TNode tree, int level) {
		 List<List<String>> ret = new ArrayList<List<String>>();
	        if (tree == null) {
	            return null;
	        }
	        if (level == 1) {
	        	return tree.value;
	        }

	        Queue<TNode> queue = new LinkedList<TNode>();
	        queue.offer(tree);
	        while (!queue.isEmpty()) {
	            List<String> levels = new ArrayList<String>();
	            int currentLevelSize = queue.size();
	            for (int i = 1; i <= currentLevelSize; ++i) {
	                TNode node = queue.poll();
	                levels.add(node.value);
	                if (node.left != null) {
	                    queue.offer(node.left);
	                }
	                if (node.right != null) {
	                    queue.offer(node.right);
	                }
	            }
	            ret.add(levels);
	        }
	        ArrayList<String> result = (ArrayList<String>) ret.get(level-1);
	        
	        return result.toString();

	 }
}
