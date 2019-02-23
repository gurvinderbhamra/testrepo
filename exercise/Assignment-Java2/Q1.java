
/*      1. Create Java classes having suitable attributes for Library management system.
        Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
*/

interface Library
{
    String libraryID = "abc123";
    String libraryBranch = "Noida";
    public void showLibrary();
}

abstract class Book
{
    private String bookName;
    private String bookId;
    private String author;
    
    public Book()
    { }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    abstract void issueBook();
    
    abstract void returnBook();
}

class Librarian extends Book implements Library
{
    private String id;
    private String name;
    
    public void issueBook()
    {
        System.out.println("Book issued");
    }
    
    public void returnBook()
    {
        System.out.println("Book returned");
    }
    
    public void showLibrary()
    {
        System.out.println(Library.libraryID);
        System.out.println(Library.libraryBranch);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class User
{
    private String username;
    private String id;
    private long phone;
    private int age;
    private Book book;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


