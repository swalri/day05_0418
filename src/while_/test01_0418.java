package while_;

import java.util.Scanner;

public class test01_0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//수를 입력 받고 구구단에 있는지 확인하시오
		
		Scanner scan = new Scanner(System.in);
		int num1, num2=0;
		System.out.println("수를 입력하시오");
		num1 = scan.nextInt();
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				num2 = i*j;
				if(num1==num2) {
					System.out.println("구구단에 있습니다");
					num2 = 0;
					break;
				}
			}
			if(num2 == 0) {
				break;
			}
		}
		if(num2 != 0) {
			System.out.println("구구단에 없습니다");
		}
	}

}


