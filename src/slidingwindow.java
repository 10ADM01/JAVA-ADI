public class slidingwindow {
    public static void main(String[] args) {

        int[] arr={1,2,9,3,4,5};
        int c = 7;
        int i=0;int j=0;
        int sum = 0;

        while(sum<c){
            sum+=arr[j];
            while(sum>c &&i<=j){
                sum -=arr[i];
                i++;
            }
            if(sum==c){
                System.out.println(i+" "+j);
            }
            j++;
        }
    }
}
