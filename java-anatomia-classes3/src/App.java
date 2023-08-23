public class App {
    public static void main(String[] args) throws Exception {
        String myName = "Juan";

        int year = 2022;

        boolean isTrue = true;

        year = 2018;

        String firstName = "Juan";
        String secondName = "Lucca";

        String fullName = fullName(firstName, secondName);
        System.out.println(fullName);
    }

    public static String fullName(String firstName, String secondName) {
        return "Result " + firstName.concat(" ").concat(secondName);
    }

}
