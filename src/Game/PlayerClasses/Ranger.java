package Game.PlayerClasses;

import Game.Player;
import Game.RandomGenerator;

public class Ranger extends Player {
  RandomGenerator randomGenerator = new RandomGenerator();
  public Ranger() {
    super();
    setLvl(1);
    setExp(0);
    setStrength(randomGenerator.stat());
    setPerception(randomGenerator.stat());
    setEndurance(randomGenerator.stat());
    setCharisma(randomGenerator.stat());
    setIntelligence(randomGenerator.stat());
    setAgility(randomGenerator.stat());
    setLuck(randomGenerator.stat());
    setHitPointsModifier(randomGenerator.hpRanger()+(getEndurance()-10)/2);
  }
}
