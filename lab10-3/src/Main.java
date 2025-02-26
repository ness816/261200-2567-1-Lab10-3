public class Main {
    public static void main(String[] args) {
        TextFileHandler tfh = new TextFileHandler("1st handler");
        ImageFileHandler ifh = new ImageFileHandler("3rd handler");
        DocFileHandler dfh = new DocFileHandler("2nd handler");
        tfh.setHandler(dfh);
        dfh.setHandler(ifh);

        tfh.process(new File("demo1","text","C:/OOP"));
        tfh.process(new File("demo2","image","C:/OOP"));
        tfh.process(new File("demo3","doc","C:/OOP"));
    }
}