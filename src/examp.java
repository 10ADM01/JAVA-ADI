import java.util.*;

public class examp{
    public static void main(String[] args){
        int  arr[] ={7,1,2,6,8,9,0};
        bubsort(arr);
        prina(arr);
        System.out.println(" ");
//        selso(arr);
        inssoo(arr);
        prina(arr);


    }
    //buble sort
    static void bubsort(int[] arr){
        int siz= arr.length;
        for(int i=0;i<siz;i++){

            for(int j =0;j<siz-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //reverse buble sort
    static void revbub(int[] arr){
        int siz= arr.length;
        for(int i=0;i<siz;i++){

            for(int j =0;j<siz-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    static void prina(int[] arr){
        for(int i = 0;i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
static void selso(int[] arr){
    //selection sort
    for(int i=0;i<arr.length-1;i++){
        int smallest = i;
        for(int j=i+1;j<arr.length;j++) {
           if(arr[smallest]>arr[j]){
               smallest = j;

        }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;

    }

    //insertionsort




    }
    static void inssoo(int[] arr){
        for(int i = 1;i<arr.length ; i++){
            int curr = arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[i]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }




    }


}