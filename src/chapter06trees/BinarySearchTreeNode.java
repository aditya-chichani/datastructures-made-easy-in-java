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

import java.util.ArrayList;

public class BinarySearchTreeNode extends BinaryTreeNode{
	int data;
	BinarySearchTreeNode left;
	BinarySearchTreeNode right;
	static ArrayList<BinarySearchTreeNode> info = new ArrayList<>();
	static BinarySearchTreeNode predecessor;
	static int flag=0;

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

	public static BinaryTreeNode AdiDeleteInBST(BinarySearchTreeNode root,int data)
	{
		BinarySearchTreeNode nodeParent = AdiDeleteInBSTHelper(root,null,data);
	}

	private static BinarySearchTreeNode AdiDeleteInBSTHelper(BinarySearchTreeNode root, BinarySearchTreeNode parent, int data) {
		if(root == null)
		{
			return parent;
		}
		BinarySearchTreeNode ans = AdiDeleteInBSTHelper(root.left,root,data);
		if(flag == 1)
			return ans;
		if(root.data == data)
		{  flag
			return parent;
		}
		predecessor = root;

	}

}

