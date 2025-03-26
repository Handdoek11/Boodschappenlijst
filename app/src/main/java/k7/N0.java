package k7;

import J6.C0644d;

/* loaded from: classes2.dex */
public final class N0 implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final N0 f38638a = new N0();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38639b = Q.a("kotlin.UByte", h7.a.v(C0644d.f3561a));

    private N0() {
    }

    public byte a(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return x6.v.c(eVar.j(getDescriptor()).C());
    }

    public void b(j7.f fVar, byte b8) {
        J6.r.e(fVar, "encoder");
        fVar.D(getDescriptor()).l(b8);
    }

    @Override // g7.a
    public /* bridge */ /* synthetic */ Object deserialize(j7.e eVar) {
        return x6.v.a(a(eVar));
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38639b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((x6.v) obj).i());
    }
}
