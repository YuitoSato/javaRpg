package javaRpg.character;

public abstract class BattleCharacter {
	public String name;
    private int hp;

	public void action(int actionInput, BattleCharacter character) {
		switch (actionInput) {
			case 0:
				this.attack(character);
				break;
			case 1:
			case 2:
			case 3:
		}
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	protected abstract void attack(BattleCharacter character);
}
