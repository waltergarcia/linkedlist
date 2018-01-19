import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    
    static boolean exit = false;
    static List list = new List();
    
    public static void main(String[] args) throws Exception{
        
        //Variables
        int opt;
        Scanner sn = new Scanner(System.in);
        
        while (!exit) {
            clearScreen();
            printMenu();
 
            try {
                opt = sn.nextInt();
                chooseOption(opt);
            } catch (InputMismatchException e) {
                System.out.println("Bad option");
                sn.next();
            }
        }
    } //End main method
    
    //Print menu method
    public final static void printMenu(){
        System.out.println("\n######## Simple LinkedList ########\n");
        System.out.println("----------- Menu -----------");
        System.out.println("1) Add node at the Start");
        System.out.println("2) Add node at the End");
        System.out.println("3) Delete node by value");
        System.out.println("4) Delete LinkedList");
        System.out.println("5) Print LinkedList");
        System.out.println("6) Exit\n");
        System.out.println("Option: "); 
    }
    
    //choose option method
    public final static void chooseOption(int opt){
        int value = 0;
        Scanner sn = new Scanner(System.in);
        
        switch (opt) {
            case 1:
                System.out.println("Enter value: ");
                value = sn.nextInt();
                list.addStart(value);
                list.printList();
                break;
                
            case 2:
                System.out.println("Enter value: ");
                value = sn.nextInt();
                list.addEnd(value);
                list.printList();
                break;
                
            case 3:
                System.out.println("Enter value: ");
                value = sn.nextInt();
                list.removeByValue(value);
                list.printList();
                break;
                
            case 4:
                list.delete();
                list.printList();
                break;
                
            case 5:
                list.printList();
                break;
                
            case 6:
                exit = true;
                break;

            default:
                System.out.println("Only numbers between 1 and 6");
        }
    }
    
    //Clear screen method
    public final static void clearScreen(){
        try{
            final String os = System.getProperty("os.name");
            
            if (os.contains("Mac OS X")){
                Runtime.getRuntime().exec("clear");
            }else{
                Runtime.getRuntime().exec("cls");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }

}