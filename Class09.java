interface Math03 {
    void show();

    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);

}

interface AdvaM {
    public void mod(int a, int b);

    public void fac(int a);

    public void pow(int a, int b);
}

class Com03 implements Math03, AdvaM { // 完成程式碼

    public int ans;// 新增ans

    public void add(int a, int b) {
        ans = a + b;
    }

    public void sub(int a, int b) {
        ans = a - b;
    }

    public void mul(int a, int b) {
        ans = a * b;
    }

    public void div(int a, int b) {
        ans = a / b;
    }

    public void mod(int a, int b) {
        ans = a % b;
    }

    public void fac(int a) {// 階層
        ans = 1;
        for (int i = 1; i <= a; i++) {
            ans *= i;
        }
    }

    public void pow(int a, int b) {// 次方
        ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
    }

    // 回傳show
    public void show() {
        System.out.println("ans = " + ans);
    }
}

public class Class09 {
    public static void main(String args[]) {
        Com03 cmp03 = new Com03();
        cmp03.mul(3, 5);
        cmp03.show();
        cmp03.mod(14, 5);
        cmp03.show();
        cmp03.fac(5);
        cmp03.show();
        cmp03.pow(2,5);
        cmp03.show();
    }
}
