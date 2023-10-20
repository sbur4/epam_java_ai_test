package test_1;

public class Test4 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        System.out.println(o1.equals(o3) + " " + o3.equals(o2) + " " + o2.equals(o1));
    }
}

// true false false