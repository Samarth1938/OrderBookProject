package New;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;






class supplier {
    String sup_Name;
    int sup_Number;
    String supplier_DeliveryDate;
    String supplier_shipmentDate;
    int supplier_innoviceNUmber;
    String supplier_innoviceDate;
     String order_Acceptance;
     static int sr_no;

     

   public void printDetails(){
    System.out.println("Supplier name is "+ sup_Name);
        System.out.println("Supplier number "+sup_Number);
        System.out.println("Enter the oder Acceptance Date"+order_Acceptance);
        System.out.println("Supplier Delivery Date is "+supplier_DeliveryDate);
       System.out.println("Supplier Shipment Date is "+supplier_shipmentDate);
       System.out.println("Supplier Innovice Number is "+supplier_innoviceNUmber);
       System.out.println("Supplier Innovice Date is "+supplier_shipmentDate);
   }
    


}

class project{
    static int SpBPro_Number;

        public static void printDetails(){
            System.out.println("Your Project Number is   SpbB_GSP_"+SpBPro_Number);
        }
}

class postatus {
    static String po_Type;
    static String po_status;
    static int po_Number;
    static String po_Date;
   static int po_Position;
    static String po_DeliveryDate;
    static String dateinput;
    public static postatus change;


    public static void printDetails(){
        System.out.println("PO Status is "+po_status);
        System.out.println("PO Type is "+po_Type);
        System.out.println("PO Number is "+po_Number);
        System.out.println("PO Date is "+po_Date);
        System.out.println("PO POsition is "+po_Position);
        System.out.println("PO Delivery Date is "+po_DeliveryDate);

    }
class LocalDate{
    LocalDate datetime;
}
    


}

class part{
    public static int part_Number;
    static String part_Name;

        public void printDetails(){
            System.out.println("Part Number is "+part_Number);
            System.out.println("Part Name is "+part_Name);

        }

        /**
         * Innerschidu
         */
        class Date {
            public static int datetime; 

            public void printDetails(){
                System.out.println();
            }
            
        }




Date thisdate=new Date();
SimpleDateFormat dateform =new SimpleDateFormat("yyyy-mm-dd");
//String datetime=sc.next();

    }





public class schidu { 
    
    
    
    



    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

       

        
        System.out.println("Welcome Schapenberg Industries");
        supplier sr_no=new supplier();
        System.out.println("Enter the SR.NO "+"INT");
        supplier.sr_no=sc.nextInt();
       supplier supplier=new supplier();
       System.out.println("Enter supplier name ");
        supplier.sup_Name=sc.next();
       System.out.println("Enter the Supplier number ");
       supplier.sup_Number=sc.nextInt();

      // supplier.printDetails();

    project SpB=new project();
        System.out.println("Enter the SpB Project Number"+"INT");
       project.SpBPro_Number=sc.nextInt();

       //project.printDetails();
        
     /*   String po_Type;
    int po_Number;
    int po_Date;
    int po_Position;
    int po_DeliveryDate;*/

    /* Able to chnage po type  */

    postatus po=new postatus();
    LocalDate myObj = LocalDate.now();
    System.out.println("Enter the PO Status 1.Open 2.Delivered 3.Cancelled ");
     postatus.po_status=sc.next();
     System.out.println("Enter the PO Type "+" 1.Sample 2.Serial 3.Pilot 4.Tooling   " );
     postatus.po_Type=sc.next();
     System.out.println("Enter the Po Number"+"INT");
    postatus.po_Number=sc.nextInt();

    System.out.println("Enter the po_Date "+"Year-Month-Date");
    //postatus.dateinput=sc.nextLine();
    postatus.po_Date=sc.next();
    System.out.println("Enter the po Position ");
    postatus.po_Position=sc.nextInt();
    System.out.println("Enter the po Delivery Date "+"Year-Month-Date");
    postatus.po_DeliveryDate=sc.next();
    
  
    
    /*int part_Number;
    String part_Name;*/

    part p=new part();
    System.out.println("Enter the Part Number "+"INT");
    part.part_Number=sc.nextInt();

    System.out.println("Enter the part name ");
    part.part_Name=sc.next();

    /*  int order_Acceptance; */

    /* int supplier_DeliveryDate;
    int supplier_shipmentDate;
    int supplier_innoviceNUmber;
    int supplier_innoviceDate; */

    supplier sp=new supplier();
    System.out.println("Enter the Order Acceptance Date "+"Year-Month-Date");
    supplier.order_Acceptance=sc.next();
    
    System.out.println("Enter the Supplier Shipment Date "+"Year-Month-Date");
    supplier.supplier_shipmentDate=sc.next();

    System.out.println("Enter The Innovice NUmebr "+"INT");
    supplier.supplier_innoviceNUmber=sc.nextInt();

    System.out.println("Enter the Suppler Inovice NUmebr "+"INT");
    supplier.supplier_innoviceNUmber=sc.nextInt();


    System.out.println("*************************************************************");
     System.out.println("Output of the Data is ");
    supplier.printDetails();
    project.printDetails();
    postatus.printDetails();
    

    System.out.println("Please Enter what you want to update ");
    System.out.println("Press po To Change the Status of PO");
    

    
    
  
  

    }
    

    }





