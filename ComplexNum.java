class ComplexNum {

    private double path1;
    private double path2;

    ComplexNum(double a1, double b1) {
        path1 = a1;
        path2 = b1;
    }

    public ComplexNum() {
        super();
    }

    ComplexNum complexSum(ComplexNum additive) {
        path1 = path1 + additive.path1;
        path2 = path2 + additive.path2;
        return this;
    }

    ComplexNum complexDiff(ComplexNum reduction) {
        path1 = path1 - reduction.path1;
        path2 = path2 - reduction.path2;
        return this;
    }

    ComplexNum complexMultiply(ComplexNum multiplier) {
        double buf = path1;
        path1 = path1 * multiplier.path1 - path2 * multiplier.path2;
        path2 = buf * multiplier.path2 + path2 * multiplier.path1;
        return this;
    }

    ComplexNum complexDivide(ComplexNum divident) {
        double m = (path1 * divident.path1 + path2 * divident.path2) / (divident.path1 * divident.path1 + divident.path2 * divident.path2);
        path2 = (path2 * divident.path1 - path1 * divident.path2) / (divident.path1 * divident.path1 + divident.path2 * divident.path2);
        path1 = m;
        return this;
    }

    public double getPath1() {
        return path1;
    }

    public double getPath2() {
        return path2;
    }

    void printResult(ComplexNum arg) {
        if (arg.getPath1() == 0)
            System.out.printf("Result: %.1fi", arg.getPath2());
        else if (arg.getPath2() == 0)
            System.out.printf("Result: %.1f", arg.getPath1());
        else if (arg.getPath2() > 0)
            System.out.printf("Result: %.1f + %.1fi", arg.getPath1(), arg.getPath2());
        else if (arg.getPath2() < 0) {
            System.out.printf("Result: %.1f + (%.1fi)", arg.getPath1(), arg.getPath2());
        }

    }

}
