public class changeEveryLetterWithNextOne {
 
public static String change(String str){
    StringBuffer sb = new StringBuffer();
for(int i=0;i<str.length();i++){
    int ascii = (int)(str.charAt(i));
    if(ascii==90){
        sb.insert(i,(char)(65));
    }else if(ascii==122){
        sb.insert(i, (char)(97));
    }else if(ascii >=65 && ascii<=90 || ascii>=97 && ascii<=122){
        sb.insert(i, (char)(ascii + 1));
    }
}

return sb.toString();
}




public static void main(String[] args) {
    String str = "abcd";
    System.out.println(change(str));
}   
}
