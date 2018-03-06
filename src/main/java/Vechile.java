public abstract class Vechile {

    private String type;
    private int health;

    public Vechile(String type, int health) {
        this.type = type;
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }
}
