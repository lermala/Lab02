public class Worker extends Person{
    private String placeOfWork;
    private String position; //должность
    private float salary; //оклад

    public Worker(String name, int age, String placeOfWork,
                  String position, float salary){
        super(name, age);
        this.placeOfWork = placeOfWork;
        this.position = position;
        this.salary = salary;
    }
@Override
    public float getPayoutAmount(){
        return salary;
    }

    public String output(){
        return super.output() + " " + placeOfWork + " "
                + position + " salary = " + salary;
    }
}
