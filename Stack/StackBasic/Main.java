package ClassesAndObjects;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		Stack st=new Stack(n);
		for(int i=0;i<n;i++)
		{
			st.push(sc.nextInt());
		}
		System.out.print(st.isEmpty()+ " ");
		System.out.print(st.isFull()+ " ");
		st.reverseOfStack();
		

	}

}
