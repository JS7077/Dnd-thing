public class StatMod {
    private final int mod, stat;
    public StatMod(int modifier, int statIndex) {
        mod = modifier;
        stat = statIndex;
    }
    public int getMod() {
        return mod;
    }
    
    public int getStat() {
        return stat;
    }
}
