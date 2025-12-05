#rotating the array by n times.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		  System.out.println(":3");
        Scanner Sc=new Scanner(System.in);
        int k=Sc.nextInt();
        int a[]={1,2,3,4,5,6};
        int arr[]=new int[a.length+1];
        for(int h=0;h<k;h++){
            for(int i=0;i<a.length;i++){
                arr[i+1]=a[i];
            }
        arr[0]=arr[a.length];
        arr[a.length]=0;
        for(int i=0;i<a.length;i++){
            a[i]=arr[i];
        }
	}
	for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
}
}
