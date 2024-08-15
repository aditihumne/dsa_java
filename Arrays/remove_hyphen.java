public class remove_hyphen {
    public static void main(String[] args) {
        String str = "Move-from-text";
        String ans =removehy(str);
        System.out.println(ans);
    }
    // public static String removehy(String str){
    //     if(str == null){
    //         return null;
    //     }
    //     String s1="";
    //     String s2="";
    //     for(int i =0;i<str.length();i++){
    //         if(str.charAt(i) =='-'){
    //             s1+=str.charAt(i);
    //         }else{
    //             s2 += str.charAt(i);
    //         }
    //     }
    //     return s1+s2;
    // }


    // public static String removehy(String str){
    //     StringBuilder s = new StringBuilder();
        
    //     int count=0;
    //     for(Character ch: str.toCharArray()){
    //         if(ch == '-'){
    //             count++;
    //         }else{
    //             s.append(ch);
    //         }
    //     }
    //     while(count>0){
    //         s.insert(0,"-");
    //         count--;
    //     }
    //     return s.toString();
    // }

    public static String removehy(String str){
        StringBuilder s = new StringBuilder();
        
        int count=0;
        for(Character ch: str.toCharArray()){
            if(ch == '-'){
                s.insert(0,'-');
            }else{
                s.append(ch);
            }
        }
        
        return s.toString();
    }
}
