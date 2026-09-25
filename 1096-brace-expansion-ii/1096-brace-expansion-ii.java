public class Solution {

    public List<String> braceExpansionII(String expression) {
        Set<String> result = parse(expression, new int[]{0});
        List<String> list = new ArrayList<>(result);
        Collections.sort(list);
        return list;
    }

    private Set<String> parse(String expr, int[] index) {
        Set<String> currSet = new HashSet<>();
        Set<String> tempSet = new HashSet<>();
        tempSet.add("");

        while (index[0] < expr.length() && expr.charAt(index[0]) != '}' && expr.charAt(index[0]) != ',') {
            if (expr.charAt(index[0]) == '{') {
                index[0]++;
                Set<String> innerSet = new HashSet<>();
                while (true) {
                    innerSet.addAll(parse(expr, index));
                    if (expr.charAt(index[0]) == '}') {
                        index[0]++; 
                        break;
                    }
                    index[0]++; 
                }
                tempSet = combine(tempSet, innerSet);
            } else {
                Set<String> letterSet = new HashSet<>();
                letterSet.add(String.valueOf(expr.charAt(index[0])));
                tempSet = combine(tempSet, letterSet);
                index[0]++;
            }
        }

        currSet.addAll(tempSet);

      
        while (index[0] < expr.length() && expr.charAt(index[0]) == ',') {
            index[0]++;
            currSet.addAll(parse(expr, index));
        }

        return currSet;
    }

    private Set<String> combine(Set<String> set1, Set<String> set2) {
        Set<String> combined = new HashSet<>();
        for (String s1 : set1) {
            for (String s2 : set2) {
                combined.add(s1 + s2);
            }
        }
        return combined;
    }
}