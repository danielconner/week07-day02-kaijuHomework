public class Tank extends Vechile implements IArmyAttack, INucelarOption{

    public Tank(String name, int health) {
        super(name, health);
    }

    @Override
    public String armyAttack(Kaiju kaiju) {
        return getType() + " has attacked " + kaiju.getName();
    }

    @Override
    public String nuke(Kaiju kaiju) {
        return getType() + " has nuked " + kaiju.getName();
    }
}
