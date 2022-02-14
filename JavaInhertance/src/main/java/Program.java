/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {InhertanceSample}
 * @Date: {2022/02/15 && 2:06 AM}
 */
public class Program {
    //
    public static void main(String[] args) {
        Book book = new Book("The ABC of package ", "Book Pub.");

        System.out.println("Hello package : " + book.getAuthors() + " " + book.getAuthors() +"  " + book.getName());
    }
}
