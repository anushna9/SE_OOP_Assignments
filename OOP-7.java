package generics;
import java.util.*;
public class generics {
	Scanner sc = new Scanner(System.in);
	boolean checkPalindrome(int e)
	{
		boolean flag = true;
		String s = Integer.toString(e);
		int len = s.length();
		for(int i=0;i<(len/2);i++)
		{
			if(s.charAt(i)!=s.charAt((len-1)-i))
			{
				flag=false;
				return flag;
			}
		}
		return flag;
	}
	int menu()
	{
		System.out.println("WHAT WOULD YOU LIKE TO SEE:\n1. ARRAYLIST\n2. EVEN INDEXES\n3. ODD INDEXES\n4. PRIME INDEXES\n5. PALINDROME INDEXES\n6. EXIT\n");
		int ch = sc.nextInt();
		return ch;
	}
	boolean prime(int e)
	{
		boolean flag = true;
		if(e==1)
		{
			return false;
		}
		if(e==2)
		{
			return true;
		}
		else
		{
			int half;
			if(e%2==1)
			{
				half=(e/2)+1;
			}
			else
			{
				half=(e/2);
			}
			for(int i=2;i<=half;i++)
			{
				
				if(e%half==0)
				{
					flag=false;
					return flag;
				}
			}
			return flag;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> evenidx = new ArrayList<>();
		ArrayList<Integer> oddidx = new ArrayList<>();
		ArrayList<Integer> primeidx = new ArrayList<>();
		ArrayList<Integer> palindromeidx = new ArrayList<>();
		System.out.println("WELCOME\n ENTER THE NUMBER OF ELEMENTS YOU WANT TO INSERT IN ARRAYLIST:\n");
		int n = sc.nextInt();
		generics g = new generics();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+"th element:\n");
			int e=sc.nextInt();
			a.add(e);
			if(e%2==1)
			{
				oddidx.add(i+1);
			}
			else if(e%2==0)
			{
				evenidx.add(i+1);
			}			
			if(g.checkPalindrome(e)==true)
			{
				palindromeidx.add(i+1);
			}
			if(g.prime(e)==true)
			{
				primeidx.add(i+1);
			}
		}
		boolean flag = true;
		while(flag)
		{
			int ch = g.menu();
			switch(ch)
			{
			case 1:
				int lena = a.size();
				System.out.println("The numbers of elements in arraylist are: "+lena+"\n");
				for(int i=0;i<lena;i++)
				{
					System.out.println(a.get(i)+" ");
				}
				System.out.println("\n");
				break;
			case 2:
				int lene = evenidx.size();
				System.out.println("The numbers of elements in arraylist are: "+lene+"\n");
				for(int i=0;i<lene;i++)
				{
					System.out.println(evenidx.get(i));
				}
				System.out.println("\n");
				break;
			case 3:
				int leno = oddidx.size();
				System.out.println("The numbers of elements in arraylist are: "+leno+"\n");
				for(int i=0;i<leno;i++)
				{
					System.out.println(oddidx.get(i));
				}
				System.out.println("\n");
				break;
			case 4:
				int lenp = primeidx.size();
				System.out.println("The numbers of elements in arraylist are: "+lenp+"\n");
				for(int i=0;i<lenp;i++)
				{
					System.out.println(primeidx.get(i));
				}
				System.out.println("\n");
				break;
			case 5:
				int lenpa = palindromeidx.size();
				System.out.println("The numbers of elements in arraylist are: "+lenpa+"\n");
				for(int i=0;i<lenpa;i++)
				{
					System.out.println(palindromeidx.get(i));
				}
				System.out.println("\n");
				break;
			case 6:
				flag=false;
				break;
			}

		}
		System.out.println("THANK YOU !!!");
//		generics g = new generics();
//		g.addMore(a);
		
	}
}