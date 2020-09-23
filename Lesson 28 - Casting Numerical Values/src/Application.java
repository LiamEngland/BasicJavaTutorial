public class Application {
    public static void main(String[] args) {

        int intValue = 100;
        short shortValue = 55;
        byte byteValue = 127;
        long longValue = 23555;

        // Adding an 'f' to the end will set it to a float value.
        float floatValue = 8834.8f;
        double doubleValue = 10.26;

        // You set the type you want to cast to (in this case int) into the brackets prior to the value.
        intValue = (int)longValue;
        System.out.println(intValue);

        doubleValue = intValue;

        // This value must be casted, as setting a float to an int will trim off the decimal points.
        intValue = (int)floatValue;

        // One thing to note is the value's not rounded up, it's just trimmed the decimal value.
        System.out.println(intValue);

        // Byte cannot hold +128, so the output of the value will not be correct. As the value has gone round to the minimum value.
        byteValue = (byte)128;
        System.out.println(byteValue);

        // The overall point to take from this is to make sure to check that the types that values are being assigned to can hold the value that's being set to it.
    }
}