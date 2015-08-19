package programming.assignment.fizzbuzz;

/**
 * Created by muskan on 20/8/15.
 */
public class NumberUtility {
    public boolean isDivisibleThree(int num) {
        if(num%3 == 0)
            return true;
        else
            return false;
    }

    public boolean isDivisibleFive(int num) {
        if(num%5 == 0)
            return true;
        else
            return false;
    }
}
