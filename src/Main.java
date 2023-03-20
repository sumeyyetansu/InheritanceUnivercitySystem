public class Main {
    public static void main(String[] args) {

       Worker w1 = new Worker("Sümeyye", 12345,"example@gmail.com");
       Worker w2 = new Worker("Yusuf", 8987675 , "@gmail.com" );

       w1.entry();
       w2.refectory();
       w1.exit();

       w1.setName("Tanşu");
       w1.setTelNumber(05555);
       w1.setEmail("bilgi@gmail.com");

        System.out.println(w1.getName() + w1.getTelNumber() + w1.getEmail() + " workin" );
        Academician lec = new Lecturer("Hale",367569436,"asasa@gmail.com","architecture", "professor",343);

        Lecturer lecturer = new Lecturer("Ali", 89898989,"email@gmail.com", "enginearing" ," docent", 121 );
        lecturer.attendClass();

        Assistant assist = new Assistant("Sevilay" , 6246264, "gfg@gmail.com","enginearing","asistant",10.00);
        assist.takeAQuiz();
        assist.entry();

        Assistant assist1 = new Assistant("Veli", 75687840, "hun@gmail.com" , "architecture","asistant",14.00);
        assist1.attendClass();

        LabAsistant lab = new LabAsistant("Ayşe" , 998979, "ex@gmail.com","Architech" , "lab Asistant" , 09.00);
        lab.enterTheLab();

        Worker sec = new SecurityGuard("Hakkı", 43670,"wwe@gmail.com","architecture", "night", "Doc");

        Computing computing = new Computing("Kazım" , 123546, "hjhj@gmail.com", "enginearing", "morning" , "networkSetup");
        computing.networkSetup();


    }
}