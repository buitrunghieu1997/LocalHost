package Akariam;

public class SwMan extends Melee {
    private int sulfurCost;

    public void setSulfurCost(int sulfurCost) {
        this.sulfurCost = sulfurCost;
    }

    public int getSulfurCost() {
        return sulfurCost;
    }

    Weapon wp = new Weapon();

    public SwMan() {
        setID(4);
        setAmmount(0);
        setAttack(18);
        setCargoWeight(3);
        setClas("Human");
        setGenerals(1.2f);
        setHumanCost(1);
        setName("Sword Man");
        setReqLvBarracks(6);
        setReqResearch(1);
        setSize(1);
        setSpeed(60);
        setTimeBuild(18000);
        setType("Light Infantry");
        setUnKeep(4);
        setSulfurCost(30);
        setWoodCost(30);
        wp.setAccuracyW(0.9f); //vu khi mau vang tren ikariam.wikia.com/wiki/Units
        wp.setWDamage(10);
        wp.setWName("Sword");
        wp.setWRank(1);
    }
}
