public class CoffeeClient
{
    public static void main(String[] args) {
        CoffeMakerTemplate starbuzz = new CapuccinoMaker();
        starbuzz.prepare();

        System.out.println("********************");
        starbuzz = new MochaMaker();
        starbuzz.prepare();

        System.out.println("********************");

        starbuzz = new AmericanoMaker();
        starbuzz.prepare();
    }
}
