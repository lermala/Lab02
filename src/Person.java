public abstract class Person implements RequestInterface{

    private String name;//фио
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract float getPayoutAmount();
    public String output(){
        return name + " age: " + age;
    };

}
