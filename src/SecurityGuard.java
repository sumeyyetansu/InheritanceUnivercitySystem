public class SecurityGuard extends Officer {
    private String document;

    public SecurityGuard(String name, int telNumber, String email, String departmant, String shift, String document) {
        super(name, telNumber, email, departmant, shift);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
    public void watch(){
        System.out.println(getName() + " is watching around");

    }
}
