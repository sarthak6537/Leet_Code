class Solution {
    public int[] findEvenNumbers(int[] digits) {

        int[] count = new int[10];

        // Step 1: Count frequency of each digit
        for (int digit : digits) {
            count[digit]++;
        }

        // Step 2: Store valid numbers
        List<Integer> ans = new ArrayList<>();

        // Step 3: Generate all 3-digit even numbers
        for (int num = 100; num <= 998; num += 2) {

            int first = num / 100;
            int second = (num / 10) % 10;
            int third = num % 10;

            // Step 4: Check digit availability
            int[] required = new int[10];

            required[first]++;
            required[second]++;
            required[third]++;

            boolean valid = true;

            for (int i = 0; i < 10; i++) {

                if (required[i] > count[i]) {
                    valid = false;
                    break;
                }
            }

            // Step 5: Add valid number
            if (valid) {
                ans.add(num);
            }
        }

        // Step 6: Convert List to int[]
        return ans.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}