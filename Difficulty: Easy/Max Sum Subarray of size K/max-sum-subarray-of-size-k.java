class Solution {
    public int maxSubarraySum(int[] arr, int k) {

        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        int max_sum = sum;
        for(int j = k; j < arr.length; j++){
            sum = sum + arr[j] - arr[j - k];
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }
}