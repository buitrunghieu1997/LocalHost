package Akariam;

public class SpMan extends Melee{
    Weapon wp = new Weapon();

    public SpMan() {
        setID(5);
        setAmmount(0);
        setAttack(13);
        setCargoWeight(3);
        setClas("Human");
        setGenerals(0.6f);
        setHumanCost(1);
        setName("Spear Man");
        setReqLvBarracks(1);
        setReqResearch(0);
        setSize(1);
        setSpeed(60);
        setTimeBuild(6000);
        setType("Light Infantry");
        setUnKeep(1);
        setWoodCost(30);
        wp.setAccuracyW(0.7f); //vu khi mau vang tren ikariam.wikia.com/wiki/Units
        wp.setWDamage(4);
        wp.setWName("Spear");
        wp.setWRank(1);
    }
}
