public class Main {
    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer("Ali", 89898989,"email@gmail.com", "enginearing" ," docent", 121 );
        lecturer.entry();
        lecturer.attendClass();
        lecturer.takeATest();
        lecturer.exit();


        Assistant assist = new Assistant("Sevilay" , 6246264, "gfg@gmail.com","enginearing","asistant",10.00);
        assist.entry();
        assist.attendClass();
        assist.takeAQuiz();
        assist.exit();

        Academician assist1 = new Assistant("Veli", 75687840, "hun@gmail.com" , "architecture","asistant",14.00);
        assist1.entry();
        assist1.attendClass();
        assist1.exit();

        LabAsistant lab = new LabAsistant("Ayşe" , 998979, "ex@gmail.com","Architech" , "lab Asistant" , 09.00);
        lab.entry();
        lab.enterTheLab();
        lab.attendClass();
        lab.refectory();
        lab.takeAQuiz();
        lab.exit();

        SecurityGuard securtiy = new SecurityGuard("Ahmet", 12345, "@email.com","enginearing" ,"morning", "doc");
        securtiy.entry();
        securtiy.work();
        securtiy.refectory();
        securtiy.watch();
        securtiy.exit();

        Worker sec = new SecurityGuard("Hakkı", 43670,"wwe@gmail.com","architecture", "night", "Doc");
        sec.entry();
        sec.refectory();
        sec.exit();

        Computing computing = new Computing("Kazım" , 123546, "hjhj@gmail.com", "enginearing", "morning" , "networkSetup");
        computing.entry();
        computing.work();
        computing.refectory();
        computing.networkSetup();
        computing.exit();
    }
}