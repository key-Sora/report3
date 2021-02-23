package jp.ac.uryukyu.ie.e205717;

public class Warrior extends LivingThing{

    public Warrior(String name, int maxHP, int attack) {
        super(name, maxHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        int damage = (int)(1.5 * attack);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }

	public Integer getHitpoint() {
		return null;
	}
    
}
