import java.util.*;
public class largersmallsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        ArrayList<Integer> odl =  new ArrayList<Integer>();
        ArrayList<Integer> evl=  new ArrayList<Integer>();
        for(int j =0;j<n;j++){
            if(j%2==0){
                evl.add(arr[j]);
            }
            if(j%2!=0){
                odl.add(arr[j]);
            }

        }
        Collections.sort(odl);
        Collections.sort(evl);
        int ol = odl.get(odl.size()-2);
        int el = evl.get(evl.size()-2);
        System.out.println(ol+el);

    }
}

