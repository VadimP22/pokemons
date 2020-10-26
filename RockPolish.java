import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class RockPolish extends StatusMove {

    public RockPolish() {
        type = Type.ROCK;
        accuracy = 85;
        priority = 0;
        hits = 1;
    }


    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, 2);
    }


    @Override
    protected String describe() {
        return ("использует Rock Polish");
    }

}
