import java.util.ArrayList;

public class Character {
    private Stat sTr;
    private Stat dEx;
    private Stat cOn;
    private Stat iNt;
    private Stat wIs;
    private Stat cHa;
    private Wealth wealth;
    
    public Character() {
        sTr = new Stat();
        dEx = new Stat();
        cOn = new Stat();
        iNt = new Stat();
        wIs = new Stat();
        cHa = new Stat();
        wealth = new Wealth();
    }
    public Character(boolean random) {
        sTr = new Stat();
        dEx = new Stat();
        cOn = new Stat();
        iNt = new Stat();
        wIs = new Stat();
        cHa = new Stat();
        wealth = new Wealth();
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
    
    private static Stat randStat() {
        ArrayList<int> rolls = new ArrayList <int>();
        for(int i = 0; i < 4; i++) {
            rolls.add(Die.six(0));
        }
        int small = 100;
        for(int i : rolls) {
            if(i < small) {
                small = i;
            }
        }
        rolls.remove(small);
        int total = 0;
        for(int i : rolls) {total += i;}
        return new Stat(total);
    }
    public void addMoney(int amount, char type) {wealth.add(amount, type);}
}
