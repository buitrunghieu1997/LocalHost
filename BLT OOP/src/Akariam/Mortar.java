package Akariam;

public class Mortar extends Ranged {
    private int sulfurCost;

    public void setSulfurCost(int sulfurCost) {
        this.sulfurCost = sulfurCost;
    }

    public int getSulfurCost() {
        return sulfurCost;
    }

    RangedW wp1 = new RangedW();
    MeleeW wp2 = new MeleeW();//co can them bien boolean de xac dinh khi nao dung VK nao?

    public Mortar() {
        setID(9);
        setAmmount(0);
        setAttack(32);
        setCargoWeight(30);
        setClas("Machine");
        setGenerals(31.0f);
        setHumanCost(5);
        setName("Motar");
        setReqLvBarracks(14);
        setReqResearch(5);
        setSize(5);
        setSpeed(40);
        setTimeBuild(240000);
        setType("Artillery");
        setUnKeep(30);
        setSulfurCost(1250);
        setWoodCost(300);
        wp1.setWRank(1);
        wp1.setWName("Mortar Shell");
        wp1.setAccuracyW(0.1f);
        wp1.setWDamage(270);
        wp1.setMunition(3);
        wp2.setWRank(2);
        wp2.setWName("Dagger");
        wp2.setAccuracyW(0.2f);
        wp2.setWDamage(10);
    }
}
