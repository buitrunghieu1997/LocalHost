package Akariam;

public class Weapon {
    private String WName;
    public void setWName(String WName) {
        this.WName = WName;
    }
    public String getWName() {
        return WName;
    }

    private int WRank;
    public void setWRank(int WRank) {
        this.WRank = WRank;
    }
    public int getWRank() {
        return WRank;
    }

    private int WDamage;
    public void setWDamage(int WDamage) {
        this.WDamage = WDamage;
    }
    public int getWDamage() {
        return WDamage;
    }

    private float accuracyW;
    public void setAccuracyW(float accuracyW) {
        this.accuracyW = accuracyW;
    }
    public float getAccuracyW() {
        return accuracyW;
    }
}
