1class Solution {
2    public String defangIPaddr(String address) {
3        StringBuilder sb = new StringBuilder();
4        for(int i = 0; i < address.length(); i++){
5            char ch = address.charAt(i);
6
7            if(ch == '.'){
8                sb.append("[.]");
9            }
10            else{
11                sb.append(ch);
12            }
13        }
14        return sb.toString();
15    }
16}