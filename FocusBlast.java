import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends SpecialMove {

    public FocusBlast() {
        priority = 0;
        type = Type.FIGHTING;
        accuracy = 70;
        power = 120;
    }


    private boolean chance(double percents) {
        if (Math.random() <= percents/100) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        if (chance(10)) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }

    }



    @Override
    protected String describe() {
        return ("исппользует Focus Blast");
    }

}
