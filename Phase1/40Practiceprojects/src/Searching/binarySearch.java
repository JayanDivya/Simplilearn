package Searching;
public class binarySearch {
    public static  void main(String[] args){
        int[] arr = {3,6,9,12,15};
        int key = 12;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
    }

private static void binarySearch(int[] arr, int i, int key, int arrlength) {
       int midValue = (i+arrlength)/2;
        while(i<=arrlength){

            if(arr[midValue]<key){

                i = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {

                arrlength=midValue-1;
            }
            midValue = (i+arrlength)/2;
        }
            if(i>arrlength){

                System.out.println("Element is not found");
            }
}
}
