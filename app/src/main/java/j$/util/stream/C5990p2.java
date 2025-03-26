package j$.util.stream;

/* renamed from: j$.util.stream.p2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5990p2 extends AbstractC5965k2 {

    /* renamed from: b, reason: collision with root package name */
    long f37766b;

    /* renamed from: c, reason: collision with root package name */
    long f37767c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5995q2 f37768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5990p2(C5995q2 c5995q2, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37768d = c5995q2;
        this.f37766b = c5995q2.f37774m;
        long j8 = c5995q2.f37775n;
        this.f37767c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37727a.l(AbstractC6032y0.A(j8, this.f37768d.f37774m, this.f37767c));
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        long j8 = this.f37766b;
        if (j8 == 0) {
            long j9 = this.f37767c;
            if (j9 > 0) {
                this.f37767c = j9 - 1;
                this.f37727a.p((InterfaceC5985o2) obj);
                return;
            }
            return;
        }
        this.f37766b = j8 - 1;
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        return this.f37767c == 0 || this.f37727a.n();
    }
}
