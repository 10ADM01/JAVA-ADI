public class recursion2 {





   public static boolean arr[] =new boolean[26];
    public static void removedups(String str,int idx,String str2){
        if(idx==str.length()){
            System.out.println(str2);
            return;
        }
        char curchar =str.charAt(idx);
        if(arr[curchar-'a']==true){
            removedups(str,idx+1,str2);
        }
        else{
            str2+=curchar;
            arr[curchar-'a']=true;
            removedups(str,idx+1,str2);
        }

    }
    public static void main(String[] args) {
        String str="aabbbaaacccc";
        removedups(str,0,"");

    }


}
