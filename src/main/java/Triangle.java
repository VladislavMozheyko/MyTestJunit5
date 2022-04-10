public class Triangle {
    public double setUp(int a, int b, int c) {
        int p;
        double s;
        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(s);
        return s;
    }
}
