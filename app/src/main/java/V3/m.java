package V3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public float f5695a;

    /* renamed from: b, reason: collision with root package name */
    public float f5696b;

    /* renamed from: c, reason: collision with root package name */
    public float f5697c;

    /* renamed from: d, reason: collision with root package name */
    public float f5698d;

    /* renamed from: e, reason: collision with root package name */
    public float f5699e;

    /* renamed from: f, reason: collision with root package name */
    public float f5700f;

    /* renamed from: g, reason: collision with root package name */
    private final List f5701g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f5702h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f5703i;

    class a extends g {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f5704c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f5705d;

        a(List list, Matrix matrix) {
            this.f5704c = list;
            this.f5705d = matrix;
        }

        @Override // V3.m.g
        public void b(Matrix matrix, U3.a aVar, int i8, Canvas canvas) {
            Iterator it = this.f5704c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(this.f5705d, aVar, i8, canvas);
            }
        }
    }

    static class b extends g {

        /* renamed from: c, reason: collision with root package name */
        private final d f5707c;

        public b(d dVar) {
            this.f5707c = dVar;
        }

        @Override // V3.m.g
        public void b(Matrix matrix, U3.a aVar, int i8, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f5707c.k(), this.f5707c.o(), this.f5707c.l(), this.f5707c.j()), i8, this.f5707c.m(), this.f5707c.n());
        }
    }

    static class c extends g {

        /* renamed from: c, reason: collision with root package name */
        private final e f5708c;

        /* renamed from: d, reason: collision with root package name */
        private final float f5709d;

        /* renamed from: e, reason: collision with root package name */
        private final float f5710e;

        public c(e eVar, float f8, float f9) {
            this.f5708c = eVar;
            this.f5709d = f8;
            this.f5710e = f9;
        }

        @Override // V3.m.g
        public void b(Matrix matrix, U3.a aVar, int i8, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f5708c.f5719c - this.f5710e, this.f5708c.f5718b - this.f5709d), 0.0f);
            this.f5722a.set(matrix);
            this.f5722a.preTranslate(this.f5709d, this.f5710e);
            this.f5722a.preRotate(c());
            aVar.b(canvas, this.f5722a, rectF, i8);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f5708c.f5719c - this.f5710e) / (this.f5708c.f5718b - this.f5709d)));
        }
    }

    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f5711h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public float f5712b;

        /* renamed from: c, reason: collision with root package name */
        public float f5713c;

        /* renamed from: d, reason: collision with root package name */
        public float f5714d;

        /* renamed from: e, reason: collision with root package name */
        public float f5715e;

        /* renamed from: f, reason: collision with root package name */
        public float f5716f;

        /* renamed from: g, reason: collision with root package name */
        public float f5717g;

        public d(float f8, float f9, float f10, float f11) {
            q(f8);
            u(f9);
            r(f10);
            p(f11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f5715e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f5712b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f5714d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f5716f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f5717g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f5713c;
        }

        private void p(float f8) {
            this.f5715e = f8;
        }

        private void q(float f8) {
            this.f5712b = f8;
        }

        private void r(float f8) {
            this.f5714d = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f8) {
            this.f5716f = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f8) {
            this.f5717g = f8;
        }

        private void u(float f8) {
            this.f5713c = f8;
        }

        @Override // V3.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5720a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f5711h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private float f5718b;

        /* renamed from: c, reason: collision with root package name */
        private float f5719c;

        @Override // V3.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5720a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f5718b, this.f5719c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f5720a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* renamed from: b, reason: collision with root package name */
        static final Matrix f5721b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        final Matrix f5722a = new Matrix();

        g() {
        }

        public final void a(U3.a aVar, int i8, Canvas canvas) {
            b(f5721b, aVar, i8, canvas);
        }

        public abstract void b(Matrix matrix, U3.a aVar, int i8, Canvas canvas);
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f8) {
        if (g() == f8) {
            return;
        }
        float g8 = ((f8 - g()) + 360.0f) % 360.0f;
        if (g8 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g8);
        this.f5702h.add(new b(dVar));
        p(f8);
    }

    private void c(g gVar, float f8, float f9) {
        b(f8);
        this.f5702h.add(gVar);
        p(f9);
    }

    private float g() {
        return this.f5699e;
    }

    private float h() {
        return this.f5700f;
    }

    private void p(float f8) {
        this.f5699e = f8;
    }

    private void q(float f8) {
        this.f5700f = f8;
    }

    private void r(float f8) {
        this.f5697c = f8;
    }

    private void s(float f8) {
        this.f5698d = f8;
    }

    private void t(float f8) {
        this.f5695a = f8;
    }

    private void u(float f8) {
        this.f5696b = f8;
    }

    public void a(float f8, float f9, float f10, float f11, float f12, float f13) {
        d dVar = new d(f8, f9, f10, f11);
        dVar.s(f12);
        dVar.t(f13);
        this.f5701g.add(dVar);
        b bVar = new b(dVar);
        float f14 = f12 + f13;
        boolean z7 = f13 < 0.0f;
        if (z7) {
            f12 = (f12 + 180.0f) % 360.0f;
        }
        c(bVar, f12, z7 ? (180.0f + f14) % 360.0f : f14);
        double d8 = f14;
        r(((f8 + f10) * 0.5f) + (((f10 - f8) / 2.0f) * ((float) Math.cos(Math.toRadians(d8)))));
        s(((f9 + f11) * 0.5f) + (((f11 - f9) / 2.0f) * ((float) Math.sin(Math.toRadians(d8)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f5701g.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((f) this.f5701g.get(i8)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f5703i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f5702h), new Matrix(matrix));
    }

    float i() {
        return this.f5697c;
    }

    float j() {
        return this.f5698d;
    }

    float k() {
        return this.f5695a;
    }

    float l() {
        return this.f5696b;
    }

    public void m(float f8, float f9) {
        e eVar = new e();
        eVar.f5718b = f8;
        eVar.f5719c = f9;
        this.f5701g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f8);
        s(f9);
    }

    public void n(float f8, float f9) {
        o(f8, f9, 270.0f, 0.0f);
    }

    public void o(float f8, float f9, float f10, float f11) {
        t(f8);
        u(f9);
        r(f8);
        s(f9);
        p(f10);
        q((f10 + f11) % 360.0f);
        this.f5701g.clear();
        this.f5702h.clear();
        this.f5703i = false;
    }
}
