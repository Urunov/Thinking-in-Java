import java.util.ArrayList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {InhertanceSample}
 * @Date: {2022/02/15 && 1:35 AM}
 */
public class Book {
    //
    private String name;
    private String publisher;
    private ArrayList<Person> authors;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    public ArrayList<Person> getAuthors(){
        return this.authors;
    }

    public String getName(){
        return name;
    }

    public void addAuthor(Person author){
        this.authors.add(author);
    }
}
