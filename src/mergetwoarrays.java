import java.util.*;
public class mergetwoarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si1=sc.nextInt();
        int[] ar1 = new int[si1];
        for(int i=0;i<si1;i++){
            ar1[i]=sc.nextInt();
        }
        int si2 = sc.nextInt();

        int[] ar2 = new int[si2];
        for(int i=0;i<si2;i++){
            ar2[i]=sc.nextInt();
        }

        int si3 = si1+si2;
        int[] ar3 = new int[si3];
        for(int j=0;j<si1;j++){
            ar3[j]=ar1[j];
        }

        for(int i=si1 ;i<si3;i++){

            ar3[i]=ar2[i-si1];
        }

        for(int l=0;l<si3;l++){
            System.out.print(ar3[l]+" ");
        }
    }
}

