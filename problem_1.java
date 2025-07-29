import java.util.Scanner;
public class problem_1 {
    /**
     * This is the main fuction
     * main function is the entry point for jvm
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first ,second;
        first = input.nextInt();
        second = input.nextInt();
        System.out.println("LCM of two nos is "+lcm(first, second));

        input.close();
    }



    
    public static int lcm(int x,int y){
        // effitient version
        int i=1;
        while(i<=y){
            int factor = x * i;
            if(factor % y == 0){
                return factor;
            }
            i++;
        }

        while(i<=(x*y)){
            if(i%x == 0 && i%y == 0){
                return i;
            }
            i++;
        }
        return 0;
    }
}
