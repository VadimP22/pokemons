import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Qwilfish extends Pokemon {
    public Qwilfish(String name, int level) {

        super(name, level);

        //назначаем типы покемону
        setType(Type.WATER, Type.POISON);

        //назначаем статы (взято с pokemondb.net)
        double healthPoints = 65;
        double attack = 95;
        double defense = 85;
        double specialAttack = 55;
        double specialDefence = 55;
        double speed = 85;
        setStats(healthPoints, attack, defense, specialAttack, specialDefence, speed);

        //назначаем атаки
        Move attackRest = new Rest();
        Move attackAcidSpray = new AcidSpray();
        Move attackAstonish = new Astonish();
        Move attackBubble = new Bubble();
        setMove(attackRest, attackAcidSpray, attackAstonish, attackBubble);
    }


}
