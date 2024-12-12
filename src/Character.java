import java.util.ArrayList;

public class Character extends Creature{
    private Wealth wealth;
    private int lvl;
    private String cls;
    private String subClass;
    private int hitDie;
    private String race;
    
    public Character() {
        wealth = new Wealth();
    }
    public Character(String clas, int hitDice, String race) {
        super(new Stat(), new Stat(), new Stat(), new Stat(), new Stat(), new Stat(), 1);
        wealth = new Wealth();
        lvl = getCr();
        hitDie = lvl;
        cls = clas;
        this.race = race;
    }
    public Character(int str, int dex, int con, int intel, int wis, int cha) {
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
