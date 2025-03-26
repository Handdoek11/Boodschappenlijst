package androidx.lifecycle;

import J6.AbstractC0650j;
import androidx.lifecycle.AbstractC0922h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m.C6181a;
import m.C6182b;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0928n extends AbstractC0922h {

    /* renamed from: j, reason: collision with root package name */
    public static final a f10314j = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10315b;

    /* renamed from: c, reason: collision with root package name */
    private C6181a f10316c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC0922h.b f10317d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f10318e;

    /* renamed from: f, reason: collision with root package name */
    private int f10319f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10320g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10321h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f10322i;

    /* renamed from: androidx.lifecycle.n$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final AbstractC0922h.b a(AbstractC0922h.b bVar, AbstractC0922h.b bVar2) {
            J6.r.e(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        private a() {
        }
    }

    /* renamed from: androidx.lifecycle.n$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC0922h.b f10323a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC0925k f10324b;

        public b(InterfaceC0926l interfaceC0926l, AbstractC0922h.b bVar) {
            J6.r.e(bVar, "initialState");
            J6.r.b(interfaceC0926l);
            this.f10324b = p.f(interfaceC0926l);
            this.f10323a = bVar;
        }

        public final void a(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
            J6.r.e(aVar, "event");
            AbstractC0922h.b f8 = aVar.f();
            this.f10323a = C0928n.f10314j.a(this.f10323a, f8);
            InterfaceC0925k interfaceC0925k = this.f10324b;
            J6.r.b(interfaceC0927m);
            interfaceC0925k.f(interfaceC0927m, aVar);
            this.f10323a = f8;
        }

        public final AbstractC0922h.b b() {
            return this.f10323a;
        }
    }

    private C0928n(InterfaceC0927m interfaceC0927m, boolean z7) {
        this.f10315b = z7;
        this.f10316c = new C6181a();
        this.f10317d = AbstractC0922h.b.INITIALIZED;
        this.f10322i = new ArrayList();
        this.f10318e = new WeakReference(interfaceC0927m);
    }

    private final void d(InterfaceC0927m interfaceC0927m) {
        Iterator descendingIterator = this.f10316c.descendingIterator();
        J6.r.d(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f10321h) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            J6.r.d(entry, "next()");
            InterfaceC0926l interfaceC0926l = (InterfaceC0926l) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f10317d) > 0 && !this.f10321h && this.f10316c.contains(interfaceC0926l)) {
                AbstractC0922h.a a8 = AbstractC0922h.a.Companion.a(bVar.b());
                if (a8 == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                l(a8.f());
                bVar.a(interfaceC0927m, a8);
                k();
            }
        }
    }

    private final AbstractC0922h.b e(InterfaceC0926l interfaceC0926l) {
        b bVar;
        Map.Entry p8 = this.f10316c.p(interfaceC0926l);
        AbstractC0922h.b bVar2 = null;
        AbstractC0922h.b b8 = (p8 == null || (bVar = (b) p8.getValue()) == null) ? null : bVar.b();
        if (!this.f10322i.isEmpty()) {
            bVar2 = (AbstractC0922h.b) this.f10322i.get(r0.size() - 1);
        }
        a aVar = f10314j;
        return aVar.a(aVar.a(this.f10317d, b8), bVar2);
    }

    private final void f(String str) {
        if (!this.f10315b || l.c.g().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void g(InterfaceC0927m interfaceC0927m) {
        C6182b.d d8 = this.f10316c.d();
        J6.r.d(d8, "observerMap.iteratorWithAdditions()");
        while (d8.hasNext() && !this.f10321h) {
            Map.Entry entry = (Map.Entry) d8.next();
            InterfaceC0926l interfaceC0926l = (InterfaceC0926l) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f10317d) < 0 && !this.f10321h && this.f10316c.contains(interfaceC0926l)) {
                l(bVar.b());
                AbstractC0922h.a b8 = AbstractC0922h.a.Companion.b(bVar.b());
                if (b8 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(interfaceC0927m, b8);
                k();
            }
        }
    }

    private final boolean i() {
        if (this.f10316c.size() == 0) {
            return true;
        }
        Map.Entry b8 = this.f10316c.b();
        J6.r.b(b8);
        AbstractC0922h.b b9 = ((b) b8.getValue()).b();
        Map.Entry e8 = this.f10316c.e();
        J6.r.b(e8);
        AbstractC0922h.b b10 = ((b) e8.getValue()).b();
        return b9 == b10 && this.f10317d == b10;
    }

    private final void j(AbstractC0922h.b bVar) {
        AbstractC0922h.b bVar2 = this.f10317d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC0922h.b.INITIALIZED && bVar == AbstractC0922h.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f10317d + " in component " + this.f10318e.get()).toString());
        }
        this.f10317d = bVar;
        if (this.f10320g || this.f10319f != 0) {
            this.f10321h = true;
            return;
        }
        this.f10320g = true;
        n();
        this.f10320g = false;
        if (this.f10317d == AbstractC0922h.b.DESTROYED) {
            this.f10316c = new C6181a();
        }
    }

    private final void k() {
        this.f10322i.remove(r0.size() - 1);
    }

    private final void l(AbstractC0922h.b bVar) {
        this.f10322i.add(bVar);
    }

    private final void n() {
        InterfaceC0927m interfaceC0927m = (InterfaceC0927m) this.f10318e.get();
        if (interfaceC0927m == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!i()) {
            this.f10321h = false;
            AbstractC0922h.b bVar = this.f10317d;
            Map.Entry b8 = this.f10316c.b();
            J6.r.b(b8);
            if (bVar.compareTo(((b) b8.getValue()).b()) < 0) {
                d(interfaceC0927m);
            }
            Map.Entry e8 = this.f10316c.e();
            if (!this.f10321h && e8 != null && this.f10317d.compareTo(((b) e8.getValue()).b()) > 0) {
                g(interfaceC0927m);
            }
        }
        this.f10321h = false;
    }

    @Override // androidx.lifecycle.AbstractC0922h
    public void a(InterfaceC0926l interfaceC0926l) {
        InterfaceC0927m interfaceC0927m;
        J6.r.e(interfaceC0926l, "observer");
        f("addObserver");
        AbstractC0922h.b bVar = this.f10317d;
        AbstractC0922h.b bVar2 = AbstractC0922h.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0922h.b.INITIALIZED;
        }
        b bVar3 = new b(interfaceC0926l, bVar2);
        if (((b) this.f10316c.n(interfaceC0926l, bVar3)) == null && (interfaceC0927m = (InterfaceC0927m) this.f10318e.get()) != null) {
            boolean z7 = this.f10319f != 0 || this.f10320g;
            AbstractC0922h.b e8 = e(interfaceC0926l);
            this.f10319f++;
            while (bVar3.b().compareTo(e8) < 0 && this.f10316c.contains(interfaceC0926l)) {
                l(bVar3.b());
                AbstractC0922h.a b8 = AbstractC0922h.a.Companion.b(bVar3.b());
                if (b8 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(interfaceC0927m, b8);
                k();
                e8 = e(interfaceC0926l);
            }
            if (!z7) {
                n();
            }
            this.f10319f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0922h
    public AbstractC0922h.b b() {
        return this.f10317d;
    }

    @Override // androidx.lifecycle.AbstractC0922h
    public void c(InterfaceC0926l interfaceC0926l) {
        J6.r.e(interfaceC0926l, "observer");
        f("removeObserver");
        this.f10316c.o(interfaceC0926l);
    }

    public void h(AbstractC0922h.a aVar) {
        J6.r.e(aVar, "event");
        f("handleLifecycleEvent");
        j(aVar.f());
    }

    public void m(AbstractC0922h.b bVar) {
        J6.r.e(bVar, "state");
        f("setCurrentState");
        j(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0928n(InterfaceC0927m interfaceC0927m) {
        this(interfaceC0927m, true);
        J6.r.e(interfaceC0927m, "provider");
    }
}
