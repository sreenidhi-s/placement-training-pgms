import java.util.*;
class Main{
    static void add(int a[][],int r,int c){
		        int s=0;
		        for(int i=0;i<r;i++){
		            for(int j=0;j<c;j++){
		                s+=a[i][j];
		            }
		      System.out.println(s);
		      s=0;
		        }
		    }
	public static void main(String[] args) {
		System.out.println("2d array");
		Scanner in= new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int a[][]=new int[r][c];
		for (int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        a[i][j]=in.nextInt();
		    }
		  }
	add(a,r,c);
	}
}
		
