package Functions;

public class FirstFunction extends AbstractFunction {

    FirstFunction() {
        super("3x^3 - 2x^2 - 7x - 8");
    }

    @Override
    public double solution(double arg) {
        return (3*Math.pow(arg, 3) - 2*Math.pow(arg, 2) - 7*arg - 8);
    }
}
