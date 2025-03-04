import java.util.ArrayList;

public class Stat {
    private int num;
    private int mod;
    
    public Stat() {
        this(randNumStat());
    }
    public Stat(int num) {
        this.num = num;
        mod = (int) ((num - 10) / 2);
    }
    
    public int getNum() {return num;}
    public void setNum(int num) {
        this.num = num;
        mod = (int) ((num - 10) / 2);
    }
    public int getMod() {return mod;}
    
    public String toString() {return num + ", mod " + mod;}
    
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
