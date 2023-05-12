package Functions;

public class ThirdFunction extends AbstractFunction {

    ThirdFunction() {
        super("x^3 - 3x^2 + 6x - 19");
    }

    @Override
    public double solution(double arg) {
        return (Math.pow(arg, 3) - 3*Math.pow(arg, 2) + 6*arg - 19);
    }
}
