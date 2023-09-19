import java.util.*;
public class bubblesort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        arrinp(arr,size);
        ssort(arr,size);


    }
    //selection
    public static void ssort(int arr[],int size){
        for(int i = 0;i<size-1;i++){
            int small =i;
            for (int j=i+1;j<size;j++){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        arrout(arr,size);
    }
    //bubble
    public static void bubbles(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println("bubble sorted");
        arrout(arr,size);
    }

    //take input
    public static void arrinp(int arr[],int size){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void arrout(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }


}

