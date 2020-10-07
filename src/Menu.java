import java.util.ArrayList;

public class Menu implements Input{

    private ArrayList<Person> people = new ArrayList<Person>(); //list for all objects

    public Menu(ArrayList<Person> people){
        this.people = people;
    }

    /*ADDING THE OBJECT*/
    public void add(){
        Person p1 = fill();
        people.add(p1);
    }

    /*ADDING THE OBJECT'S DATA*/
    public Person fill(){
        String name = Input.inputString("name: ");
        int age = Input.inputInteger("age: ");

        int type = Input.inputInteger("press [1] if person's student or [2] - is worker: ");
        if (type == 1){
            String educ = Input.inputString("education: ");
            float money = Input.inputFloat("scholarship: ");
            int level = Input.inputInteger("course: ");
            return new Student(name, age, educ, level ,money);

        } else {
            String place = Input.inputString("place of work: ");
            String pos = Input.inputString("position: ");
            float money = Input.inputFloat("salary: ");
            return new Worker(name, age, place, pos, money);
        }
    }

    /*OUTPUT OF ALL OBJECTS*/
    public void lookAll(){
        int j = 0;
        for (Person per:
             people) {
            j++;
            System.out.println(j + ") "+ per.output() + " ");
        }
    }

    /*CHANGING THE OBJECT*/
    public void change(){
        int id = find();
        Person changingPerson = fill();
        people.set(id, changingPerson);
    }

    /*SEARCHING THE OBJECT*/
    public int find(){
        if (people.isEmpty())
            System.out.println("The list is empty. Add entries.");

        int id = Input.inputInteger("Enter the ID of person: ");
        if (id > people.size())
            id = Input.inputInteger("This id does not exist. Enter again:");
        System.out.println("Found person: " + people.get(id-1).output());

        return id-1;
    }

    public Person findObject(){
        int id = find();
        return people.get(id);
    }

    public float issueTheRequest(){
        RequestInterface req = findObject();
        return req.getPayoutAmount();
    }

}
