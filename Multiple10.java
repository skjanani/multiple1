package janani;
import java.util.Scanner;
public class Multiple10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,sum,sum1,a;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
    a=n%10;
	sum=10-a;
	sum1=sum+n;
System.out.println(sum1);
	}

}
