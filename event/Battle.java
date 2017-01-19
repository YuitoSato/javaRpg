package javaRpg.event;
import java.util.*;
import javaRpg.character.*;

public class Battle {
	private BattleCharacter hero;
	private BattleCharacter monster;
	
	public Battle(BattleCharacter hero, BattleCharacter monster) {
		this.hero = hero;
		this.monster = monster;
		String line = "------------------------";
		System.out.println(line + "\nたたかう：0\nまほう：1\nまもる：2\nためる：3\n" + line);
	}
	
	public boolean start() {
		while (hero.getHp() >= 0 && monster.getHp() >=0) {
			System.out.println(hero.name +  "：" + hero.getHp());
			System.out.println(monster.name +  "：" + monster.getHp());
			System.out.println("アクションを入力してください");
			String actionInputStr = new java.util.Scanner( System.in ).nextLine();
			int heroActionInput = Integer.parseInt(actionInputStr);
			hero.action(heroActionInput, monster);
			int monsterActionInput = new java.util.Random().nextInt(1);
			monster.action(monsterActionInput, hero);
		}

		if (monster.getHp() <= 0) {
			System.out.println(monster.name + "を倒した！");
			return true;
		} else {
			System.out.println(hero.name + "は力尽きた。。");
			System.out.println("ゲームオーバー");
			return false;
		}
	}
}
