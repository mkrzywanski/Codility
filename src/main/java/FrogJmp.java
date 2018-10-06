public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        double value = (Y - X) / (D * 1.0);
        return (int) Math.ceil(value);
    }
}
