package l6;

import a6.InterfaceC0828e;
import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import f6.InterfaceC5793a;
import f6.d;
import g6.EnumC5814b;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import t6.AbstractC6805a;

/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6180a extends AtomicReference implements InterfaceC0828e, InterfaceC5732b {

    /* renamed from: o, reason: collision with root package name */
    final d f38816o;

    /* renamed from: s, reason: collision with root package name */
    final d f38817s;

    /* renamed from: t, reason: collision with root package name */
    final InterfaceC5793a f38818t;

    public C6180a(d dVar, d dVar2, InterfaceC5793a interfaceC5793a) {
        this.f38816o = dVar;
        this.f38817s = dVar2;
        this.f38818t = interfaceC5793a;
    }

    @Override // a6.InterfaceC0828e
    public void a() {
        lazySet(EnumC5814b.DISPOSED);
        try {
            this.f38818t.run();
        } catch (Throwable th) {
            AbstractC5751a.b(th);
            AbstractC6805a.m(th);
        }
    }

    @Override // a6.InterfaceC0828e
    public void b(Object obj) {
        lazySet(EnumC5814b.DISPOSED);
        try {
            this.f38816o.accept(obj);
        } catch (Throwable th) {
            AbstractC5751a.b(th);
            AbstractC6805a.m(th);
        }
    }

    @Override // d6.InterfaceC5732b
    public void c() {
        EnumC5814b.a(this);
    }

    @Override // a6.InterfaceC0828e
    public void d(InterfaceC5732b interfaceC5732b) {
        EnumC5814b.i(this, interfaceC5732b);
    }

    @Override // a6.InterfaceC0828e
    public void onError(Throwable th) {
        lazySet(EnumC5814b.DISPOSED);
        try {
            this.f38817s.accept(th);
        } catch (Throwable th2) {
            AbstractC5751a.b(th2);
            AbstractC6805a.m(new CompositeException(th, th2));
        }
    }
}
