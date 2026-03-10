package Mod6;

public class Subarray {

        public static void main(String[] args) {
            int arr[] = {1,2,3,1,1,1,1};
            int k = 3;

            int sum=0,count=0;

            for(int i=0;i<arr.length;i++){
                sum+=arr[i];

                if(sum==k)
                    count=i+1;

                if(sum>k)
                    sum-=arr[i-count];
            }

            System.out.println(count);
        }
    }

