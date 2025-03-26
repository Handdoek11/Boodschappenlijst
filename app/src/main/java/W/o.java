package W;

import J6.AbstractC0650j;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class o implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    private static final o f5769A;

    /* renamed from: B, reason: collision with root package name */
    private static final o f5770B;

    /* renamed from: C, reason: collision with root package name */
    private static final o f5771C;

    /* renamed from: D, reason: collision with root package name */
    private static final o f5772D;

    /* renamed from: E, reason: collision with root package name */
    private static final o f5773E;

    /* renamed from: F, reason: collision with root package name */
    private static final o f5774F;

    /* renamed from: G, reason: collision with root package name */
    private static final o f5775G;

    /* renamed from: H, reason: collision with root package name */
    private static final o f5776H;

    /* renamed from: I, reason: collision with root package name */
    private static final o f5777I;

    /* renamed from: J, reason: collision with root package name */
    private static final o f5778J;

    /* renamed from: K, reason: collision with root package name */
    private static final o f5779K;

    /* renamed from: L, reason: collision with root package name */
    private static final List f5780L;

    /* renamed from: s, reason: collision with root package name */
    public static final a f5781s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    private static final o f5782t;

    /* renamed from: u, reason: collision with root package name */
    private static final o f5783u;

    /* renamed from: v, reason: collision with root package name */
    private static final o f5784v;

    /* renamed from: w, reason: collision with root package name */
    private static final o f5785w;

    /* renamed from: x, reason: collision with root package name */
    private static final o f5786x;

    /* renamed from: y, reason: collision with root package name */
    private static final o f5787y;

    /* renamed from: z, reason: collision with root package name */
    private static final o f5788z;

    /* renamed from: o, reason: collision with root package name */
    private final int f5789o;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final o a() {
            return o.f5774F;
        }

        public final o b() {
            return o.f5787y;
        }

        private a() {
        }
    }

    static {
        o oVar = new o(100);
        f5782t = oVar;
        o oVar2 = new o(200);
        f5783u = oVar2;
        o oVar3 = new o(300);
        f5784v = oVar3;
        o oVar4 = new o(400);
        f5785w = oVar4;
        o oVar5 = new o(500);
        f5786x = oVar5;
        o oVar6 = new o(600);
        f5787y = oVar6;
        o oVar7 = new o(700);
        f5788z = oVar7;
        o oVar8 = new o(800);
        f5769A = oVar8;
        o oVar9 = new o(900);
        f5770B = oVar9;
        f5771C = oVar;
        f5772D = oVar2;
        f5773E = oVar3;
        f5774F = oVar4;
        f5775G = oVar5;
        f5776H = oVar6;
        f5777I = oVar7;
        f5778J = oVar8;
        f5779K = oVar9;
        f5780L = AbstractC6987o.g(oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9);
    }

    public o(int i8) {
        this.f5789o = i8;
        if (1 > i8 || i8 >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i8).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f5789o == ((o) obj).f5789o;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(o oVar) {
        return J6.r.f(this.f5789o, oVar.f5789o);
    }

    public final int g() {
        return this.f5789o;
    }

    public int hashCode() {
        return this.f5789o;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f5789o + ')';
    }
}
