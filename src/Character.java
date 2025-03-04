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
    public Character(Stat str, Stat dex, Stat con, Stat intel, Stat wis, Stat cha,
                     int challengeRating, int hitPointMax, int spd, int swim, int flight, int burrow,
                     String size, String type, String align, int armorClass, int passivePerception,
                     String clas, int hitDice, String race) {
        super(str, dex, con, intel, wis, cha, challengeRating, hitPointMax, spd, swim, flight, burrow,
                size, type, align, armorClass, passivePerception);
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
        return new Stat();
    }
    public void addMoney(int amount, char type) {wealth.add(amount, type);}
}
