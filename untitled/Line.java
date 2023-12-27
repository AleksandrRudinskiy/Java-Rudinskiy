public class Line {
    private static final String INITIAL_NAME = "Вячеслав";

    public static void makeHi(String name) {

        if (name.equals(INITIAL_NAME)) {
            System.out.println("Привет " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }

}
