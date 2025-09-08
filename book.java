public class book {
    String bookTitle;
    int year;
    double price;
    String author;

    public book(String bookTitle, String author, int year, double price){
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public void display(){
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Released on: " + year);
        System.out.println("Price: " + price);
    }

    public String getTitle(){
        return bookTitle;
    }
    public void setTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
}
