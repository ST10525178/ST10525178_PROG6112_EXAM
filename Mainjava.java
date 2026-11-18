import java.util.Scanner;
public class Main{
    public static void main(string[]arg){
        Scanner input=new Scanner(System.in);
        
        //1D array for product name
        String[]products={
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Seal Phuket mattress",
        };
        //2D array for:[3 products][3 months]
        int[][]sale=new int[3][3];
        
        // Get input - matches sample screenshot exactly
        for(int i=0;i<products.length;i++){
            for (int month=0;month<3;month++){
                System.out.print("Enter number of sale foe month"+(month+1)+"for"+products[i]+":");
                sales[i][month]=input.nextInt();
            }
            System.out.println();
            }
        //Use Product class 
        Product productReport=new Product(products,sales);
        
        System.out.println("\nPRODUCT SALE REPORT-2026");
        System.out.println("**************************");
        System.out.println("TOTAL PRODUCTS SALES:"+productReport.getTotalProductsSold());
        System.out.println("AVERAGE PRODUCTS SALES:"+(int)productReport.getTotalAverageProductsSold());
        System.out.println("MOST POPULAR PRODUCT:"+productReport.getMostPopularProduct());
        input.close();
        }
                
               
       
        }
    
    

    

