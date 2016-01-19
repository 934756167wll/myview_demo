package demo.view.com.myview_demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Cheers on 2016/1/18 0018.
 */
public class MyView extends View {

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //实例化画笔
        Paint paint = new Paint();
        //设置画笔的颜色
        paint.setColor(Color.BLUE);
        //设置画笔的宽度
        paint.setStrokeWidth(5);
        //设置圆弧为空心
        paint.setStyle(Paint.Style.FILL);
        //消除锯齿
        paint.setAntiAlias(true);
        //获得圆心的X坐标
        int width = getWidth()/2;
        int w = width-getWidth()/5;
        //圆弧半径
        int radius = getWidth()/2-260;

        //画圆
        canvas.drawCircle(150,150,radius,paint);

        paint.setColor(Color.WHITE);

        //画第一根线
        canvas.drawLine(100,150,150,200,paint);

        canvas.drawLine(150,200,220,100,paint);

    }
}
