public class PipeCheckDemo {
    public static void main(String[] args) {
        PipeCheckDemo pip = new PipeCheckDemo();
        if (pip != null | false) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}