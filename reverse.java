/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class Main {
    static void reverse(int[] a) {
        Scanner sc = new Scanner(System.in);
        int n = a.length-1;
        int i =0;
        while(i<n){
            int temp = a[i];
            a[i] = a[n];
            a[n] = temp;
            i++;
            n--;
        }
        for(int j = 0;j<a.length;j++){
            System.out.print(a[j]);
        }
    
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    reverse(a);
    }
}
