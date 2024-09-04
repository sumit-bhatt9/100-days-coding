

// 100 day challenge
// Day 2
// Question 3: Reverse a given Array
// Problem Statement: You are given an array. The task is to reverse the array and print it. 
// import java.util.*;
// class Rev
// {
//   public static void main(String args[])
//   {
//      Scanner sc= new Scanner(System.in);
//      int n=sc.nextInt();
//      int arr[]=new int[n];
//      for(int i=0;i<n;i++)
//      {
//        arr[i]= sc.nextInt();
//      }
//      reverse(arr,n);
     
//    }
//     static void printArray(int revarr[], int n)
//     {
//       System.out.println("The reverse of the given array is \n" );
//      for(int i=0;i<n;i++)
//      {
//         System.out.print(revarr[i]+" ");
//      }

//     }
//    static void reverse(int a[], int n)
//    {
//      int revarr[]= new int[n];
//      for(int i=a.length-1;i>=0;i--)
//      {
//       revarr[n-i-1] =a[i];
//      }
//       printArray( revarr,n);
//    }
// }

public class Rev {
    //Function to print array
    static void printArray(int arr[], int n) {
       System.out.print("Reversed array is:- \n");
       for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
       }
    }
    //Function to reverse array 
    static void reverseArray(int arr[], int size) {
       int p1 = 0, p2 = size - 1;
       while(p1<p2)
       {
        int temp= arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;
        p1++;
        p2--;
       }
       printArray(arr, size);
    }
    public static void main(String[] args) {
       int n = 6;
       int arr[] = { 6 ,5, 4, 3, 2, 1};
       reverseArray(arr, n);
 
    }
 }  