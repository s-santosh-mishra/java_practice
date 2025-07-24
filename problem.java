import java.util.Scanner;

public class problem {
        /**
         * This is the main method
         * @param args
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//         //Cluculte the bus fair baseg on the age and gender

//         // System.out.print("Hello user please enter your Name : ");
//         // String name = input.nextLine();

//         // System.out.printf("Hello %s please enter your Age : ", name);
//         // int age = input.nextInt();
//         // input.nextLine();

//         // System.out.print("Please enter your Gender : ");
//         // String gender = input.nextLine();

//         // System.out.print("Final step ! Enter your Fair : ");
//         // double fair = input.nextDouble();

//         // if (gender.toLowerCase().equals("female")) {
//         //     if (age <= 10) {
//         //         fair = fair - (fair * 0.75);
//         //         System.out.printf("Ms. %s, Your fair would be Rs. %.2f Under Children Quota\n", name, fair);
//         //     } else {
//         //         fair = fair - (fair * 0.5);
//         //         System.out.printf("Ms. %s Your fair would be Rs. %.2f Under Gender Quota\n", name, fair);
//         //     }
//         // } else {
//         //     if (age >= 60) {
//         //         fair = fair - (fair * 0.3);
//         //         System.out.printf("Mr. %s, Your fair would be Rs. %.2f Under Senior Citizen Quota\n", name, fair);
//         //     } else if (age <= 10) {
//         //         fair = fair - (fair * 0.75);
//         //         System.out.printf("Mr. %s, Your fair would be Rs. %.2f Under Children Quota\n", name, fair);
//         //     } else {
//         //         System.out.printf("Hello %s, Your fair would be Rs. %.2f\n", name, fair);
//         //     }
//         // }


//         //different logic

//         if (age<10){
//             fair = fair - (fair * 0.75);
//             System.out.printf("Hello, %s, Your fair would be Rs. %.2f Under Children Quota\n", name, fair);
//         } else if(gender.toLowerCase().equals("female")){
//             fair = fair - (fair * 0.5);
//             System.out.printf("Ms. %s Your fair would be Rs. %.2f Under Gender Quota\n", name, fair);
//         }
//         else if(age>60 && !gender.toLowerCase().equals("female")){
//             fair = fair - (fair * 0.3);
//             System.out.printf("Mr. %s, Your fair would be Rs. %.2f Under Senior Citizen Quota\n", name, fair);
//         }
//         else{
//             System.out.printf("Mr. %s, Your fair would be Rs. %.2f\n", name, fair);
//         }

//problem 2 -> find out if a no is positive negative or zero

        // int a = input.nextInt();
        // if (a==0){
        //     System.out.println("its zero");
        // }else if(a>0){
        //     System.out.println("Its psoitive");
        // }else{
        //     System.out.println("Its negative");
        // }

    
//problem 3 biggest of three
        // int a= input.nextInt();
        // int b = input.nextInt(); 
        // int c = input.nextInt();
        // if(a==b && a==c){
        //     System.out.println("All are same");
        // }
        // else if(a>=b && a>=c){
        //     System.out.println(a+" is greatest ");
        // }
        // else if(b>=a && b>=c){
        //     System.out.println(b+" is greatest ");
        // }
        // else {
        //     System.out.println(c+" is greatest ");
        // }


// problem 4 leap year

        // int year = input.nextInt();
        // if (year % 4 == 0){
        //     if (year % 100 != 0 || year % 400 == 0){
        //         System.out.println("print its a leap year");
        //     }
        //     else{
        //         System.out.println("print its not a leap year");
        //     }
        // }else{
        //     System.out.println("print its not a leap year");
        // }

        //alternative logic

        // if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
        //     System.out.println("its a leap year");
        // }
        // else {
        //     System.out.println("its not a leap year");
        // }
//problem 5 even or odd using bitwise operator

        // int no = input.nextInt();
        // if(( no & 1) == 0){
        //         System.out.println("its even");
        // }else{
        //         System.out.println("its odd");
        // }


// Problem 5 : The High-Security Door
// Write a program that decides if a high-security door should open. The door opens if any of the following conditions are true:
// The person is an Admin.
// The person is a Manager AND has a valid keycard.
// The person is a regular Employee AND has a valid keycard AND it is currently within working hours.
// Let's assume you have these boolean variables:
// isAdmin
// isManager
// isEmployee
// hasKeycard
// isWorkingHours
        input.close();

     }
 }