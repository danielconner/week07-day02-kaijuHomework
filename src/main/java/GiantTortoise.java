public class GiantTortoise extends Kaiju implements IAttack, IMove, IBuildingAttack{

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

    @Override
    public String move(String move) {
        return getName() + " has just " + move;
    }

    @Override
    public String buildingAttack(Building building) {
        if (building.getDamagedLimit() - getAttack() <= 0) {
            return "a " + building.getType() + " has been destroyed by " + getName() +"!";
        }
        else return building.getType() + " has been badly damaged";
    }
}
