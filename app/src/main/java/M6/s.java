package m6;

import a6.AbstractC0829f;
import d6.InterfaceC5732b;
import g6.EnumC5814b;
import g6.EnumC5815c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class s extends AbstractC0829f {

    /* renamed from: o, reason: collision with root package name */
    final a6.j f39378o;

    /* renamed from: s, reason: collision with root package name */
    final long f39379s;

    /* renamed from: t, reason: collision with root package name */
    final TimeUnit f39380t;

    static final class a extends AtomicReference implements InterfaceC5732b, Runnable {

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39381o;

        a(a6.i iVar) {
            this.f39381o = iVar;
        }

        public boolean a() {
            return get() == EnumC5814b.DISPOSED;
        }

        public void b(InterfaceC5732b interfaceC5732b) {
            EnumC5814b.k(this, interfaceC5732b);
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            EnumC5814b.a(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a()) {
                return;
            }
            this.f39381o.b(0L);
            lazySet(EnumC5815c.INSTANCE);
            this.f39381o.a();
        }
    }

    public s(long j8, TimeUnit timeUnit, a6.j jVar) {
        this.f39379s = j8;
        this.f39380t = timeUnit;
        this.f39378o = jVar;
    }

    @Override // a6.AbstractC0829f
    public void G(a6.i iVar) {
        a aVar = new a(iVar);
        iVar.d(aVar);
        aVar.b(this.f39378o.c(aVar, this.f39379s, this.f39380t));
    }
}
