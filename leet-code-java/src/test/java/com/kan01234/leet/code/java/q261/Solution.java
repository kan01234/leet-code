package com.kan01234.leet.code.java.q261;

public class Solution {

    public boolean validTree(int n, int[][] edges) {
        int[] parents = new int[n];
        // init parents
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }

        // iterate edges
        for (int[] edge : edges) {
            int e1 = edge[0], e2 = edge[1];
            if (findParent(e1, parents) == findParent(e2, parents)) {
                return false;
            }
            System.out.println(findParent(e1, parents));
            System.out.println(findParent(e2, parents));
            parents[findParent(e2, parents)] = findParent(e1, parents);
            n--;
        }
        // check all the node it connect
        return n == 1;
    }

    private int findParent(int e, int[] parents) {
        // find the parents of e when it is not parent of itself
        if (parents[e] != e) {
            return findParent(parents[e], parents);
        }

        return parents[e];
    }


}
