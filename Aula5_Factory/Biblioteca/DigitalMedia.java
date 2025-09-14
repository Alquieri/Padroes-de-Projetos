package Aula5_Factory.Biblioteca;

public class DigitalMedia extends LibraryItem {
    String fileFormat;

    public DigitalMedia(String title, String author, int publicationYear, String fileFormat){
        super(title, author, publicationYear);
        this.fileFormat = fileFormat;
    }

    @Override
    public void borrow(){
        super.onBorrow();
    }

    @Override
    public  void returnItem(){
        super.onReturn();
    }

    public void play(){
        System.out.println("Voce está escutando " + this.title + " no formato " + this.fileFormat);
    }


    
}
