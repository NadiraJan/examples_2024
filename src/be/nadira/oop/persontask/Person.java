package be.nadira.oop.persontask;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;

   public Person(){
       this(null, null, 0, 0, 0);

    }

    Person(String name, String surname, int age){
        this(name, surname, age, 0, 0);

    }

    // deze constructor zal gebruikt worden:
    Person(String name, String surname, int age, int height, int weight){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
       return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
