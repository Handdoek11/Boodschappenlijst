package m7;

import J6.AbstractC0650j;
import i7.j;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k7.V;
import y6.AbstractC6971J;
import y6.P;

/* loaded from: classes2.dex */
class z extends AbstractC6229c {

    /* renamed from: f, reason: collision with root package name */
    private final l7.t f39473f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39474g;

    /* renamed from: h, reason: collision with root package name */
    private final i7.f f39475h;

    /* renamed from: i, reason: collision with root package name */
    private int f39476i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f39477j;

    /* synthetic */ class a extends J6.o implements I6.a {
        a(Object obj) {
            super(0, obj, v.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        @Override // I6.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return v.a((i7.f) this.f3564s);
        }
    }

    public /* synthetic */ z(l7.a aVar, l7.t tVar, String str, i7.f fVar, int i8, AbstractC0650j abstractC0650j) {
        this(aVar, tVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : fVar);
    }

    private final boolean t0(i7.f fVar, int i8) {
        boolean z7 = (b().d().f() || fVar.l(i8) || !fVar.k(i8).c()) ? false : true;
        this.f39477j = z7;
        return z7;
    }

    private final boolean u0(i7.f fVar, int i8, String str) {
        l7.a b8 = b();
        i7.f k8 = fVar.k(i8);
        if (!k8.c() && (d0(str) instanceof l7.r)) {
            return true;
        }
        if (J6.r.a(k8.e(), j.b.f36735a)) {
            l7.h d02 = d0(str);
            l7.v vVar = d02 instanceof l7.v ? (l7.v) d02 : null;
            String e8 = vVar != null ? l7.i.e(vVar) : null;
            if (e8 != null && v.d(k8, b8, e8) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // k7.AbstractC6132i0
    protected String Z(i7.f fVar, int i8) {
        Object obj;
        J6.r.e(fVar, "desc");
        String h8 = fVar.h(i8);
        if (!this.f39448e.j() || r0().keySet().contains(h8)) {
            return h8;
        }
        Map map = (Map) l7.x.a(b()).b(fVar, v.c(), new a(fVar));
        Iterator it = r0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = (Integer) map.get((String) obj);
            if (num != null && num.intValue() == i8) {
                break;
            }
        }
        String str = (String) obj;
        return str == null ? h8 : str;
    }

    @Override // m7.AbstractC6229c, j7.c
    public void c(i7.f fVar) {
        Set f8;
        J6.r.e(fVar, "descriptor");
        if (this.f39448e.g() || (fVar.e() instanceof i7.d)) {
            return;
        }
        if (this.f39448e.j()) {
            Set a8 = V.a(fVar);
            Map map = (Map) l7.x.a(b()).a(fVar, v.c());
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = P.b();
            }
            f8 = P.f(a8, keySet);
        } else {
            f8 = V.a(fVar);
        }
        for (String str : r0().keySet()) {
            if (!f8.contains(str) && !J6.r.a(str, this.f39474g)) {
                throw u.f(str, r0().toString());
            }
        }
    }

    @Override // m7.AbstractC6229c, j7.e
    public j7.c d(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        return fVar == this.f39475h ? this : super.d(fVar);
    }

    @Override // m7.AbstractC6229c
    protected l7.h d0(String str) {
        J6.r.e(str, "tag");
        return (l7.h) AbstractC6971J.f(r0(), str);
    }

    public int e(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        while (this.f39476i < fVar.g()) {
            int i8 = this.f39476i;
            this.f39476i = i8 + 1;
            String U7 = U(fVar, i8);
            int i9 = this.f39476i - 1;
            this.f39477j = false;
            if (r0().containsKey(U7) || t0(fVar, i9)) {
                if (!this.f39448e.d() || !u0(fVar, i9, U7)) {
                    return i9;
                }
            }
        }
        return -1;
    }

    @Override // m7.AbstractC6229c, j7.e
    public boolean v() {
        return !this.f39477j && super.v();
    }

    @Override // m7.AbstractC6229c
    /* renamed from: v0 */
    public l7.t r0() {
        return this.f39473f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l7.a aVar, l7.t tVar, String str, i7.f fVar) {
        super(aVar, tVar, null);
        J6.r.e(aVar, "json");
        J6.r.e(tVar, "value");
        this.f39473f = tVar;
        this.f39474g = str;
        this.f39475h = fVar;
    }
}
