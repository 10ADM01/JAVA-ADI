//public class arrayexe {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5};
//        System.out.println(exear(arr));
//    }
//    public static int[] exear(int[] arr){
//        return arr;
//    }
//}


import java.util.*;

//high freq more than 1
public class arrayexe {
    public static int freq(int arr[]){
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int key:hm.keySet()){
            if(hm.get(key)>1){
                res.add(key);
            }
        }
        Collections.sort(res);
        return res.get(1);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(freq(arr));}
}
