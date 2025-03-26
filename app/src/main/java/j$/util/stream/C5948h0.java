package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5948h0 extends AbstractC5960j2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f37705b;

    /* renamed from: c, reason: collision with root package name */
    C5928d0 f37706c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5953i0 f37707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5948h0(C5953i0 c5953i0, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37707d = c5953i0;
        InterfaceC5985o2 interfaceC5985o22 = this.f37720a;
        Objects.requireNonNull(interfaceC5985o22);
        this.f37706c = new C5928d0(interfaceC5985o22);
    }

    @Override // j$.util.stream.AbstractC5960j2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37720a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        InterfaceC5983o0 interfaceC5983o0 = (InterfaceC5983o0) ((C5912a) this.f37707d.f37714n).apply(j8);
        if (interfaceC5983o0 != null) {
            try {
                boolean z7 = this.f37705b;
                C5928d0 c5928d0 = this.f37706c;
                if (!z7) {
                    interfaceC5983o0.sequential().forEach(c5928d0);
                } else {
                    j$.util.b0 spliterator = interfaceC5983o0.sequential().spliterator();
                    while (!this.f37720a.n() && spliterator.tryAdvance((LongConsumer) c5928d0)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC5983o0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC5983o0 != null) {
            interfaceC5983o0.close();
        }
    }

    @Override // j$.util.stream.AbstractC5960j2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        this.f37705b = true;
        return this.f37720a.n();
    }
}
