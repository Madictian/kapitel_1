public class opgavetolv {

    public static void main(String[] args) {
// Der konverteres fra mil til KM og derefter konverteres timer og minutter til sekunder så vi har km per sekund og videre tilrettet til timer.
        double kmhr = ((24*1.6) / ((1 * 3600) + (40*60) + 35)) * 3600;
        System.out.print(kmhr);
    }
}
