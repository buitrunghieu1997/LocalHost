package Akariam;

public class SGiant extends Melee {
    private int sulfurCost;

    public void setSulfurCost(int sulfurCost) {
        this.sulfurCost = sulfurCost;
    }

    public int getSulfurCost() {
        return sulfurCost;
    }

    private int armor;

    public void setArmor(int armor) { this.armor = armor; }

    public int getArmor() { return armor; }

    Weapon wp = new Weapon();

    public SGiant() {
        setID(3);
        setAmmount(0);
        setAttack(184);
        setArmor(3);
        setCargoWeight(15);
        setClas("Machine");
        setGenerals(6.2f);
        setHumanCost(2);
        setName("Steam Giant");
        setReqLvBarracks(12);
        setReqResearch(2);
        setSize(3);
        setSpeed(40);
        setTimeBuild(90000);
        setType("Heavy Infantry");
        setUnKeep(12);
        setSulfurCost(180);
        setWoodCost(130);
        wp.setAccuracyW(1); //vu khi mau vang tren ikariam.wikia.com/wiki/Units
        wp.setWDamage(42);
        wp.setWName("Steam lance");
        wp.setWRank(1);
    }
}
