package test_1;

public class Test5 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0, j = 10; res > 10; ++i, --j) { // l1
            res = res + i + j;
        }
        System.out.println(0);
    }
}

// 0