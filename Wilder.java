public class Wilder {
    // atributes
    private String firstname;
    private boolean aware;
    private String message = "";

    // constructors
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public void whoAmI() {
        if (aware) {
            message = "Je m'appelle " + this.getFirstname() + " et je suis aware";
        } else {
            message = "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
        System.out.println(message);
    }
}