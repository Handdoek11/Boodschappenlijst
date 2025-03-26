package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6002s0 extends AbstractC6012u0 implements InterfaceC5980n2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5980n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC6032y0.i(this, l8);
    }

    @Override // j$.util.stream.AbstractC6012u0, j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        if (this.f37795a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j8);
        throw null;
    }
}
