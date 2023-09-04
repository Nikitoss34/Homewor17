public class Homework17 {
    public static void main(String[] args) {
        User bob = new User("Bob", "Yarosh", 18, "October", 2003,
                "bobyarosh24@email.com", 12345, 75.0, 80.120 , 15000);

        bob.printAccountInfo();
        bob.setSurname("Petrenko");
        bob.printAccountInfo();
        bob.setWeight(78.0);
        bob.printAccountInfo();

        Person tom = new Person("Tom", "Fedorov", 24, "January",
                2005, "tomfedorov34@gmail.com", 23458, 80.0, 70.120 , 20000);
        tom.printAccountInfo();
        tom.setSteps(17000);
        tom.printAccountInfo();
        tom.setPress(80.120);
        tom.printAccountInfo();

        Client mike = new Client("Mike", "Goncharov", 15, "May", 2000, "mikegoncharov513@gmail.com",
                80310, 90.0, 90.120 , 13000);
        mike.printAccountInfo();


    }

}