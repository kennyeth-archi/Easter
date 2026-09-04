import java.util.Scanner;

public class EasterProject {
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in); 

        System.out.println("_.---------------*.+ Easter Day Calculator +.*----------------._");

        System.out.println("Enter year:");
        // Read user input
        int y = scanner.nextInt();  

        System.out.println("Computing date...");

        // Compute the date
        int a = y % 19;
        System.out.println("a = " + a);
        int b = y / 100;
        System.out.println("b = " + b);
        int c = y % 100;
        System.out.println("c = " + c);
        int d = b / 4;
        System.out.println("d = " + d);
        int e = b % 4;
        System.out.println("e = " + e);
        int f = (b + 8) / 25;
        System.out.println("f = " + f);
        int g = (b - f +1) / 3;
        System.out.println("g = " + g);
        int h = (19 * a + b - d - g + 15) % (30);
        System.out.println("h = " + h);
        int i = c / 4;
        System.out.println("i = " + i);
        int k = c % 4;
        System.out.println("k = " + k);
        int r = (32 + 2 * e + 2 * i - h - k) % 7; 
        System.out.println("r = " + r);
        int m = (a + 11 * h + 22 * r) / 451;
        System.out.println("m = " + m);
        int n = (h + r - 7 * m + 114) / 31;
        System.out.println("n = " + n);
        int p = (h + r - 7 * m + 114) % 31;
        System.out.println("p = " + p);

        System.out.println("... Calculation complete!");

        // Assign the month (will only ever be March or April)

        String month = "";

        if (n == 3) {
            month = "March";
        }
        if (n == 4) {
            month = "April";
        }

        // Figure out the suffix for the day (_st, _nd, _rd, _th)

        int lastDigit = Math.abs((p+1) % 10);

        String suffix = "";

        if (lastDigit == 1) {
            suffix = "st";
        } else if (lastDigit == 2) {
            suffix = "nd";
        } else if (lastDigit == 3) {
            suffix = "rd";
        } else {
            suffix = "th";
        }

        // Print the final reponse

        System.out.println("Easter in " + y + " falls on " + month + ", " + (p+1) + suffix + ".");

        System.out.println("*~----------*.+ Thanks for using, see you soon! +.*-----------~*");

        scanner.close();
    }
}
