package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
interface K0 {
    K0 b(int i8);

    long count();

    void forEach(Consumer consumer);

    K0 h(long j8, long j9, IntFunction intFunction);

    void i(Object[] objArr, int i8);

    Object[] o(IntFunction intFunction);

    int q();

    Spliterator spliterator();
}
