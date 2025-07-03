import java.util.ArrayList;
import java.util.List;

public class Character extends Creature{
    private final Wealth wealth;
    private int lvl;
    private String subClass;
    private final String race, cls;
    private final List<Item> inventory = new ArrayList<>();
    
    public Character(Stat[] stats, int level, int spd, int size, String type,
                     String align, int armorClass, String clas, int hitDice, String race) {
        super(stats, level, spd, hitDice, type, align, armorClass);
        this.size = size;
        wealth = new Wealth();
        lvl = getCr();
        cls = clas;
        this.race = race;
    }
    
    public int getWealth() {return wealth.getBalance();}
    public int getWealth(char type) {return wealth.getBalance(type);}
    public String getRace() {return race;}
    
    public void addMoney(int amount, char type) {wealth.add(amount, type);}
    public void lvlUp() {
        lvl++;
    }
}
