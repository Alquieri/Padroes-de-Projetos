package Aula5_Factory.Biblioteca;

public class Book extends LibraryItem {
    
    private String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;

    }

    @Override
    public void borrow(){
        super.onBorrow();
    }

    @Override
    public  void returnItem(){
        super.onReturn();
    }

    public void readSample(){
        System.out.println("Lendo as paginas do " + this.title + " do genero " + this.genre);
    }

    
}
