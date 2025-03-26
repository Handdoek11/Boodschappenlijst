package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6666a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f6667b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private I6.a f6668c;

    public u(boolean z7) {
        this.f6666a = z7;
    }

    public final void a(c cVar) {
        J6.r.e(cVar, "cancellable");
        this.f6667b.add(cVar);
    }

    public final I6.a b() {
        return this.f6668c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(b bVar) {
        J6.r.e(bVar, "backEvent");
    }

    public void f(b bVar) {
        J6.r.e(bVar, "backEvent");
    }

    public final boolean g() {
        return this.f6666a;
    }

    public final void h() {
        Iterator it = this.f6667b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).cancel();
        }
    }

    public final void i(c cVar) {
        J6.r.e(cVar, "cancellable");
        this.f6667b.remove(cVar);
    }

    public final void j(boolean z7) {
        this.f6666a = z7;
        I6.a aVar = this.f6668c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void k(I6.a aVar) {
        this.f6668c = aVar;
    }
}
