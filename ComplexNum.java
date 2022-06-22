class ComplexNum {

    private double a;
    private double b;
    private ComplexNum result;

    ComplexNum(double a1, double b1) {
        a = a1;
        b = b1;
    }


    ComplexNum complexAdd(ComplexNum additive) {
        a = a + additive.a;
        b = b + additive.b;
        return this;
    }

    ComplexNum complexReduce(ComplexNum reduction) {
        a = a - reduction.a;
        b = b - reduction.b;
        return this;
    }

    ComplexNum complexMultiply(ComplexNum multiplier) {
        double buf = a;
        a = a * multiplier.a - b * multiplier.b;
        b = buf * multiplier.b + b * multiplier.a;
        return this;
    }

    double module() {
        return Math.sqrt(a * a + b * b);
    }

    ComplexNum complexDivide(ComplexNum divident) {
        double m = (a * divident.a + b * divident.b)/(divident.a*divident.a+divident.b*divident.b);
        b = (b*divident.a - a * divident.b)/(divident.a*divident.a+divident.b*divident.b);
        a=m;
        return this;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public ComplexNum getResult() {
        return result;

    }

    void printResult(ComplexNum arg) {
        System.out.println(arg.getB() + "i " + "+ (" + arg.getA() + ")");
    }

}
