package chapter06trees;

import java.util.HashMap;
import java.util.HashSet;

public class FindHeightGivenParentsArray {
    static HashMap<Integer,Integer> nodeHeightMap = new HashMap<>();
    //O(n) time complexity solution
    static int heightGivenParentsArray(int[] parents){
        int maxHeight=0;
        nodeHeightMap.put(-1,-1); // Root's parent height is -1, Root's height is 0

        for(int i=0;i<parents.length;i++)
        {
            maxHeight = Math.max(computeHeight(i,parents),maxHeight);
        }
        return maxHeight;
    }

    // Each node's height is computed exactly once
    private static int computeHeight(int node, int[] parents) {
        if(nodeHeightMap.containsKey(node))
            return nodeHeightMap.get(node);    // If you know the height return it;
        int height = computeHeight(parents[node],parents)+1;
        nodeHeightMap.put(node,height);
        return height;
    }
}
