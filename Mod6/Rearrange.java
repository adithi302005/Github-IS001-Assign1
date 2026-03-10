package Mod6;

public class Rearrange {

        public static void main(String[] args) {
            int arr[] = {1,-2,3,-4,5};

            for(int i=0;i<arr.length;i++){
                if(arr[i]<0){
                    int temp=arr[i];
                    arr[i]=arr[0];
                    arr[0]=temp;
                }
            }

            for(int i:arr)
                System.out.print(i+" ");
        }
    }

