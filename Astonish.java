import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Astonish extends PhysicalMove {

    public Astonish() {
        accuracy = 100;
        power = 30;
        type = Type.GHOST;
        priority = 0;
        hits = 1;
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        super.applyOppEffects(pokemon);

        //создаём и применяем эффект flinch
        Effect flinchEffect = new Effect();
        flinchEffect.attack(0);
        flinchEffect.turns(1);
        flinchEffect.chance(0.30);
        pokemon.addEffect(flinchEffect);
    }


    @Override
    protected String describe() {
        return ("исппользует Astonish");
    }


}
