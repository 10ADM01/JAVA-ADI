import java.util.*;
public class missinginarray {
    public static void main(String[] args) {
        int A[] = {1,2,3,5,1};
        int size = A.length;
        int ans[] =new int[2];
        int[] newarray=new int[size];
        Arrays.fill(newarray,0);
        for(int i=0;i<size;i++){
            int value=A[i];
            if(newarray[value-1]==-1){
                ans[0]=value;
            }
            if(newarray[value-1]==0){
                newarray[value-1]=-1;
            }

        }
        for(int ij=0;ij<newarray.length;ij++){
            if(newarray[ij]==0){
                ans[1]=ij+1;
            }
        }
        for(int ab=0;ab<newarray.length;ab++){
            System.out.println(newarray[ab]);
        }
        for(int abb=0;abb<ans.length;abb++){
            System.out.println(ans[abb]);
        }

    }
}
