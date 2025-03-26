package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5977n extends AbstractC5965k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37749b = 2;

    /* renamed from: c, reason: collision with root package name */
    boolean f37750c;

    /* renamed from: d, reason: collision with root package name */
    Object f37751d;

    public /* synthetic */ C5977n(InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5977n(N3 n32, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37751d = n32;
        this.f37750c = true;
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        switch (this.f37749b) {
            case 0:
                this.f37750c = false;
                this.f37751d = null;
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
    public final void accept(Object obj) {
        switch (this.f37749b) {
            case 0:
                InterfaceC5985o2 interfaceC5985o2 = this.f37727a;
                if (obj == null) {
                    if (this.f37750c) {
                        return;
                    }
                    this.f37750c = true;
                    this.f37751d = null;
                    interfaceC5985o2.accept((InterfaceC5985o2) null);
                    return;
                }
                Object obj2 = this.f37751d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f37751d = obj;
                    interfaceC5985o2.accept((InterfaceC5985o2) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((C5912a) ((C6011u) this.f37751d).f37794n).apply((C5912a) obj);
                if (stream != null) {
                    try {
                        boolean z7 = this.f37750c;
                        InterfaceC5985o2 interfaceC5985o22 = this.f37727a;
                        if (!z7) {
                            ((Stream) stream.sequential()).forEach(interfaceC5985o22);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC5985o22.n() && spliterator.tryAdvance(interfaceC5985o22)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f37750c) {
                    boolean test = ((N3) this.f37751d).f37527m.test(obj);
                    this.f37750c = test;
                    if (test) {
                        this.f37727a.accept((InterfaceC5985o2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public boolean n() {
        switch (this.f37749b) {
            case 1:
                this.f37750c = true;
                return this.f37727a.n();
            case 2:
                return !this.f37750c || this.f37727a.n();
            default:
                return super.n();
        }
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public void k() {
        switch (this.f37749b) {
            case 0:
                this.f37750c = false;
                this.f37751d = null;
                this.f37727a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5977n(C6011u c6011u, InterfaceC5985o2 interfaceC5985o2) {
        super(interfaceC5985o2);
        this.f37751d = c6011u;
    }
}
