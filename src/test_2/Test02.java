package test_2;

public class Test02 {
    public static void main(String[] args) {
        int x = 1;
        if (x++ == 2) {
            System.out.println(++x);
        }else{
            System.out.println(--x);
        }
    }
}

// 1