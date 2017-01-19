package javaRpg.main;
import javaRpg.character.*;
import javaRpg.event.Battle;

public class Main {
	public static void main(String[] args) {
		System.out.println("ゲームスタート");
		Hero hero = new Hero();
		Matango matango = new Matango();
		Battle firstBattle = new Battle(hero, matango);
		if (firstBattle.start()) {
			SuperHero superHero = new SuperHero();
			Dragon dragon = new Dragon();
			System.out.println(dragon.getHp());
			Battle secondBattle = new Battle(superHero, dragon);

			if (secondBattle.start()) {
				System.out.println("ゲームクリア！");
			}
		}
	}
}
