package Akariam;

public class Hoplite extends Melee{
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

    private float oD; //Offense/Defense for hosplite only

    public void setoD(float oD) {
        this.oD = oD;
    }

    public float getoD() {
        return oD;
    }

    public Hoplite() {
        setID(2);
        setAmmount(0);
        setAttack(56);
        setArmor(1);
        setCargoWeight(5);
        setClas("Human");
        setGenerals(1.4f);
        setHumanCost(1);
        setName("Hosplite");
        setReqLvBarracks(4);
        setReqResearch(1); //code 1 = Professional Army in Military
        setSize(1);
        setSpeed(60);
        setTimeBuild(30000); //ms
        setType("Heavy Infantry");
        setUnKeep(3);
        setSulfurCost(30);
        setWoodCost(40);
        setoD(3.5f);
        wp.setAccuracyW(0.9f);
        wp.setWDamage(18);
        wp.setWName("Spear");
        wp.setWRank(1);
    }
}
