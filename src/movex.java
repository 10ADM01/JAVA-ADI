public class movex {
    public static void main(String[] args) {
        String ab="axbxcccxxxvxxd";
       movx(ab,0,0,"");
    }

    public static void movx(String ab,int idx,int count,String newString){
        if(idx==ab.length()){
            for(int i=0;i<count;i++){
                newString +='a';
            }
            System.out.println(newString);
            return;
        }
        char currentchar =ab.charAt(idx);
        if(currentchar=='a'){
            count ++;
            movx(ab,idx+1,count,newString);
        }
        else{
            newString +=currentchar;
            movx(ab,idx+1,count,newString);
        }
    }
}
