public class Test {
    public static void main(String[] args) {
        // int x = 10;
        // int y = 2;
        //     try {
        //         for (int z = 2; z >= 0; z--) {
        //             int ans = x / z;
        //             System.out.print(ans+ " ");
        //         }
        //     } catch (ArithmeticException e1) {
        //         System.out.println("E2");
        //     } catch (Exception e1) {
        //         System.out.println("E1");
        //     }

        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(Character.toString(s2.charAt(0)));
        System.out.println(foundAt);
    }
}
