package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5979n1 extends AbstractC5984o1 {
    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        K0 a8;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = this.f37760d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.f37759c == null && (a8 = AbstractC5984o1.a(this.f37761e)) != null) {
                Spliterator spliterator = a8.spliterator();
                this.f37760d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f37757a = null;
        }
        return tryAdvance;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f37757a == null) {
            return;
        }
        if (this.f37760d == null) {
            Spliterator spliterator = this.f37759c;
            if (spliterator == null) {
                ArrayDeque b8 = b();
                while (true) {
                    K0 a8 = AbstractC5984o1.a(b8);
                    if (a8 != null) {
                        a8.forEach(consumer);
                    } else {
                        this.f37757a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
