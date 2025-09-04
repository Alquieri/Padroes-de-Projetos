package Aula5.Biblioteca;

public class LibraryManagementSystem {

    public static void main(String[] args) {
    
        LibraryItem book =  LibraryItemFactory.createItem("book", "Senhor dos aneis", "J.R.R. Tolkien", 1954, "Fantasia");
        LibraryItem magazine = LibraryItemFactory.createItem("magazine", "MAD", "Vários", 2023, "15");
        LibraryItem digitalMedia = LibraryItemFactory.createItem("digitalMedia", "Meteoro da Paixão", "Luan Santana", 2007, "MP3");


        java.util.List<LibraryItem> itensDaBiblioteca = new java.util.ArrayList<>();
        itensDaBiblioteca.add(book);
        itensDaBiblioteca.add(magazine);
        itensDaBiblioteca.add(digitalMedia);


  

       for (LibraryItem _item : itensDaBiblioteca) {

            if (_item instanceof Magazine) {
                Magazine _magazine = (Magazine) _item;
                _magazine.flipPages();
            }
               
            if (_item instanceof Book) {
                Book _book = (Book) _item;
                _book.readSample();
            }
               
            if (_item instanceof DigitalMedia) {
                DigitalMedia _digitalMedia = (DigitalMedia) _item;
                _digitalMedia.play();
            }

            _item.borrow(); 
            System.out.println("");
        }

        for (LibraryItem _item : itensDaBiblioteca) {
            _item.returnItem();
        }
            

    }

}