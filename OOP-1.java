import java.util.*;
public class Complex {
	float img,real;
	Scanner sc = new Scanner(System.in);
	void getdata() {
		real= sc.nextFloat();
		img= sc.nextFloat();
	} 
	void putdata() {
		System.out.println(real + "+" + img + "i");
	}
	
	Complex add(Complex d1, Complex d2) {
		System.out.println("addition is: ");
		Complex d3 = new Complex();
		d3.real=d1.real+d2.real;
		d3.img=d1.img+d2.img;
		return d3;
	}
	
	Complex sub(Complex d1, Complex d2) {
		System.out.println("sub is: ");
		Complex d3 = new Complex(
				);
		d3.real=d1.real-d2.real;
		d3.img=d1.img-d2.img;
		return d3;
	}

	Complex mul(Complex d1, Complex d2) {
		System.out.println("mul is: ");
		Complex d3 = new Complex();
		d3.real=d1.real*d2.real - d1.img*d2.img;
		d3.img=d1.real*d2.img + d1.img*d2.real;
		return d3;
	}
	
	Complex div(Complex d1, Complex d2) {
		System.out.println("div is: ");
		Complex d3 = new Complex();
		d3.real=(d1.real*d2.real + d1.img*d2.img)/(d2.real*d2.real + d2.img*d2.img);
		d3.img=(d1.img*d2.real - d1.real*d2.img)/(d2.real*d2.real + d2.img*d2.img);
		return d3;
	}
	
	public static void main(String[] args) {
			
		int i=0;
		while(i==0) {
			Complex c1 = new Complex();
			Complex c2 = new Complex();
			System.out.println("enter first number: ");
			c1.getdata();
			System.out.println("enter second number: ");
			c2.getdata();
			
			System.out.println("first no is: " + c1.real + "+" + c1.img + "i");
			System.out.println("second no is: " + c2.real + "+" + c2.img + "i");
			
			System.out.println("Menu: ");
			System.out.println("1 : Addition ");
			System.out.println("2 : Sub ");
			System.out.println("3 : mul ");
			System.out.println("4 : div ");
			
            
            Complex c3 = new Complex();	
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            switch (n) {
            case 1:
                c3=c3.add(c1, c2); 
                c3.putdata();
                break;
            
            case 2:
                c3=c3.sub(c1, c2);
                c3.putdata();
                break;
            
            case 3:
                c3=c3.mul(c1, c2);
                c3.putdata();
                break;
                
            case 4:
                if(c2.real==0 && c2.img==0) {
                    System.out.println("Invalid case");
                    break;
                }
                else {
                c3=c3.div(c1, c2);
                c3.putdata();
                break;
                }
            
            default:
                System.out.println("Enter correct no");
                break;
            
            }
            
            System.out.println("Enter if you want to continue enter: 0");
            i= sc.nextInt();

            if(i!=0) {
                break;
            }	
        }
		
	}

}