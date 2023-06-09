package Lab7;

public class MongoDB implements UserDB {

    private static MongoDB instance;

    private MongoDB() {
        System.out.println("Instance MongoDB created");
    }

    public static MongoDB getInstance() {
        if (instance == null) {
            instance = new MongoDB();
        }
        return instance;
    }

    @Override
    public void saveData() {

    }
}
