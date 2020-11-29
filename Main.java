package lab9;

public class Main {
    public static void main(String[] args) {
        task1();
        task8();
    }

    static void task1(){
        System.out.println("Task 1");
        ToHexConveter toHexConveter = new ToHexConveter();

        System.out.println("Test 1");
        int i1 = 51966;
        System.out.println(i1);
        String ans1 = toHexConveter.intToHexString(i1);
        System.out.println(ans1.toUpperCase());

        System.out.println("Test 2");
        int i2 = 101112;
        System.out.println(i2);
        String ans2 = toHexConveter.intToHexString(i2);
        System.out.println(ans2.toUpperCase() + '\n');
    }

    static void task8(){
        System.out.println("Task 8");
        NumCounter numcounter = new NumCounter();

        System.out.println("Test 1");
        String s1 = new String ("The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago");
        System.out.println(s1);
        int ans1 = numcounter.countNum(s1);
        System.out.println(ans1);

        System.out.println("Test 2");
        String s2 = new String ("The user with the nickname koala 757677 this month wrote 3 times more comments than the user with the nickname croco 181 dile 920 4 months ago");
        System.out.println(s2);
        int ans2 = numcounter.countNum(s2);
        System.out.println(ans2);
    }
}
