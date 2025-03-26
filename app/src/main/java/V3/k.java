package V3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: m, reason: collision with root package name */
    public static final V3.c f5652m = new i(0.5f);

    /* renamed from: a, reason: collision with root package name */
    d f5653a;

    /* renamed from: b, reason: collision with root package name */
    d f5654b;

    /* renamed from: c, reason: collision with root package name */
    d f5655c;

    /* renamed from: d, reason: collision with root package name */
    d f5656d;

    /* renamed from: e, reason: collision with root package name */
    V3.c f5657e;

    /* renamed from: f, reason: collision with root package name */
    V3.c f5658f;

    /* renamed from: g, reason: collision with root package name */
    V3.c f5659g;

    /* renamed from: h, reason: collision with root package name */
    V3.c f5660h;

    /* renamed from: i, reason: collision with root package name */
    f f5661i;

    /* renamed from: j, reason: collision with root package name */
    f f5662j;

    /* renamed from: k, reason: collision with root package name */
    f f5663k;

    /* renamed from: l, reason: collision with root package name */
    f f5664l;

    public interface c {
        V3.c a(V3.c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i8, int i9) {
        return c(context, i8, i9, 0);
    }

    private static b c(Context context, int i8, int i9, int i10) {
        return d(context, i8, i9, new V3.a(i10));
    }

    private static b d(Context context, int i8, int i9, V3.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i8);
        if (i9 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i9);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(D3.l.f1830Y4);
        try {
            int i10 = obtainStyledAttributes.getInt(D3.l.f1838Z4, 0);
            int i11 = obtainStyledAttributes.getInt(D3.l.f1865c5, i10);
            int i12 = obtainStyledAttributes.getInt(D3.l.f1874d5, i10);
            int i13 = obtainStyledAttributes.getInt(D3.l.f1856b5, i10);
            int i14 = obtainStyledAttributes.getInt(D3.l.f1847a5, i10);
            V3.c m8 = m(obtainStyledAttributes, D3.l.f1883e5, cVar);
            V3.c m9 = m(obtainStyledAttributes, D3.l.f1910h5, m8);
            V3.c m10 = m(obtainStyledAttributes, D3.l.f1919i5, m8);
            V3.c m11 = m(obtainStyledAttributes, D3.l.f1901g5, m8);
            return new b().y(i11, m9).C(i12, m10).u(i13, m11).q(i14, m(obtainStyledAttributes, D3.l.f1892f5, m8));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i8, int i9) {
        return f(context, attributeSet, i8, i9, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i8, int i9, int i10) {
        return g(context, attributeSet, i8, i9, new V3.a(i10));
    }

    public static b g(Context context, AttributeSet attributeSet, int i8, int i9, V3.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D3.l.f1864c4, i8, i9);
        int resourceId = obtainStyledAttributes.getResourceId(D3.l.f1873d4, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(D3.l.f1882e4, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static V3.c m(TypedArray typedArray, int i8, V3.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i8);
        if (peekValue == null) {
            return cVar;
        }
        int i9 = peekValue.type;
        return i9 == 5 ? new V3.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i9 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f5663k;
    }

    public d i() {
        return this.f5656d;
    }

    public V3.c j() {
        return this.f5660h;
    }

    public d k() {
        return this.f5655c;
    }

    public V3.c l() {
        return this.f5659g;
    }

    public f n() {
        return this.f5664l;
    }

    public f o() {
        return this.f5662j;
    }

    public f p() {
        return this.f5661i;
    }

    public d q() {
        return this.f5653a;
    }

    public V3.c r() {
        return this.f5657e;
    }

    public d s() {
        return this.f5654b;
    }

    public V3.c t() {
        return this.f5658f;
    }

    public boolean u(RectF rectF) {
        boolean z7 = this.f5664l.getClass().equals(f.class) && this.f5662j.getClass().equals(f.class) && this.f5661i.getClass().equals(f.class) && this.f5663k.getClass().equals(f.class);
        float a8 = this.f5657e.a(rectF);
        return z7 && ((this.f5658f.a(rectF) > a8 ? 1 : (this.f5658f.a(rectF) == a8 ? 0 : -1)) == 0 && (this.f5660h.a(rectF) > a8 ? 1 : (this.f5660h.a(rectF) == a8 ? 0 : -1)) == 0 && (this.f5659g.a(rectF) > a8 ? 1 : (this.f5659g.a(rectF) == a8 ? 0 : -1)) == 0) && ((this.f5654b instanceof j) && (this.f5653a instanceof j) && (this.f5655c instanceof j) && (this.f5656d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f8) {
        return v().o(f8).m();
    }

    public k x(V3.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f5653a = bVar.f5665a;
        this.f5654b = bVar.f5666b;
        this.f5655c = bVar.f5667c;
        this.f5656d = bVar.f5668d;
        this.f5657e = bVar.f5669e;
        this.f5658f = bVar.f5670f;
        this.f5659g = bVar.f5671g;
        this.f5660h = bVar.f5672h;
        this.f5661i = bVar.f5673i;
        this.f5662j = bVar.f5674j;
        this.f5663k = bVar.f5675k;
        this.f5664l = bVar.f5676l;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private d f5665a;

        /* renamed from: b, reason: collision with root package name */
        private d f5666b;

        /* renamed from: c, reason: collision with root package name */
        private d f5667c;

        /* renamed from: d, reason: collision with root package name */
        private d f5668d;

        /* renamed from: e, reason: collision with root package name */
        private V3.c f5669e;

        /* renamed from: f, reason: collision with root package name */
        private V3.c f5670f;

        /* renamed from: g, reason: collision with root package name */
        private V3.c f5671g;

        /* renamed from: h, reason: collision with root package name */
        private V3.c f5672h;

        /* renamed from: i, reason: collision with root package name */
        private f f5673i;

        /* renamed from: j, reason: collision with root package name */
        private f f5674j;

        /* renamed from: k, reason: collision with root package name */
        private f f5675k;

        /* renamed from: l, reason: collision with root package name */
        private f f5676l;

        public b() {
            this.f5665a = h.b();
            this.f5666b = h.b();
            this.f5667c = h.b();
            this.f5668d = h.b();
            this.f5669e = new V3.a(0.0f);
            this.f5670f = new V3.a(0.0f);
            this.f5671g = new V3.a(0.0f);
            this.f5672h = new V3.a(0.0f);
            this.f5673i = h.c();
            this.f5674j = h.c();
            this.f5675k = h.c();
            this.f5676l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f5651a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f5599a;
            }
            return -1.0f;
        }

        public b A(float f8) {
            this.f5669e = new V3.a(f8);
            return this;
        }

        public b B(V3.c cVar) {
            this.f5669e = cVar;
            return this;
        }

        public b C(int i8, V3.c cVar) {
            return D(h.a(i8)).F(cVar);
        }

        public b D(d dVar) {
            this.f5666b = dVar;
            float n8 = n(dVar);
            if (n8 != -1.0f) {
                E(n8);
            }
            return this;
        }

        public b E(float f8) {
            this.f5670f = new V3.a(f8);
            return this;
        }

        public b F(V3.c cVar) {
            this.f5670f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f8) {
            return A(f8).E(f8).w(f8).s(f8);
        }

        public b p(V3.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i8, V3.c cVar) {
            return r(h.a(i8)).t(cVar);
        }

        public b r(d dVar) {
            this.f5668d = dVar;
            float n8 = n(dVar);
            if (n8 != -1.0f) {
                s(n8);
            }
            return this;
        }

        public b s(float f8) {
            this.f5672h = new V3.a(f8);
            return this;
        }

        public b t(V3.c cVar) {
            this.f5672h = cVar;
            return this;
        }

        public b u(int i8, V3.c cVar) {
            return v(h.a(i8)).x(cVar);
        }

        public b v(d dVar) {
            this.f5667c = dVar;
            float n8 = n(dVar);
            if (n8 != -1.0f) {
                w(n8);
            }
            return this;
        }

        public b w(float f8) {
            this.f5671g = new V3.a(f8);
            return this;
        }

        public b x(V3.c cVar) {
            this.f5671g = cVar;
            return this;
        }

        public b y(int i8, V3.c cVar) {
            return z(h.a(i8)).B(cVar);
        }

        public b z(d dVar) {
            this.f5665a = dVar;
            float n8 = n(dVar);
            if (n8 != -1.0f) {
                A(n8);
            }
            return this;
        }

        public b(k kVar) {
            this.f5665a = h.b();
            this.f5666b = h.b();
            this.f5667c = h.b();
            this.f5668d = h.b();
            this.f5669e = new V3.a(0.0f);
            this.f5670f = new V3.a(0.0f);
            this.f5671g = new V3.a(0.0f);
            this.f5672h = new V3.a(0.0f);
            this.f5673i = h.c();
            this.f5674j = h.c();
            this.f5675k = h.c();
            this.f5676l = h.c();
            this.f5665a = kVar.f5653a;
            this.f5666b = kVar.f5654b;
            this.f5667c = kVar.f5655c;
            this.f5668d = kVar.f5656d;
            this.f5669e = kVar.f5657e;
            this.f5670f = kVar.f5658f;
            this.f5671g = kVar.f5659g;
            this.f5672h = kVar.f5660h;
            this.f5673i = kVar.f5661i;
            this.f5674j = kVar.f5662j;
            this.f5675k = kVar.f5663k;
            this.f5676l = kVar.f5664l;
        }
    }

    public k() {
        this.f5653a = h.b();
        this.f5654b = h.b();
        this.f5655c = h.b();
        this.f5656d = h.b();
        this.f5657e = new V3.a(0.0f);
        this.f5658f = new V3.a(0.0f);
        this.f5659g = new V3.a(0.0f);
        this.f5660h = new V3.a(0.0f);
        this.f5661i = h.c();
        this.f5662j = h.c();
        this.f5663k = h.c();
        this.f5664l = h.c();
    }
}
