/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: PrintAllAncestors.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

public class PrintAllAncestors {
	public static boolean printAllAncestors(BinaryTreeNode root, BinaryTreeNode node){
		if(root == null) 
			return false;
		if(root.getLeft() == node || root.getRight() == node || 
			printAllAncestors(root.getLeft(), node) || printAllAncestors(root.getRight(), node)) {
			System.out.println(root.getData());
			return true;
		}
		return false;
	}
	public static void AdiPrintAllAncestors(BinaryTreeNode root, Integer data){
		AdiPrintAllAncestorsHelper(root,data,"");
	}

	private static void AdiPrintAllAncestorsHelper(BinaryTreeNode root, Integer data, String path){
		if(root == null)
			return;
		path+=root.getData()+" ";
		if (root.getData() == data)
		{
			System.out.println(path);
			return;
		}
		AdiPrintAllAncestorsHelper(root.getLeft(),data,path);
		AdiPrintAllAncestorsHelper(root.getRight(),data,path);
	}
}
