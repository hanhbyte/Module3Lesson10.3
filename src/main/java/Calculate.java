public class Calculate {
    private int first;
    private int second;

    public Calculate() {
    }

    public Calculate(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public double add() {
        return first + second;
    }

    public double sub() {
        return first - second;
    }

    public double mul() {
        return first * second;
    }

    public double div() throws ArithmeticException {
        if (second == 0) {
            throw new ArithmeticException("By zero");
        }
        return (double) first / (double)second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public double count(int chose){
        double result;
        switch (chose){
            case 1:
                result = add();
            break;
            case 2:
                result = sub();
                break;
            case 3:
                result = mul();
                break;
            case 4:
                result = div();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + chose);
        }
        return result;
    }
}
