public class GiantTortoise extends Kaiju implements IAttack{

    public GiantTortoise(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public String attackVechile(Vechile vechile) {
         if (vechile.getHealth() - getAttack() < 0){
            return vechile.getType() + " has been destroyed";
        }
        return vechile.getType() + " has been damaged and health is currently " + (vechile.getHealth() - getAttack());
    }
}