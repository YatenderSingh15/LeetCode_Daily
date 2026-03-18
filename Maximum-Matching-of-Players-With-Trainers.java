1class Solution {
2    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
3        Arrays.sort(players);
4        Arrays.sort(trainers);
5        int i = 0;
6        int j = 0;
7        int matchings = 0;
8        while(i < players.length && j < trainers.length){
9            if(players[i] <= trainers[j]){
10                matchings++;
11                i++;
12                j++;
13            }
14            else{
15                j++;
16            }
17        }
18        return matchings;
19    }
20}