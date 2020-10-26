import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Bellsprout {
    public Weepinbell(String name, int level) {
        super(name, level);

        //level >= 21
        if (getLevel() < 21) {
            setLevel(21);
        }

        //назначаем статы (взято с pokemondb.net)
        double healthPoints = 65;
        double attack = 90;
        double defense = 50;
        double specialAttack = 85;
        double specialDefence = 45;
        double speed = 55;
        setStats(healthPoints, attack, defense, specialAttack, specialDefence, speed);

        //добавляем атаки
        Move attackSlam = new Slam();
        addMove(attackSlam);

    }
}
