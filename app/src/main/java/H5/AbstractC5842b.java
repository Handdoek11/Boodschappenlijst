package h5;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g5.AbstractC5808a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z0.C7026g0;
import z0.InterfaceC7028h0;
import z0.X;

/* renamed from: h5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5842b {

    /* renamed from: e, reason: collision with root package name */
    private static TimeInterpolator f36239e;

    /* renamed from: a, reason: collision with root package name */
    protected final AbstractC5808a f36240a;

    /* renamed from: b, reason: collision with root package name */
    protected final List f36241b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    protected final List f36243d = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    protected final List f36242c = new ArrayList();

    /* renamed from: h5.b$a */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ List f36244o;

        a(List list) {
            this.f36244o = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f36244o.iterator();
            while (it.hasNext()) {
                AbstractC5842b.this.c((e) it.next());
            }
            this.f36244o.clear();
            AbstractC5842b.this.f36242c.remove(this.f36244o);
        }
    }

    /* renamed from: h5.b$b, reason: collision with other inner class name */
    protected static class C0265b implements InterfaceC7028h0 {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC5842b f36246a;

        /* renamed from: b, reason: collision with root package name */
        private e f36247b;

        /* renamed from: c, reason: collision with root package name */
        private RecyclerView.F f36248c;

        /* renamed from: d, reason: collision with root package name */
        private C7026g0 f36249d;

        public C0265b(AbstractC5842b abstractC5842b, e eVar, RecyclerView.F f8, C7026g0 c7026g0) {
            this.f36246a = abstractC5842b;
            this.f36247b = eVar;
            this.f36248c = f8;
            this.f36249d = c7026g0;
        }

        @Override // z0.InterfaceC7028h0
        public void a(View view) {
            this.f36246a.q(this.f36247b, this.f36248c);
        }

        @Override // z0.InterfaceC7028h0
        public void b(View view) {
            AbstractC5842b abstractC5842b = this.f36246a;
            e eVar = this.f36247b;
            RecyclerView.F f8 = this.f36248c;
            this.f36249d.k(null);
            this.f36246a = null;
            this.f36247b = null;
            this.f36248c = null;
            this.f36249d = null;
            abstractC5842b.s(eVar, f8);
            abstractC5842b.e(eVar, f8);
            eVar.a(f8);
            abstractC5842b.f36243d.remove(f8);
            abstractC5842b.f();
        }

        @Override // z0.InterfaceC7028h0
        public void c(View view) {
            this.f36246a.g(this.f36247b, this.f36248c);
        }
    }

    public AbstractC5842b(AbstractC5808a abstractC5808a) {
        this.f36240a = abstractC5808a;
    }

    private void a(RecyclerView.F f8) {
        if (f8 == null) {
            throw new IllegalStateException("item is null");
        }
        this.f36243d.add(f8);
    }

    public void b() {
        List list = this.f36243d;
        for (int size = list.size() - 1; size >= 0; size--) {
            X.e(((RecyclerView.F) list.get(size)).f10944a).c();
        }
    }

    void c(e eVar) {
        t(eVar);
    }

    protected final boolean d() {
        return this.f36240a.R();
    }

    public abstract void e(e eVar, RecyclerView.F f8);

    protected void f() {
        this.f36240a.S();
    }

    public abstract void g(e eVar, RecyclerView.F f8);

    public void h() {
        k(null);
    }

    public void i() {
        m(null);
    }

    protected void j(RecyclerView.F f8) {
        this.f36240a.j(f8);
    }

    public void k(RecyclerView.F f8) {
        for (int size = this.f36242c.size() - 1; size >= 0; size--) {
            List list = (List) this.f36242c.get(size);
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                if (l((e) list.get(size2), f8) && f8 != null) {
                    list.remove(size2);
                }
            }
            if (f8 == null) {
                list.clear();
            }
            if (list.isEmpty()) {
                this.f36242c.remove(list);
            }
        }
    }

    protected abstract boolean l(e eVar, RecyclerView.F f8);

    public void m(RecyclerView.F f8) {
        List list = this.f36241b;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (l((e) list.get(size), f8) && f8 != null) {
                list.remove(size);
            }
        }
        if (f8 == null) {
            list.clear();
        }
    }

    protected void n(e eVar) {
        this.f36241b.add(eVar);
    }

    public boolean o() {
        return !this.f36241b.isEmpty();
    }

    public boolean p() {
        return (this.f36241b.isEmpty() && this.f36243d.isEmpty() && this.f36242c.isEmpty()) ? false : true;
    }

    protected abstract void q(e eVar, RecyclerView.F f8);

    protected abstract void r(e eVar, RecyclerView.F f8);

    protected abstract void s(e eVar, RecyclerView.F f8);

    protected abstract void t(e eVar);

    public boolean u(RecyclerView.F f8) {
        return this.f36243d.remove(f8);
    }

    protected void v(RecyclerView.F f8) {
        if (f36239e == null) {
            f36239e = new ValueAnimator().getInterpolator();
        }
        f8.f10944a.animate().setInterpolator(f36239e);
        j(f8);
    }

    public void w(boolean z7, long j8) {
        ArrayList arrayList = new ArrayList(this.f36241b);
        this.f36241b.clear();
        if (z7) {
            this.f36242c.add(arrayList);
            X.g0(((e) arrayList.get(0)).b().f10944a, new a(arrayList), j8);
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c((e) it.next());
            }
            arrayList.clear();
        }
    }

    protected void x(e eVar, RecyclerView.F f8, C7026g0 c7026g0) {
        c7026g0.k(new C0265b(this, eVar, f8, c7026g0));
        a(f8);
        c7026g0.o();
    }
}
