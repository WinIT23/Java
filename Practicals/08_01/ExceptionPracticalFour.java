// SOP of ExceptionPracticalSuper than ExceptionPractical and than Main

class ExceptionPracticalSuper {
    int numOne = 4;
    int numTwo = 0;

    public void raiseException() throws Exception{
        int answer = numOne / numTwo;
        System.out.println("After division by zero");
    }
}

class ExceptionPractical extends ExceptionPracticalSuper {

    public void raiseExceptionSub() throws Exception {
        raiseException();
    }
}

class ExceptionPracticalDemo {

    public static void main(String[] args) {

        ExceptionPractical obj = new ExceptionPractical();
        try {
            obj.raiseExceptionSub();
        } catch(Exception e) {
            System.out.println("In catch block");
            e.printStackTrace();
        } finally {
            System.out.println("In finally Block");
        }
    }
}
