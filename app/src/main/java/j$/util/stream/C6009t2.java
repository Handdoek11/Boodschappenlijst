package j$.util.stream;

/* renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6009t2 extends AbstractC5960j2 {

    /* renamed from: b, reason: collision with root package name */
    long f37790b;

    /* renamed from: c, reason: collision with root package name */
    long f37791c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6014u2 f37792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6009t2(C6014u2 c6014u2, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37792d = c6014u2;
        this.f37790b = c6014u2.f37798m;
        long j8 = c6014u2.f37799n;
        this.f37791c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.AbstractC5960j2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37720a.l(AbstractC6032y0.A(j8, this.f37792d.f37798m, this.f37791c));
    }

    @Override // j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        long j9 = this.f37790b;
        if (j9 == 0) {
            long j10 = this.f37791c;
            if (j10 > 0) {
                this.f37791c = j10 - 1;
                this.f37720a.accept(j8);
                return;
            }
            return;
        }
        this.f37790b = j9 - 1;
    }

    @Override // j$.util.stream.AbstractC5960j2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        return this.f37791c == 0 || this.f37720a.n();
    }
}
