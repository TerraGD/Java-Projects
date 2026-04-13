

public class Book {
    String title;
    String author;
     
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

        
    public void showDetail() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    
    public static void main(String[] args){
        Book b = new Book("Programming","Jason");
        b.showDetail();
    }
}