class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>(); //empty string, return empty arraylist
        List<String> list = new ArrayList<>();
        helper("", digits, list);
        return list;
    }
    public void helper(String p, String up, List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        // taking the number corresponding to the first char of string.
        int num = up.charAt(0) - '0';
        // initializing start and end as random char, here it is takesn as '0'
        char s = '0';
        char e = '0';
        // setting up start and end
        // normally until 7, it follows (char)(((num-1) * 3 - 3) + 'a'), but since 7 has 4 characters,
        // adding extra checks to set up start and end.
        if(num == 8 || num == 9){
            s = (char)(((num-1) * 3 - 2) + 'a');
        }else{
            s = (char)(((num-1) * 3 - 3) + 'a');
        }
        if(num == 7 || num == 9){
            e = (char)(s + 4);
        }else{
            e = (char)(s + 3);
        }
        // calling all possible calls by adding each character in current num to previous p.
        for(char i = s; i < e; i++){
            helper(p + i, up.substring(1), list);
        }
    }
}
