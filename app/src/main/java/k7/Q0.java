package k7;

/* loaded from: classes2.dex */
public final class Q0 implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final Q0 f38646a = new Q0();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38647b = Q.a("kotlin.UInt", h7.a.z(J6.q.f3583a));

    private Q0() {
    }

    public int a(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return x6.x.c(eVar.j(getDescriptor()).n());
    }

    public void b(j7.f fVar, int i8) {
        J6.r.e(fVar, "encoder");
        fVar.D(getDescriptor()).z(i8);
    }

    @Override // g7.a
    public /* bridge */ /* synthetic */ Object deserialize(j7.e eVar) {
        return x6.x.a(a(eVar));
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38647b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((x6.x) obj).i());
    }
}
