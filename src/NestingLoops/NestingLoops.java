package NestingLoops;

public class NestingLoops {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"

            for (int n = 1; n <= 3; n++) {
                for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c + " " + n);
            }
        }
        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print("(" + a + "," + b + ")");
            }
            System.out.println("testing!");        }
        System.out.println("\n");
    }
}

// the inner loop (n) changes faster than the outer loop (c)
// changing the loops around gives this output, the inner loop
// (c) changes faster than the outer loop (n):
/*
A 1
B 1
C 1
D 1
E 1
A 2
B 2
C 2
D 2
E 2
A 3
B 3
C 3
D 3
E 3


(1,1)(1,2)(1,3)(2,1)(2,2)(2,3)(3,1)(3,2)(3,3)
*/

// changing loop AB to println puts each statement
// on a separate line, rather than one long line
// adding a statement between the loops adds it to the end of the statement