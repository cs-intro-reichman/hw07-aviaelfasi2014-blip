public class Koch {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        StdDraw.setCanvasSize(600, 600);
        StdDraw.setScale(0, 1);
        StdDraw.clear();

        curve(n, 0.1, 0.5, 0.9, 0.5);
        StdDraw.show();
    }

    public static void curve(int n, double x1, double y1, double x2, double y2) {

        if (n == 0) {
            StdDraw.line(x1, y1, x2, y2);
            return;
        }

        double xA = x1 + (x2 - x1) / 3.0;
        double yA = y1 + (y2 - y1) / 3.0;

        double xB = x1 + 2.0 * (x2 - x1) / 3.0;
        double yB = y1 + 2.0 * (y2 - y1) / 3.0;

        double dx = xB - xA;
        double dy = yB - yA;

        double xC = xA + (dx * Math.cos(Math.PI / 3.0) - dy * Math.sin(Math.PI / 3.0));
        double yC = yA + (dx * Math.sin(Math.PI / 3.0) + dy * Math.cos(Math.PI / 3.0));

        curve(n - 1, x1, y1, xA, yA);
        curve(n - 1, xA, yA, xC, yC);
        curve(n - 1, xC, yC, xB, yB);
        curve(n - 1, xB, yB, x2, y2);
    }

    public static void snowFlake(int n) {
        StdDraw.setYscale(0, 1.1);
        StdDraw.setXscale(0, 1.1);
        StdDraw.clear();

        double x1 = 0.1, y1 = 0.1;
        double x2 = 1.0, y2 = 0.1;
        double x3 = 0.55, y3 = 0.1 + 0.9 * 0.866; 

        curve(n, x1, y1, x2, y2);
        curve(n, x2, y2, x3, y3);
        curve(n, x3, y3, x1, y1);
    }
}
