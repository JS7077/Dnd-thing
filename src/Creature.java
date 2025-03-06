public class Creature {
    protected Stat[] stats;
    private final int cr;
    protected int pb;
    protected int maxHp, hp, hitDie;
    protected int speed, swimSpeed, flySpeed, digSpeed;
    protected int size;
    public static final int TINY = 4, SMALL = 6, MED = 8, LARGE = 10, HUGE = 12, GARGANTUAN = 20;
    protected String type;
    protected String alignment;
    protected int AC;
    protected int passiveWis;
    
    public Creature(Stat[] stats, int challengeRating, int hitPointMax,
                    int spd, int swim, int flight, int burrow,
                    int size, String type, String align, int armorClass,
                    int passivePerception, int hitDieCount, int pb) {
        this.stats = stats;
        cr = challengeRating;
        this.pb = pb;
        maxHp = hitPointMax;
        hp = maxHp;
        hitDie = hitDieCount;
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
    public Creature(Stat[] stats, int challengeRating,
                    int spd, int swim, int flight, int burrow,
                    int size, String type, String align, int armorClass) {
        this(stats, challengeRating, calculateMaxHp(challengeRating, size, stats[Stat.CON]), spd, swim, flight, burrow,
                size, type, align, armorClass, 10 + stats[Stat.WIS].getMod(),
                challengeRating, (challengeRating - 1) / 4 + 2);
    }
    public Creature(Stat[] stats, int challengeRating, int spd, int size,
                    String type, String align, int armorClass) {
        this(stats, challengeRating, spd, 0, 0, 0,
                size, type, align, armorClass);
    }
    public Creature() { //makes a commoner
        this(new Stat[6], 0, 30, MED, "humanoid", "N", 10);
    }
    
    public int getCr() {return cr;}
    
    public static int calculateMaxHp(int lvl, int hitDiceSize, Stat con) {
        int out = con.getMod() * lvl + hitDiceSize;
        for(int i = 0; i < lvl - 1; i++) {
            out += Die.roll(hitDiceSize);
        }
        return out;
    }
}
