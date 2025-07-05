import java.util.Arrays;
import java.util.stream.Collectors;

public enum Race {
    DWARF(new StatMod[]{new StatMod(2,Stat.CON)},25,"Dwarvish",new Subrace[]{Subrace.HILL,Subrace.MOUNTAIN}),
    ELF(new StatMod[]{new StatMod(2,Stat.DEX)},30,"Elvish",new Subrace[]{Subrace.HIGH,Subrace.WOOD,Subrace.DARK),
    HALFLING(new StatMod[]{new StatMod(2,Stat.DEX)},25,"Halfling",new Subrace[]{Subrace.LIGHTFOOT,Subrace.STOUT),
    HUMAN(Fun.humanFill(),30,"One of choice",null),
    DRAGONBORN(new StatMod[]{new StatMod(2,Stat.STR),new StatMod(1,Stat.CHA)},30,"Draconic",null),
    GNOME(new StatMod[]{new StatMod(2,Stat.INT)},25,"Gnomish",new Subrace[]{Subrace.FOREST,Subrace.ROCK}),
    HALF_ELF(new StatMod[]{new StatMod(2,Stat.CHA),new StatMod(1,)}),HALF_ORC(),TIEFLING();
    Race(StatMod[] scoreIncreases, int speed, String languages, Subrace[] subraces) {
    }
}
