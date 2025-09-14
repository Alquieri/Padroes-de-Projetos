package Aula5_Factory.Biblioteca;

public class LibraryItemFactory {


    public static LibraryItem createItem(String type, String title, String author,int publicationYear, String extraInfo ){
        switch (type) {
            case "book":
                    return new Book(title,author,publicationYear,extraInfo);

            case "magazine":
                   return new Magazine(title,author,publicationYear,extraInfo);

             case "digitalMedia":
                    return new DigitalMedia(title,author,publicationYear,extraInfo);
                   
            default:
              throw new IllegalArgumentException("Tipo de item não reconhecido: " + type);

        }
       
    }




}