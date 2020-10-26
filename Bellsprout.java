import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level) {
        super(name, level);

        setType(Type.GRASS, Type.POISON);

        //назначаем статы (взято с pokemondb.net)
        double healthPoints = 50;
        double attack = 75;
        double defense = 35;
        double specialAttack = 70;
        double specialDefence = 30;
        double speed = 40;
        setStats(healthPoints, attack, defense, specialAttack, specialDefence, speed);

        //назначаем атаки
        Move attackEnergyBall = new EnergyBall();
        Move attackSweetScent = new SweetScent();
        setMove(attackEnergyBall, attackSweetScent);

    }
}
