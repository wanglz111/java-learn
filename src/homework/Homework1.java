package src.homework;

public class Homework1 {

    public static void main(String[] args) {
        Person person1 = new Person("John", 35, "Cooker");
        Person person2 = new Person("Jane", 25, "Police");
        Person person3 = new Person("Jack", 45, "Doctor");

        Person[] people = { person1, person2, person3 };

        for (int i = 0; i < people.length - 1; i++) {
            for (int j = i + 1; j < people.length; j++) {
                if (people[i].getAge() > people[j].getAge()) {
                    Person temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }
        System.out.println("Sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }

    }
}

class Person {
    String name;
    int age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.job.equals(p.job);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode() + this.age + this.job.hashCode();
    }

}
