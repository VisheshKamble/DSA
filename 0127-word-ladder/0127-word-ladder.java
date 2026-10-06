class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if(!wordList.contains(endWord)){
            return 0;
        }

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        int length = 0 ;
        queue.offer(beginWord);
        visited.add(beginWord);

        Set<String> words = new HashSet<>(wordList);

        while(!queue.isEmpty()){
            int size = queue.size();
            length++ ;
            for(int i = 0 ; i < size ; i++){
                String current = queue.poll();

                for(int j = 0 ; j < current.length() ; j++){
                    char temp[] = current.toCharArray();
                    for(char ch ='a' ; ch <= 'z' ; ch++){
                        temp[j] = ch ;
                        String newWord = new String(temp);

                        if(newWord.equals(endWord)){
                            return length + 1;
                        }

                        if(words.contains(newWord) && !visited.contains(newWord)){
                            queue.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }              
            }
        }

        return 0;
        
    }
}