interface Math02 {

    public void show();

    // 計算下面四行
    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);
}

class Compute02 implements Math02 {// 完成下面程式碼

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
    //回傳show
    public void show(){
        System.out.println("ans = "+ ans);
    }
}

public class Class05 {
    public static void main(String args[]) {
        Compute02 cmp02 = new Compute02();
        cmp02.add(3, 5);
        cmp02.show();
        cmp02.sub(3, 5);
        cmp02.show();
        cmp02.mul(3, 5);
        cmp02.show();
        cmp02.div(3, 5);
        cmp02.show();
    }
}
