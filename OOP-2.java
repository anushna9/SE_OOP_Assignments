import java.util.*;
class publications{
	Scanner sc = new Scanner(System.in);
	String titlefrompublication;
	int pricefrompublication;
	int initialcopies;
	int totalSale=0;
	void saleCopy(int q,int price)
	{
		totalSale+=(q*price);
	}
	void initializebooks(book b)
	{
		System.out.println("enter initial number of books:");
		b.initialcopies=sc.nextInt();
		//int dummy=sc.nextInt();
		System.out.println("enter name of the author :");
		b.authorfrombooks=sc.next();
		System.out.println("enter the price of the books :");
		b.pricefrompublication=sc.nextInt();
	}
	void initializemagazines(magazine m)
	{
		System.out.println("enter initial number of magzine");
		m.initialcopies=sc.nextInt();
		System.out.println("enter title of magzine :");
		m.titlefrompublication=sc.next();
		System.out.println("enter the price of the magzine: ");
		m.pricefrompublication=sc.nextInt();		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		publications p = new publications();
		book b = new book();
		b.initializebooks(b);
		magazine m = new magazine();
		m.initializemagazines(m);	
		int z = 1;
		while(z==1)
		{
			System.out.println("1.order book");
			System.out.println("2.order magazine");
			System.out.println("3.total book sale ");
			System.out.println("4.total magzine sale");
			System.out.println("5.total publication sale");
			System.out.println("6.receive book");
			System.out.println("7.receive magazine");
			System.out.println("ENTER CHOICE: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter order quantity :");
				b.order=sc.nextInt();
				if(b.initialcopies<b.order)
				{
					System.out.println("insufficient stock");
				}
				else
				{
					b.saleCopy(b.order,b.pricefrompublication);
					p.saleCopy(b.order,b.pricefrompublication);
					b.initialcopies-=b.order;
					System.out.println("order placed!!");
				}
				System.out.println("total copies available :"+b.initialcopies);
				break;
			case 2:
				System.out.println("enter order quantity :");
				m.orderQty=sc.nextInt();
				if(m.orderQty>m.initialcopies)
				{
					System.out.println("insufficient stock ");
				}
				else {
					m.saleCopy(m.orderQty, m.pricefrompublication);
					p.saleCopy(m.orderQty,m.pricefrompublication);
					m.initialcopies-=m.orderQty;
				}
				System.out.println("total available copies :"+m.initialcopies);
				break;
			case 3:
				System.out.println("total book sale :" +b.totalSalebook);
				break;
			case 4:
				System.out.println("total sale of magzine :"+m.totalSalemagazine);
				break;
			case 5:
				System.out.println("total publication sale : "+p.totalSale);
				break;
			case 6:
				System.out.println("enter receive quantity :");
				b.order=sc.nextInt();
				b.initialcopies+=b.order;
				System.out.println("total available copies : "+b.initialcopies);
				break;
			case 7:
				System.out.println("enter receive quantity :");
				m.orderQty=sc.nextInt();
				m.initialcopies+=m.orderQty;
				System.out.println("total available copies : "+m.initialcopies);
				break;
			}
			System.out.println("do you want continue: 1/0 ");
			z=sc.nextInt();
			if(z==0)
			{
				System.out.println("THANK YOU");
				break;
			}
		}
	}
}
class book extends publications
{
	String authorfrombooks;
	int order;
	int totalSalebook = 0;
	void saleCopy(int q,int price)
	{
		totalSalebook+=(q*price);
	}
}
class magazine extends publications
{
	int orderQty;
	int totalSalemagazine=0;
	void saleCopy(int q,int price)
	{
		totalSalemagazine+=(q*price);
	}
}