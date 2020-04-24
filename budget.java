import java.util.*;
//abstract class
abstract class budget{
	abstract void print();
}
//i will use single level inheritance
class expensis extends budget{
	double salary;
	 int total = 0;
	 int w_bills;
	 int p_expen;
	 int f_bills;
    int rent;
    int elec_bills;
	Scanner sc=new Scanner(System.in);
	void print(){
		System.out.println("====Home Budget Management====");
		System.out.println("====Developed By Jatin====");
		System.out.println();
		System.out.println("Enter your monthly budget");
		salary=sc.nextDouble();
}
	///nested class
	class homebills{
	void display(){
		System.out.println("Enter your personal expensis");
		p_expen=sc.nextInt();
		System.out.println("Enter monthly foodbills");
		f_bills=sc.nextInt();
		System.out.println("Enter monthly waterbills");
		w_bills=sc.nextInt();
		System.out.println("Enter your rent");
		rent=sc.nextInt();
		System.out.println("Enter your electricity bills");
		elec_bills=sc.nextInt();

		total = w_bills+rent+p_expen+f_bills+elec_bills;

		if(total<salary)
		{
			System.out.println("you are in budget of "+(salary-total));
		}
		else{
			System.out.println("you are in underbudget of "+(total-salary));
		}

	}
}
	
	public static void main(String args[])
	{
		
		expensis e = new expensis();
		expensis.homebills h = e.new homebills();
		e.print();
        	h.display(); 
        
	}
}
