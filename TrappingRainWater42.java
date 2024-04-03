class Solution {
    public int trap(int[] a) {
        int res = 0;
        // for(int i = 1; i < a.length - 1; i++) { 
        //     int lb = a[i];
        //     for(int j = 0; j < i; j++) {
        //         lb = Math.max(lb, a[j]);
        //     }
        //     int rb = a[i];
        //     for(int j = i + 1; j < a.length; j++) {
        //         rb = Math.max(rb, a[j]);
        //     }
        //     int wl = Math.min(lb, rb);
        //     int t = wl - a[i];
        //     res += t;
        // }
        // return res;

        int l=0;
        int r = a.length-1;
        int lhb = a[0];
        int rhb = a[a.length-1];

        while(l<=r){
            if(lhb<=rhb)
            {
                if(a[l]>=lhb){
                    lhb=a[l];
                }
                else{
                    res = res +lhb-a[l];
                }
                l++;
            }
            else{
                if(a[r]>=rhb){
                    rhb=a[r];
                }
                else{
                    res=res+rhb - a[r];
                }
                r--;
            }
        }
        return res;
    }
}
