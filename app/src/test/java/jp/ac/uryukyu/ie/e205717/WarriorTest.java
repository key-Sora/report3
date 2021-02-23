package jp.ac.uryukyu.ie.e205717;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    /**
     * 戦士が三回スキルで殴って、三回ともに成功しているのかの検証。
     * サンドバッグを敵として、三回殴らせる。
     * この間敵は何もしないこととする。
     */
    @Test
    void SkillTest() {
        int result = 450;
        int sum = 0;
        int defaultWarriorHP = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", defaultWarriorHP, 100);
        Enemy sandbag = new Enemy("サンドバッグ", 1000, 0);
        for(int i=0 ; i<3 ; i++){
            demoWarrior.attackWithWeponSkill(sandbag);
            sum += 150;
        }
        assertEquals(result, sum);
        
    }
}
