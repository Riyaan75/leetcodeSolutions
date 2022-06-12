public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 2, 2, 2, 2, 3, 1, 2, 1, 3, 3, 1, 2, 2, 2 };
        // int nums[] = { 2, 4, 2, 1, 2, 1, 1, 1, 3 };
        int count = 0;
        int majorityElement = 0;
        int majCount = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
            }
            if (majorityElement == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int e : nums) {
            if (e == majorityElement) {
                count++;
            }
        }
        System.out.println(count > majCount ? "Majority Element " + majorityElement
                : " No Majority Element ");

    }
}