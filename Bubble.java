import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Bubble extends PhysicalMove {

    public Bubble() {
        accuracy = 100;
        power = 40;
        type = Type.WATER;
        priority = 0;
        hits = 1;
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (chance(10)) {
            pokemon.setMod(Stat.SPEED, -1);
        }

    }


    private boolean chance(double percents) {
        if (Math.random() <= percents/100) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    protected String describe() {
        return ("использует Bubble");
    }

}
