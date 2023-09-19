public class strictlyinc {
    public static boolean increc(int arr[],int idx) {
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return increc(arr,idx+1);

        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(increc(arr,0));

    }

}
