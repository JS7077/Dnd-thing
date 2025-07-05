public interface Item {
    default StatMod mod() {return new StatMod(0,-1);}
    String getName();
}
