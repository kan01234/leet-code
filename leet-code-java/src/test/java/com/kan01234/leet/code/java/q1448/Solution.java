package com.kan01234.leet.code.java.q1448;

import com.kan01234.leet.code.java.common.model.TreeNode;

public class Solution {
    private int ans;

    /**
     * Returns the number of good nodes in the binary tree.
     *
     * The algorithm uses a depth-first search (DFS) to traverse the binary tree.
     * It keeps track of the maximum value encountered in the path from the root to the current node.
     * If the value of the current node is greater than or equal to the maximum value encountered so far, the node is considered good, and the answer is incremented.
     * The DFS continues to the left and right subtrees, updating the maximum value as it traverses down the tree.
     *
     * @param root The root node of the binary tree.
     * @return The number of good nodes in the binary tree.
     *
     * @implNote The time complexity of this algorithm is O(N), where N is the number of nodes in the binary tree.
     * The algorithm visits each node once during the depth-first search.
     *
     * @implNote The space complexity of this algorithm is O(H), where H is the height of the binary tree.
     * In the worst case, the DFS call stack can grow up to the height of the tree.
     *
     * @see <a href="https://leetcode.com/problems/count-good-nodes-in-binary-tree/">LeetCode Problem 1448</a>
     */
    public int goodNodes(TreeNode root) {
        int ans = 0; // The number of good nodes
        dfs(root, -10000); // Start the depth-first search with the minimum value as the initial maximum
        return ans;
    }

    /**
     * Depth-first search (DFS) helper function to find the number of good nodes in the binary tree.
     *
     * @param root The current node in the DFS traversal.
     * @param mx   The maximum value encountered so far in the path from the root to the current node.
     */
    private void dfs(TreeNode root, int mx) {
        if (root == null) {
            return;
        }
        if (mx <= root.val) {
            ++ans; // Increment the number of good nodes if the current node is good
            mx = root.val; // Update the maximum value encountered so far in the path
        }
        dfs(root.left, mx); // Continue the DFS on the left subtree
        dfs(root.right, mx); // Continue the DFS on the right subtree
    }
}
