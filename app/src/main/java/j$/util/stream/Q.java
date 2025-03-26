package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class Q extends S {

    /* renamed from: b, reason: collision with root package name */
    final Consumer f37550b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    Q(Consumer consumer, boolean z7) {
        super(z7);
        this.f37550b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37550b.accept(obj);
    }
}
