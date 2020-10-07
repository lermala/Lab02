import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Test");
        
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Student("name1", 20, "IRNITU", 4, (float) 11000.465));
        people.add(new Worker("name2", 28, "Slata", "cashier", (float) 5000.465));

        boolean flag = false;
        while (!flag) {
            System.out.println("\nChoose the task: \n[1] - add object\n" +
                    "[2] - change object\n[3] - view all objects\n" +
                    "[4] - issuing request\n[5] - exit");

            Menu menu = new Menu(people);

            switch (Input.inputInteger("")) {
                case 1:
                    menu.add();
                    break;
                case 2:
                    menu.change();
                    break;
                case 3:
                    menu.lookAll();
                    break;
                case 4:
                    System.out.println("Payout amount = " + menu.issueTheRequest());
                    break;
                case 5:
                    System.out.println("[EXIT]");
                    flag = true;
                    break;
                default:
                    System.out.println("ERROR. Enter the task's number again.");
                    break;
            }

        }


    }
}
