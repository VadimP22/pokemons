import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest() {
        type = Type.PSYCHIC;
        priority = 0;
        hits = 1;
    }


    @Override
    protected boolean checkAccuracy (Pokemon attacker, Pokemon defender) {
        return true;
    }


    @Override
    protected void applySelfEffects (Pokemon pokemon) {

        //лечим покемона
        pokemon.restore();

        //создаём эффект
        Effect sleepEffect = new Effect();
        //настраиваем
        sleepEffect.attack(0);
        sleepEffect.turns(2);
        sleepEffect.condition(Status.SLEEP);
        //применяем
        pokemon.addEffect(sleepEffect);
    }


    @Override
    protected String describe() {
        return ("использует Rest");
    }


}
