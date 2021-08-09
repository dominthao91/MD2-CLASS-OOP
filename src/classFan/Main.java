package classFan;

public class Main {
    public static void main(String[] args) {

        Fan fan1 = new Fan(3,true,"red",10);
        Fan fan2 = new Fan(5,false,"blue,",5);
        System.out.println("trạng thái fan1 "+fan1.Showall());
        System.out.println("trang thái Fan2 "+fan2.Showall());

    }
}
