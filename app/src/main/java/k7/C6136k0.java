package k7;

/* renamed from: k7.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6136k0 implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    private final g7.b f38698a;

    /* renamed from: b, reason: collision with root package name */
    private final i7.f f38699b;

    public C6136k0(g7.b bVar) {
        J6.r.e(bVar, "serializer");
        this.f38698a = bVar;
        this.f38699b = new B0(bVar.getDescriptor());
    }

    @Override // g7.a
    public Object deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return eVar.v() ? eVar.w(this.f38698a) : eVar.q();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && J6.r.a(J6.H.b(C6136k0.class), J6.H.b(obj.getClass())) && J6.r.a(this.f38698a, ((C6136k0) obj).f38698a);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return this.f38699b;
    }

    public int hashCode() {
        return this.f38698a.hashCode();
    }

    @Override // g7.h
    public void serialize(j7.f fVar, Object obj) {
        J6.r.e(fVar, "encoder");
        if (obj == null) {
            fVar.f();
        } else {
            fVar.s();
            fVar.n(this.f38698a, obj);
        }
    }
}
