public class Opgavesyv {
    public static void main(String[] args) {

        double pi1 = 4 * ((1) - (1/3) + (1/5) - (1/7) + (1/9) - (1/11));
        // giver et ikke brugbart eksempel på pi da consolen kun regner i integer og de indeholder ikke decimaler under 0
        double pi = 4 * ((1.0) - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));
        // bedre eksempel men stadig ikke brugbart da vi stopper med bevis relativt hutigt, en nærmere acceptabel pi ville være 3.14

        System.out.println("pi(1) = " + pi1);
        System.out.println("pi(1.0) = " + pi);
    }
}
