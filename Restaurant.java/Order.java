import java.util.Scanner;
public class Order extends BillAndpayment {

Scanner s = new Scanner(System.in);

    public void order(){
        
      System.out.println("Enter your choice.. ");
      ch = s.nextInt();
      while(ch>12){
        System.out.println("invalid choise!, try again");
        ch = s.nextInt();
      }
      switch (ch) {
          case 1:
          order = "singleBeefBurger";
          singleBeefBurger = true;
          System.out.println("You have order (singleBeefBurger)... ");
          System.out.println();
          System.out.println("How many singleBeefBurger do you want?");
          quantity = s.nextInt();
          System.out.println();
          System.out.println("with cheese?,(y/n)\t1$\tone try!! ");
          cheese = s.next();

            if (cheese.equals("y")) {
                total = (total + quantity*11);
                total =quantity+total;
              }
              else if(cheese.equals("n")){
              total = total + quantity*11;
              }
              else {
             System.out.println("\tSorry, invalid choise, try again leater!");
             System.exit(0);
              }
              break;

              case 2:
              order = "smallShawarma";
              smallShawarma = true;
          System.out.println("You have order (smallShawarma) ");
          System.out.println();
          System.out.println("How many smallShawarma do you want?");
          quantity1 = s.nextInt();
          System.out.println("with cheese?,(y/n)\t1$\tone try!! ");
          cheese = s.next();
          if (cheese.equals("y")) {
            total = (total + quantity1*7);
            total =quantity1+total;
          }
          else if(cheese.equals("n")){
          total = total + quantity1*7;
          }
          else {
         System.out.println("\tSorry, invalid choise, try again leater!");
         System.exit(0);
          }
         
              break;

              case 3:
              bigShawarma = true;
          System.out.println("You have order (bigShawarma) ");
          System.out.println();
          System.out.println("How many bigShawarma do you want?");
          quantity2 = s.nextInt();
          System.out.println("with cheese?,(y/n)\t1$\tone try!! ");
          cheese = s.next();
          
          if (cheese.equals("y")) {
            total = (total + quantity2*11);
            total =quantity2+total;
          }
          else if(cheese.equals("n")){
          total = total + quantity2*11;
          }
          else {
         System.out.println("\tSorry, invalid choise, try again leater!");
         System.exit(0);
          }
              break;

              case 4:
              friedChickien = true;
          System.out.println("You have order (friedChickien) ");
          System.out.println();
          System.out.println("How many friedChickien do you want?");
          quantity3 = s.nextInt();
          total = total + quantity3*19;
              break;

              case 5:
              kababSandwich = true;
          System.out.println("You have order (kababSandwich) ");
          System.out.println();
          System.out.println("How many kababSandwich do you want?");
          quantity4 = s.nextInt();
          total = total + quantity4*8;
              break;

              case 6:
              doubleBeefBurger = true;
          System.out.println("You have order (doubleBeefBurger) ");
          System.out.println();
          System.out.println("How many doubleBeefBurger do you want?");
          quantity5 = s.nextInt();
          System.out.println("with cheese?,(y/n)\t1$\tone try!! ");
          cheese = s.next();
          if (cheese.equals("y")) {
            total = (total + quantity5*17);
            total =quantity5+total;
          }
          else if(cheese.equals("n")){
          total = total + quantity5*17;
          }
          else {
         System.out.println("\tSorry, invalid choise, try again leater!");
         System.exit(0);
          }
          
              break;

              case 7:
              singleChickienBurger=true;
          System.out.println("You have order (singleChickienBurger) ");
          System.out.println();
          System.out.println("How many singleChickienBurger do you want?");
          quantity6 = s.nextInt();
          System.out.println("with cheese?,(y/n)\t1$\tone try!! ");
          cheese = s.next();
          if (cheese.equals("y")) {
            total = (total + quantity6*10);
            total =quantity6+total;
          }
          else if(cheese.equals("n")){
          total = total + quantity6*10;
          }
          else {
         System.out.println("\tSorry, invalid choise, try again leater!");
         System.exit(0);
          }
              break;

              case 8:
              doubleChickienBurger=true;
          System.out.println("You have order (doubleChickienBurger) ");
          System.out.println();
          System.out.println("How many doubleChickienBurger do you want?");
          quantity7 = s.nextInt();
          System.out.println("with cheese?,(y/n)\t1$\tone try!! ");
          cheese = s.next();
          if (cheese.equals("y")) {
            total = (total + quantity7*18);
            total =quantity7+total;
          }
          else if(cheese.equals("n")){
          total = total + quantity7*18;
          }
          else {
         System.out.println("\tSorry, invalid choise, try again leater!");
         System.exit(0);
          }
              break;

              case 9:
              frenchFries=true;
          System.out.println("You have order (frenchFries) ");
          System.out.println();
          System.out.println("How many frenchFries do you want?");
          quantity8 = s.nextInt();
          total = total + quantity8*5;
              break;

              case 10:
              pepsi=true;
          System.out.println("You have order (pepsi) ");
          System.out.println();
          System.out.println("How many pepsi do you want?");
          quantity9 = s.nextInt();
          total = total + quantity9*3;
              break;

              case 11:
              water=true;
          System.out.println("You have order (water) ");
          System.out.println();
          System.out.println("How many water do you want?");
          quantity10 = s.nextInt();
          total = total + quantity10*1;
              break;

              case 12:
              Exit = true;
              System.exit(1);
              break;

              default:
                break;
            }
            System.out.println();
            System.out.println("do you want to order anything else? (y/n):");
            again = s.next();
            if (again.equalsIgnoreCase("y")) {
                order();
            }
            else if(again.equalsIgnoreCase("n")){
                Bill();

                System.exit(1);
            }
            else{System.out.println("invalid choise");
       
              System.exit(1);
       
        }

            
   
        }      

        
    }
     
    


