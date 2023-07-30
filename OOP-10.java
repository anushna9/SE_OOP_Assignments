import java.util.*;
public interface CAR {
    abstract void Gather();
    abstract void Assemble();
    abstract void Ready();
}

public class Sedan implements CAR{

    @Override
    public void Gather() {
        System.out.println("Gathering Parts for Sedan.");
    }

    @Override
    public void Assemble() {
        System.out.println("Assembling Parts for Sedan.");
    }

    @Override
    public void Ready() {
        System.out.println("Sedan is Ready");
    }
    
}
public class HatchBack implements CAR{

    @Override
    public void Gather() {
        System.out.println("Gathering Parts for Hatchback.");
    }

    @Override
    public void Assemble() {
        System.out.println("Assembling Parts of Hatchback.");
    }

    @Override
    public void Ready() {
        System.out.println("HatchBack is Ready");
    }
    
}
public class SUV implements CAR{

    @Override
    public void Gather() {
        System.out.println("Gathering Parts for SUV.");
    }

    @Override
    public void Assemble() {
        System.out.println("Assembling Parts of SUV.");
    }

    @Override
    public void Ready() {
        System.out.println("SUV is Ready");
    }
    
}
public class CarFactory {
    
    public static CAR getCAR(String Type){
        
        if(Type==null){
            return null;
        }
        else if(Type.equalsIgnoreCase("HatchBack")){
            return new HatchBack();
        }
        else if(Type.equalsIgnoreCase("Sedan")){
            return new sedan();
        }
        else if(Type.equalsIgnoreCase("SUV")){
            return new SUV();
        }
        return null;
        
    }
    
}
public class Assignment10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarFactory F = new CarFactory();
        int choice ;
        do{
            System.out.println("enter the choice for operation ");
            System.out.println("1.HatchBack  2.sedan       3.SUV -1.Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    CAR CAR1  = F.getCAR("HatchBack");
                    
                    CAR1.Gather();
                    CAR1.Assemble();
                    CAR1.Ready();
                    break;
                    
                case 2:
                    CAR CAR2 = F.getCAR("sedan");
                    CAR2.Gather();
                    CAR2.Assemble();
                    CAR2.Ready();
                    break;
                
                case 3:
                    CAR CAR3 = F.getCAR("SUV");
                    CAR3.Gather();
                    CAR3.Assemble();
                    CAR3.Ready();
                    break;
                  default:
                	 System.out.println("Wrong Choice");
            }
            
        }while(choice !=-1);
        
    }
    
}