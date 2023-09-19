public class recur3 {

    public static void subse(String str,int idx,String str2){
        if(idx==str.length()){
            System.out.println(str2);
            if(str2==""){
                System.out.println("0");
            }
            return;
        }
        char curchar =str.charAt(idx);
        //if it needs to come
        subse(str,idx+1,str2+curchar);
        //if it doesnt neeed to come
        subse(str,idx+1,str2);
    }


    public static void main(String[] args) {
        String str="abc";
        subse(str,0,"");
    }
}
