package programming.assignment.diamond;

import programming.assignment.triangle.Asterick;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by muskan on 19/8/15.
 */
public class MainDiamond {
    public static void main(String[] args) {
        Asterick a = new Asterick('*');
        try {
            System.out.println("\nEnter the no. of lines of triangle to be printed : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String choice = br.readLine();
            int n = Integer.parseInt(choice);
            int i,j,k;
            for(i=0;i<((2*n)-1);i++) {
                if (i < n) {
                    for (j = 0; j < (n - i - 1); j++) {
                        System.out.print(" ");
                    }
                    for (j = 0; j < ((2 * i) + 1); j++) {
                        a.printSymbol();
                    }
                    for (j = 0; j < (n - i - 1); j++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                else {
                    k=i%n;
                    for(j=0;j<(k+1);j++) {
                        System.out.print(" ");
                    }
                    for(j=0;j<(2*(n-k-1))-1;j++) {
                        a.printSymbol();
                    }
                    for(j=0;j<(k+1);j++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
