package java_interoperability;

public class JavaFile {

    public static void main(String[] args) {
        int sum = KotlinFileKt.add(3, 4);
        System.out.println("3 + 4 is " + sum);
        System.out.println("Volume is: " + KotlinFileKt.volume(2, 3));
    }

    public static int prod(int a, int b) {
        return a * b;
    }
}
