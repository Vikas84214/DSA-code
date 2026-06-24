package OOPS;

public class opps {
    public static void main(String[] args) {
        pen p1 = new pen();

        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "yellow";
        System.out.println(p1.color);
    }
}

class pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
