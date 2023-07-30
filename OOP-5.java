import java.util.*;

interface Vehicle{
    void Speedup();
    void Gearchange();
    void Applybrakes();
}

public class vehicle {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        boolean ch=true;
        while(ch)
        {
            System.out.println("enter your choice\n 1.Car\n 2.Bike\n 3.Bicycle\n 4.Exit");
            int c=cin.nextInt();
            switch(c)
            {
                case 1:
                {
                    Car C=new Car();
                    C.menu();
                    break;
                }
                case 2:
                {
                    Bike B=new Bike();
                    B.menu();
                    break;
                }
                case 3:
                {
                    Bicycle BY=new Bicycle();
                    BY.menu();
                    break;
                }
                case 4:
                {
                    ch=false;
                    break;
                }
            }
        }
    }
}

class Car implements Vehicle{
    int gear=0;
    int speed=0;
    Scanner sc=new Scanner(System.in);
    public void menu(){
        boolean ch=true;
        while(ch) {
            System.out.println("CAR\n 1.Speed Up\n 2.Change Gear\n 3.Apply Brakes\n 4.Exit");
            int c = sc.nextInt();
            switch (c) {
                case 1: {
                    Speedup();
                    break;
                }
                case 2: {
                    Gearchange();
                    break;
                }
                case 3: {
                    Applybrakes();
                    break;
                }
                case 4: {
                    ch = false;
                    break;
                }
            }
        }
    }
    public void Speedup(){
        if(gear>=5){
            System.out.println("Out of Range\n");
        }
        else{
            gear++;speed+=20;
            System.out.println("Gear : "+gear+"\nSpeed : "+speed+"\n");
        }
    }
    public void Gearchange(){
        if(gear>=5){
            System.out.println("Out of Range\n");
        }
        else{
            gear++;speed+=20;
            System.out.println("Gear : "+gear+"\nSpeed : "+speed+"\n");
        }
    }
    public void Applybrakes(){
        if(gear==0){
            System.out.println("At Rest");
        }
        else{
            gear--;speed-=20;
            System.out.println("Gear : "+gear+"\nSpeed : "+speed+"\n");
        }
    }
}

class Bike implements Vehicle{
    int gear=0;
    int speed=0;
    Scanner sc=new Scanner(System.in);
    public void menu(){
        boolean ch=true;
        while(ch) {
            System.out.println("BIKE\n 1.Speed Up\n 2.Change Gear\n 3.Apply Brakes\n 4.Exit");
            int c = sc.nextInt();
            switch (c) {
                case 1: {
                    Speedup();
                    break;
                }
                case 2: {
                    Gearchange();
                    break;
                }
                case 3: {
                    Applybrakes();
                    break;
                }
                case 4: {
                    ch = false;
                    break;
                }
            }
        }
    }
    public void Speedup(){
        if(gear>=5){
            System.out.println("Out of Range\n");
 }
        else{
            gear++;speed+=20;
            System.out.println("Gear : "+gear+"\nSpeed : "+speed+"\n");
        }
    }
    public void Gearchange(){
        if(gear>=5){
            System.out.println("Out of Range\n");
        }
        else{
            gear++;speed+=20;
            System.out.println("Gear : "+gear+"\nSpeed : "+speed+"\n");
        }
    }
    public void Applybrakes(){
        if(gear==0){
            System.out.println("At Rest");
        }
        else{
            gear--;speed-=20;
            System.out.println("Gear : "+gear+"\nSpeed : "+speed+"\n");
        }
    }
}

class Bicycle implements Vehicle{
    int gear=0;
    int speed=0;
    Scanner sc=new Scanner(System.in);
    public void menu(){
        boolean ch=true;
        while(ch) {
            System.out.println("BICYCLE\n 1.Speed Up\n 2.Change Gear\n 3.Apply Brakes\n 4.Exit");
            int c = sc.nextInt();
            switch (c) {
                case 1: {
                    Speedup();
                    break;
                }
                case 2: {
                    Gearchange();
                    break;
                }
                case 3: {
                    Applybrakes();
                    break;
                }
                case 4: {
                    ch = false;
                    break;
                }
            }
        }
    }
    public void Speedup(){
        if(gear>=5){
            System.out.println("Out of Range\n");
        }
        else{
            gear++;speed+=20;
            System.out.println("Gear : "+gear+"\nSpeed : "+speed+"\n");
        }
    }
    public void Gearchange(){
        if(gear>=5){
            System.out.println("Out of Range\n");
        }
        else{
            gear++;speed+=20;
            System.out.println("Gear : "+gear+"\nSpeed : "+speed+"\n");
        }
    }
    public void Applybrakes(){
        if(gear==0){
            System.out.println("At Rest");
        }
        else{
            gear--;speed-=20;
            System.out.println("Gear : "+gear+"\nSpeed : "+speed+"\n");
        }
    }
}