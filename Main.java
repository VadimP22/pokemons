//import ru.ifmo.se.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {

    public static void main(String[] args) {

        Battle battle = new Battle();

	    Pokemon p1 = new Qwilfish("Qwilfi",1);
	    Pokemon p2 = new Cranidos("Cran", 1);
	    Pokemon p3 = new Rampardos("Ramp", 30);
	    Pokemon p4 = new Bellsprout("Bells", 1);
	    Pokemon p5 = new Weepinbell("Weep", 21);
	    Pokemon p6 = new Victreebel("Vi", 21);


	    battle.addAlly(p3);
		battle.addAlly(p2);
		battle.addAlly(p1);

		battle.addFoe(p4);
		battle.addFoe(p5);
		battle.addFoe(p6);
        battle.go();
    }
}
