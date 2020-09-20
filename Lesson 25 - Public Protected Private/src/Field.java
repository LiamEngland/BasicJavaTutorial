public class Field {
    private Plant plant = new Plant();

    public Field() {
        // This works, size is protected & Field is in the same package as Plant.
        System.out.print(plant.strSize);
    }
}
