package Akariam;

public class Ram extends Melee {
    private int armor;

    public void setArmor(int armor) { this.armor = armor; }

    public int getArmor() { return armor; }

    MeleeW wp1 = new MeleeW();//co can them bien boolean de xac dinh khi nao dung VK nao?
    MeleeW wp2 = new MeleeW();

    public Ram() {
        setID(11);
        setAmmount(0);
        setAttack(88);
        setArmor(1);
        setCargoWeight(30);
        setClas("Machine");
        setGenerals(4.4f);
        setHumanCost(5);
        setName("Ram");
        setReqLvBarracks(3);
        setReqResearch(7);
        setSize(5);
        setSpeed(40);
        setTimeBuild(180000);
        setType("Artillery");
        setUnKeep(15);
        setWoodCost(220);
        wp1.setWRank(1);
        wp1.setWName("Ram");
        wp1.setAccuracyW(0.1f);
        wp1.setWDamage(80);
        wp2.setWRank(2);
        wp2.setWName("Short Sword");
        wp2.setAccuracyW(0.7f);
        wp2.setWDamage(12);
    }
}
