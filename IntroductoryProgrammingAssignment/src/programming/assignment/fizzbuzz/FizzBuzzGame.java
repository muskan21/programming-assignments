package programming.assignment.fizzbuzz;

/**
 * Created by muskan on 20/8/15.
 */
public class FizzBuzzGame {
    public static void main(String[] args){
        NumberUtility n = new NumberUtility();
        int i;
        boolean flag3=false, flag5=false;
        for(i=1;i<=100;i++){
            if(n.isDivisibleThree(i)) {
                System.out.print("Fizz");
                flag3 = true;
            }
            if (n.isDivisibleFive(i)) {
                System.out.print("Buzz");
                flag5 = true;
            }
            if(!flag3 && !flag5)
                System.out.print(i);
            System.out.println();
            flag3=false;
            flag5=false;
        }
    }
}
