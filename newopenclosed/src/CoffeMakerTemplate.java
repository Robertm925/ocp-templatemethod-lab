public abstract class CoffeMakerTemplate
{
    public void prepare()
    {
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    public abstract void addIngredients();

    public abstract void finalTouch();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

}
