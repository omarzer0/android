package com.example.armgame;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
public class CustomeView extends View{

    public CustomeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
     Vector v=new Vector(120,100);
    Segment s=new Segment(v,100,30);
    Paint linepaint=new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine((float)s.getA().getX(),(float)s.getA().getY(),(float)s.getB().getX(),(float)s.getB().getY(),linepaint);

    }

}
