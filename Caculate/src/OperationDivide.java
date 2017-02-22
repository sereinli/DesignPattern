/**
 * Created by CBS on 2017/2/22.
 */
public class OperationDivide extends Operation {

    @Override
    public double getResult() {
        if(NumberB == 0.00f) {
            System.out.println("Invalid divide number!");
            return 0;
        }
        return NumberA / NumberB;
    }
}
