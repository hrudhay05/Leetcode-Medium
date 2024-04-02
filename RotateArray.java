import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        rotate(a,k);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
        
        public static void rotate(int[] a ,int k){
            k=k%a.length;
            if(k<0){
                k=k+a.length;
            }
            reverse(a,0,a.length-1);
            reverse(a,0,k-1);
            reverse(a,k,a.length-1);
           
        }
        public static void reverse(int[]a,int start,int end){
            while(start<end){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
}
//without main method
