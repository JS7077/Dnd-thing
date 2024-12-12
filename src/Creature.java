public class Creature {
    private Stat sTr;
    private Stat dEx;
    private Stat cOn;
    private Stat iNt;
    private Stat wIs;
    private Stat cHa;
    private int cr;
    private int pb;
    private int maxHp;
    private int hp;
    private int hitDice;
    
    public Creature() {
    
    }
    public Creature(Stat str, Stat dex, Stat con, Stat intel, Stat wis, Stat cha, int challengeRating) {
        sTr = str;
        dEx = dex;
        cOn = con;
        iNt = intel;
        wIs = wis;
        cHa = cha;
        cr = challengeRating;
        pb = (int) ((challengeRating - 1) / 4 + 2);
    }
    
    public int getCr() {return cr;}
}
