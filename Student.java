public class Student {
    // write the code of student class here
  int age;
  String name;

    // Display method
    void display() {
        System.out.println("My name is " + name + ". I am " + age + " years old");
    }

    // sayHello method
    void sayHello(String name) {
        System.out.println(this.name + " says hello to " + name);
    }
}
