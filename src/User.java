public class User {
    private static String version = "1";
    private String name;
    private String surname;
    private String type;

    public String toString (User user) {
        return user.name + " " + user.surname + " - "  + user.type;
    }

    private void setName (User user) {
        this.name = user.name;
    }
    private void setSurame (User user) {
        this.surname = user.surname;
    }
    private void setType(User user) {
        this.type = user.type;
    }

    private String getName () {
        return this.name;
    }

    private String getSurname () {
        return this.surname;
    }

    private String getType () {
        return this.type;
    }

    public User (String name, String surname, String type) {
        this.name = name;
        this.surname = surname;
        this.type = type;

    }

    public void changeDetails(User a) {
        this.setName(a);
        this.setSurame(a);
        this.setType(a);
    }
}
