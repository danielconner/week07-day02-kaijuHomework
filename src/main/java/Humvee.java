public class Humvee extends Vechile implements IArmyAttack, INucelarOption{

    public Humvee(String type, int health) {
        super(type, health);
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
