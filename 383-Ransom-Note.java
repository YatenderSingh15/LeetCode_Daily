class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(Character ch : ransomNote.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(Character ch : magazine.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        for(char key : map1.keySet()){
            int value1 = map1.get(key);
            int value2 = map2.getOrDefault(key,0);
            if(value1 > value2){
                return false;
            }
        }
        return true;
    }
}