public class Voter {
    private int id;
    private String name;
    private String email;
    private String password;

    public Voter(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
}
