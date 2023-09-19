import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class miniaaray {
    public static void main(String[] args){
        int [] arr ={16,20,21,29,12,90,67,88,9};
        int minim=arr[0];
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minim){
                minim=arr[i];
                ind = i;
            }

        }
        System.out.println(minim);
        System.out.println(ind);
        

    }

}
