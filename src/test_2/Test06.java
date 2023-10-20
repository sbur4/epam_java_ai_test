package test_2;

public class Test06 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i < 5; ++i, i = i + 1) {
            res += i;
            System.out.println("A");
        }
        System.out.println(res);
    }
}

// AAA6