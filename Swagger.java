import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove {

    public Swagger() {
        type = Type.ROCK;
        priority = 0;
        hits = 1;
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.confuse();
        pokemon.setMod(Stat.ATTACK, 2);
    }


    @Override
    protected String describe() {
        return ("использует Swagger");
    }


}
