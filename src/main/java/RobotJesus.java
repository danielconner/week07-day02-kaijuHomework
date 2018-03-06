public class RobotJesus extends Kaiju implements IAttack{

    public RobotJesus(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public String attackVechile(Vechile vechile) {
        if (vechile.getHealth() - getAttack() <= 0){
            return vechile.getType() + " has been destroyed";
        }
         else return vechile.getType() + " Has been damaged and health is currently " + (vechile.getHealth() - getAttack());
    }
}
