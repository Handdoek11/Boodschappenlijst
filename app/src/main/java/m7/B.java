package m7;

import java.util.List;
import y6.AbstractC6971J;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
final class B extends z {

    /* renamed from: k, reason: collision with root package name */
    private final l7.t f39393k;

    /* renamed from: l, reason: collision with root package name */
    private final List f39394l;

    /* renamed from: m, reason: collision with root package name */
    private final int f39395m;

    /* renamed from: n, reason: collision with root package name */
    private int f39396n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(l7.a aVar, l7.t tVar) {
        super(aVar, tVar, null, null, 12, null);
        J6.r.e(aVar, "json");
        J6.r.e(tVar, "value");
        this.f39393k = tVar;
        List a02 = AbstractC6987o.a0(r0().keySet());
        this.f39394l = a02;
        this.f39395m = a02.size() * 2;
        this.f39396n = -1;
    }

    @Override // m7.z, k7.AbstractC6132i0
    protected String Z(i7.f fVar, int i8) {
        J6.r.e(fVar, "desc");
        return (String) this.f39394l.get(i8 / 2);
    }

    @Override // m7.z, m7.AbstractC6229c, j7.c
    public void c(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
    }

    @Override // m7.z, m7.AbstractC6229c
    protected l7.h d0(String str) {
        J6.r.e(str, "tag");
        return this.f39396n % 2 == 0 ? l7.i.b(str) : (l7.h) AbstractC6971J.f(r0(), str);
    }

    @Override // m7.z, j7.c
    public int e(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        int i8 = this.f39396n;
        if (i8 >= this.f39395m - 1) {
            return -1;
        }
        int i9 = i8 + 1;
        this.f39396n = i9;
        return i9;
    }

    @Override // m7.z, m7.AbstractC6229c
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public l7.t r0() {
        return this.f39393k;
    }
}
