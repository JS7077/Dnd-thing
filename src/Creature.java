public class Creature {
    protected Stat sTr, dEx, cOn, iNt, wIs, cHa;
    private int cr;
    protected int pb;
    protected int maxHp;
    protected int hp;
    protected int hitDie;
    private int speed, swimSpeed, flySpeed, digSpeed;
    private String size;
    private String type;
    private String alignment;
    private int AC;
    private int passiveWis;
    
    public Creature() {
    
    }
    public Creature(Stat str, Stat dex, Stat con, Stat intel, Stat wis, Stat cha,
                    int challengeRating, int hitPointMax, int spd, int swim, int flight, int burrow,
                    String size, String type, String align, int armorClass, int passivePerception,
                    int hitDie, int pb) {
        sTr = str;
        dEx = dex;
        cOn = con;
        iNt = intel;
        wIs = wis;
        cHa = cha;
        cr = challengeRating;
        pb = (int) ((challengeRating - 1) / 4 + 2);
        maxHp = hitPointMax;
        hp = maxHp;
        this.hitDie = hitDie;
        speed = spd;
        swimSpeed = swim;
        flySpeed = flight;
        digSpeed = burrow;
        this.size = size;
        this.type = type;
        alignment = align;
        AC = armorClass;
        passiveWis = passivePerception;
    }
    public Creature(Stat str, Stat dex, Stat con, Stat intel, Stat wis, Stat cha,
                    int challengeRating, int hitPointMax, int spd, int swim, int flight, int burrow,
                    String size, String type, String align, int armorClass, int passivePerception) {
        this(str, dex, con, intel, wis, cha, challengeRating, hitPointMax, spd, swim, flight, burrow,
                size, type, align, armorClass, passivePerception, (int) ((challengeRating - 1) / 4 + 2),
                sizeHp(size));
    }
    
    public int getCr() {return cr;}
    
    public static int sizeHp(String size) {
        if(size.equals("tiny")) {return 4;}
        else if(size.equals("small")) {return 6;}
        else if(size.equals("medium")) {return 8;}
        else if(size.equals("large")) {return 10;}
        else if(size.equals("huge")) {return 12;}
        else if(size.equals("gargantuan")) {return 20;}
        else {return 0;}
    }
}
