class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
       int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        
        // Step 1: Count the frequency of each number in nums
        int[] count = new int[maxVal + 1];
        for (int num : nums) {
            count[num]++;
        }
        
        // Step 2: Count how many elements are multiples of each number i
        long[] multiplesCount = new long[maxVal + 1];
        for (int i = 1; i <= maxVal; i++) {
            for (int j = i; j <= maxVal; j += i) {
                multiplesCount[i] += count[j];
            }
        }
        
        // Step 3: Compute the exact number of pairs that have GCD equal to i
        // Work backwards from maxVal down to 1
        long[] exactGcdPairs = new long[maxVal + 1];
        for (int i = maxVal; i >= 1; i--) {
            long totalPairsWithDivisor = (multiplesCount[i] * (multiplesCount[i] - 1)) / 2;
            
            // Subtract pairs that have a strictly larger multiple of i as their GCD
            for (int j = 2 * i; j <= maxVal; j += i) {
                totalPairsWithDivisor -= exactGcdPairs[j];
            }
            exactGcdPairs[i] = totalPairsWithDivisor;
        }
        
        // Step 4: Create a prefix sum array of the exact pair counts
        long[] prefixSums = new long[maxVal + 1];
        for (int i = 1; i <= maxVal; i++) {
            prefixSums[i] = prefixSums[i - 1] + exactGcdPairs[i];
        }
        
        // Step 5: Answer each query using binary search
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long targetIndex = queries[i];
            
            // Binary search to find the smallest GCD value that covers targetIndex
            int low = 1, high = maxVal, ans = maxVal;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                // If the total pairs up to 'mid' is strictly greater than the target index,
                // then 'mid' is a candidate GCD value.
                if (prefixSums[mid] > targetIndex) {
                    ans = mid;
                    high = mid - 1; // Try to find a smaller valid GCD
                } else {
                    low = mid + 1;
                }
            }
            answer[i] = ans;
        }
        
        return answer; 
    }
}