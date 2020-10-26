import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cranidos extends Pokemon {
    public Cranidos(String name, int level) {

        super(name, level);

        //назначаем типы покемону
        setType(Type.ROCK);

        //назначаем статы (взято с pokemondb.net)
        double healthPoints = 67;
        double attack = 125;
        double defense = 40;
        double specialAttack = 30;
        double specialDefence = 30;
        double speed = 58;
        setStats(healthPoints, attack, defense, specialAttack, specialDefence, speed);

        //назначаем атаки
        Move attackConfide = new Confide();
        Move attackRockPolish = new RockPolish();
        Move attackSwagger = new Swagger();
        setMove(attackConfide, attackRockPolish, attackSwagger);
    }
}
