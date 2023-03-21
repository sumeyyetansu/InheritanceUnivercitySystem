public class Assistant extends Academician{
    private double officeTime;

    public Assistant(String name, int telNumber, String email, String departmant, String title, double officeTime) {
        super(name, telNumber, email, departmant, title);
        this.officeTime = officeTime;
    }

    public double getOfficeTime() {
        return officeTime;
    }

    public void setOfficeTime(double officeTime) {
        this.officeTime = officeTime;
    }
    public void takeAQuiz(){
        System.out.println(getName() + "quiz yapıyor" );

    }

    @Override
    public void attendClass() {
        System.out.println(this.getName() + " derse girdi, yoklama yaptı. Çıktı");

    }


}
