import java.util.Scanner;
public class BillAndpayment extends RestaurantVariables {
    public void Bill(){
        
        System.out.println("=======================================================");
        if (singleBeefBurger==true) {
            System.out.println(quantity+"x"+"\tsingleBeefBurger           11$");
        }
        if (smallShawarma==true) {
            System.out.println(quantity1+"x"+"\tsmallShawarma              7$");
        }
        if (bigShawarma==true) {
            System.out.println(quantity2+"x"+"\tbigShawarma               11$");
        }
        if (friedChickien==true) {
            System.out.println(quantity3+"x"+"\tfriedChickien             19$");
        }
        if (kababSandwich==true) {
            System.out.println(quantity4+"x"+"\tkababSandwich              8$");
        }
        if (doubleBeefBurger==true) {
            System.out.println(quantity5+"x"+"\tdoubleBeefBurger          17$");
        }
        if (singleChickienBurger==true) {
            System.out.println(quantity6+"x"+"\tsingleChickienBurger      10$");
        }
        if (doubleChickienBurger==true) {
            System.out.println(quantity7+"x"+"\tdoubleChickienBurger      18$");
        }
        if (frenchFries==true) {
            System.out.println(quantity8+"x"+"\tfrench Fries               5$");
        }
        if (pepsi==true) {
            System.out.println(quantity9+"x"+"\tpepsi                      3$");
        }
        if (water==true) {
            System.out.println(quantity10+"x"+"\twater                     1$");
        }
        if (Exit==true) {
            System.out.println("\tThank you come back again.");
        }
        System.out.println("=======================================================");
        System.out.println("        Thank you for ordaring        ");
        System.out.println("");
        System.out.println("           the total is: "+total+"$");
        System.out.println();
        System.out.println("Enter a payment..");
        Scanner s = new Scanner(System.in);
        pay = s.nextInt();
        while (pay<total) {
            System.out.println("not enough payment, the total is: "+total);
            pay = s.nextInt();
        }
         if(pay==total){
            System.out.println("Thank you have a nice day (:");

        }
        else if(pay>total){
        rest = pay - total;
        System.out.println("the rest = "+rest);

        }
        else
            System.out.println("invalid choise, try again later");
            System.exit(1);
        

    }
    
}
