package k7;

/* loaded from: classes2.dex */
public final class T0 implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final T0 f38654a = new T0();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38655b = Q.a("kotlin.ULong", h7.a.A(J6.t.f3584a));

    private T0() {
    }

    public long a(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return x6.z.c(eVar.j(getDescriptor()).t());
    }

    public void b(j7.f fVar, long j8) {
        J6.r.e(fVar, "encoder");
        fVar.D(getDescriptor()).C(j8);
    }

    @Override // g7.a
    public /* bridge */ /* synthetic */ Object deserialize(j7.e eVar) {
        return x6.z.a(a(eVar));
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38655b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((x6.z) obj).k());
    }
}
