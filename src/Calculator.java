import java.util.Scanner;
import java.util.ArrayList;
    //The Methods
 class Calculatoroperations {

        public double addition(ArrayList<Double> numbers) {
            double sum = 0;
            for (double number : numbers) {
                sum += number;
            }
            return sum;
        }

        public double subtraction(ArrayList<Double> numbers) {
            double actual = numbers.get(0);

            for (int i = 1; i < numbers.size(); i++) {
                actual -= numbers.get(i);
            }

            return actual;
        }

        public double multiplication(ArrayList<Double> numbers) {
            double multi = 1;
            for (int i = 0; i < numbers.size(); i++) {
                multi *= numbers.get(i);
            }
            return multi;
        }
    }


                                                //début du code
                                               public class Calculator {
    public static void main(String[] args) {
        String answer;
        Calculatoroperations operations = new Calculatoroperations();
        boolean running = true;
        System.out.print("Welcome to GFox's Advanced Calculator,");// c'est mon pseudo x)
        Scanner input = new Scanner(System.in);

        while (running) {
            System.out.println("What kind of operation would you like to do ?");
            System.out.println("1.basic operations (+,-,*,/,%) 2.Special commands (PGCD,PPCM,Calculate the power of a number...  3.More advanced Options");
            System.out.println("You may also stop the program by writing stop ");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("stop")) {
                System.exit(0);
            }
            int answer1 = Integer.parseInt(choice);
            if (answer1 == 1) {
                System.out.print("You choosed the basic operations ");
                System.out.print("Please enter the desired operation (+,-,*,/,%) ");
              String answer2 = input.nextLine();


              //Addition
              if (answer2.equals("+")) {
                  ArrayList<Double> numbersadd = new ArrayList<>();
                  boolean adding = true;
                  while (adding) {
                      System.out.println("Enter a number:");
                      double number = input.nextDouble();
                      numbersadd.add(number);
                      input.nextLine();
                      System.out.println("Do you want to add another number? (yes/no)");
                       answer = input.nextLine();
                      if (answer.equalsIgnoreCase("no")) {
                          adding = false;
                          break;
                      } else if (answer.equalsIgnoreCase("yes")) {
                          adding = true;
                      }
                  }//closes adding loop
                  System.out.println("The result of the addition of your entries are : " + operations.addition(numbersadd));
                  }

              //end of the addition

                //début de la soustraction

                if (answer2.equals("-") ){
                    ArrayList<Double> numberssub = new ArrayList<>();
                    boolean subtraction = true;
                    while (subtraction) {
                        System.out.println("Enter a number:");
                        double number = input.nextDouble();
                        input.nextLine();
                        numberssub.add(number);
                        System.out.println("Do you want to subtract this number with another number ? (yes/no)");
                        answer = input.nextLine();
                        if(answer.equalsIgnoreCase("yes")) {
                            subtraction = true;
                        }
                        else if (answer.equalsIgnoreCase("no")) {
                            subtraction = false;
                            break;
                        }
                    }
                    System.out.println("The result of the subtraction is : " + operations.subtraction(numberssub));
                }

                //start of the multiplication
                 if (answer2.equals("*")){
                    ArrayList<Double> numbersmulti = new ArrayList<>();
                    boolean multiplication = true;
                    while (multiplication) {
                        System.out.println("Enter a number:");
                        double number = input.nextDouble();
                        numbersmulti.add(number);
                        input.nextLine();
                        System.out.println("Do you want to multiply another number? (yes/no)");
                        answer = input.nextLine();
                        if(answer.equalsIgnoreCase("yes")) {
                            multiplication = true;
                        }
                        else if (answer.equalsIgnoreCase("no")) {
                            multiplication = false;
                            break;
                        }
                        }
                    System.out.println("The result of the multiplication is : " + operations.multiplication(numbersmulti));
                    }
                 //end of the multiplication







                }
                  }//closes running loop
            }//closes main
        }//closes calculator class