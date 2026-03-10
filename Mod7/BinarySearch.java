package Mod7;


    public class BinarySearch {
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,6};
            int key = 4;

            int low=0,high=arr.length-1;

            while(low<=high){
                int mid=(low+high)/2;

                if(arr[mid]==key){
                    System.out.println("Found");
                    break;
                }
                else if(arr[mid]<key)
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
    }

