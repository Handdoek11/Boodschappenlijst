package k7;

import i7.e;

/* loaded from: classes2.dex */
public final class D implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final D f38593a = new D();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38594b = new y0("kotlin.time.Duration", e.i.f36712a);

    private D() {
    }

    public long a(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return T6.a.f5296s.c(eVar.r());
    }

    public void b(j7.f fVar, long j8) {
        J6.r.e(fVar, "encoder");
        fVar.E(T6.a.J(j8));
    }

    @Override // g7.a
    public /* bridge */ /* synthetic */ Object deserialize(j7.e eVar) {
        return T6.a.h(a(eVar));
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38594b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((T6.a) obj).N());
    }
}
