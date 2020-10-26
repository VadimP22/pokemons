import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SweetScent extends StatusMove {

    public SweetScent() {
        type = Type.NORMAL;
        accuracy = 100;
        priority = 0;
        hits = 1;
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, -1);
    }


    @Override
    protected String describe() {
        return ("испльзует Sweet Scent");
    }


}
