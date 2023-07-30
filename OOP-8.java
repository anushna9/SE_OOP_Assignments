import java.util.*;
import java.io.*;

public class Assignment_8
{
   public static void main(String [] args)
    {
        int op;
        Scanner sc = new Scanner(System.in);
        StudentRecords sr = new StudentRecords();
    
        while(true)
        {
            System.out.println("1 - Add Record\n2 - Update Record\n3 - Display Record\n4 - Search Record\n5 - Delete Record\n6 - Clear All Records\n7 - Exit");
            System.out.println();
            op = sc.nextInt();
            System.out.println();
            switch(op)
            {
                case 1: sr.addRecord();
                break;
                
                case 2: sr.updateRecord();
                break;
                
                case 3: sr.displayRecords();
                break;
                
                case 4: sr.searchRecords();
                break;
                
                case 5: sr.deleteRecord();
                break;
                
                case 6: sr.clearRecords();
                break;
                
                case 7: sr.exit();
                break;
                
                default: System.out.println("Invalid input.");
            }
            
        }  
    }  
}


// FILE NAME: StudentRecords.java
import java.util.*;
import java.io.*;

public class StudentRecords
{
    static void addRecord()
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st.txt")));
            String stdName, address;
            
            int stdId, rollNo, std;
            float marks;
            String s;
            boolean addMore = false;
            
            do
            {
                System.out.print("\nEnter student's name: ");
                stdName = br.readLine();
                
                System.out.print("\nEnter student's id: ");
                stdId = Integer.parseInt(br.readLine());
                
                System.out.print("\nEnter student's roll number: ");
                rollNo = Integer.parseInt(br.readLine());
                
                System.out.print("\nEnter address: ");
                address = br.readLine();
                
                System.out.print("\nEnter student's class: ");
                std = Integer.parseInt(br.readLine());
                
                System.out.print("\nEnter marks: ");
                marks = Float.parseFloat(br.readLine());
                
                pw.println(stdName + " " + stdId + " " + rollNo + " " + address + " " + std + " " + marks);
                System.out.print("\nRecord added successfully.\nDo you want to add more?(Y/N): ");
                
                s = br.readLine();
                if(s.equalsIgnoreCase("Y"))
                {
                    addMore = true;
                }
                else
                {
                    addMore = false;
                }
                
            }
            while(addMore);
            
            pw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static void deleteRecord()
    {
        try
        {
            BufferedReader file1 = new BufferedReader(new FileReader("st.txt"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st1.txt", true)));
            String name;
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the student you want to delete: ");
            String searchName = sc.nextLine();
            
            while((name = file1.readLine())!=null)
            {
                String[]line = name.split(" ");
                if(!searchName.equalsIgnoreCase(line[0]))
                {
                    pw.println(name);
                    flag = 0;
                }
                else
                {
                    line[0] = "-";
                    line[1] = "-";
                    line[2] = "-";
                    line[3] = "-";
                    line[4] = "-";
                    pw.println(line[0] + " "+ line[1] + " " + line[2] + " " + line[3] + " " +line[4]); 
                    flag = 1;
                    while((name = file1.readLine())!=null)
                    {
                        pw.println(name);
                    }
                    break;
                }
            }

            file1.close();
            pw.close();
            if(flag == 1)
            {
                File delName = new File("st.txt");
                File oldName = new File("st1.txt");
                File newName = new File("st.txt");
                
                if(delName.delete())
                {
                    System.out.println("Record deleted successfully.");
                }
                
                else
                {
                    System.out.println("Error.");
                }
                
                if(oldName.renameTo(newName))
                {
                pw.close();
                    if(flag == 1)
                    {
                        File del_Name = new File("st.txt");
                        File old_Name = new File("st1.txt");
                        File new_Name = new File("st.txt");
                        
                        if(del_Name.delete())
                        {
                            System.out.println("Record deleted successfully.");
                        }
                        
                        else
                        {
                            System.out.println("Error.");
                        }
                        
                        if(old_Name.renameTo(newName))
                        {
                            System.out.println("Renamed successfully.");
                        }
                        
                        else
                        {
                            System.out.println("Error.");
                        }
                    }
                    
                    else
                    {
                        System.out.println("Record not found.");
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    static void updateRecord()
    {
        try
        {
            BufferedReader file1 = new BufferedReader(new FileReader("st.txt"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st1.txt")));
            
            String name;
            int flag = 0;
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the name of the student you want to update: ");
            String searchName = sc.nextLine();
            
            while((name = file1.readLine())!=null)
            {
                String[]line = name.split(" ");
                if(!searchName.equalsIgnoreCase(line[0]))
                {
                    pw.println(name);
                    flag = 0;
                }
                
                else
                {
                    System.out.println("Record found.");
                    System.out.println("Enter updated marks: ");
                    
                    float up_mark = sc.nextFloat();
                    pw.println(line[0]+" "+line[1]+" "+line[2]+" "+line[3]+" "+line[4]+" "+up_mark);
                    flag = 1;
                    
                    while((name = file1.readLine())!=null)
                    {
                        pw.println(name);
                    }
                break;
                }
            }
            
            file1.close();
            pw.close();
            if(flag == 1)
            {
                File delName = new File("st.txt");
                File oldName = new File("st1.txt");
                File newName = new File("st.txt");
                
                if(delName.delete())
                {
                    System.out.println("Record updated successfully.");
                }
                
                else
                {
                    System.out.println("Error.");
                }
                
                if(oldName.renameTo(newName))
                {
                    System.out.println("Renamed successfully.");
                }
                else
                {
                    System.out.println("Error.");
                }
            }
           
            else
            {
                System.out.println("Record not found.");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static void searchRecords()
    {
        try
        {
            BufferedReader file = new BufferedReader(new FileReader("st.txt"));
            String name;
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the id of the student you want to search: ");
            String searchName = sc.nextLine();
            
            while((name = file.readLine())!= null)
            {
                String[]line = name.split(" ");
                if(searchName.equalsIgnoreCase(line[1]))
                {
                    System.out.println("Record found.");
                    System.out.println(name);
                    System.out.println();
                    
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 0)
            {
                System.out.println("Record not found.");
            }
            
            file.close();      
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void displayRecords()
    {
        try
        {
            BufferedReader file = new BufferedReader(new FileReader("st.txt"));
            String name;
            int i = 1;
            
            while((name = file.readLine())!= null)
            {
                System.out.println(name);
                System.out.println("\n");
            }
            
            file.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static void clearRecords()
    {
        try
        {
            File delName = new File("st.txt");
            if(delName.delete())
            {
                System.out.println("Cleared records.");
            }
            
            else
            {
                System.out.println("Error.");
            }
            
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st.txt")));
            pw.close();
            System.out.println("All records are cleared successfully.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static void exit()  
    {
        System.exit(0);
    }
}