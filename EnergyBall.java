import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class EnergyBall extends SpecialMove {

    public EnergyBall() {
        priority = 0;
        type = Type.GRASS;
        accuracy = 100;
        power = 90;
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
        return ("исппользует Energy Ball");
    }
}
