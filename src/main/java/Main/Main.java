package Main;

public class Main {
    public static void main(String[] args) {
        MoneyBox moneyBox1 = new MoneyBox(100 , 200,150,100,300);
        MoneyBox moneyBox2 = new MoneyBox(); // не задаем ни один параметр
//        int x = moneyBox2.weight;
//        System.out.println(x);
        HeavyBox heavyBox1 = new HeavyBox(100 , 150,150,100);
        int newWeight = heavyBox1.weight * 2;
        heavyBox1.weight = newWeight;
//        int newHeight = heavyBox1.height * 2; // .height выделяется красным
//        heavyBox1.height
    }
}
