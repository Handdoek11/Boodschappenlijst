package H;

import H.c;
import H.n;
import J6.AbstractC0650j;
import J6.C0652l;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2805g;

    /* renamed from: h, reason: collision with root package name */
    private static final i f2806h;

    /* renamed from: i, reason: collision with root package name */
    private static final i f2807i;

    /* renamed from: j, reason: collision with root package name */
    private static final i f2808j;

    /* renamed from: a, reason: collision with root package name */
    private final d f2809a;

    /* renamed from: b, reason: collision with root package name */
    private final d f2810b;

    /* renamed from: c, reason: collision with root package name */
    private final d f2811c;

    /* renamed from: d, reason: collision with root package name */
    private final d f2812d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2813e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f2814f;

    public static final class a {

        /* renamed from: H.i$a$a, reason: collision with other inner class name */
        public static final class C0046a extends i {
            C0046a(d dVar, int i8) {
                super(dVar, dVar, i8, null);
            }

            @Override // H.i
            public long e(float f8, float f9, float f10, float f11) {
                return G.h.a(f8, f9, f10, f11, d());
            }
        }

        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(d dVar, d dVar2, int i8) {
            if (!n.e(i8, n.f2835a.a())) {
                return null;
            }
            long e8 = dVar.e();
            c.a aVar = c.f2772a;
            boolean e9 = c.e(e8, aVar.b());
            boolean e10 = c.e(dVar2.e(), aVar.b());
            if (e9 && e10) {
                return null;
            }
            if (!e9 && !e10) {
                return null;
            }
            if (!e9) {
                dVar = dVar2;
            }
            J6.r.c(dVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            x xVar = (x) dVar;
            float[] c8 = e9 ? xVar.J().c() : k.f2818a.c();
            float[] c9 = e10 ? xVar.J().c() : k.f2818a.c();
            return new float[]{c8[0] / c9[0], c8[1] / c9[1], c8[2] / c9[2]};
        }

        public final i c() {
            return i.f2808j;
        }

        public final i d() {
            return i.f2806h;
        }

        public final i e() {
            return i.f2807i;
        }

        public final i f(d dVar) {
            return new C0046a(dVar, n.f2835a.c());
        }

        private a() {
        }
    }

    public static final class b extends i {

        /* renamed from: k, reason: collision with root package name */
        private final x f2815k;

        /* renamed from: l, reason: collision with root package name */
        private final x f2816l;

        /* renamed from: m, reason: collision with root package name */
        private final float[] f2817m;

        public /* synthetic */ b(x xVar, x xVar2, int i8, AbstractC0650j abstractC0650j) {
            this(xVar, xVar2, i8);
        }

        private final float[] f(x xVar, x xVar2, int i8) {
            if (e.f(xVar.J(), xVar2.J())) {
                return e.k(xVar2.F(), xVar.I());
            }
            float[] I7 = xVar.I();
            float[] F7 = xVar2.F();
            float[] c8 = xVar.J().c();
            float[] c9 = xVar2.J().c();
            A J7 = xVar.J();
            k kVar = k.f2818a;
            if (!e.f(J7, kVar.b())) {
                float[] b8 = AbstractC0625a.f2767b.a().b();
                float[] c10 = kVar.c();
                float[] copyOf = Arrays.copyOf(c10, c10.length);
                J6.r.d(copyOf, "copyOf(this, size)");
                I7 = e.k(e.e(b8, c8, copyOf), xVar.I());
            }
            if (!e.f(xVar2.J(), kVar.b())) {
                float[] b9 = AbstractC0625a.f2767b.a().b();
                float[] c11 = kVar.c();
                float[] copyOf2 = Arrays.copyOf(c11, c11.length);
                J6.r.d(copyOf2, "copyOf(this, size)");
                F7 = e.j(e.k(e.e(b9, c9, copyOf2), xVar2.I()));
            }
            if (n.e(i8, n.f2835a.a())) {
                I7 = e.l(new float[]{c8[0] / c9[0], c8[1] / c9[1], c8[2] / c9[2]}, I7);
            }
            return e.k(F7, I7);
        }

        @Override // H.i
        public long e(float f8, float f9, float f10, float f11) {
            float a8 = (float) this.f2815k.D().a(f8);
            float a9 = (float) this.f2815k.D().a(f9);
            float a10 = (float) this.f2815k.D().a(f10);
            return G.h.a((float) this.f2816l.G().a(e.n(this.f2817m, a8, a9, a10)), (float) this.f2816l.G().a(e.o(this.f2817m, a8, a9, a10)), (float) this.f2816l.G().a(e.p(this.f2817m, a8, a9, a10)), f11, this.f2816l);
        }

        private b(x xVar, x xVar2, int i8) {
            super(xVar, xVar2, xVar, xVar2, i8, null, null);
            this.f2815k = xVar;
            this.f2816l = xVar2;
            this.f2817m = f(xVar, xVar2, i8);
        }
    }

    static {
        AbstractC0650j abstractC0650j = null;
        a aVar = new a(abstractC0650j);
        f2805g = aVar;
        h hVar = h.f2781a;
        f2806h = aVar.f(hVar.h());
        x h8 = hVar.h();
        d g8 = hVar.g();
        n.a aVar2 = n.f2835a;
        f2807i = new i(h8, g8, aVar2.b(), abstractC0650j);
        f2808j = new i(hVar.g(), hVar.h(), aVar2.b(), abstractC0650j);
    }

    public /* synthetic */ i(d dVar, d dVar2, int i8, AbstractC0650j abstractC0650j) {
        this(dVar, dVar2, i8);
    }

    public final d d() {
        return this.f2810b;
    }

    public long e(float f8, float f9, float f10, float f11) {
        long h8 = this.f2811c.h(f8, f9, f10);
        C0652l c0652l = C0652l.f3580a;
        float intBitsToFloat = Float.intBitsToFloat((int) (h8 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h8 & 4294967295L));
        float i8 = this.f2811c.i(f8, f9, f10);
        float[] fArr = this.f2814f;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            i8 *= fArr[2];
        }
        float f12 = intBitsToFloat2;
        float f13 = intBitsToFloat;
        return this.f2812d.j(f13, f12, i8, f11, this.f2810b);
    }

    public /* synthetic */ i(d dVar, d dVar2, d dVar3, d dVar4, int i8, float[] fArr, AbstractC0650j abstractC0650j) {
        this(dVar, dVar2, dVar3, dVar4, i8, fArr);
    }

    private i(d dVar, d dVar2, d dVar3, d dVar4, int i8, float[] fArr) {
        this.f2809a = dVar;
        this.f2810b = dVar2;
        this.f2811c = dVar3;
        this.f2812d = dVar4;
        this.f2813e = i8;
        this.f2814f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private i(d dVar, d dVar2, int i8) {
        long e8 = dVar.e();
        c.a aVar = c.f2772a;
        this(dVar, dVar2, c.e(e8, aVar.b()) ? e.d(dVar, k.f2818a.b(), null, 2, null) : dVar, c.e(dVar2.e(), aVar.b()) ? e.d(dVar2, k.f2818a.b(), null, 2, null) : dVar2, i8, f2805g.b(dVar, dVar2, i8), null);
    }
}
