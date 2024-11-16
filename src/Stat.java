public class Stat {
    private int num;
    private int mod;
    
    public Stat() {
        num = 10;
        mod = 0;
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
}
