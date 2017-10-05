package Akariam;

public class Gcpter extends Ranged {
    private int sulfurCost;

    public void setSulfurCost(int sulfurCost) {
        this.sulfurCost = sulfurCost;
    }

    public int getSulfurCost() {
        return sulfurCost;
    }

    RangedW wp1 = new RangedW();

    public Gcpter() {
        setID(12);
        setAmmount(0);
        setAttack(29);
        setCargoWeight(15);
        setClas("Machine");
        setGenerals(2.5f);
        setHumanCost(3);
        setName("Gyrocopter");
        setReqLvBarracks(10);
        setReqResearch(9);
        setSize(1);
        setSpeed(80);
        setTimeBuild(90000);
        setType("Fighter Pilot");
        setUnKeep(15);
        setSulfurCost(100);
        setWoodCost(25);
        wp1.setWRank(1);
        wp1.setWName("Crossbow");
        wp1.setAccuracyW(0.8f);
        wp1.setWDamage(17);
        wp1.setMunition(4);
    }
}
