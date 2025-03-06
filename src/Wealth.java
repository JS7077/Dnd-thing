public class Wealth {
    private int balance;
    
    public Wealth() {
        balance = 0;
    }
    public Wealth(int balance) {
        this.balance = balance;
    }
    
    public int getBalance() {return balance;}
    public int getBalance(char type) {
        int d = exchange(type);
        return balance / d;
    }
    public void add(int amount) {
        add(amount, 'g');
    }
    public void add(int amount, char type) {
        int x = exchange(type);
        balance += amount * x;
    }
    public int exchange(char type) {
        if(type == 'c') {
            return 1;
        } else if(type == 's') {
            return 10;
        } else if(type == 'e') {
            return 50;
        } else if(type == 'g') {
            return 100;
        } else if(type == 'p') {
            return 1000;
        }
        return 0;
    }
}
