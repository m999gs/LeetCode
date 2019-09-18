class Solution {
    public int largestRectangleArea(int[] bars) {
        if (bars == null || bars.length == 0) return 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int n = bars.length;
        int front = 0;
        int max = 0;
        while (front < n) {
            if (stack.isEmpty() || bars[stack.peek()] < bars[front]) {
                stack.push(front);
                front++;
            } else {
                int last = stack.pop();
                int width = stack.isEmpty() ? front : front - (stack.peek() + 1);
                max = Math.max(max, bars[last] * width);
            }
        }
        while (!stack.isEmpty()) {
            int last = stack.pop();
            int width = stack.isEmpty() ? front : front - (stack.peek() + 1);
            max = Math.max(max, bars[last] * width);
        }
        return max;
    }
}