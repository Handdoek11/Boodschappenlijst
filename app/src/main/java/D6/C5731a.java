package d6;

import e6.AbstractC5751a;
import g6.InterfaceC5813a;
import h6.AbstractC5844b;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import r6.AbstractC6714f;
import r6.C6716h;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5731a implements InterfaceC5732b, InterfaceC5813a {

    /* renamed from: o, reason: collision with root package name */
    C6716h f35282o;

    /* renamed from: s, reason: collision with root package name */
    volatile boolean f35283s;

    @Override // g6.InterfaceC5813a
    public boolean a(InterfaceC5732b interfaceC5732b) {
        if (!d(interfaceC5732b)) {
            return false;
        }
        interfaceC5732b.c();
        return true;
    }

    @Override // g6.InterfaceC5813a
    public boolean b(InterfaceC5732b interfaceC5732b) {
        AbstractC5844b.e(interfaceC5732b, "disposable is null");
        if (!this.f35283s) {
            synchronized (this) {
                try {
                    if (!this.f35283s) {
                        C6716h c6716h = this.f35282o;
                        if (c6716h == null) {
                            c6716h = new C6716h();
                            this.f35282o = c6716h;
                        }
                        c6716h.a(interfaceC5732b);
                        return true;
                    }
                } finally {
                }
            }
        }
        interfaceC5732b.c();
        return false;
    }

    @Override // d6.InterfaceC5732b
    public void c() {
        if (this.f35283s) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f35283s) {
                    return;
                }
                this.f35283s = true;
                C6716h c6716h = this.f35282o;
                this.f35282o = null;
                e(c6716h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g6.InterfaceC5813a
    public boolean d(InterfaceC5732b interfaceC5732b) {
        AbstractC5844b.e(interfaceC5732b, "disposables is null");
        if (this.f35283s) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f35283s) {
                    return false;
                }
                C6716h c6716h = this.f35282o;
                if (c6716h != null && c6716h.e(interfaceC5732b)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    void e(C6716h c6716h) {
        if (c6716h == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c6716h.b()) {
            if (obj instanceof InterfaceC5732b) {
                try {
                    ((InterfaceC5732b) obj).c();
                } catch (Throwable th) {
                    AbstractC5751a.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw AbstractC6714f.c((Throwable) arrayList.get(0));
        }
    }

    public boolean f() {
        return this.f35283s;
    }
}
