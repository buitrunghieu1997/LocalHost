package Akariam;

public class Archer extends Ranged {
    private int sulfurCost;

    public void setSulfurCost(int sulfurCost) {
        this.sulfurCost = sulfurCost;
    }

    public int getSulfurCost() {
        return sulfurCost;
    }

    RangedW wp1 = new RangedW();
    MeleeW wp2 = new MeleeW();//co can them bien boolean de xac dinh khi nao dung VK nao?

    public Archer() {
        setID(7);
        setAmmount(0);
        setAttack(16);
        setCargoWeight(5);
        setClas("Human");
        setGenerals(1.1f);
        setHumanCost(1);
        setName("Archer");
        setReqLvBarracks(7);
        setReqResearch(4);
        setSize(1);
        setSpeed(60);
        setTimeBuild(24000);
        setType("Long-Range Fighter");
        setUnKeep(4);
        setSulfurCost(25);
        setWoodCost(30);
        wp1.setWRank(1);
        wp1.setWName("Bow");
        wp1.setAccuracyW(0.4f);
        wp1.setWDamage(5);
        wp1.setMunition(3);
        wp2.setWRank(2);
        wp2.setWName("Short Sword");
        wp2.setAccuracyW(0.6f);
        wp2.setWDamage(5);
    }
}
