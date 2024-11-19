public class Main {
    public static void main(String[] args) {
        Character thing = new Barbarian();
        thing.addMoney(100, 'p');
        System.out.println(thing.getWealth('s'));
    }
}
