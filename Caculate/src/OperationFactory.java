/**
 * Created by CBS on 2017/2/22.
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation operation = null;

        switch (operate) {
            case "+":
                operation = new OperationPlus();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMultiply();
                break;
            case "/":
                operation = new OperationDivide();
                break;
        }

        return operation;
    }
}
