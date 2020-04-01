/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: SiblingBinaryTreeNode.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

public class SiblingBinaryTreeNode {
	public int data;	
	public SiblingBinaryTreeNode left;
	public SiblingBinaryTreeNode right;
	public SiblingBinaryTreeNode nextSibling;
	
	public SiblingBinaryTreeNode(int data){
		this.data = data;
		left = null;
		right = null;
		nextSibling = null;
	}
	public SiblingBinaryTreeNode(int data, SiblingBinaryTreeNode left, SiblingBinaryTreeNode right, SiblingBinaryTreeNode nextSibling){
		this.data = data;
		this.left = left;
		this.right = right;
		this.nextSibling = nextSibling;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SiblingBinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(SiblingBinaryTreeNode left) {
		this.left = left;
	}
	public SiblingBinaryTreeNode getRight() {
		return right;
	}
	public void setRight(SiblingBinaryTreeNode right) {
		this.right = right;
	}
	public SiblingBinaryTreeNode getNextSibling() {
		return nextSibling;
	}
	public void setNextSibling(SiblingBinaryTreeNode nextSibling) {
		this.nextSibling = nextSibling;
	}
	// Sets the data in this BinaryTreeNode node.
	public void setValue(int data) {
		this.data = data;
	}
	// Tests whether this node is a leaf node.
	public boolean isLeaf() {
		return left == null && right == null;
	}

	public static SiblingBinaryTreeNode getSampleSiblingBinaryTree(){
		SiblingBinaryTreeNode node1 = new SiblingBinaryTreeNode(1);
		SiblingBinaryTreeNode node2 = new SiblingBinaryTreeNode(2);
		SiblingBinaryTreeNode node3 = new SiblingBinaryTreeNode(3);
		SiblingBinaryTreeNode node4 = new SiblingBinaryTreeNode(4);
		SiblingBinaryTreeNode node5 = new SiblingBinaryTreeNode(5);
		SiblingBinaryTreeNode node6 = new SiblingBinaryTreeNode(6);
		SiblingBinaryTreeNode node7 = new SiblingBinaryTreeNode(7);
		node2.setLeft(node4);
		node2.setRight(node5);
		//node3.setLeft(node6);
		node3.setRight(node7);
		node1.setLeft(node2);
		node1.setRight(node3);
		return node1;
	}
}
