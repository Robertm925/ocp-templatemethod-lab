public class AmericanoMaker extends CoffeMakerTemplate
{
    @Override
    public void addIngredients()
    {
        System.out.println("Add more hot water");
    }

    @Override
    public void finalTouch()
    {
        System.out.println("Add sugar and cream");
    }
}
