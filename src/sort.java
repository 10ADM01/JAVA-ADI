public class sort{

    public static void main(String[] args) {
        int[] arr = {1,3,15,9,11,0};
        prina(arr);
        System.out.println(" ");
        selso(arr);
        prina(arr);

    }
    static void bubsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }

    }
//selection sort
    static void selso(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int small = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }

            int temp = arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }

    static void prina(int[] arr){
        for(int i = 0;i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //insertionsort

    static void insso(int[] arr){
        for(int i = 1 ; i<arr.length;i++){
            int curr = arr[i];
            int j=i-1;
            while(j>=0&&curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;

        }

    }


}