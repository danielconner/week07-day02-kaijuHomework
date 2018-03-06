public class Tank extends Vechile implements IArmyAttack{

    public Tank(String name, int health) {
        super(name, health);
    }

    @Override
    public String armyAttack(Kaiju kaiju) {
        return getType() + " has attacked " + kaiju.getName();
    }
}
