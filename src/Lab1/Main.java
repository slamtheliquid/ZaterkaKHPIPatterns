package Lab1;

class Main
{
    public static void main(String[] args)
    {
        String [] pointsOfView = {"KhTZ", "Industrial'na", "City Centre", "P'yatikhatki", "Shevchenkivskii", "Saltovka"};

        TIterator scenario1 = new TIterator("Tourist Path", pointsOfView);
        Iterator iterator1 = scenario1.getIterator();
        System.out.println("\nFirst Path: " + scenario1.getName());
        System.out.println("=================================");
        while ((iterator1.hasNext())){
            System.out.println(iterator1.next().toString() + " ");
        }
        System.out.println("=================================\n");

        NIterator scenario2 = new NIterator("Tourist Navigator", pointsOfView);
        Iterator iterator2 = scenario2.getIterator();
        System.out.println("\nSecond Path: " + scenario2.getName());
        System.out.println("=================================");
        while ((iterator2.hasNext())){
            System.out.println(iterator2.next().toString() + " ");
        }
        System.out.println("=================================\n");

        GIterator scenario3 = new GIterator("Local Guide", pointsOfView);
        Iterator iterator3 = scenario3.getIterator();
        System.out.println("\nThird Path: " + scenario3.getName());
        System.out.println("=================================");
        while ((iterator3.hasNext())){
            System.out.println(iterator3.next().toString() + " ");
        }
        System.out.println("=================================\n");
    }
}





