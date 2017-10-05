package Akariam;

public class SCneer extends Ranged {
    private int sulfurCost;

    public void setSulfurCost(int sulfurCost) {
        this.sulfurCost = sulfurCost;
    }

    public int getSulfurCost() {
        return sulfurCost;
    }

    RangedW wp1 = new RangedW();
    MeleeW wp2 = new MeleeW();//co can them bien boolean de xac dinh khi nao dung VK nao?

    public SCneer() {
        setID(6);
        setAmmount(0);
        setAttack(12);
        setCargoWeight(5);
        setClas("Human");
        setGenerals(4.0f);
        setHumanCost(1);
        setName("Sulphur Carabineer");
        setReqLvBarracks(13);
        setReqResearch(3);
        setSize(4);
        setSpeed(60);
        setTimeBuild(60000);
        setType("Long-Range Fighter");
        setUnKeep(3);
        setSulfurCost(150);
        setWoodCost(50);
        wp1.setWRank(1);
        wp1.setWName("Harquebus");
        wp1.setAccuracyW(0.7f);
        wp1.setWDamage(29);
        wp1.setMunition(3);
        wp2.setWRank(2);
        wp2.setWName("Bayonet");
        wp2.setAccuracyW(0.6f);
        wp2.setWDamage(3);
    }
}
