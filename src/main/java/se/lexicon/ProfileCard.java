package se.lexicon;

public class ProfileCard {

    public static void printProfile() {
        String name = "Lina";
        int age = 34;
        String city = "Växjö";
        IO.println("====================\n" +
                "My Profile\n" +
                "====================\n" +
                "Name : " + name + "\n" +
                "Age  : " + age + "\n" +
                "City : " + city + "\n" +
                "====================");
    }
}