public class Encode_Decode {
    public void  encodeANDdecode(String[] word){
        String encodeStr = "" ;
        for(int i = 0 ; i < word.length ; i++){
            encodeStr+=word[i]+"@";
        }

        System.out.println("Encodede Sucessfully!");
        System.out.println(encodeStr);
        String [] decode = encodeStr.split("@") ; 
        System.out.println("Decodede Sucessfully! ");
        for(String s : decode){
            System.out.print(s+"");
        }
    }
    public static void main(String[] args) {
        Encode_Decode e = new Encode_Decode(); 
        String word[] = {"ab","b","c","abc"};
        e.encodeANDdecode(word);
    }
}
