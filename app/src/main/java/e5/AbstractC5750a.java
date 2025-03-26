package e5;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5750a {
    public static void a(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i8 = 0; i8 < pointArr.length; i8++) {
            int i9 = i8 + i8;
            Point point = pointArr[i8];
            fArr[i9] = point.x;
            fArr[i9 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i10 = 0; i10 < pointArr.length; i10++) {
            int i11 = i10 + i10;
            pointArr[i10].set((int) fArr[i11], (int) fArr[i11 + 1]);
        }
    }

    public static void b(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
