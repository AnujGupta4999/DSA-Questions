import java.util.Arrays;
public class sortCharacter {
    public static void main(String[] args) {
        String str = "bnsd";
        char[] ch = str.toCharArray();
         Arrays.sort(ch);
        String st = new String(ch);
         System.out.println(st);
        
    }
}
