public class MochaMaker extends CoffeMakerTemplate
{
    @Override
    public void addIngredients()
    {
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    public void finalTouch()
    {
        System.out.println("Adding sugar");
    }
}
