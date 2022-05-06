package day04;

public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c,5);
        System.out.println("now radius is "+c.radius);
    }
    public void printAreas(Circle c,int time){

        System.out.println("Radius\t\tArea");

        //设置圆的半径1
        for (int i = 1;i<=time;i++){
            c.radius = i;
            System.out.println(c.radius+"\t\t"+c.finArea());
        }
        c.radius = time + 1;
    }
}
