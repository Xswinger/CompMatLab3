package Functions;

public class SecondFunction extends AbstractFunction {

    SecondFunction() {
        super("2x^3 - 3x^2 + 5x - 9");
    }

    @Override
    public double solution(double arg) {
        return (2*Math.pow(arg, 3) - 3*Math.pow(arg, 2) + 5*arg - 9);
    }
}
