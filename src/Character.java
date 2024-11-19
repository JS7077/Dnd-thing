import java.util.ArrayList;

public class Character {
    private Stat sTr;
    private Stat dEx;
    private Stat cOn;
    private Stat iNt;
    private Stat wIs;
    private Stat cHa;
    private Wealth wealth;
    private int pb;
    private int lvl;
    private String cls;
    private String subClass;
    private int maxHp;
    private int hp;
    private int hitDice;
    private int hitDie;
    private String race;
    
    public Character() {
        sTr = new Stat();
        dEx = new Stat();
        cOn = new Stat();
        iNt = new Stat();
        wIs = new Stat();
        cHa = new Stat();
        wealth = new Wealth();
        pb = 2;
        lvl = 1;
        hitDie = lvl;
    }
    public Character(String clas, int hitDice) {
        sTr = randStat();
        dEx = randStat();
        cOn = randStat();
        iNt = randStat();
        wIs = randStat();
        cHa = randStat();
        wealth = new Wealth();
        cls = clas;
    }
    public Character(int str, int dex, int con, int intel, int wis, int cha) {
        sTr = new Stat(str);
        dEx = new Stat(dex);
        cOn = new Stat(con);
        iNt = new Stat(intel);
        wIs = new Stat(wis);
        cHa = new Stat(cha);
        wealth = new Wealth();
    }
    
    public int getWealth() {return wealth.getBalance();}
    public int getWealth(char type) {return wealth.getBalance(type);}
    
    public static Stat randStat() {
        ArrayList<Integer> rolls = new ArrayList <>();
        for(int i = 0; i < 4; i++) {
            rolls.add(Die.six(0));
        }
        int small = 100;
        for(int i : rolls) {
            if(i < small) {
                small = i;
            }
        }
        rolls.remove((Integer) small);
        int total = 0;
        for(int i : rolls) {total += i;}
        return new Stat(total);
    }
    public void addMoney(int amount, char type) {wealth.add(amount, type);}
}
