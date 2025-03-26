package p3;

/* renamed from: p3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6344i implements InterfaceC6365t {

    /* renamed from: a, reason: collision with root package name */
    private final C6340g f40300a;

    /* renamed from: b, reason: collision with root package name */
    private O f40301b;

    @Override // p3.InterfaceC6365t
    public final /* bridge */ /* synthetic */ InterfaceC6365t a(O o8) {
        this.f40301b = o8;
        return this;
    }

    @Override // p3.InterfaceC6365t
    public final InterfaceC6367u zzb() {
        R0.b(this.f40301b, O.class);
        return new C6346j(this.f40300a, this.f40301b, null);
    }
}
