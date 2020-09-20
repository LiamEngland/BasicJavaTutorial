public class Application {
    public static void main(String[] args) {

        /*
            private - only accessible within the same class.
            protected - accessible to subclasses & within the same package.
            public - accessible from anywhere.
            no modifier - accessible from same package only.
         */


        Plant plant1 = new Plant();

        System.out.println(plant1.strName);
        System.out.println(Plant.intId);

        // This too won't work, as strType is only accessible within the Plant class (private).
        // System.out.println(plant1.strType);

        // Won't work, size is protected & Application isn't in the same package as Plant.
        System.out.println(plant1.strSize);
    }
}
