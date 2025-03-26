package U3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import q0.AbstractC6410a;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f5350i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f5351j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f5352k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f5353l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f5354a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f5355b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f5356c;

    /* renamed from: d, reason: collision with root package name */
    private int f5357d;

    /* renamed from: e, reason: collision with root package name */
    private int f5358e;

    /* renamed from: f, reason: collision with root package name */
    private int f5359f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f5360g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f5361h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i8, float f8, float f9) {
        boolean z7 = f9 < 0.0f;
        Path path = this.f5360g;
        if (z7) {
            int[] iArr = f5352k;
            iArr[0] = 0;
            iArr[1] = this.f5359f;
            iArr[2] = this.f5358e;
            iArr[3] = this.f5357d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f8, f9);
            path.close();
            float f10 = -i8;
            rectF.inset(f10, f10);
            int[] iArr2 = f5352k;
            iArr2[0] = 0;
            iArr2[1] = this.f5357d;
            iArr2[2] = this.f5358e;
            iArr2[3] = this.f5359f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f11 = 1.0f - (i8 / width);
        float[] fArr = f5353l;
        fArr[1] = f11;
        fArr[2] = ((1.0f - f11) / 2.0f) + f11;
        this.f5355b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f5352k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z7) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f5361h);
        }
        canvas.drawArc(rectF, f8, f9, true, this.f5355b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i8) {
        rectF.bottom += i8;
        rectF.offset(0.0f, -i8);
        int[] iArr = f5350i;
        iArr[0] = this.f5359f;
        iArr[1] = this.f5358e;
        iArr[2] = this.f5357d;
        Paint paint = this.f5356c;
        float f8 = rectF.left;
        paint.setShader(new LinearGradient(f8, rectF.top, f8, rectF.bottom, iArr, f5351j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f5356c);
        canvas.restore();
    }

    public Paint c() {
        return this.f5354a;
    }

    public void d(int i8) {
        this.f5357d = AbstractC6410a.k(i8, 68);
        this.f5358e = AbstractC6410a.k(i8, 20);
        this.f5359f = AbstractC6410a.k(i8, 0);
        this.f5354a.setColor(this.f5357d);
    }

    public a(int i8) {
        this.f5360g = new Path();
        Paint paint = new Paint();
        this.f5361h = paint;
        this.f5354a = new Paint();
        d(i8);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f5355b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f5356c = new Paint(paint2);
    }
}
