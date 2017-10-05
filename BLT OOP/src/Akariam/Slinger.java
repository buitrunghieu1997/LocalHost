package Akariam;

public class Slinger extends Ranged{
    RangedW wp1 = new RangedW();
    MeleeW wp2 = new MeleeW();//co can them bien boolean de xac dinh khi nao dung VK nao?

    public Slinger() {
        setID(8);
        setAmmount(0);
        setAttack(8);
        setCargoWeight(3);
        setClas("Human");
        setGenerals(0.4f);
        setHumanCost(1);
        setName("Slinger");
        setReqLvBarracks(2);
        setReqResearch(0);
        setSize(1);
        setSpeed(60);
        setTimeBuild(9000);
        setType("Long-Range Fighter");
        setUnKeep(2);
        setWoodCost(20);
        wp1.setWRank(1);
        wp1.setWName("Sling");
        wp1.setAccuracyW(0.2f);
        wp1.setWDamage(3);
        wp1.setMunition(5);
        wp2.setWRank(2);
        wp2.setWName("Dagger");
        wp2.setAccuracyW(0.6f);
        wp2.setWDamage(2);
    }
}
