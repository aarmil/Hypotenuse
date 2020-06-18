public class Hypotenuse {
    public static void main(String[] args) {
        //Defining triangle sides
        float a = 10.5f;
        float b = 12.7f;

        //Formula of Hypotenuse
        float hypotenuse = (float) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse is equal to " + hypotenuse);
    }
}
