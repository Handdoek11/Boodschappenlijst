package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes3.dex */
final class U3 extends AbstractC5960j2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f37586b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V3 f37587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U3(V3 v32, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37587c = v32;
        this.f37586b = true;
    }

    @Override // j$.util.stream.AbstractC5960j2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37720a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        if (this.f37586b) {
            this.f37587c.getClass();
            LongPredicate longPredicate = null;
            longPredicate.test(j8);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC5960j2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        return !this.f37586b || this.f37720a.n();
    }
}
