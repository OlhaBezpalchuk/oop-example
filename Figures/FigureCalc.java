import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FigureCalc {

    public Map getMeasures(ArrayList<Figure> figures) {

        Map measures = new HashMap<String, Double>();

        figures.forEach((figure)->measures.put(figure.toString().split("@")[0], figure.square()));

        return measures;
    }
}
