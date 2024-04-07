class sum {
    public static void main(String args[]) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        for (int i = 0; i <= nums.length + 1; i++) {
            for (int j = 0; nums.length + 1; j--) {
                if (nums[i] + nums[j] == 9) {
                    System.out.println(nums[i], nums[j]);
                }
            }
        }
    }
}