public class mergesort {



    public static void ms(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        //System.out.println(mid);
        ms(arr,si,mid);
        ms(arr,mid+1,ei);
        conc(arr,si,mid,ei);

    }
    //concquere
//    public static void conc(int arr[],int si,int mid,int ei){
//        int arr2[]=new int[ei-si+1];
//        int idx1 =si;
//        int idx2=mid+1;
//        int x=0;
//        while(idx1<=mid && idx2<=ei){
//            if(arr[idx1]<=arr[idx2]){
//                arr2[x++]=arr[idx1++];
//
//
//            }
//            else{
//                arr2[x++]=arr[idx2++];
//
//            }
//        }
//        while(idx1<=mid){
//            arr2[x++]=arr[idx1++];
//
//        }
//        while(idx2<=ei){
//            arr2[x++]=arr[idx2++];
//
//        }
//
//
//
//
//
//        for(int i=0,j=si;i< arr2.length;i++,j++ ){
//            arr[j]=arr2[i];
//            // System.out.println(arr[]);
//
//        }
//
//    }

    //devide



    public static void conc(int arr[],int si,int mid,int ei){
        int arr2[]=new int[ei-si+1];
        int idx1 =si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                arr2[x++]=arr[idx2++];


            }
            else{
                arr2[x++]=arr[idx1++];

            }
        }
        while(idx1<=mid){
            arr2[x++]=arr[idx1++];

        }
        while(idx2<=ei){
            arr2[x++]=arr[idx2++];

        }





        for(int i=0,j=si;i< arr2.length;i++,j++ ){
            arr[j]=arr2[i];
            // System.out.println(arr[]);

        }

    }


    public static void main(String[] args) {

        int [] arr={6,3,9,5,2,8};
        int n =arr.length;
        //
        ms(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
}
