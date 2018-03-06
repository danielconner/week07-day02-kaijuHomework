public abstract class Building {

    private String type;
    private int damagedLimit;


    public Building(String type, int damagedLimit) {
        this.type = type;
        this.damagedLimit = damagedLimit;
    }

    public String getType() {
        return type;
    }

    public int getDamagedLimit() {
        return damagedLimit;
    }
}
