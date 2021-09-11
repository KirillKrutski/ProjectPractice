package Main;

public class Box {
    private int width; // ширина коробки
    private int height; // высота коробки
    private int depth; // глубина коробки

    // Конструктор для создания клона обьекта
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор, используемый для введения других значений переменных
    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, используемы, когда ни одно значение не задано
    Box() {
        // значение -1 используется
        // для указания неинициализированного параллепипеда
        width = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор для создания куба
    Box(int len) {
        width = height = depth = len;
    }

    // Вычисляем объем коробки
    int getVolume() {
        return width * height * depth;
    }
}
