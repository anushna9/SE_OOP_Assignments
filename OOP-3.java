import java.util.*;

public class employe {
	Scanner sc = new Scanner(System.in);
	String empName;
	int empId;
	String address;
	String mail;
	String mobile;
	

    //take input from the user 
	public
	void getdata()
	{
		System.out.println("Enter employe name: ");
		String epname=sc.next();
        this.empName=epname;
		System.out.println("Enter employe ID: ");
		int epid=sc.nextInt();
        this.empId=epid;
		System.out.println("Enter employe address: ");
		String epadd=sc.next();
        this.address=epadd;
		System.out.println("Enter employe mail id: ");
		String epmail=sc.next();
        this.mail=epmail;

        //check if email id is valid
        boolean flag1 = Mailid(epmail);
		if(flag1==false)
		{
			System.out.println("Invalid mail ID!\n please enter details again: \n");
			getdata();
		}	

        //check if mobile no is valid
		System.out.println("Enter employe mobile no: ");
		String mob=sc.next();
        this.mobile=mob;
		boolean flag2 = MobileNo(mob);
		if(flag2==false)
		{
			System.out.println("Invalid mobile number!\n please enter details again: \n");
			getdata();
		}
			
	}

    boolean Mailid(String epmail)
	{
		boolean flag = false;
		int l = epmail.length();
		int ans = -1;
		ans = epmail.indexOf("@gmail.com");
		if(ans>=0 && ans<l)
		{
			flag=true;
		}
		return flag;
	}

	boolean MobileNo(String mob)
	{
		boolean flag = true;
		if(mob.length()!=10)
		{
			flag=false;
		}
		return flag;
	}

    //print the payslip
	void Payslip(double gross,double net)
	{
		System.out.println("Pay slip: ");
		System.out.println("employe Name: "+this.empName+"\n");
		System.out.println("employe Id: "+this.empId+"\n");
		System.out.println("Gross Salary: "+gross+"\n");
		System.out.println("Net Salary: "+net+"\n");
	}

    calculate the salary
	void Calculate(int bp)
	{
		double da=(0.97*bp);
		double hra = 0.1*bp;
		double pf=(0.12*bp);
		double scf = (0.001*bp);
		double gross=bp+da+hra+pf;
		double net=gross-pf-scf;
		Payslip(gross,net);
	}
	void menu()
	{
        System.out.println("Menu: ");
		System.out.println("1.Programmer\n2.Team Lead\n3.Asst Proj Manager\n4.Proj Manager\nElse Press 0 to quit");
		System.out.println("Enter your option: ");
	}
	
}

class salary extends employe{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		salary s = new salary();
		s.menu();
		int c=sc.nextInt();
		switch(c)
		{
		case 0:
			break;
		case 1:
			Programmer p = new Programmer();
			p.getdata();
			p.getProgrammer();
			break;
		case 2:
			TL t = new TL();
			t.getdata();
			t.getTL();
			break;
		case 3:
			APM a = new APM();
			a.getdata();
			a.getAPM();
			break;
		case 4:
			PM m = new PM();
			m.getdata();
			m.getPM();
			break;
		}
		sc.close();
	}
}

class Programmer extends employe
{
	Scanner sc = new Scanner(System.in);
	int bp=0;
	void getProgrammer()
	{
		System.out.println("Enter basic pay of programmer: ");
		bp=sc.nextInt();
		Calculate(bp);
	}
}

class TL extends employe
{
	Scanner sc = new Scanner(System.in);
	int bp=0;
	void getTL()
	{
		System.out.println("Enter basic pay of team lead: ");
		bp=sc.nextInt();
		Calculate(bp);
	}
}

class APM extends employe
{
	Scanner sc = new Scanner(System.in);
	int bp=0;
	void getAPM()
	{
		System.out.println("Enter basic pay of Asst Proj Manager: ");
		bp=sc.nextInt();
		Calculate(bp);
	}
}

class PM extends employe
{
	Scanner sc = new Scanner(System.in);
	int bp=0;
	void getPM()
	{
		System.out.println("Enter basic pay of Proj Manager: ");
		bp=sc.nextInt();
		Calculate(bp);
	}
}