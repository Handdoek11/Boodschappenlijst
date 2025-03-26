package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6031y extends AbstractC5950h2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f37823b;

    /* renamed from: c, reason: collision with root package name */
    C5992q f37824c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6036z f37825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6031y(C6036z c6036z, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37825d = c6036z;
        InterfaceC5985o2 interfaceC5985o22 = this.f37708a;
        Objects.requireNonNull(interfaceC5985o22);
        this.f37824c = new C5992q(interfaceC5985o22);
    }

    @Override // j$.util.stream.AbstractC5950h2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37708a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5970l2, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        F f8 = (F) ((C5912a) this.f37825d.f37845n).apply(d8);
        if (f8 != null) {
            try {
                boolean z7 = this.f37823b;
                C5992q c5992q = this.f37824c;
                if (!z7) {
                    f8.sequential().forEach(c5992q);
                } else {
                    j$.util.V spliterator = f8.sequential().spliterator();
                    while (!this.f37708a.n() && spliterator.tryAdvance((DoubleConsumer) c5992q)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    f8.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (f8 != null) {
            f8.close();
        }
    }

    @Override // j$.util.stream.AbstractC5950h2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        this.f37823b = true;
        return this.f37708a.n();
    }
}
