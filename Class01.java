// app11_1, 抽象類別的實例
abstract class CShape {
    protected String color;

    public CShape(String str) { // 在抽象類別CShape加入建構元 設定color值
        color = str;
    }

    public abstract void show();
}

class CRectangle extends CShape {
    protected int width, height;

    public CRectangle(int w, int h) {
        super("Yellow"); // 繼承輸入的顏色
        width = w;
        height = h;
    }

    public void show() {
        System.out.print("color=" + color + ",  ");
        System.out.println("area=" + width * height);
    }
}

class CCircle extends CShape {
    protected double radius;

    public CCircle(double r) {
        super("Green"); // 繼承輸入的顏色
        radius = r;
    }

    public void show() {
        System.out.print("color=" + color + ",  ");
        System.out.println("area=" + 3.14 * radius * radius);
    }
}

public class Class01 {
    public static void main(String args[]) {

        CRectangle rect = new CRectangle(5, 10);
        rect.show();

        CCircle cir = new CCircle(2.0);
        cir.show();
    }
}