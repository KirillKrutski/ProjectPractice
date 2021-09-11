package Main;

public class HeavyBox extends Box{
    int weight; // <-- особенность класса HeavyBox

    HeavyBox(HeavyBox ob){
        super(ob);  // с помощью super вызываем(используем)
                    // конструктор из СуперКласса Box
        weight = ob.weight; // из класса Box передаем значение
                            // weight в класс HeavyBox
    }

    // Конструктор, используемый при введении всех элементов
    HeavyBox(int w, int h , int d , int m){
        super(w , h , d);
        weight = m; // масса
    }

    // Конструктор по умолчанию
    HeavyBox(){
        super();
        weight = -1;
    }

    HeavyBox(int len , int m){
        super(len);
        weight = m;
    }
}
