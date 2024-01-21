
public class largestWordInAString {
    
    public String largest(String str){
        String[] str1 = str.split(" ");
        String str2 = "";
        for(String words : str1){
            if(words.length()> str2.length()){
                str2= words;
            }
        }
        
        return str2;

    }    
    
    
    
    public static void main(String[] args){
        String str = "Hey this side Ashish";
        largestWordInAString lar = new largestWordInAString();

        System.out.println(lar.largest(str));

    }
}
