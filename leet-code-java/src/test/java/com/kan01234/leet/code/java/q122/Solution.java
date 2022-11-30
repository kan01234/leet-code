package com.kan01234.leet.code.java.q122;

/*
 * 122. [Best Time to Buy and Sell Stock
 * II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)
 */

class Solution {

  public int maxProfit(int[] prices) {
    if (prices == null || prices.length == 0)
      return 0;
    int result = 0;
    for (int i = 1; i < prices.length; i++)
      if (prices[i] > prices[i - 1])
        result += prices[i] - prices[i - 1];
    return result;
  }
}
