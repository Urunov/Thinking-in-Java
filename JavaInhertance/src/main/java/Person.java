/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {InhertanceSample}
 * @Date: {2022/02/15 && 1:33 AM}
 */
public class Person {
    //
    private String name;
    private int age;
    private Book book;

    public Person(String initialName) {
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + " , age " + this.age + " year. ");
    }

    public String getName(){
        return name;
    }
}
