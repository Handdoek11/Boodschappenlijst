package o4;

import X2.D;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m4.AbstractC6203i;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final f f39871a;

    /* renamed from: b, reason: collision with root package name */
    private final n4.f f39872b;

    /* renamed from: c, reason: collision with root package name */
    private String f39873c;

    /* renamed from: d, reason: collision with root package name */
    private final a f39874d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f39875e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    private final j f39876f = new j(128);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference f39877g = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference f39878a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference f39879b = new AtomicReference(null);

        /* renamed from: c, reason: collision with root package name */
        private final boolean f39880c;

        public a(boolean z7) {
            this.f39880c = z7;
            this.f39878a = new AtomicMarkableReference(new d(64, z7 ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f39879b.set(null);
            e();
        }

        private void d() {
            Runnable runnable = new Runnable() { // from class: o4.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39870o.c();
                }
            };
            if (D.a(this.f39879b, null, runnable)) {
                n.this.f39872b.f39587b.f(runnable);
            }
        }

        private void e() {
            Map map;
            synchronized (this) {
                try {
                    if (this.f39878a.isMarked()) {
                        map = ((d) this.f39878a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f39878a;
                        atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                n.this.f39871a.r(n.this.f39873c, map, this.f39880c);
            }
        }

        public Map b() {
            return ((d) this.f39878a.getReference()).a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((d) this.f39878a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f39878a;
                    atomicMarkableReference.set((d) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public n(String str, s4.g gVar, n4.f fVar) {
        this.f39873c = str;
        this.f39871a = new f(gVar);
        this.f39872b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str, Map map, List list) {
        if (i() != null) {
            this.f39871a.t(str, i());
        }
        if (!map.isEmpty()) {
            this.f39871a.q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.f39871a.s(str, list);
    }

    public static n k(String str, s4.g gVar, n4.f fVar) {
        f fVar2 = new f(gVar);
        n nVar = new n(str, gVar, fVar);
        ((d) nVar.f39874d.f39878a.getReference()).e(fVar2.i(str, false));
        ((d) nVar.f39875e.f39878a.getReference()).e(fVar2.i(str, true));
        nVar.f39877g.set(fVar2.k(str), false);
        nVar.f39876f.c(fVar2.j(str));
        return nVar;
    }

    public static String l(String str, s4.g gVar) {
        return new f(gVar).k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        boolean z7;
        String str;
        synchronized (this.f39877g) {
            try {
                z7 = false;
                if (this.f39877g.isMarked()) {
                    str = i();
                    this.f39877g.set(str, false);
                    z7 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            this.f39871a.t(this.f39873c, str);
        }
    }

    public Map f() {
        return this.f39874d.b();
    }

    public Map g() {
        return this.f39875e.b();
    }

    public List h() {
        return this.f39876f.a();
    }

    public String i() {
        return (String) this.f39877g.getReference();
    }

    public boolean n(String str, String str2) {
        return this.f39875e.f(str, str2);
    }

    public void o(final String str) {
        synchronized (this.f39873c) {
            this.f39873c = str;
            final Map b8 = this.f39874d.b();
            final List b9 = this.f39876f.b();
            this.f39872b.f39587b.f(new Runnable() { // from class: o4.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39865o.j(str, b8, b9);
                }
            });
        }
    }

    public void p(String str) {
        String c8 = d.c(str, 1024);
        synchronized (this.f39877g) {
            try {
                if (AbstractC6203i.y(c8, (String) this.f39877g.getReference())) {
                    return;
                }
                this.f39877g.set(c8, true);
                this.f39872b.f39587b.f(new Runnable() { // from class: o4.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39869o.m();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
