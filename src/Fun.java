public class Fun {
    public static StatMod[] humanFill() {
        StatMod[] sm = new StatMod[6];
        for(int i = 0; i < sm.length; i++) {
            sm[i] = new StatMod(1,i);
        }
        return sm;
    }
}
