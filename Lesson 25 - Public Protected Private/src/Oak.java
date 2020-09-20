public class Oak extends Plant {
    public Oak() {
        // For variables, it's best to declare them as private.

        // Won't work - type is private.
        // type = "tree";

        // This will work, because Oak is a sub-class of Plant, and strSize is protected.
        this.strSize = "Medium";

        // No access specifier, this works as Oak and Plant are in the same package.
        this.intHeight = 8;
    }
}
