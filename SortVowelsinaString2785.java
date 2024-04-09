class Solution {
    public String sortVowels(String s) {
        char[] v = new char[s.length()];
        int index =0;

        for(char c:s.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                v[index++] = c;
            }
        }
        Arrays.sort(v,0,index);

        StringBuilder sb = new StringBuilder();
        index =0;
        for(char c:s.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                sb.append(v[index++]);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}
