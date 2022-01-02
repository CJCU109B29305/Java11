interface iAaa {
    public void show();
}

class Cbbb {
    public int num = 10;

    public void set(int n) {
        num = n;
    }
}
// 定義Cccc類別

class Cccc extends Cbbb implements iAaa {
    // 完成程式碼
    public void show() {
        System.out.println("num = " + num);
    }
}

public class Class08 {
    public static void main(String args[]) {
        Cccc cc = new Cccc();
        cc.set(5);
        cc.show();
    }
}
