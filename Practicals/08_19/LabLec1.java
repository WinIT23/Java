class StringDemo {
    public static void main(String[] args) {

        String string = new String();
        string = "Hello world";

        System.out.println(string);
        System.out.println(string.charAt(2));
        System.out.println(string.codePointAt(2));
        System.out.println(string.contains("worl"));

        int i = 16969;

        // valueOf dosen't change values of string object
        System.out.println(String.valueOf(i));
        System.out.println(string);

    }
}
