public class Die {
    public static int roll(int die) {
        return (int) (Math.random() * die + 1);
    }
    public static int twenty(int mod) {return roll(20) + mod;}
    public static int twelve(int mod) {return roll(12) + mod;}
    public static int ten(int mod) {return roll(10) + mod;}
    public static int eight(int mod) {return roll(8) + mod;}
    public static int six(int mod) {return roll(6) + mod;}
    public static int four(int mod) {return roll(4) + mod;}
}
