class Solution {
    public String intToRoman(int n) {
        int[] num = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num.length; i++){
            while(n >= num[i]){
                sb.append(rom[i]);
                n = n - num[i];
            }
        }
        return sb.toString();
    }
}
