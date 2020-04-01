package chapter06trees;

public class GenerateStrictBinaryTreeFromPreorderLI {
    private static StringBuilder mutablePreOrder;
    public static BinaryTreeNode generateStrictBinaryTree(String preOrder)
    {
        mutablePreOrder = new StringBuilder(preOrder);
        return generateStrictBinaryTreeHelper();
    }

    private static BinaryTreeNode generateStrictBinaryTreeHelper() {
        String curr = String.valueOf(mutablePreOrder.charAt(0));
        mutablePreOrder.deleteCharAt(0);
        if (curr.equals("L"))
            return new BinaryTreeNode(0);
        BinaryTreeNode node = new BinaryTreeNode(1);
        node.left = generateStrictBinaryTreeHelper();
        node.right = generateStrictBinaryTreeHelper();
        return node;
    }
}
