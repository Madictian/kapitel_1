public class OpgaveFire {

    public static void main(String[] args) {

        //Laver en tabel som bliver defineret som en streng da vi ikke vil lave en regnetabel idag.
        String[][] table  = new String[5][];
        table[0] = new String[] {"a",   "a^2",  "a^3",   "a^4"};
        table[1] = new String[] {"1",     "1",    "1",     "1"};
        table[2] = new String[] {"2",     "4",    "8",    "16"};
        table[3] = new String[] {"3",     "9",   "27",    "81"};
        table[4] = new String[] {"4",    "16",   "64",   "256"};
        // ved brug af for loop laver jeg rows udfra table.
        // derudover blev jeg introduceret til System.out.format så jeg kunne danne mellemrum i mit print.
        for (String[]   row :   table)  {
            System.out.format("%15s%15s%15s%15s\n", row);
        }
    }
}
