package p6;

import a6.InterfaceC0826c;
import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import f6.InterfaceC5793a;
import f6.d;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import p7.b;
import q6.EnumC6639b;
import t6.AbstractC6805a;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6396a extends AtomicReference implements InterfaceC0826c, b, InterfaceC5732b {

    /* renamed from: o, reason: collision with root package name */
    final d f40845o;

    /* renamed from: s, reason: collision with root package name */
    final d f40846s;

    /* renamed from: t, reason: collision with root package name */
    final InterfaceC5793a f40847t;

    /* renamed from: u, reason: collision with root package name */
    final d f40848u;

    public C6396a(d dVar, d dVar2, InterfaceC5793a interfaceC5793a, d dVar3) {
        this.f40845o = dVar;
        this.f40846s = dVar2;
        this.f40847t = interfaceC5793a;
        this.f40848u = dVar3;
    }

    @Override // p7.a
    public void a() {
        Object obj = get();
        EnumC6639b enumC6639b = EnumC6639b.CANCELLED;
        if (obj != enumC6639b) {
            lazySet(enumC6639b);
            try {
                this.f40847t.run();
            } catch (Throwable th) {
                AbstractC5751a.b(th);
                AbstractC6805a.m(th);
            }
        }
    }

    @Override // p7.a
    public void b(Object obj) {
        if (e()) {
            return;
        }
        try {
            this.f40845o.accept(obj);
        } catch (Throwable th) {
            AbstractC5751a.b(th);
            ((b) get()).cancel();
            onError(th);
        }
    }

    @Override // d6.InterfaceC5732b
    public void c() {
        cancel();
    }

    @Override // p7.b
    public void cancel() {
        EnumC6639b.a(this);
    }

    @Override // p7.a
    public void d(b bVar) {
        if (EnumC6639b.f(this, bVar)) {
            try {
                this.f40848u.accept(this);
            } catch (Throwable th) {
                AbstractC5751a.b(th);
                bVar.cancel();
                onError(th);
            }
        }
    }

    public boolean e() {
        return get() == EnumC6639b.CANCELLED;
    }

    @Override // p7.b
    public void h(long j8) {
        ((b) get()).h(j8);
    }

    @Override // p7.a
    public void onError(Throwable th) {
        Object obj = get();
        EnumC6639b enumC6639b = EnumC6639b.CANCELLED;
        if (obj == enumC6639b) {
            AbstractC6805a.m(th);
            return;
        }
        lazySet(enumC6639b);
        try {
            this.f40846s.accept(th);
        } catch (Throwable th2) {
            AbstractC5751a.b(th2);
            AbstractC6805a.m(new CompositeException(th, th2));
        }
    }
}
