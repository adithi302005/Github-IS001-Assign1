package Mod6;

public class DifferenceArray {

        public static void main(String[] args) {
            int arr[] = {10,10,10,10,10};
            int l=1,r=3,val=5;

            arr[l]+=val;
            if(r+1<arr.length)
                arr[r+1]-=val;

            for(int i=1;i<arr.length;i++)
                arr[i]+=arr[i-1];

            for(int i:arr)
                System.out.print(i+" ");
        }
    }

