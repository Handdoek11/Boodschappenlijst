package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class J extends L implements InterfaceC5980n2 {

    /* renamed from: c, reason: collision with root package name */
    static final G f37486c;

    /* renamed from: d, reason: collision with root package name */
    static final G f37487d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        p(Long.valueOf(j8));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f37499a) {
            return j$.util.D.d(((Long) this.f37500b).longValue());
        }
        return null;
    }

    static {
        EnumC5936e3 enumC5936e3 = EnumC5936e3.LONG_VALUE;
        f37486c = new G(true, enumC5936e3, j$.util.D.a(), new r(6), new C5962k(8));
        f37487d = new G(false, enumC5936e3, j$.util.D.a(), new r(6), new C5962k(8));
    }
}
