package javaRpg.character;

public class SuperHero extends Hero {
	public SuperHero() {
		this.name = "スーパーヒーロー";
		this.setHp(1000);
		System.out.println(this.name + "にランクアップしました！");
	}

	@Override
	protected void attack(BattleCharacter character) {
		int attackPoint = 40;
		System.out.println(this.name + "の攻撃！" + attackPoint + "のダメージ！");
		int hp = character.getHp() - attackPoint;
		character.setHp(hp);
		System.out.println(character.name + "のHP残り：" + character.getHp());
	}
}
