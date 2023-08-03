import java.util.Scanner;

public class Operations implements OldFashionPoundOperation {
    @Override
    public void sum(OldFashionPound a, OldFashionPound b) {
        //5p 17s 8d + 3p 4s 10d
        int p = a.pound + b.pound;
        int s = a.shilling + b.shilling;
        int d = a.pence + b.pence;
        if (d > 12) {
            s += 1;
            d = d - 12;
        }
        if (s > 20) {
            p += 1;
            s = s - 20;
        }

        System.out.println("The sum is = " + p + "p " + s + "s " + d + "d");

    }

    @Override
    public void subtraction(OldFashionPound a, OldFashionPound b) {
        //5p 17s 8d - 3p 4s 10d
        int p = a.pound - b.pound;
        int s = a.shilling - b.shilling;
        int d = a.pence - b.pence;
        if (a.pence < b.pence) {
            s -= 1;
            d = (d + 12) - d;
        }
        if (a.shilling < b.shilling) {
            p -= 1;
            s = (s + 20) - s;
        }

        System.out.println("The sub result is = " + p + "p " + s + "s " + d + "d");

    }

    @Override
    public void multiplication(OldFashionPound a, int b) {
        int p = a.pound * b;
        int s = a.shilling * b;
        int d = a.pence * b;
        if (d > 12) {
            s += 1;
            d -= 12;
        }
        if (s > 20) {
            p += 1;
            s -= 20;
        }

        System.out.println("The multiplication result is = " + p + "p " + s + "s " + d + "d");
    }

    @Override
    public void division(OldFashionPound a, int b) {
        int c = ((a.pound * 240) + (a.shilling * 12) + a.pence) / b; // getting pounds and shillings to pences
        int p = c / 240;
        int s = (c - (p * 240)) / 12;
        int d = a.pence / b;


        System.out.println("The division result is = " + p + "p " + s + "s " + d + "d");

    }
}


