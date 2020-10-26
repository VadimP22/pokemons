import ru.ifmo.se.pokemon.*;

public class AcidSpray extends StatusMove {

    public AcidSpray() {
        type = Type.POISON;
        power = 40;
        accuracy = 100;
        priority = 0;
        hits = 1;
    }


    @Override
    protected boolean checkAccuracy(Pokemon attacker, Pokemon defender) {
        return true;
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_DEFENSE, -2);
    }


    @Override
    protected String describe() {
        return ("испльзует Acid Spray");
    }


}
