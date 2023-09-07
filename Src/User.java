public class User {
    private String name;
    private String surname;
    private int birthday;
    private String month;
    private int year;
    private String email;
    private int telephone;
    private double weight;
    private double press;
    private double steps;


    public User(String name, String surname, int birthday, String month, int year, String email, int telephone, double weight,
                double press, double steps) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.month = month;
        this.year = year;
        this.email = email;
        this.telephone = telephone;
        this.weight = weight;
        this.press = press;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephone() {
        return telephone;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPress() {
        return press;
    }

    public void setPress(double press) {
        this.press = press;
    }

    public double getSteps() {
        return steps;
    }

    public void setSteps(double steps) {
        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Bob{" +
                "name='" + name + '\'' + "\n" +
                "  surname='" + surname + '\'' + "\n" +
                "  birthday='" + birthday + '\'' + "\n" +
                "  month='" + month + '\'' + "\n" +
                "  year='" + year + '\'' + "\n" +
                "  email='" + email + '\'' + "\n" +
                "  telephone='" + telephone + '\'' + "\n" +
                "  weight='" + weight + '\'' + "\n" +
                "  press='" + press + '\'' + "\n" +
                "  steps='" + steps + '\'' + "\n" +
                "  age='" + (2020-year)  + '\'' + "\n" +
                '}';

    }

}