import ru.ifmo.se.pokemon.Move;

public class Victreebel extends Weepinbell {

    public Victreebel(String name, int level) {
        super(name, level);


        //назначаем статы (взято с pokemondb.net)
        double healthPoints = 80;
        double attack = 105;
        double defense = 65;
        double specialAttack = 100;
        double specialDefence = 70;
        double speed = 70;
        setStats(healthPoints, attack, defense, specialAttack, specialDefence, speed);

        //добавляем атаки
        Move attackSwordsDance = new SwordsDance();
        addMove(attackSwordsDance);

    }


}
