package zajecia.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Application {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        insertExampleData(bookstore);

        bookstore.showBooks();
    }
public static void insertExampleData(Bookstore bookstore){
    Book book1 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz", "2001", "7132678");

    book1.size = 3;
    String[] ogniemIMieczem = new String[3];

    ogniemIMieczem[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc feugiat augue nunc, nec condimentum odio ullamcorper vel. In at libero at massa commodo hendrerit sit amet sed nisi. Duis porttitor ultricies nisl ac imperdiet. Fusce mollis eleifend egestas. Nulla facilisi. Maecenas tincidunt mollis tempor. Phasellus rhoncus neque sit amet justo facilisis, ut consectetur ipsum porttitor. Nulla facilisi. Pellentesque faucibus consequat purus, laoreet vestibulum neque commodo a. Maecenas quis scelerisque tellus, quis pharetra leo. Nulla finibus ut tortor sed sollicitudin. Nulla commodo odio vitae imperdiet efficitur. Proin nec luctus dolor. Nam egestas eros eget interdum consequat.";
    ogniemIMieczem[1] = "Fusce augue mi, consequat gravida sapien vel, venenatis aliquam diam. Praesent est elit, cursus nec vulputate quis, aliquam at odio. Aliquam porttitor, lacus et varius vestibulum, mauris velit facilisis lorem, ac faucibus eros nisi sit amet turpis. Sed consectetur consectetur scelerisque. Ut tempor erat et orci mollis, bibendum porttitor justo dignissim. Aenean eget lacinia sapien. Vestibulum aliquam felis nec mauris tempor suscipit vitae vitae enim.";
    ogniemIMieczem[2] = "Ut dictum, metus ut laoreet mattis, ligula enim molestie elit, ut condimentum eros leo quis urna. Nunc a egestas risus. Quisque luctus lobortis elit a maximus. Vestibulum scelerisque dui condimentum mauris elementum eleifend. In ultrices sapien vitae risus maximus, sit amet aliquam ante sollicitudin. Aliquam erat volutpat. Phasellus eget auctor diam. Nulla molestie odio ut metus ornare, id accumsan tellus porta. Suspendisse egestas augue sed tortor venenatis, et sollicitudin neque cursus. In ac est facilisis, ornare mauris sed, molestie orci. Morbi pharetra magna eleifend dignissim congue. Etiam vestibulum ornare sem, ac iaculis massa molestie ut. Vivamus vulputate lobortis ipsum, vitae facilisis est vehicula non. Nulla egestas nulla et ipsum condimentum, sed maximus metus ornare. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; In vel lacus et massa placerat sagittis in at risus.";
    book1.content = ogniemIMieczem;

    Book book2= new Book("Alicja w ciemnym pomieszczeniu", "Adam Ziontecki"," 2002 ", "21343535");
    String[] alicjaWCiemnymPomieszczeniu = new String[3];
    alicjaWCiemnymPomieszczeniu[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc feugiat augue nunc, nec condimentum odio ullamcorper vel. In at libero at massa commodo hendrerit sit amet sed nisi. Duis porttitor ultricies nisl ac imperdiet. Fusce mollis eleifend egestas. Nulla facilisi. Maecenas tincidunt mollis tempor. Phasellus rhoncus neque sit amet justo facilisis, ut consectetur ipsum porttitor. Nulla facilisi. Pellentesque faucibus consequat purus, laoreet vestibulum neque commodo a. Maecenas quis scelerisque tellus, quis pharetra leo. Nulla finibus ut tortor sed sollicitudin. Nulla commodo odio vitae imperdiet efficitur. Proin nec luctus dolor. Nam egestas eros eget interdum consequat.";
    alicjaWCiemnymPomieszczeniu[1] = "Fusce augue mi, consequat gravida sapien vel, venenatis aliquam diam. Praesent est elit, cursus nec vulputate quis, aliquam at odio. Aliquam porttitor, lacus et varius vestibulum, mauris velit facilisis lorem, ac faucibus eros nisi sit amet turpis. Sed consectetur consectetur scelerisque. Ut tempor erat et orci mollis, bibendum porttitor justo dignissim. Aenean eget lacinia sapien. Vestibulum aliquam felis nec mauris tempor suscipit vitae vitae enim.";
    alicjaWCiemnymPomieszczeniu[2] = "Ut dictum, metus ut laoreet mattis, ligula enim molestie elit, ut condimentum eros leo quis urna. Nunc a egestas ris";
    book2.content = alicjaWCiemnymPomieszczeniu;


    Book book3 = new Book("Wladimir Od zera do bohatera", "Wladimir Putin", "996", "452324");
    String[] wladimirOdZeraDoBohatera = new String[3];
    wladimirOdZeraDoBohatera[0] = "tygrys";
    wladimirOdZeraDoBohatera[1] = "nie";
    wladimirOdZeraDoBohatera[2] = "miauczy";
    book3.content = wladimirOdZeraDoBohatera;

    bookstore.add(book1);
    bookstore.add(book2);
    bookstore.add(book3);
}

}
