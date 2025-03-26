package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5925c2 extends AbstractC5965k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37634b = 1;

    /* renamed from: c, reason: collision with root package name */
    boolean f37635c;

    /* renamed from: d, reason: collision with root package name */
    Object f37636d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC5917b f37637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5925c2(X x7, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37637e = x7;
        InterfaceC5985o2 interfaceC5985o22 = this.f37727a;
        Objects.requireNonNull(interfaceC5985o22);
        this.f37636d = new V(interfaceC5985o22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5925c2(C6036z c6036z, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37637e = c6036z;
        InterfaceC5985o2 interfaceC5985o22 = this.f37727a;
        Objects.requireNonNull(interfaceC5985o22);
        this.f37636d = new C5992q(interfaceC5985o22);
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        switch (this.f37634b) {
            case 0:
                this.f37727a.l(-1L);
                break;
            case 1:
                this.f37727a.l(-1L);
                break;
            default:
                this.f37727a.l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        switch (this.f37634b) {
            case 0:
                InterfaceC5983o0 interfaceC5983o0 = (InterfaceC5983o0) ((C5912a) ((C5953i0) this.f37637e).f37714n).apply((C5912a) obj);
                if (interfaceC5983o0 != null) {
                    try {
                        boolean z7 = this.f37635c;
                        C5928d0 c5928d0 = (C5928d0) this.f37636d;
                        if (!z7) {
                            interfaceC5983o0.sequential().forEach(c5928d0);
                        } else {
                            j$.util.b0 spliterator = interfaceC5983o0.sequential().spliterator();
                            while (!this.f37727a.n() && spliterator.tryAdvance((LongConsumer) c5928d0)) {
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
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((C5912a) ((X) this.f37637e).f37600n).apply((C5912a) obj);
                if (intStream != null) {
                    try {
                        boolean z8 = this.f37635c;
                        V v7 = (V) this.f37636d;
                        if (!z8) {
                            intStream.sequential().forEach(v7);
                        } else {
                            j$.util.Y spliterator2 = intStream.sequential().spliterator();
                            while (!this.f37727a.n() && spliterator2.tryAdvance((IntConsumer) v7)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                F f8 = (F) ((C5912a) ((C6036z) this.f37637e).f37845n).apply((C5912a) obj);
                if (f8 != null) {
                    try {
                        boolean z9 = this.f37635c;
                        C5992q c5992q = (C5992q) this.f37636d;
                        if (!z9) {
                            f8.sequential().forEach(c5992q);
                        } else {
                            j$.util.V spliterator3 = f8.sequential().spliterator();
                            while (!this.f37727a.n() && spliterator3.tryAdvance((DoubleConsumer) c5992q)) {
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            f8.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (f8 != null) {
                    f8.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        switch (this.f37634b) {
            case 0:
                this.f37635c = true;
                break;
            case 1:
                this.f37635c = true;
                break;
            default:
                this.f37635c = true;
                break;
        }
        return this.f37727a.n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5925c2(C5953i0 c5953i0, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37637e = c5953i0;
        InterfaceC5985o2 interfaceC5985o22 = this.f37727a;
        Objects.requireNonNull(interfaceC5985o22);
        this.f37636d = new C5928d0(interfaceC5985o22);
    }
}
