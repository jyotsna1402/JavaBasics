import java.util.Scanner;

public class Searching {
    public static int linearSearch(int arr[],int key){
        int steps = 0;
        for(int i=0;i<arr.length;i++){
            steps++;
            if(arr[i]==key){
                System.out.println("Steps taken in linear search :"+steps);
            return i;
            } 
        }
        System.out.println("Steps taken in linear search :"+steps);
        return -1;
    }
    public static int binarySearch(int arr[],int key){
        int start=0,end =arr.length-1;
        int steps = 0;
        while (start<=end) {
            steps++;
            int mid=(start +end)/2;
            if(arr[mid]==key){
                System.out.println("Steps taken in binary search :"+steps);
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println("Steps taken in binary search :"+steps);
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++){
            System.out.print("Element "+ ": "); // indicating element number
            arr[i] = sc.nextInt();
        }
        //display
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(("Element to be searched:"));
        int key=sc.nextInt();
        System.out.println("Linear search result:"+linearSearch(arr,key));
        System.out.println("Binary Search result:"+binarySearch(arr, key));
    }
}
