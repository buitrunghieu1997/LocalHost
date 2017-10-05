package Akariam;

public class S300 extends Melee{ //Spartans300
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

    public S300() {
        setID(1);
        setAmmount(0);
        setAttack(60);
        setArmor(6);
        setCargoWeight(5);
        setClas("Human");
        setGenerals(1.6f);
        setHumanCost(0);
        setName("300 Spartans");
        setReqLvBarracks(0);
        setReqResearch(0);
        setSize(1);
        setSpeed(60);
        setTimeBuild(0);
        setType("Heavy Infantry");
        setUnKeep(0);
        setSulfurCost(40);
        setWoodCost(40);
        wp.setAccuracyW(1); //vu khi mau vang tren ikariam.wikia.com/wiki/Units
        wp.setWDamage(28);
        wp.setWName("Spear");
        wp.setWRank(1);
    }
}
