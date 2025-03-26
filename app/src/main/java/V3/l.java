package V3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final m[] f5677a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f5678b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f5679c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f5680d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f5681e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f5682f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final m f5683g = new m();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f5684h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f5685i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f5686j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f5687k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f5688l = true;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final l f5689a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i8);

        void b(m mVar, Matrix matrix, int i8);
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final k f5690a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f5691b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f5692c;

        /* renamed from: d, reason: collision with root package name */
        public final b f5693d;

        /* renamed from: e, reason: collision with root package name */
        public final float f5694e;

        c(k kVar, float f8, RectF rectF, b bVar, Path path) {
            this.f5693d = bVar;
            this.f5690a = kVar;
            this.f5694e = f8;
            this.f5692c = rectF;
            this.f5691b = path;
        }
    }

    public l() {
        for (int i8 = 0; i8 < 4; i8++) {
            this.f5677a[i8] = new m();
            this.f5678b[i8] = new Matrix();
            this.f5679c[i8] = new Matrix();
        }
    }

    private float a(int i8) {
        return ((i8 + 1) % 4) * 90;
    }

    private void b(c cVar, int i8) {
        this.f5684h[0] = this.f5677a[i8].k();
        this.f5684h[1] = this.f5677a[i8].l();
        this.f5678b[i8].mapPoints(this.f5684h);
        if (i8 == 0) {
            Path path = cVar.f5691b;
            float[] fArr = this.f5684h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f5691b;
            float[] fArr2 = this.f5684h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f5677a[i8].d(this.f5678b[i8], cVar.f5691b);
        b bVar = cVar.f5693d;
        if (bVar != null) {
            bVar.b(this.f5677a[i8], this.f5678b[i8], i8);
        }
    }

    private void c(c cVar, int i8) {
        int i9 = (i8 + 1) % 4;
        this.f5684h[0] = this.f5677a[i8].i();
        this.f5684h[1] = this.f5677a[i8].j();
        this.f5678b[i8].mapPoints(this.f5684h);
        this.f5685i[0] = this.f5677a[i9].k();
        this.f5685i[1] = this.f5677a[i9].l();
        this.f5678b[i9].mapPoints(this.f5685i);
        float f8 = this.f5684h[0];
        float[] fArr = this.f5685i;
        float max = Math.max(((float) Math.hypot(f8 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float i10 = i(cVar.f5692c, i8);
        this.f5683g.n(0.0f, 0.0f);
        f j8 = j(i8, cVar.f5690a);
        j8.b(max, i10, cVar.f5694e, this.f5683g);
        this.f5686j.reset();
        this.f5683g.d(this.f5679c[i8], this.f5686j);
        if (this.f5688l && (j8.a() || l(this.f5686j, i8) || l(this.f5686j, i9))) {
            Path path = this.f5686j;
            path.op(path, this.f5682f, Path.Op.DIFFERENCE);
            this.f5684h[0] = this.f5683g.k();
            this.f5684h[1] = this.f5683g.l();
            this.f5679c[i8].mapPoints(this.f5684h);
            Path path2 = this.f5681e;
            float[] fArr2 = this.f5684h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f5683g.d(this.f5679c[i8], this.f5681e);
        } else {
            this.f5683g.d(this.f5679c[i8], cVar.f5691b);
        }
        b bVar = cVar.f5693d;
        if (bVar != null) {
            bVar.a(this.f5683g, this.f5679c[i8], i8);
        }
    }

    private void f(int i8, RectF rectF, PointF pointF) {
        if (i8 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i8 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i8 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private V3.c g(int i8, k kVar) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private d h(int i8, k kVar) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i8) {
        float[] fArr = this.f5684h;
        m mVar = this.f5677a[i8];
        fArr[0] = mVar.f5697c;
        fArr[1] = mVar.f5698d;
        this.f5678b[i8].mapPoints(fArr);
        return (i8 == 1 || i8 == 3) ? Math.abs(rectF.centerX() - this.f5684h[0]) : Math.abs(rectF.centerY() - this.f5684h[1]);
    }

    private f j(int i8, k kVar) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public static l k() {
        return a.f5689a;
    }

    private boolean l(Path path, int i8) {
        this.f5687k.reset();
        this.f5677a[i8].d(this.f5678b[i8], this.f5687k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f5687k.computeBounds(rectF, true);
        path.op(this.f5687k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i8) {
        h(i8, cVar.f5690a).b(this.f5677a[i8], 90.0f, cVar.f5694e, cVar.f5692c, g(i8, cVar.f5690a));
        float a8 = a(i8);
        this.f5678b[i8].reset();
        f(i8, cVar.f5692c, this.f5680d);
        Matrix matrix = this.f5678b[i8];
        PointF pointF = this.f5680d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f5678b[i8].preRotate(a8);
    }

    private void n(int i8) {
        this.f5684h[0] = this.f5677a[i8].i();
        this.f5684h[1] = this.f5677a[i8].j();
        this.f5678b[i8].mapPoints(this.f5684h);
        float a8 = a(i8);
        this.f5679c[i8].reset();
        Matrix matrix = this.f5679c[i8];
        float[] fArr = this.f5684h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f5679c[i8].preRotate(a8);
    }

    public void d(k kVar, float f8, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f5681e.rewind();
        this.f5682f.rewind();
        this.f5682f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f8, rectF, bVar, path);
        for (int i8 = 0; i8 < 4; i8++) {
            m(cVar, i8);
            n(i8);
        }
        for (int i9 = 0; i9 < 4; i9++) {
            b(cVar, i9);
            c(cVar, i9);
        }
        path.close();
        this.f5681e.close();
        if (this.f5681e.isEmpty()) {
            return;
        }
        path.op(this.f5681e, Path.Op.UNION);
    }

    public void e(k kVar, float f8, RectF rectF, Path path) {
        d(kVar, f8, rectF, null, path);
    }
}
