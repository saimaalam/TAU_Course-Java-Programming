package chapter9;

public class WeddingCake extends Cake {
    public String tiers;
    public WeddingCake() {
        super("Red Velvet");
    }

    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }
}
