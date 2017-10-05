package Akariam;

public class BBdier extends Ranged {
    private int sulfurCost;

    public void setSulfurCost(int sulfurCost) {
        this.sulfurCost = sulfurCost;
    }

    public int getSulfurCost() {
        return sulfurCost;
    }

    RangedW wp1 = new RangedW();

    public BBdier() {
        setID(11);
        setAmmount(0);
        setAttack(40);
        setCargoWeight(30);
        setClas("Machine");
        setGenerals(5.8f);
        setHumanCost(5);
        setName("Ballon-Bombardier");
        setReqLvBarracks(11);
        setReqResearch(8);
        setSize(2);
        setSpeed(20);
        setTimeBuild(180000);
        setType("Bomber");
        setUnKeep(45);
        setSulfurCost(250);
        setWoodCost(40);
        wp1.setWRank(1);
        wp1.setWName("Bomb");
        wp1.setAccuracyW(0.2f);
        wp1.setWDamage(48);
        wp1.setMunition(2);
    }
}
