class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];

            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }

            stack.push(num);
        }

        int i = 0;
        for (int j = 0; j < nums1.length; j++) {
            result[i] = map.getOrDefault(nums1[j], -1);
            i++;
        }

        return result;
    }
}