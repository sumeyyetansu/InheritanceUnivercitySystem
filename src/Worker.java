public abstract class Worker {
    private String name;
    private int telNumber;
    private String email;

    public Worker(String name, int telNumber, String email) {
        this.name = name;
        this.telNumber = telNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void entry();

    public abstract void exit();

    public void refectory(){
        System.out.println(getName() + " yemekhaneye gitti");
    }


}
