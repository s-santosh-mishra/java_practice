import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hello user please enter your Name : ");
        String name = input.nextLine();

        System.out.printf("Hello %s please enter your Age : ",name);
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Please enter your Gender : ");
        String gender = input.nextLine();

        System.out.print("Final step ! Enter your Fair : ");
        double fair = input.nextDouble();

        if (gender.toLowerCase().equals("female")) {
            fair = fair - (fair * 0.5);
            System.out.printf("Ms. %s Your fair would be Rs. %.2f Under Gender Quota\n", name, fair);
        }
        else if (age >= 60) {
            fair = fair - (fair * 0.3);
            System.out.printf("Mr. %s, Your fair would be Rs. %.2f Under Senior Citizen Quota\n", name, fair);
        } else if (age <= 10) {
            fair = fair - (fair * 0.75);
            System.out.printf("Mr. %s, Your fair would be Rs. %.2f Under Children Quota\n", name, fair);         
        } else {
            System.out.printf("Hello %s, Your fair would be Rs. %.2f\n", name, fair);
        }
        System.out.println("Thanks For travelling with us! Happy journey.");
        input.close();
    }
}
