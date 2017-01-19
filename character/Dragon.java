package javaRpg.character;

public class Dragon extends BattleCharacter {
	public Dragon() {
		this.name = "ドラゴン";
		this.setHp(60);
		System.out.println(this.name + "が現れました！");
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
