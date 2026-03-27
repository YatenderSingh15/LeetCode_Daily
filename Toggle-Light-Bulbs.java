1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        boolean[] state = new boolean[101];
4        for(int bulb : bulbs){
5            state[bulb] = !state[bulb];
6        }
7        List<Integer> result = new ArrayList<>();
8        for(int i = 1; i <= 100; i++){
9            if(state[i]){
10                result.add(i);
11            }
12        }
13        return result;
14    }
15}