public class Application {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree1 = new Tree();

        // Creating an additional reference to the same Object.
        Plant plant2 = tree1;

        // Because Tree is a sub-class of Plant, and plant2 is a reference of tree1 - grow displays "Tree Growing".
        plant2.grow();

        // Calling method on tree will work, as defined in the Tree Class.
        tree1.shedLeaves();

        // Calling method on plant won't work, as method not in parent Class.
        // plant2.shedLeaves();

        // Grow can be called from doGrow, as a child class of expected parent is provided, as it extends the Plant class.
        doGrow(tree1);
    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }
}
