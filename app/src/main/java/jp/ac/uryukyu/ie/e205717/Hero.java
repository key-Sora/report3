package jp.ac.uryukyu.ie.e205717;

public class Hero{
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name キャラクター名
     * @param maxHP キャラのHP
     * @param attack キャラの攻撃力
     */
    public Hero(String name, int maxHP, int attack){
        this.name = name;
        hitPoint = maxHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maxHP, attack);
    }
    /**
     * パラメータ変数nameのgetterメソッド。
     */
    public String getName() {
        return name;        
    }
    /**
     * フィールド変数hitPointのgetterメソッド。
     */
    public int gethitPoint(){
        return hitPoint;
    }
    /**
     * フィールド変数attackのgetterメソッド。
     */
    public int getAttack(){
        return attack;
    }
    /**
     * フィールド変数deadのgetterメソッド。
     */
    public boolean getDead(){
        return dead;
    }
    /**
     * フィールド変数nameのsetterメソッド。
     * @param name　名前。
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * フィールド変数hitPointのsetterメソッド。
     * @param hitPoint　打点。
     */
    public void sethitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
    /**
     * フィールド変数attackのsetterメソッド。
     * @param attack　攻撃
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }
    /**
     * フィールド変数deadのsetterメソッド。
     * @param dead　生死判定。
     */
    public void setDead(boolean dead) {
        this.dead = dead;
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

	public Integer getHitpoint() {
        int defhp = 100;
		return defhp;
	}
}
