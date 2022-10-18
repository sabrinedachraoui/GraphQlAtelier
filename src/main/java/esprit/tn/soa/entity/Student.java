package esprit.tn.soa.entity;

public class Student {

    private final String CIN;
    private final String nompre;
    private final String email;


    public Student(String cin, String nompre, String email) {
        CIN = cin;
        this.nompre = nompre;
        this.email = email;
    }

    public String getCIN() {
        return CIN;
    }

    public String getNompre() {
        return nompre;
    }

    public String getEmail() {
        return email;
    }
}

