// SOP of finally block will be called

class ExceptionPractical {

    int numOne = 4;
    int numTwo = 0;

    public void raiseException() {
        try {
            int answer = numOne / numTwo;
            System.out.println("After division by zero");
        } catch(Exception e) {
            System.out.println("In catch block");
            e.printStackTrace();
        } finally {
            System.out.println("In finally Block");
        }
    }
}

class ExceptionPracticalDemo {
    public static void main(String[] args) {
        ExceptionPractical obj = new ExceptionPractical();
        obj.raiseException();
    }
}
