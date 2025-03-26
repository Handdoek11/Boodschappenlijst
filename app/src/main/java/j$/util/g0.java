package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class g0 implements Iterator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    boolean f37375a = false;

    /* renamed from: b, reason: collision with root package name */
    Object f37376b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Spliterator f37377c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    g0(Spliterator spliterator) {
        this.f37377c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37375a = true;
        this.f37376b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f37375a) {
            this.f37377c.tryAdvance(this);
        }
        return this.f37375a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f37375a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f37375a = false;
        return this.f37376b;
    }
}
