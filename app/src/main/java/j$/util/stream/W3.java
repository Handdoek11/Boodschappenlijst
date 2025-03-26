package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes3.dex */
final class W3 extends AbstractC5960j2 implements d4 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ X3 f37598b;

    @Override // j$.util.stream.d4
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W3(X3 x32, InterfaceC5985o2 interfaceC5985o2, boolean z7) {
        super(interfaceC5985o2);
        this.f37598b = x32;
    }

    @Override // j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37598b.getClass();
        LongPredicate longPredicate = null;
        longPredicate.test(j8);
        throw null;
    }
}
