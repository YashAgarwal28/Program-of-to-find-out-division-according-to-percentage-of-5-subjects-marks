import java.util.Scanner;

public class Division_According_To_Percentage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 5 subjecs marks");

		int phy=sc.nextInt();
		int chem=sc.nextInt();
		int bio=sc.nextInt();
		int math=sc.nextInt();
		int eng=sc.nextInt();
		
		int per=(phy+chem+bio+math+eng)/5;
		System.out.println("percentage="+per);
		if(per>=60)
			System.out.println("first division");
		else if(per>=50 && per<60)
			System.out.println("second division");
		else if(per>=40 && per<50)
			System.out.println("third division");
		else
			System.out.println("fail");
	}
}
