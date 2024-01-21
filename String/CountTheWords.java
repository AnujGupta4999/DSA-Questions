public class countTheWords {
    
    public static void main(String[] args) {
        String str = "Hi my name is Rishi";
        int n = str.length();
        int spaces = 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == ' '){
                spaces +=1;
            }
        }
        System.out.println(spaces+1);
    }
}
