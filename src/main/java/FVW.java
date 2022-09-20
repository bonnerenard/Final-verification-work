import sun.security.x509.OtherName;

import java.util.Arrays;

public class FVW {
    public static void main (String[] args) {
        String[] Array1 = new String[]{"3","-2","12334","324","1","5"};
        int n = 0;
        int index = 0;
        while (index < Array1.length) {
            if (Array1[index].length() <= 3) {
                n = n + 1;
            }
            index = index + 1;
        }
        index = 0;
        int counter = 0;
        String[] Array2 = new String[n];
        while ( index < Array1.length ) {
            if ( Array1[index].length() <= 3) {
                Array2[counter] = Array1[index];
                counter = counter + 1;
            }
            index = index + 1;
        }

        System.out.println(Arrays.toString(Array2));
    }
}
