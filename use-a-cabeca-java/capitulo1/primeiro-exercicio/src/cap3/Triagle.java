package cap3;

public class Triagle {
    double area;
    int height;
    int lenght;

    public static void main(String[] args) {
        Triagle []ta = new Triagle[4];
        int x = 0;

        while (x < 4){
           ta[x] = new Triagle();
            ta[x].height = (x + 1) * 2;
            ta[x].lenght = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x = x +1;
        }

        int y = x;
        x = 27;
        Triagle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);

    }
    void setArea() {
        area = (height * lenght)/ 2;
    }
}
