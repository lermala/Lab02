public class Student extends Person {
    private String education; //Название учебного заведения
    private int level; // курс
    private float scholarship; //стипендия

    public Student(String name, int age, String education,
                   int level, float scholarship){
        super(name, age);
        this.education = education;
        this.level = level;
        this.scholarship = scholarship;
    }

    @Override
    public float getPayoutAmount(){ return scholarship; }

    public String output(){
        return super.output() + " " + education + " "
                + level + " course, scholarship = " + scholarship;
    }

}
