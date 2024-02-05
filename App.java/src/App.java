public class App {
    public static void main(String[] args) throws Exception {
        // Data types
        long l = 50000000000l; // 8 bytes-> more than 10 digits and you must specify l
        int a = 5; // 4 bytes -> 32bits
        short s = 5; // 2 bytes -> 16bits with a range of 32768 to 32767
        byte b = 5; // 1 byte -> 8bits with a range of -128 to 127
        double d = 12.80;
        float f = 1.2f;

        char c = 'A';
        c = 68; // it will print the ASCII character D --> American Standard code for
                // Information interchange
        int k = (int) 6.7; // we can cast a double to an int -- type casting (explicit)
        System.out.println(k);

    }
}
