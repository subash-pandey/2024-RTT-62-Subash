package PA_303_10_1;

public class StoneMonster extends Monster {
    public StoneMonster() {
    }
    public StoneMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return ("Attack with stone! ");
    }
}
