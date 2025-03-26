package j6;

import a6.i;
import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import f6.InterfaceC5793a;
import g6.EnumC5814b;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import t6.AbstractC6805a;

/* renamed from: j6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6084d extends AtomicReference implements i, InterfaceC5732b {

    /* renamed from: o, reason: collision with root package name */
    final f6.d f38352o;

    /* renamed from: s, reason: collision with root package name */
    final f6.d f38353s;

    /* renamed from: t, reason: collision with root package name */
    final InterfaceC5793a f38354t;

    /* renamed from: u, reason: collision with root package name */
    final f6.d f38355u;

    public C6084d(f6.d dVar, f6.d dVar2, InterfaceC5793a interfaceC5793a, f6.d dVar3) {
        this.f38352o = dVar;
        this.f38353s = dVar2;
        this.f38354t = interfaceC5793a;
        this.f38355u = dVar3;
    }

    @Override // a6.i
    public void a() {
        if (e()) {
            return;
        }
        lazySet(EnumC5814b.DISPOSED);
        try {
            this.f38354t.run();
        } catch (Throwable th) {
            AbstractC5751a.b(th);
            AbstractC6805a.m(th);
        }
    }

    @Override // a6.i
    public void b(Object obj) {
        if (e()) {
            return;
        }
        try {
            this.f38352o.accept(obj);
        } catch (Throwable th) {
            AbstractC5751a.b(th);
            ((InterfaceC5732b) get()).c();
            onError(th);
        }
    }

    @Override // d6.InterfaceC5732b
    public void c() {
        EnumC5814b.a(this);
    }

    @Override // a6.i
    public void d(InterfaceC5732b interfaceC5732b) {
        if (EnumC5814b.i(this, interfaceC5732b)) {
            try {
                this.f38355u.accept(this);
            } catch (Throwable th) {
                AbstractC5751a.b(th);
                interfaceC5732b.c();
                onError(th);
            }
        }
    }

    public boolean e() {
        return get() == EnumC5814b.DISPOSED;
    }

    @Override // a6.i
    public void onError(Throwable th) {
        if (e()) {
            AbstractC6805a.m(th);
            return;
        }
        lazySet(EnumC5814b.DISPOSED);
        try {
            this.f38353s.accept(th);
        } catch (Throwable th2) {
            AbstractC5751a.b(th2);
            AbstractC6805a.m(new CompositeException(th, th2));
        }
    }
}
