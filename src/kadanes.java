
import java.util.*;
public class kadanes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        arrinp(arr,n);

        int maxi=arr[0];
        int sum=0;
        for(int i=0;i<n;i++){
            sum +=arr[i];
            maxi =Math.max(maxi,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxi);


    }

    public static void arrinp(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
}
