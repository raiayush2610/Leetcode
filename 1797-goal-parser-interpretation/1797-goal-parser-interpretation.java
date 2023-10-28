class Solution {
    public String interpret(String c) {
        StringBuilder sb = new StringBuilder();
        int l = c.length();
        for(int i = 0; i < l; i++){
            if(c.charAt(i) == '(' && i < l - 1){
                if(c.charAt(i+1) == ')'){
                    sb.append('o');
                }
            }
            else if(c.charAt(i) != '(' && c.charAt(i) != ')'){
                sb.append(c.charAt(i));
            }
        }
        return sb.toString();
    }
}