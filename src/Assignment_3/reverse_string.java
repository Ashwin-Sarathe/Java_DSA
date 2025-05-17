package Assignment_3;

public class reverse_string {
    public static void main(String[] args) {
        String str = "Hello This is AI";
        String revStr = "";
        for(int i=str.length()-1; i>=0;i--){
            revStr += str.charAt(i);
        }
        System.out.println(str);
        System.out.println(revStr);
    }
}
