import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AlgoVisHelper {


    private AlgoVisHelper(){}

    //颜色
    public static void setColor(Graphics2D g2d,Color color){
        g2d.setColor(color);
    }

    //线条粗细
    public static void setStrokeWidth(Graphics2D g2d,int w){
        int strokeWidth = w;
        g2d.setStroke(new BasicStroke(strokeWidth,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));

    }

    //空心圆
    public static void strokeCircle(Graphics2D g2d,int x,int y,int r){

        Ellipse2D circle = new Ellipse2D.Double(x-r,y-r,2*r,2*r);
        g2d.draw(circle);
    }

    //实心圆
    public static void fillCircle(Graphics2D g2d,int x,int y,int r){

        Ellipse2D circle = new Ellipse2D.Double(x-r,y-r,2*r,2*r);
        g2d.fill(circle);
    }

    //暂停
    public static void pause(int t){
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
