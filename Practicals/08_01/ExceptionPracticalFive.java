//throw custom exception

class MyException extends Exception {
    String msg;

    MyException(String s){
        msg = s;
    }

    public String toString() {
        return msg;
    }
}

class Student {
    private String studentName;
    private int studentAge;

    public void setName(String studentName) {
        this.studentName = studentName;
    }
    public void setAge(int studentAge) throws MyException {
        if(studentAge < 0) {
            throw new MyException("Negative age not accepted");
        } else if (studentAge == 0) {
            throw new MyException("This is my first Varsaad....");
        } else {
            this.studentAge = studentAge;
        }
    }

    public int getAge() {
        return studentAge;
    }

    public String toString() {
    return "Age : " + this.studentAge + "\nName : " + this.studentName;
    }
}

class StudentDemo {
    public static void main(String[] args) {
        int age = -1;
        Student obj = new Student();

        obj.setName("Vinit");
        
        try{
            obj.setAge(age);
            System.out.println(obj);
        } catch(MyException e) {
            System.out.println(e);
        }

    }
}
