import java.util.*;
import java.lang.*;
import java.io.*;

public class Array_operations
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        int sum = 0;
        int maxx = arr[0];
        for(int i=0; i<n; i++)
        {
            sum = sum+arr[i];
            if(arr[i]>maxx)
            {
                maxx = arr[i];
            }
        }
        int avg = sum/n ;
        System.out.print(sum +" "+ avg +" "+ maxx);
    }
}

