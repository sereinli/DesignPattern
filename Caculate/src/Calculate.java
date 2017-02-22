import java.util.Scanner;

/**
 * Created by CBS on 2017/2/22.
 */
public class Calculate {

    public static void main(String[] args) {
        System.out.println("Calculate");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input number A:");
        double numberA = input.nextDouble();

        System.out.println("Please input an operate(+、-、*、/):");
        String operate = input.next();
        int operateLength = operate.length();
        while (operateLength != 1 || (operateLength == 1 && !checkOperate(operate))) {
            System.out.println("Invalid operate! Please input an operate(+、-、*、/):");
            operate = input.next();
            operateLength = operate.length();
        }

        System.out.println("Please input number B:");
        double numberB = input.nextDouble();

        Operation operation = OperationFactory.createOperation(operate);
        operation.NumberA = numberA;
        operation.NumberB = numberB;

        double result = operation.getResult();
        System.out.println("" + numberA + " " + operate + " " + numberB + " = " + result);

        System.exit(0);
    }

    private static boolean checkOperate(String operate) {
        String regex = "[*+-/]";
        return operate.matches(regex);
    }
}
