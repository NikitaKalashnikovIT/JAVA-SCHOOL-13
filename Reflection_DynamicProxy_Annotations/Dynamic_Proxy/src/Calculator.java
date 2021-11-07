
@Metric
public class Calculator implements CalculatorImpl{
    private int result = 1;
    private int variable = 0;
    String name ;
    public static final String MONDAY = "MMM";
    public static final String CONST_VAR = "bla bla";

    private int XXX(){
        return 1;
    }
    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Metric
    public void calc(int number) {
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("Факториал  числа "+ number + " = " + result);
    }
}
