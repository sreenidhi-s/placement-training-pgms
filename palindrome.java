// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println(":)");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int index=s.length();
        int i=0;
        boolean ispal = true;
        int index2=index-1;
        for(i=0;i<index2;i++){
            char ch = s.charAt(i);
            if (ch==s.charAt(index2-i)){
                continue;
                }
            else{
                System.out.print("not palindrome");
                ispal = false;
            }
        index2--;
        }
        if(ispal){
            System.out.print("palindr");
        }
        
    }
}
