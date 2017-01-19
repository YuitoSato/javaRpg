package javaRpg.character;

public class Hero extends BattleCharacter {
	public Hero() {
		this.name = "ヒーロー";
		this.setHp(40);
		System.out.println(this.name + "が誕生しました！");
	}

	@Override
	protected void attack(BattleCharacter character) {
		int attackPoint = 20;
		System.out.println(this.name + "の攻撃！" + attackPoint + "のダメージ！");
		int hp = character.getHp() - attackPoint;
		character.setHp(hp);
		System.out.println(character.name + "のHP残り：" + character.getHp());
	}
}
