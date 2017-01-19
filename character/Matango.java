package javaRpg.character;

public class Matango extends BattleCharacter {
	public Matango() {
		this.name = "おばけキノコ";
		this.setHp(30);
		System.out.println(this.name + "が現れました！");
	}

	@Override
	protected void attack(BattleCharacter character) {
		int attackPoint = 10;
		System.out.println(this.name + "の攻撃！" + attackPoint + "のダメージ！");
		int hp = character.getHp() - attackPoint;
		System.out.println(hp);
		character.setHp(hp);
		System.out.println(character.name + "のHP残り：" + character.getHp());
	}
}
