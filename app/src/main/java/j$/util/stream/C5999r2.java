package j$.util.stream;

/* renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5999r2 extends AbstractC5955i2 {

    /* renamed from: b, reason: collision with root package name */
    long f37777b;

    /* renamed from: c, reason: collision with root package name */
    long f37778c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6004s2 f37779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5999r2(C6004s2 c6004s2, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37779d = c6004s2;
        this.f37777b = c6004s2.f37785m;
        long j8 = c6004s2.f37786n;
        this.f37778c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.AbstractC5955i2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37715a.l(AbstractC6032y0.A(j8, this.f37779d.f37785m, this.f37778c));
    }

    @Override // j$.util.stream.InterfaceC5975m2, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        long j8 = this.f37777b;
        if (j8 == 0) {
            long j9 = this.f37778c;
            if (j9 > 0) {
                this.f37778c = j9 - 1;
                this.f37715a.accept(i8);
                return;
            }
            return;
        }
        this.f37777b = j8 - 1;
    }

    @Override // j$.util.stream.AbstractC5955i2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        return this.f37778c == 0 || this.f37715a.n();
    }
}
