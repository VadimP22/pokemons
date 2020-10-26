import ru.ifmo.se.pokemon.Move;

public class Rampardos extends Cranidos {

    public Rampardos(String name, int level) {
        super(name, level);

        //level >= 30
        if (getLevel() < 30) {
            setLevel(30);
        }

        //назначаем статы (взято с pokemondb.net)
        double healthPoints = 97;
        double attack = 165;
        double defense = 60;
        double specialAttack = 65;
        double specialDefence = 50;
        double speed = 58;
        setStats(healthPoints, attack, defense, specialAttack, specialDefence, speed);

        //добавляем 1 атаку к существующим 3-м
        Move attackFocusBlast = new FocusBlast();
        addMove(attackFocusBlast);

    }


}
