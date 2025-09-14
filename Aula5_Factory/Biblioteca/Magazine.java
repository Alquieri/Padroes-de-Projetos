package Aula5_Factory.Biblioteca;

public class Magazine extends LibraryItem {

    private String issueNumber ;

    public Magazine(String title, String author, int publicationYear, String issueNumber ){
        super(title, author, publicationYear);
        this.issueNumber =  issueNumber;
    }

    @Override
    public void borrow(){
        super.onBorrow();
    }

    @Override
    public  void returnItem(){
        super.onReturn();
    }

    
    public void flipPages() {
        System.out.println("Folheando as páginas da revista " + this.title + " Edição #" + this.issueNumber);
    }

    
}
