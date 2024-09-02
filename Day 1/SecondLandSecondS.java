// 100 day challenge
// Day 1
// Question 2: Find Second Smallest and Second Largest Element in an array
// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

// class SecondLandSecondS
// {
//   public static void main(String args[])
//   {
//     Scanner sc= new Scanner(System.in);
//     int size = sc.nextInt();
//     int a[]= new int[size];
//     for(int i=0;i<a.length;i++)
//     {
//       a[i]=sc.nextInt();
//     }
//     System.out.println("The second smallest number is " + Largesmall(a[1]));
//     System.out.println("The second largest number is " + Largesmall(a[a.length-1]));
//   }
//     int Largesmall(int arr[])
//     {
//       int t;
//       for(int i=0;i<arr.length;i++)
//       {
//       if(arr[i]>arr[i+1]
//          {
//            t=arr[i];
//            arr[i]=arr[i+1];
//            arr[i+1]=t;
//          }
//       }
//       return 0;
//     }
// }
import java.util.*;
class SecondLandSecondS
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int a[]= new int[n];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
     int sL= secondLargest(a,n);
     int sS= secondSmallest(a,n);
     System.out.println("Second smallest is "+sS);
     System.out.println("Second largest is "+sL);
  }
  static int secondLargest(int arr[], int n)
     {
        if(n<2)
        return -1;
        int largest=Integer.MIN_VALUE; 
        int seclargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
          if(arr[i]> largest)
          {
             seclargest=largest;
             largest=arr[i];
          }
          else if(arr[i] >seclargest && arr[i]!=largest)
             {
              seclargest=arr[i];
             }
        }
       return seclargest;
     }
   
     static int secondSmallest(int arr[], int n)
   { 
        if(n<2)
        return -1;
        int smallest=Integer.MAX_VALUE; 
        int secsmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
          if(arr[i] < smallest)
          {
             secsmallest=smallest;
             smallest=arr[i];
          }
          else if(arr[i] < secsmallest && arr[i]!=smallest)
             {
              secsmallest=arr[i];
             }
        }
       return secsmallest;
      }

    }