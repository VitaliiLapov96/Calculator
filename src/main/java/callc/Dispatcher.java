package callc;
import java.util.Scanner;
public class Dispatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Variable:");
        int x = sc.nextInt();
        System.out.println("Enter The Mark:");
        char z = sc.next().charAt(0);
        System.out.println("Enter The Second Variable:");
        int y = sc.nextInt();
        Model m = new Model(x,y);
        switch (z){
            case '+':
                int rsum = Controller.sum(m);
                View.dispayInt(rsum);
                break;
            case '-':
                int rriz = Controller.riz(m);
                View.dispayInt(rriz);
                break;
            case '*':
                int rdob = Controller.dob(m);
                View.dispayInt(rdob);
                break;
            case '/':
                double rdil = Controller.dil(m);
                View.displayDouble(rdil);
                break;
            default:
                System.out.println("Wrong Sign!");
                break;
        }
    }
}
