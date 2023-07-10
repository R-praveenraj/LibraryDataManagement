class LibraryItem{
    private int id;

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String title;
    int year;
}
class Book extends LibraryItem{
    String author;
}
class Magazine extends LibraryItem{
    int issue;
}
class Main{
    public static void main(String[] args) {
        Book book=new Book();
        Magazine magazine=new Magazine();
        magazine.setId(1000);
        magazine.title="Ponniyin Selvan";
        magazine.year=1990;
        book.author="Kalki";
        magazine.issue=1;
        System.out.println(magazine.getId()+"  "+magazine.title+"  "+magazine.year+"  "+book.author+"  "+magazine.issue);
    }
}