package com.dataStructures.LeetcodeDailyChallange;

import java.util.ArrayList;
import java.util.List;
class treeNode {
     int val;
      treeNode left;
      treeNode right;
      treeNode() {}
      treeNode(int val) { this.val = val; }
     treeNode(int val, treeNode left, treeNode right) {
         this.val = val;
            this.left = left;
          this.right = right;
      }
  }

public class ModeInBT {
    public int[] findMode(treeNode root) {
        List<Integer> ans = new ArrayList<>();
        // count[0] := currCount
        // count[1] := maxCount
        int[] count = new int[2];

        inorder(root, count, ans);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private treeNode pred = null;

    private void inorder(treeNode root, int[] count, List<Integer> ans) {
        if (root == null)
            return;

        inorder(root.left, count, ans);
        updateCount(root, count, ans);
        inorder(root.right, count, ans);
    }

    private void updateCount(treeNode root, int[] count, List<Integer> ans) {
        if (pred != null && pred.val == root.val)
            ++count[0];
        else
            count[0] = 1;

        if (count[0] > count[1]) {
            count[1] = count[0];
            ans.clear();
            ans.add(root.val);
        } else if (count[0] == count[1]) {
            ans.add(root.val);
        }

        pred = root;
    }
}
