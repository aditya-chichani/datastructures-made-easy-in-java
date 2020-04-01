package chapter06trees;

public class Main {
    public static void main(String[] args) {

         BinaryTreeNode root = new BinaryTreeNode(7);
        int[] bstElements = {4,9,2,5};
         for(int i =0; i<bstElements.length; i++)
            InsertInBinaryTreeLevelOrder.insertInBinaryTreeLevelOrder(root,bstElements[i]);

        BinaryTreeNode.prettyPrint(root);
       BinarySearchTreeNode.AdiInsertInBST(root,1);
       // checkHowJavaPassesObjectsToMethods(root);
        BinaryTreeNode.prettyPrint(root);

        /*
        PrintAllAncestors.AdiPrintAllAncestors(root,7);
        ZigzagTraversal.AdiZigZag(root);
        VerticalSum.AdiVerticalSum(root);
        */

       /*
        BinaryTreeNode root = GenerateStrictBinaryTreeFromPreorderLI.generateStrictBinaryTree("ILILL");
        BinaryTreeNode.lvlOrder(root);
        System.out.println(root);
        SiblingBinaryTreeNode root = SiblingBinaryTreeNode.getSampleSiblingBinaryTree();
        FillNextSiblingsWithLevelOrder.fillNextSiblings(root);
        FillNextSiblingsWithRecursion.fillNextSiblings(root);
        FillNextSiblingsWithLevelOrder.AdiFillNextSiblings(root);
        int[] parents = {-1,0,1,6,6,0,0,2,7};
        System.out.println(FindHeightGivenParentsArray.heightGivenParentsArray(parents));
        */


    }

    // Java passes objects
    static void checkHowJavaPassesObjectsToMethods(BinaryTreeNode root)
    {
        root.setData(100);
    }
}
