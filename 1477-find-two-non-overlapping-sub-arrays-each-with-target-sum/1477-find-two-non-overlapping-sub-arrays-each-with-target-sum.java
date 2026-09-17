class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;

        int[] best = new int[n];

        int INF = 1000000;

        for (int i = 0; i < n; i++) {
            best[i] = INF;
        }

        int answer = INF;

        int start = 0;
        int sum = 0;

        for (int end = 0; end < n; end++) {

            sum += arr[end];

            while (sum > target) {
                sum -= arr[start];
                start++;
            }

            
            if (sum == target) {

                int length = end - start + 1;

              
                if (start > 0 && best[start - 1] != INF) {
                    answer = Math.min(answer, length + best[start - 1]);
                }

              
                if (end == 0) {
                    best[end] = length;
                } else {
                    best[end] = Math.min(best[end - 1], length);
                }

            } else {

           
                if (end > 0) {
                    best[end] = best[end - 1];
                }
            }
        }

        if (answer == INF) {
            return -1;
        }

        return answer;
    }
}