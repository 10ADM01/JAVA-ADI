import java.util.*;
public class choco {
    public static int cho(int arr[],int n,int m){
        Arrays.sort(arr);
        int minn=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff= arr[i+m-1]-arr[i];
            if(diff <minn){
            minn=diff;}
        }
        //System.out.println("the minimum difference is :"+minn);
        return minn;

    }
    public static void main(String args[]){
        Scanner ab=new Scanner(System.in);
        int m = ab.nextInt();
        int n = ab.nextInt();

        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=ab.nextInt();
        }

        System.out.println("the minimum is: " +cho(arr,n,m));
    }
}
