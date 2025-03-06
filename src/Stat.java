public class Stat {
    private int num;
    private int mod;
    
    public static final int STR = 0, DEX = 1, CON = 2, INT = 3, WIS = 4, CHA = 5;
    
    
    
    public Stat() {
        this(10);
    }
    public Stat(boolean random) {this(randNumStat());}
    public Stat(int num) {
        this.num = num;
        mod = (num - 10) / 2;
    }
    
    public int getNum() {return num;}
    public void setNum(int num) {
        this.num = num;
        mod = (num - 10) / 2;
    }
    public int getMod() {return mod;}
    
    public String toString() {return num + ", mod " + mod;}
    
    public static Stat[] randPrioStats(int first) { //makes largest at index of @param first
        Stat[] stats = new Stat[6];
        int biggest = 0;
        for(int i = 0; i < stats.length; i++) {
            if(stats[i].getNum() > stats[biggest].getNum()) {
                biggest = i;
            }
        }
        Stat temp = stats[first];
        stats[first] = stats[biggest];
        stats[biggest] = temp;
        return stats;
    }
    public static int randNumStat() {
        int[] rolls = new int[4];
        for(int i = 0; i < 4; i++) {
            rolls[i] = Die.six(0);
        }
        int small = 7;
        for(int r : rolls) {
            if(r < small) {
                small = r;
            }
        }
        int total = 0;
        for(int i : rolls) {total += i;}
        return total - small;
    }
}
