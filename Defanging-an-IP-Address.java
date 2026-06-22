1class Solution {
2    public String defangIPaddr(String address) {
3        StringBuilder sb = new StringBuilder();
4        for(char ch : address.toCharArray()){
5            if(ch == '.'){
6                sb.append("[.]");
7            }
8            else{
9                sb.append(ch);
10            }
11        }
12        return sb.toString();
13    }
14}