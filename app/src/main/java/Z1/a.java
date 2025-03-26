package Z1;

import J1.l;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c2.C0977a;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.load.resource.bitmap.x;
import d2.AbstractC5709k;
import d2.AbstractC5710l;
import d2.C5700b;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: D, reason: collision with root package name */
    private boolean f6163D;

    /* renamed from: F, reason: collision with root package name */
    private Drawable f6165F;

    /* renamed from: G, reason: collision with root package name */
    private int f6166G;

    /* renamed from: K, reason: collision with root package name */
    private boolean f6170K;

    /* renamed from: L, reason: collision with root package name */
    private Resources.Theme f6171L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f6172M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f6173N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f6174O;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f6176Q;

    /* renamed from: o, reason: collision with root package name */
    private int f6177o;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f6181v;

    /* renamed from: w, reason: collision with root package name */
    private int f6182w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f6183x;

    /* renamed from: y, reason: collision with root package name */
    private int f6184y;

    /* renamed from: s, reason: collision with root package name */
    private float f6178s = 1.0f;

    /* renamed from: t, reason: collision with root package name */
    private L1.a f6179t = L1.a.f3696e;

    /* renamed from: u, reason: collision with root package name */
    private com.bumptech.glide.g f6180u = com.bumptech.glide.g.NORMAL;

    /* renamed from: z, reason: collision with root package name */
    private boolean f6185z = true;

    /* renamed from: A, reason: collision with root package name */
    private int f6160A = -1;

    /* renamed from: B, reason: collision with root package name */
    private int f6161B = -1;

    /* renamed from: C, reason: collision with root package name */
    private J1.e f6162C = C0977a.c();

    /* renamed from: E, reason: collision with root package name */
    private boolean f6164E = true;

    /* renamed from: H, reason: collision with root package name */
    private J1.h f6167H = new J1.h();

    /* renamed from: I, reason: collision with root package name */
    private Map f6168I = new C5700b();

    /* renamed from: J, reason: collision with root package name */
    private Class f6169J = Object.class;

    /* renamed from: P, reason: collision with root package name */
    private boolean f6175P = true;

    private boolean N(int i8) {
        return O(this.f6177o, i8);
    }

    private static boolean O(int i8, int i9) {
        return (i8 & i9) != 0;
    }

    private a X(n nVar, l lVar) {
        return c0(nVar, lVar, false);
    }

    private a c0(n nVar, l lVar, boolean z7) {
        a l02 = z7 ? l0(nVar, lVar) : Y(nVar, lVar);
        l02.f6175P = true;
        return l02;
    }

    public final com.bumptech.glide.g A() {
        return this.f6180u;
    }

    public final Class B() {
        return this.f6169J;
    }

    public final J1.e C() {
        return this.f6162C;
    }

    public final float D() {
        return this.f6178s;
    }

    public final Resources.Theme E() {
        return this.f6171L;
    }

    public final Map F() {
        return this.f6168I;
    }

    public final boolean G() {
        return this.f6176Q;
    }

    public final boolean H() {
        return this.f6173N;
    }

    protected final boolean I() {
        return this.f6172M;
    }

    public final boolean J(a aVar) {
        return Float.compare(aVar.f6178s, this.f6178s) == 0 && this.f6182w == aVar.f6182w && AbstractC5710l.d(this.f6181v, aVar.f6181v) && this.f6184y == aVar.f6184y && AbstractC5710l.d(this.f6183x, aVar.f6183x) && this.f6166G == aVar.f6166G && AbstractC5710l.d(this.f6165F, aVar.f6165F) && this.f6185z == aVar.f6185z && this.f6160A == aVar.f6160A && this.f6161B == aVar.f6161B && this.f6163D == aVar.f6163D && this.f6164E == aVar.f6164E && this.f6173N == aVar.f6173N && this.f6174O == aVar.f6174O && this.f6179t.equals(aVar.f6179t) && this.f6180u == aVar.f6180u && this.f6167H.equals(aVar.f6167H) && this.f6168I.equals(aVar.f6168I) && this.f6169J.equals(aVar.f6169J) && AbstractC5710l.d(this.f6162C, aVar.f6162C) && AbstractC5710l.d(this.f6171L, aVar.f6171L);
    }

    public final boolean K() {
        return this.f6185z;
    }

    public final boolean L() {
        return N(8);
    }

    boolean M() {
        return this.f6175P;
    }

    public final boolean P() {
        return this.f6164E;
    }

    public final boolean Q() {
        return this.f6163D;
    }

    public final boolean R() {
        return N(2048);
    }

    public final boolean S() {
        return AbstractC5710l.u(this.f6161B, this.f6160A);
    }

    public a T() {
        this.f6170K = true;
        return d0();
    }

    public a U() {
        return Y(n.f12931e, new com.bumptech.glide.load.resource.bitmap.l());
    }

    public a V() {
        return X(n.f12930d, new m());
    }

    public a W() {
        return X(n.f12929c, new x());
    }

    final a Y(n nVar, l lVar) {
        if (this.f6172M) {
            return clone().Y(nVar, lVar);
        }
        k(nVar);
        return k0(lVar, false);
    }

    public a Z(int i8, int i9) {
        if (this.f6172M) {
            return clone().Z(i8, i9);
        }
        this.f6161B = i8;
        this.f6160A = i9;
        this.f6177o |= 512;
        return e0();
    }

    public a a0(Drawable drawable) {
        if (this.f6172M) {
            return clone().a0(drawable);
        }
        this.f6183x = drawable;
        int i8 = this.f6177o | 64;
        this.f6184y = 0;
        this.f6177o = i8 & (-129);
        return e0();
    }

    public a b(a aVar) {
        if (this.f6172M) {
            return clone().b(aVar);
        }
        if (O(aVar.f6177o, 2)) {
            this.f6178s = aVar.f6178s;
        }
        if (O(aVar.f6177o, 262144)) {
            this.f6173N = aVar.f6173N;
        }
        if (O(aVar.f6177o, 1048576)) {
            this.f6176Q = aVar.f6176Q;
        }
        if (O(aVar.f6177o, 4)) {
            this.f6179t = aVar.f6179t;
        }
        if (O(aVar.f6177o, 8)) {
            this.f6180u = aVar.f6180u;
        }
        if (O(aVar.f6177o, 16)) {
            this.f6181v = aVar.f6181v;
            this.f6182w = 0;
            this.f6177o &= -33;
        }
        if (O(aVar.f6177o, 32)) {
            this.f6182w = aVar.f6182w;
            this.f6181v = null;
            this.f6177o &= -17;
        }
        if (O(aVar.f6177o, 64)) {
            this.f6183x = aVar.f6183x;
            this.f6184y = 0;
            this.f6177o &= -129;
        }
        if (O(aVar.f6177o, 128)) {
            this.f6184y = aVar.f6184y;
            this.f6183x = null;
            this.f6177o &= -65;
        }
        if (O(aVar.f6177o, 256)) {
            this.f6185z = aVar.f6185z;
        }
        if (O(aVar.f6177o, 512)) {
            this.f6161B = aVar.f6161B;
            this.f6160A = aVar.f6160A;
        }
        if (O(aVar.f6177o, 1024)) {
            this.f6162C = aVar.f6162C;
        }
        if (O(aVar.f6177o, 4096)) {
            this.f6169J = aVar.f6169J;
        }
        if (O(aVar.f6177o, 8192)) {
            this.f6165F = aVar.f6165F;
            this.f6166G = 0;
            this.f6177o &= -16385;
        }
        if (O(aVar.f6177o, 16384)) {
            this.f6166G = aVar.f6166G;
            this.f6165F = null;
            this.f6177o &= -8193;
        }
        if (O(aVar.f6177o, 32768)) {
            this.f6171L = aVar.f6171L;
        }
        if (O(aVar.f6177o, 65536)) {
            this.f6164E = aVar.f6164E;
        }
        if (O(aVar.f6177o, 131072)) {
            this.f6163D = aVar.f6163D;
        }
        if (O(aVar.f6177o, 2048)) {
            this.f6168I.putAll(aVar.f6168I);
            this.f6175P = aVar.f6175P;
        }
        if (O(aVar.f6177o, 524288)) {
            this.f6174O = aVar.f6174O;
        }
        if (!this.f6164E) {
            this.f6168I.clear();
            int i8 = this.f6177o;
            this.f6163D = false;
            this.f6177o = i8 & (-133121);
            this.f6175P = true;
        }
        this.f6177o |= aVar.f6177o;
        this.f6167H.d(aVar.f6167H);
        return e0();
    }

    public a b0(com.bumptech.glide.g gVar) {
        if (this.f6172M) {
            return clone().b0(gVar);
        }
        this.f6180u = (com.bumptech.glide.g) AbstractC5709k.d(gVar);
        this.f6177o |= 8;
        return e0();
    }

    public a c() {
        if (this.f6170K && !this.f6172M) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f6172M = true;
        return T();
    }

    protected final a e0() {
        if (this.f6170K) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return d0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return J((a) obj);
        }
        return false;
    }

    @Override // 
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            J1.h hVar = new J1.h();
            aVar.f6167H = hVar;
            hVar.d(this.f6167H);
            C5700b c5700b = new C5700b();
            aVar.f6168I = c5700b;
            c5700b.putAll(this.f6168I);
            aVar.f6170K = false;
            aVar.f6172M = false;
            return aVar;
        } catch (CloneNotSupportedException e8) {
            throw new RuntimeException(e8);
        }
    }

    public a f0(J1.g gVar, Object obj) {
        if (this.f6172M) {
            return clone().f0(gVar, obj);
        }
        AbstractC5709k.d(gVar);
        AbstractC5709k.d(obj);
        this.f6167H.e(gVar, obj);
        return e0();
    }

    public a g0(J1.e eVar) {
        if (this.f6172M) {
            return clone().g0(eVar);
        }
        this.f6162C = (J1.e) AbstractC5709k.d(eVar);
        this.f6177o |= 1024;
        return e0();
    }

    public a h(Class cls) {
        if (this.f6172M) {
            return clone().h(cls);
        }
        this.f6169J = (Class) AbstractC5709k.d(cls);
        this.f6177o |= 4096;
        return e0();
    }

    public a h0(float f8) {
        if (this.f6172M) {
            return clone().h0(f8);
        }
        if (f8 < 0.0f || f8 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f6178s = f8;
        this.f6177o |= 2;
        return e0();
    }

    public int hashCode() {
        return AbstractC5710l.p(this.f6171L, AbstractC5710l.p(this.f6162C, AbstractC5710l.p(this.f6169J, AbstractC5710l.p(this.f6168I, AbstractC5710l.p(this.f6167H, AbstractC5710l.p(this.f6180u, AbstractC5710l.p(this.f6179t, AbstractC5710l.q(this.f6174O, AbstractC5710l.q(this.f6173N, AbstractC5710l.q(this.f6164E, AbstractC5710l.q(this.f6163D, AbstractC5710l.o(this.f6161B, AbstractC5710l.o(this.f6160A, AbstractC5710l.q(this.f6185z, AbstractC5710l.p(this.f6165F, AbstractC5710l.o(this.f6166G, AbstractC5710l.p(this.f6183x, AbstractC5710l.o(this.f6184y, AbstractC5710l.p(this.f6181v, AbstractC5710l.o(this.f6182w, AbstractC5710l.l(this.f6178s)))))))))))))))))))));
    }

    public a i(L1.a aVar) {
        if (this.f6172M) {
            return clone().i(aVar);
        }
        this.f6179t = (L1.a) AbstractC5709k.d(aVar);
        this.f6177o |= 4;
        return e0();
    }

    public a i0(boolean z7) {
        if (this.f6172M) {
            return clone().i0(true);
        }
        this.f6185z = !z7;
        this.f6177o |= 256;
        return e0();
    }

    public a j0(l lVar) {
        return k0(lVar, true);
    }

    public a k(n nVar) {
        return f0(n.f12934h, AbstractC5709k.d(nVar));
    }

    a k0(l lVar, boolean z7) {
        if (this.f6172M) {
            return clone().k0(lVar, z7);
        }
        v vVar = new v(lVar, z7);
        m0(Bitmap.class, lVar, z7);
        m0(Drawable.class, vVar, z7);
        m0(BitmapDrawable.class, vVar.c(), z7);
        m0(V1.c.class, new V1.f(lVar), z7);
        return e0();
    }

    public a l(int i8) {
        if (this.f6172M) {
            return clone().l(i8);
        }
        this.f6182w = i8;
        int i9 = this.f6177o | 32;
        this.f6181v = null;
        this.f6177o = i9 & (-17);
        return e0();
    }

    final a l0(n nVar, l lVar) {
        if (this.f6172M) {
            return clone().l0(nVar, lVar);
        }
        k(nVar);
        return j0(lVar);
    }

    public final L1.a m() {
        return this.f6179t;
    }

    a m0(Class cls, l lVar, boolean z7) {
        if (this.f6172M) {
            return clone().m0(cls, lVar, z7);
        }
        AbstractC5709k.d(cls);
        AbstractC5709k.d(lVar);
        this.f6168I.put(cls, lVar);
        int i8 = this.f6177o;
        this.f6164E = true;
        this.f6177o = 67584 | i8;
        this.f6175P = false;
        if (z7) {
            this.f6177o = i8 | 198656;
            this.f6163D = true;
        }
        return e0();
    }

    public a n0(l... lVarArr) {
        return lVarArr.length > 1 ? k0(new J1.f(lVarArr), true) : lVarArr.length == 1 ? j0(lVarArr[0]) : e0();
    }

    public a o0(boolean z7) {
        if (this.f6172M) {
            return clone().o0(z7);
        }
        this.f6176Q = z7;
        this.f6177o |= 1048576;
        return e0();
    }

    public final int p() {
        return this.f6182w;
    }

    public final Drawable q() {
        return this.f6181v;
    }

    public final Drawable r() {
        return this.f6165F;
    }

    public final int s() {
        return this.f6166G;
    }

    public final boolean u() {
        return this.f6174O;
    }

    public final J1.h v() {
        return this.f6167H;
    }

    public final int w() {
        return this.f6160A;
    }

    public final int x() {
        return this.f6161B;
    }

    public final Drawable y() {
        return this.f6183x;
    }

    public final int z() {
        return this.f6184y;
    }

    private a d0() {
        return this;
    }
}
