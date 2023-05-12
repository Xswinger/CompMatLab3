package Functions;

public class Test extends AbstractFunction{
    Test() {
        super("y=x");
    }

    @Override
    public double solution(double arg) {
        return (-3*Math.pow(arg, 3) - 5*Math.pow(arg, 2) + 4*arg - 2);
    }
}
