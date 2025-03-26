package m6;

import a6.AbstractC0829f;
import a6.j;
import d6.InterfaceC5732b;
import g6.EnumC5814b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class l extends AbstractC0829f {

    /* renamed from: o, reason: collision with root package name */
    final a6.j f39333o;

    /* renamed from: s, reason: collision with root package name */
    final long f39334s;

    /* renamed from: t, reason: collision with root package name */
    final long f39335t;

    /* renamed from: u, reason: collision with root package name */
    final TimeUnit f39336u;

    static final class a extends AtomicReference implements InterfaceC5732b, Runnable {

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39337o;

        /* renamed from: s, reason: collision with root package name */
        long f39338s;

        a(a6.i iVar) {
            this.f39337o = iVar;
        }

        public void a(InterfaceC5732b interfaceC5732b) {
            EnumC5814b.i(this, interfaceC5732b);
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            EnumC5814b.a(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != EnumC5814b.DISPOSED) {
                a6.i iVar = this.f39337o;
                long j8 = this.f39338s;
                this.f39338s = 1 + j8;
                iVar.b(Long.valueOf(j8));
            }
        }
    }

    public l(long j8, long j9, TimeUnit timeUnit, a6.j jVar) {
        this.f39334s = j8;
        this.f39335t = j9;
        this.f39336u = timeUnit;
        this.f39333o = jVar;
    }

    @Override // a6.AbstractC0829f
    public void G(a6.i iVar) {
        a aVar = new a(iVar);
        iVar.d(aVar);
        a6.j jVar = this.f39333o;
        if (!(jVar instanceof o6.m)) {
            aVar.a(jVar.d(aVar, this.f39334s, this.f39335t, this.f39336u));
            return;
        }
        j.c b8 = jVar.b();
        aVar.a(b8);
        b8.e(aVar, this.f39334s, this.f39335t, this.f39336u);
    }
}
