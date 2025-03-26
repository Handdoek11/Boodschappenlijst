package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class P extends S implements InterfaceC5980n2 {

    /* renamed from: b, reason: collision with root package name */
    final LongConsumer f37539b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC5980n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC6032y0.i(this, l8);
    }

    @Override // j$.util.stream.J3
    public final Object b(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        abstractC5917b.U(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.J3
    public final /* bridge */ /* synthetic */ Object c(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        e(abstractC5917b, spliterator);
        return null;
    }

    P(LongConsumer longConsumer, boolean z7) {
        super(z7);
        this.f37539b = longConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37539b.accept(j8);
    }
}
