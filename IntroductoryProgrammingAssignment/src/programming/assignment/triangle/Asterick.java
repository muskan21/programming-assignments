package programming.assignment.triangle;

/**
 * Created by muskan on 19/8/15.
 */
public class Asterick {
    //fields
    private char symbol;

    //constructor
    public Asterick(char sym) {
        this.symbol=sym;
    }

    public Asterick() {
        symbol=0;
    }

    //methods

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void printSymbol() {
        System.out.print(this.symbol);
    }

    public void printlnSymbol() {
        System.out.println(this.symbol);
    }
}
