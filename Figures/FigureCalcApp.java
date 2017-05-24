import java.util.ArrayList;
import java.util.Map;

public class FigureCalcApp {

    public static void main(String[] args) {
        ArrayList<Figure> arrayList = new ArrayList<>();

        arrayList.add(new Circle(10, 10, 100));
        arrayList.add(new Rectangle(10, 10, 100, 100));

        Map map = new FigureCalc().getMeasures(arrayList);

        map.forEach((k,v)-> System.out.println(k + " " + v));
    }
}
