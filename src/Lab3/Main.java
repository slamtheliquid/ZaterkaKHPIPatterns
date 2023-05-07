package Lab3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserInterface userInterface = new UserInterface();
        Memento repo = new Memento();

        System.out.println("User's messages are turned on");
        userInterface.setPreferenceAndDate("DEFAULT MESSAGES");
        System.out.println(userInterface);
        repo.setSave(userInterface.save());
        Thread.sleep(6000);


        System.out.println("User turned off all of the messages");
        userInterface.setPreferenceAndDate("NO MESSAGES");
        System.out.println(userInterface);
        Thread.sleep(6000);


        System.out.println("User has rolled back all of the changes");
        userInterface.load(repo.getSave());
        System.out.println(userInterface);
    }
}
