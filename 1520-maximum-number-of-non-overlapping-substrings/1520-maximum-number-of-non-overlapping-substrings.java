class Solution {
    public List<String> maxNumOfSubstrings(String s) {

        int n = s.length();

        int[] first = new int[26];
        int[] last = new int[26];

      
        for (int i = 0; i < 26; i++) {
            first[i] = n;
        }

    
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';

            first[index] = Math.min(first[index], i);
            last[index] = i;
        }

        List<int[]> intervals = new ArrayList<>();

        for (int c = 0; c < 26; c++) {

            if (first[c] == n) {
                continue;
            }

            int start = first[c];
            int end = last[c];

            boolean valid = true;

            for (int i = start; i <= end; i++) {

                int index = s.charAt(i) - 'a';

             
                if (first[index] < start) {
                    valid = false;
                    break;
                }

                
                end = Math.max(end, last[index]);
            }

            if (valid) {
                intervals.add(new int[]{start, end});
            }
        }

       
        intervals.sort((a, b) -> a[1] - b[1]);

        List<String> result = new ArrayList<>();

        int previousEnd = -1;

        for (int[] interval : intervals) {

            int start = interval[0];
            int end = interval[1];

            if (start > previousEnd) {

                result.add(s.substring(start, end + 1));

                previousEnd = end;
            }
        }

        return result;
    }
}