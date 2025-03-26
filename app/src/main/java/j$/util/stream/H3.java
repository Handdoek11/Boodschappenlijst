package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class H3 extends AbstractC5941f3 {
    @Override // j$.util.stream.AbstractC5941f3
    final AbstractC5941f3 e(Spliterator spliterator) {
        return new H3(this.f37685b, spliterator, this.f37684a);
    }

    @Override // j$.util.stream.AbstractC5941f3
    final void d() {
        Y2 y22 = new Y2();
        this.f37691h = y22;
        Objects.requireNonNull(y22);
        this.f37688e = this.f37685b.V(new G3(y22, 0));
        this.f37689f = new C5912a(5, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a8 = a();
        if (a8) {
            Y2 y22 = (Y2) this.f37691h;
            long j8 = this.f37690g;
            if (y22.f37641c != 0) {
                if (j8 >= y22.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j8));
                }
                for (int i8 = 0; i8 <= y22.f37641c; i8++) {
                    long j9 = y22.f37642d[i8];
                    Object[] objArr = y22.f37607f[i8];
                    if (j8 < objArr.length + j9) {
                        obj = objArr[(int) (j8 - j9)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j8));
            }
            if (j8 < y22.f37640b) {
                obj = y22.f37606e[(int) j8];
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j8));
            }
            consumer.p(obj);
        }
        return a8;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f37691h == null && !this.f37692i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            G3 g32 = new G3(consumer, 1);
            this.f37685b.U(this.f37687d, g32);
            this.f37692i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
