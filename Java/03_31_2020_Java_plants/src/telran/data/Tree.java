package telran.data;

public class Tree extends Plant {
    public Tree(String name, int height, int age){
        super(name, height, age);
    }

    private static int TREE_GROW_PER_YEAR = 50;

    @Override
    public int getGrowPerSeason() {
        return TREE_GROW_PER_YEAR;
    }

    @Override
    public void doSummer() {
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println(getName() + " has grown in Summer up to " + getHeight());
    }

    @Override
    public void doAutumn() {
        System.out.println(getName() + " is not growing in Autumn, height is " + getHeight());
    }


}
