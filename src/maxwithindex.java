import java.util.*;
public class maxwithindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        int max =0;
        int idx =0;
        for(int i=0;i<size; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
                idx=i;
            }

        }
//        int max =0;
//        int idx =0;
//        for(int i=0;i<size;i++){
//            if(arr[i]>max){
//                max = arr[i];
//                idx=i;
//            }
//        }
        System.out.println(max);
        System.out.println(idx);
    }
}
