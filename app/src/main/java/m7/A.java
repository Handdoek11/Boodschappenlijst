package m7;

/* loaded from: classes2.dex */
final class A extends AbstractC6229c {

    /* renamed from: f, reason: collision with root package name */
    private final l7.b f39390f;

    /* renamed from: g, reason: collision with root package name */
    private final int f39391g;

    /* renamed from: h, reason: collision with root package name */
    private int f39392h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(l7.a aVar, l7.b bVar) {
        super(aVar, bVar, null);
        J6.r.e(aVar, "json");
        J6.r.e(bVar, "value");
        this.f39390f = bVar;
        this.f39391g = r0().size();
        this.f39392h = -1;
    }

    @Override // k7.AbstractC6132i0
    protected String Z(i7.f fVar, int i8) {
        J6.r.e(fVar, "desc");
        return String.valueOf(i8);
    }

    @Override // m7.AbstractC6229c
    protected l7.h d0(String str) {
        J6.r.e(str, "tag");
        return r0().get(Integer.parseInt(str));
    }

    @Override // j7.c
    public int e(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        int i8 = this.f39392h;
        if (i8 >= this.f39391g - 1) {
            return -1;
        }
        int i9 = i8 + 1;
        this.f39392h = i9;
        return i9;
    }

    @Override // m7.AbstractC6229c
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public l7.b r0() {
        return this.f39390f;
    }
}
