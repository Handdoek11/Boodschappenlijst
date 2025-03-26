package z0;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: z0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7062z {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f44845a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f44846b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f44847c = new HashMap();

    /* renamed from: z0.z$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC0922h f44848a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC0925k f44849b;

        a(AbstractC0922h abstractC0922h, InterfaceC0925k interfaceC0925k) {
            this.f44848a = abstractC0922h;
            this.f44849b = interfaceC0925k;
            abstractC0922h.a(interfaceC0925k);
        }

        void a() {
            this.f44848a.c(this.f44849b);
            this.f44849b = null;
        }
    }

    public C7062z(Runnable runnable) {
        this.f44845a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(InterfaceC6998B interfaceC6998B, InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        if (aVar == AbstractC0922h.a.ON_DESTROY) {
            l(interfaceC6998B);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(AbstractC0922h.b bVar, InterfaceC6998B interfaceC6998B, InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        if (aVar == AbstractC0922h.a.g(bVar)) {
            c(interfaceC6998B);
            return;
        }
        if (aVar == AbstractC0922h.a.ON_DESTROY) {
            l(interfaceC6998B);
        } else if (aVar == AbstractC0922h.a.c(bVar)) {
            this.f44846b.remove(interfaceC6998B);
            this.f44845a.run();
        }
    }

    public void c(InterfaceC6998B interfaceC6998B) {
        this.f44846b.add(interfaceC6998B);
        this.f44845a.run();
    }

    public void d(final InterfaceC6998B interfaceC6998B, InterfaceC0927m interfaceC0927m) {
        c(interfaceC6998B);
        AbstractC0922h lifecycle = interfaceC0927m.getLifecycle();
        a aVar = (a) this.f44847c.remove(interfaceC6998B);
        if (aVar != null) {
            aVar.a();
        }
        this.f44847c.put(interfaceC6998B, new a(lifecycle, new InterfaceC0925k() { // from class: z0.y
            @Override // androidx.lifecycle.InterfaceC0925k
            public final void f(InterfaceC0927m interfaceC0927m2, AbstractC0922h.a aVar2) {
                this.f44814o.f(interfaceC6998B, interfaceC0927m2, aVar2);
            }
        }));
    }

    public void e(final InterfaceC6998B interfaceC6998B, InterfaceC0927m interfaceC0927m, final AbstractC0922h.b bVar) {
        AbstractC0922h lifecycle = interfaceC0927m.getLifecycle();
        a aVar = (a) this.f44847c.remove(interfaceC6998B);
        if (aVar != null) {
            aVar.a();
        }
        this.f44847c.put(interfaceC6998B, new a(lifecycle, new InterfaceC0925k() { // from class: z0.x
            @Override // androidx.lifecycle.InterfaceC0925k
            public final void f(InterfaceC0927m interfaceC0927m2, AbstractC0922h.a aVar2) {
                this.f44811o.g(bVar, interfaceC6998B, interfaceC0927m2, aVar2);
            }
        }));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f44846b.iterator();
        while (it.hasNext()) {
            ((InterfaceC6998B) it.next()).c(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator it = this.f44846b.iterator();
        while (it.hasNext()) {
            ((InterfaceC6998B) it.next()).b(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator it = this.f44846b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC6998B) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator it = this.f44846b.iterator();
        while (it.hasNext()) {
            ((InterfaceC6998B) it.next()).d(menu);
        }
    }

    public void l(InterfaceC6998B interfaceC6998B) {
        this.f44846b.remove(interfaceC6998B);
        a aVar = (a) this.f44847c.remove(interfaceC6998B);
        if (aVar != null) {
            aVar.a();
        }
        this.f44845a.run();
    }
}
