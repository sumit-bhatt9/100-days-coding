import java.util.*;
public class SmallestElement {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int a[]= new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(SmallE(a));
    }
    static int SmallE(int arr[])
    {
        int small=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];
            }
        }
        return small;
    }
}
