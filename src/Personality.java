public class Personality {
    private final char[] alignment = new char[2];
    public static final int ORDER = 0, MORAL = 1;
    public static final char CHAOTIC='C',LAWFUL='L',NEUTRAL='N',GOOD='G',EVIL='E';
    private String name;
    private int age, weight, height;
    public static int parseHeight(int feet, int inches) {
        return 12*feet+inches;
    }
    private String features, background;
}
