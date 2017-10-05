package Akariam;
//no docter, no cook so no "crystal glass" and no "wine" elements
//No special army Babarian exe swinger
//luu y cua thay xem thoi gian bulid quan nhanh hon bao nhieu lan
public class Army {
    private int ID;
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }

    private int ammount;
    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
    public int getAmmount() {
        return ammount;
    }

    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private String type;
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    private String clas;
    public void setClas(String clas) {
        this.clas = clas;
    }
    public String getClas() {
        return clas;
    }

    private int attack; //hitPoint
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getAttack() {
        return attack;
    }

    private int cargoWeight;
    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
    public int getCargoWeight() {
        return cargoWeight;
    }

    private int speed;
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    private int size;
    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }

    private int humanCost; //So dan ton de xay dung
    public void setHumanCost(int humanCost) {
        this.humanCost = humanCost;
    }
    public int getHumanCost() {
        return humanCost;
    }

    private int woodCost;
    public void setWoodCost(int woodCost) {
        this.woodCost = woodCost;
    }
    public int getWoodCost() {
        return woodCost;
    }

    private int unKeep; //muc luong
    public void setUnKeep(int unKeep) {
        this.unKeep = unKeep;
    }
    public int getUnKeep() {
        return unKeep;
    }

    private int timeBuild; //ms
    public void setTimeBuild(int timeBuild) {
        this.timeBuild = timeBuild;
    }
    public int getTimeBuild() {
        return timeBuild;
    }

    private int reqLvBarracks;
    public void setReqLvBarracks(int reqLvBarracks) {
        this.reqLvBarracks = reqLvBarracks;
    }
    public int getReqLvBarracks() {
        return reqLvBarracks;
    }

    private int reqResearch; // tao ID cua cac research
    public void setReqResearch(int reqResearch) {
        this.reqResearch = reqResearch;
    }
    public int getReqResearch() {
        return reqResearch;
    }

    private float generals;
    public void setGenerals(float generals) {
        this.generals = generals;
    }
    public float getGenerals() {
        return generals;
    }
}
