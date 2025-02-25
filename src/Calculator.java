import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        while (true) {
            int choice = startMessage();
            switch (choice){
                case 1: basicCalc(); break;
                case 2: advancedCalc(); break;
                case 3: finCalc(); break;
                case 4: break;
                default:
                    System.out.println("Invalid Choice");
            }
            if (choice == 4) break;
        }
    }


    static int startMessage() {
        System.out.println("Please choose one choice from: ");
        System.out.println("1- Basic Calc \n" +
                "2- Advanced Calc \n" +
                "3- Financial Calc \n" +
                "4- Quit");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    static void basicCalc() {
        System.out.println("Please choose the operation => [Add, Subtract, Multiply, Division]");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        double result = 0.0;
        switch (choice){
            case "add": result = sum(); break;
            case "subtract": result = subtract(); break;
            case "multiply": result = multiply(); break;
            case "division": result = division(); break;
            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("The Result IS = " + result);
    }

    static double sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The First Number");
        double num1 = input.nextDouble();
        System.out.println("Please Enter The Second Number");
        double num2 = input.nextDouble();
        return num1 + num2;
    }

    static double subtract() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The First Number");
        double num1 = input.nextDouble();
        System.out.println("Please Enter The Second Number");
        double num2 = input.nextDouble();
        return num1 - num2;
    }

    static double multiply() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The First Number");
        double num1 = input.nextDouble();
        System.out.println("Please Enter The Second Number");
        double num2 = input.nextDouble();
        return num1 * num2;
    }

    static double division() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The First Number");
        double num1 = input.nextDouble();
        System.out.println("Please Enter The Second Number");
        double num2 = input.nextDouble();
        return num1 / num2;
    }

    static void advancedCalc() {
        System.out.println("Please choose the operation \n" +
                "1- From M to Cm \n" +
                "2- From Km to M" );
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        double result = 0.0;
        switch (choice){
            case 1: result = fromMtoCm(); break;
            case 2: result = fromKmToM(); break;
            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("The Result IS = " + result);
    }

    static double fromMtoCm() {
        System.out.println("Please Enter The Number");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        return num * 100;
    }

    static double fromKmToM() {
        System.out.println("Please Enter The Number");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        return num * 1000;
    }

    static void finCalc() {
        System.out.println("Please choose the operation \n" +
                "1- From EGP to USD \n" +
                "2- From USD to EGP" );
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        double result = 0.0;
        switch (choice){
            case 1: result = fromEgpToUsd(); break;
            case 2: result = fromUsdToEgp(); break;
            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("The Result IS = " + result);
    }

    static double fromEgpToUsd() {
        System.out.println("Please Enter Amount Of Cash");
        Scanner input = new Scanner(System.in);
        double cash = input.nextDouble();
        return cash * 0.02;
    }

    static double fromUsdToEgp() {
        System.out.println("Please Enter Amount Of Cash");
        Scanner input = new Scanner(System.in);
        double cash = input.nextDouble();
        return cash * 50.59;
    }

}
