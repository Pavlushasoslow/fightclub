package fightclub;

/**
 Моя очередная попытка вкатиться в погромирование №хрен знает какой
 А здесь у нас коты они царапаются и кусаются.
 */
public class cat {
    private int hp;  // Это у нас очки здоровья кота.
    private int str; // Это сила кота. Что она делает я пока не знаю. Возможно она будет падать по мере уменьшения хп.
    private int atk; // Это очки атаки кота. Скорее всего они будут константой, взвимодействовть с силой и вычитаться из стамины
    private int def; // Это очки защиты кота. Они скорее всего будут константой, взвимодействовть с силой и возможно будут влиять на стамину, но не точно.
    private int stm; // Это стамина она тратится на удары и возможно защиту. Восстанавливается каждый "ход" силой.

    // Гетеры. Не по порядку но и так сойдет.

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getHp() {
        return hp;
    }

    public int getStm() {
        return stm;
    }

    public int getStr() {
        return str;
    }

    // Сетеры. Не знаю что будет с порядком. ... Он уплыл.

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setStm(int stm) {
        this.stm = stm;
    }

    public void setStr(int str) {
        this.str = str;
    }

    // Конструктор ... ы?

    public cat (int hp, int str, int atk, int def, int stm){
        this.hp = hp;
        this.str = str;
        this.atk = atk;
        this.def = def;
        this.stm = stm;
    }
}
