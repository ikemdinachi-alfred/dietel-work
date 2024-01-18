package LibrarayManagementApplication;

public class Book{
    private String id;
    private String title;
    private String author;
    private boolean isAvalaible;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvalaible = false;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public void setIsAvailable(boolean trueOrFalse){
        isAvalaible = trueOrFalse;
    }

    public boolean isAvalaible() {
        return isAvalaible;
    }

    public String toString(){
       return String.format("""
               Book Title: %s
               Book Author: %s
               Book ID : %s
               Available Status: %s
               
               """, title,author,id,isAvalaible) ;

    }
}
