public class RewardValue {
    
    private double cV;
    private int m;

    public RewardValue(double V) {
        this.cV = V;
        this.m = (int) (10000*V/35);
    }

    public RewardValue(int M) {
        this.m = M;
        this.cV = 0.0035*Double.valueOf(M);
    }

    public double getCashValue() {
        return this.cV;
    }

    public int getMilesValue() {
        return this.m;
    }
}