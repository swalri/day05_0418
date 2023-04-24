package while_;
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		boolean tf = true;
//		int num=0, sum=0;
//		while(tf) {
//			System.out.println("10~20사이의 수 입력");
//			num = scan.nextInt();
//			if(num<10 || num>20) {
//				System.out.println("잘못 입력");
//				continue;
//			}
//			break;
//		}
//		for(int i=1; i<=num ;i++) {
//			sum+=i;
//		}
//		System.out.println("1부터 "+num+"까지의 합은 "+sum);
		
		
		boolean bool = true;
		int n = 1;
		while(bool) {
			System.out.println("종속문장");
			if(n==2) break;//bool = false;
			n++;
		}
		System.out.println("while종료");
		
		
		
		
		
		
		
	}
}


