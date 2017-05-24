public class SimplePainterApp {

    public static void main(String[] args) {
        SimplePainter simplePainter = new SimplePainter();
        simplePainter.drawFigure(new Circle(10, 10, 100));
        simplePainter.drawFigure(new Rectangle(10, 10, 100, 100));
    }
}
