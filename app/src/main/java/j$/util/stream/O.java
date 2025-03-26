package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class O extends S implements InterfaceC5975m2 {

    /* renamed from: b, reason: collision with root package name */
    final IntConsumer f37528b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC5975m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC6032y0.g(this, num);
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

    O(IntConsumer intConsumer, boolean z7) {
        super(z7);
        this.f37528b = intConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        this.f37528b.accept(i8);
    }
}
