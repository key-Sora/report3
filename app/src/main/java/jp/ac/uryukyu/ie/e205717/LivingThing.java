package jp.ac.uryukyu.ie.e205717;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name キャラクター名
     * @param maxHP キャラのHP
     * @param attack キャラの攻撃力
     */
    public LivingThing (String name, int maxHP, int attack){
        this.name = name;
        hitPoint = maxHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maxHP, attack);
    }

    public boolean isDead(){
        if(hitPoint > 0){
            dead = false;
        }else{
            dead = true;
        }
        return dead;
    }
    public String getName(){
        return name;
    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
    public void attack(LivingThing opponent){
        if(!dead){
            int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
        }
    }
}
