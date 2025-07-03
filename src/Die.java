public class Die {
    public static int roll(int die) {
        return (int) (Math.random() * die + 1);
    }
    public static int d20(int mod) {return roll(20) + mod;}
    public static int d12(int mod) {return roll(12) + mod;}
    public static int d10(int mod) {return roll(10) + mod;}
    public static int d8(int mod) {return roll(8) + mod;}
    public static int d6(int mod) {return roll(6) + mod;}
    public static int d4(int mod) {return roll(4) + mod;}
}
