package k7;

import x6.C6916E;

/* loaded from: classes2.dex */
public final class X0 implements g7.b {

    /* renamed from: b, reason: collision with root package name */
    public static final X0 f38665b = new X0();

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C6138l0 f38666a = new C6138l0("kotlin.Unit", C6916E.f44463a);

    private X0() {
    }

    public void a(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        this.f38666a.deserialize(eVar);
    }

    @Override // g7.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(j7.f fVar, C6916E c6916e) {
        J6.r.e(fVar, "encoder");
        J6.r.e(c6916e, "value");
        this.f38666a.serialize(fVar, c6916e);
    }

    @Override // g7.a
    public /* bridge */ /* synthetic */ Object deserialize(j7.e eVar) {
        a(eVar);
        return C6916E.f44463a;
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return this.f38666a.getDescriptor();
    }
}
