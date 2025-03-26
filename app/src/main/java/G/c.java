package G;

import android.graphics.Paint;

/* loaded from: classes.dex */
public abstract class c {
    public static final n a() {
        return new b();
    }

    public static final Paint b() {
        return new Paint(7);
    }

    public static final void c(Paint paint, long j8) {
        paint.setColor(h.d(j8));
    }

    public static final void d(Paint paint, float f8) {
        paint.setStrokeWidth(f8);
    }

    public static final void e(Paint paint, int i8) {
        paint.setStyle(o.c(i8, o.f2492a.a()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
