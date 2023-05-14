 public class ParaByValue {
    void callByVal(int x, int y){
        x = x + y;
        y = y + 1;
        System.out.println("х = "+ x);
        System.out.println("y = "+ y);
    }
}
class ParaByValueDemo{
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        ParaByValue test = new ParaByValue();
        test.callByVal(a, b);
        System.out.println("a= "+ a);//вывод 2
        System.out.println("b= "+ b);//вывод 3

    }
}