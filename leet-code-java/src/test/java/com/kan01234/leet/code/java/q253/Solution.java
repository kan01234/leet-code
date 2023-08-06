package com.kan01234.leet.code.java.q253;

public class Solution {
    /**
     * Finds the minimum number of conference rooms required to schedule all the meetings.
     *
     * The algorithm uses an array of deltas to represent the changes in the number of ongoing meetings at each time point.
     * It iterates through the input meeting time intervals and increments the delta at the start time and decrements the delta at the end time.
     * The resulting delta array represents the difference in the number of meetings at each time point.
     * By accumulating the deltas and finding the maximum value, the algorithm determines the minimum number of conference rooms needed.
     *
     * @param intervals The array of meeting time intervals where intervals[i] = [starti, endi].
     * @return The minimum number of conference rooms required to schedule all the meetings.
     *
     * @implNote The time complexity of this algorithm is O(N), where N is the total number of meeting time intervals.
     * The algorithm iterates through the input intervals once to compute the deltas and then iterates through the deltas once to find the maximum value.
     *
     * @implNote The space complexity of this algorithm is O(1), meaning it uses constant space.
     * The algorithm uses a fixed-size array of deltas, which is independent of the size of the input.
     *
     */
    public int minMeetingRooms(int[][] intervals) {
        int n = 1000010; // The maximum possible time point (assuming no meeting ends after this time)
        int[] delta = new int[n];

        // Calculate the deltas for each meeting time interval
        for (int[] interval : intervals) {
            ++delta[interval[0]]; // Increment the delta at the start time
            --delta[interval[1]]; // Decrement the delta at the end time
        }

        int res = delta[0]; // Initialize the result with the first delta value
        // Accumulate the deltas and find the maximum value
        for (int i = 1; i < n; ++i) {
            delta[i] += delta[i - 1]; // Accumulate the deltas
            res = Math.max(res, delta[i]); // Find the maximum value
        }
        return res; // The maximum value represents the minimum number of conference rooms needed
    }
}
