// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println(":D  D:");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char[] arr2 = s.toCharArray();
        Arrays.sort(arr2);
        String h = Arrays.toString(arr);
        String h2 = Arrays.toString(arr2);
        if(h.equals(h2)){
            System.out.print("Anagram");}
        else{
            System.out.print("Not Anagram");
        }
        }
    }
