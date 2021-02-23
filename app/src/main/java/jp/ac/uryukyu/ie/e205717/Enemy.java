package jp.ac.uryukyu.ie.e205717;

public class Enemy extends LivingThing{

    public Enemy(String name, int maxHP, int attack) {
        super(name, maxHP, attack);
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

	public static Integer getHitpoint() {
		return null;
	}
}