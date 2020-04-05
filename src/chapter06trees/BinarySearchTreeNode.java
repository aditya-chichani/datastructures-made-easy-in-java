/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter06trees;

import java.util.*;

public class BinarySearchTreeNode extends BinaryTreeNode{
	int data;
	BinarySearchTreeNode left;
	BinarySearchTreeNode right;

	BinarySearchTreeNode(int x) {
		data = x;
		left = null;
		right = null;
	}

	public static BinaryTreeNode AdiInsertInBST(BinaryTreeNode root,int data){
		if(root == null)
		{
			root = new BinaryTreeNode(data);
			return root;
		}
		if(data < root.getData())
			root.left = AdiInsertInBST(root.getLeft(),data);
		 else
			root.right = AdiInsertInBST(root.getRight(),data);
		 return root;
	}
}

