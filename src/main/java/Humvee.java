public class Humvee extends Vechile implements IArmyAttack{

    public Humvee(String type, int health) {
        super(type, health);
    }

    @Override
    public String armyAttack(Kaiju kaiju) {
        return getType() + " has attacked " + kaiju.getName();
    }
}
