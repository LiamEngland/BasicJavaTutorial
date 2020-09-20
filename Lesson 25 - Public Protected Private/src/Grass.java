public class Grass extends Plant {
    public Grass() {
        // If this were to be in a different package, with an import statement, it still won't work even though a sub-class.
        System.out.print(this.intHeight);
    }
}
