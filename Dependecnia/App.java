public class App {
    public static void main(String[] args) {
        Printer impresora = new Printer();
        Document doc1 = new Document("Documento1");
        Document doc2 = new Document("Documento2");

        impresora.print(doc1);
        impresora.print(doc2);


    }
}
