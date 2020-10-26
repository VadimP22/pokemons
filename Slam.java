import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Slam extends PhysicalMove {

    public Slam() {
        //type, power, accuracy, priority, hits
        super(Type.NORMAL, 80, 75, 0, 1);
    }


    @Override
    protected String describe() {
        return ("исппользует Slam");
    }
}
