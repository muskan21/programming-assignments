package programming.assignment.primefactor;

import programming.assignment.fizzbuzz.NumberUtility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by muskan on 20/8/15.
 */
public class PrimeFactorGenerator {
    public static void main(String[] args) {
        NumberUtility n = new NumberUtility();
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the no. to generate prime factors : ");
            int num = Integer.parseInt(br.readLine());
            list = generate(num);
            if(list.isEmpty()) {
                System.out.println("Empty List.");
            }
            else {
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i) + "\t");
                }
            }
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static ArrayList<Integer> generate(int num) {
        NumberUtility n = new NumberUtility();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int numb=num;
        int dividend = 2;
        while(numb != 0) {
            if(numb == 1)
                break;
            if(!n.isDivisible(numb,dividend)) {
                dividend++;
            }
            else {
                list.add(dividend);
                while(numb%dividend == 0) {
                    numb/=dividend;
                }
                if(numb == 1)
                    break;
            }
        }
        return list;
    }
}
