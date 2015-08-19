package programming.assignment.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by muskan on 19/8/15.
 */
public class MainVertical {
    public static void main(String[] args) {
        Asterick a = new Asterick('*');
        try {
            System.out.println("\nEnter the no. of times asterick is to be printed : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String choice = br.readLine();
            int n = Integer.parseInt(choice);
            int i;
            for(i=0;i<n;i++) {
                a.printlnSymbol();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
