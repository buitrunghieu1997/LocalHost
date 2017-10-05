package Akariam;

public class Catapult extends Ranged {
    private int sulfurCost;

    public void setSulfurCost(int sulfurCost) {
        this.sulfurCost = sulfurCost;
    }

    public int getSulfurCost() {
        return sulfurCost;
    }

    RangedW wp1 = new RangedW();
    MeleeW wp2 = new MeleeW();//co can them bien boolean de xac dinh khi nao dung VK nao?

    public Catapult() {
        setID(10);
        setAmmount(0);
        setAttack(54);
        setCargoWeight(30);
        setClas("Machine");
        setGenerals(11.2f);
        setHumanCost(5);
        setName("Catapult");
        setReqLvBarracks(8);
        setReqResearch(6);
        setSize(5);
        setSpeed(40);
        setTimeBuild(180000);
        setType("Artillery");
        setUnKeep(25);
        setSulfurCost(300);
        setWoodCost(260);
        wp1.setWRank(1);
        wp1.setWName("Rock");
        wp1.setAccuracyW(0.1f);
        wp1.setWDamage(133);
        wp1.setMunition(5);
        wp2.setWRank(2);
        wp2.setWName("Dagger");
        wp2.setAccuracyW(0.2f);
        wp2.setWDamage(4);
    }
}
