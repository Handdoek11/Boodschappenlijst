package j$.util.stream;

/* renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6019v2 extends AbstractC5950h2 {

    /* renamed from: b, reason: collision with root package name */
    long f37805b;

    /* renamed from: c, reason: collision with root package name */
    long f37806c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6024w2 f37807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6019v2(C6024w2 c6024w2, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37807d = c6024w2;
        this.f37805b = c6024w2.f37818m;
        long j8 = c6024w2.f37819n;
        this.f37806c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.AbstractC5950h2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37708a.l(AbstractC6032y0.A(j8, this.f37807d.f37818m, this.f37806c));
    }

    @Override // j$.util.stream.InterfaceC5970l2, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        long j8 = this.f37805b;
        if (j8 == 0) {
            long j9 = this.f37806c;
            if (j9 > 0) {
                this.f37806c = j9 - 1;
                this.f37708a.accept(d8);
                return;
            }
            return;
        }
        this.f37805b = j8 - 1;
    }

    @Override // j$.util.stream.AbstractC5950h2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        return this.f37806c == 0 || this.f37708a.n();
    }
}
