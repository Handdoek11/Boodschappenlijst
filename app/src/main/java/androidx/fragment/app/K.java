package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import v0.e;
import z0.X;

/* loaded from: classes.dex */
abstract class K {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f9975a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f9976b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f9977c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    boolean f9978d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f9979e = false;

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ d f9980o;

        a(d dVar) {
            this.f9980o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (K.this.f9976b.contains(this.f9980o)) {
                this.f9980o.e().a(this.f9980o.f().f9884Z);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ d f9982o;

        b(d dVar) {
            this.f9982o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            K.this.f9976b.remove(this.f9982o);
            K.this.f9977c.remove(this.f9982o);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9984a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f9985b;

        static {
            int[] iArr = new int[e.b.values().length];
            f9985b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9985b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9985b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f9984a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9984a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9984a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9984a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        private final C f9986h;

        d(e.c cVar, e.b bVar, C c8, v0.e eVar) {
            super(cVar, bVar, c8.k(), eVar);
            this.f9986h = c8;
        }

        @Override // androidx.fragment.app.K.e
        public void c() {
            super.c();
            this.f9986h.m();
        }

        @Override // androidx.fragment.app.K.e
        void l() {
            if (g() != e.b.ADDING) {
                if (g() == e.b.REMOVING) {
                    Fragment k8 = this.f9986h.k();
                    View M12 = k8.M1();
                    if (w.G0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + M12.findFocus() + " on view " + M12 + " for Fragment " + k8);
                    }
                    M12.clearFocus();
                    return;
                }
                return;
            }
            Fragment k9 = this.f9986h.k();
            View findFocus = k9.f9884Z.findFocus();
            if (findFocus != null) {
                k9.S1(findFocus);
                if (w.G0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k9);
                }
            }
            View M13 = f().M1();
            if (M13.getParent() == null) {
                this.f9986h.b();
                M13.setAlpha(0.0f);
            }
            if (M13.getAlpha() == 0.0f && M13.getVisibility() == 0) {
                M13.setVisibility(4);
            }
            M13.setAlpha(k9.e0());
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private c f9987a;

        /* renamed from: b, reason: collision with root package name */
        private b f9988b;

        /* renamed from: c, reason: collision with root package name */
        private final Fragment f9989c;

        /* renamed from: d, reason: collision with root package name */
        private final List f9990d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private final HashSet f9991e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private boolean f9992f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9993g = false;

        class a implements e.a {
            a() {
            }

            @Override // v0.e.a
            public void a() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c c(int i8) {
                if (i8 == 0) {
                    return VISIBLE;
                }
                if (i8 == 4) {
                    return INVISIBLE;
                }
                if (i8 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i8);
            }

            static c f(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : c(view.getVisibility());
            }

            void a(View view) {
                int i8 = c.f9984a[ordinal()];
                if (i8 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (w.G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i8 == 2) {
                    if (w.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i8 == 3) {
                    if (w.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i8 != 4) {
                    return;
                }
                if (w.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, Fragment fragment, v0.e eVar) {
            this.f9987a = cVar;
            this.f9988b = bVar;
            this.f9989c = fragment;
            eVar.b(new a());
        }

        final void a(Runnable runnable) {
            this.f9990d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f9992f = true;
            if (this.f9991e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f9991e).iterator();
            while (it.hasNext()) {
                ((v0.e) it.next()).a();
            }
        }

        public void c() {
            if (this.f9993g) {
                return;
            }
            if (w.G0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f9993g = true;
            Iterator it = this.f9990d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(v0.e eVar) {
            if (this.f9991e.remove(eVar) && this.f9991e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f9987a;
        }

        public final Fragment f() {
            return this.f9989c;
        }

        b g() {
            return this.f9988b;
        }

        final boolean h() {
            return this.f9992f;
        }

        final boolean i() {
            return this.f9993g;
        }

        public final void j(v0.e eVar) {
            l();
            this.f9991e.add(eVar);
        }

        final void k(c cVar, b bVar) {
            int i8 = c.f9985b[bVar.ordinal()];
            if (i8 == 1) {
                if (this.f9987a == c.REMOVED) {
                    if (w.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9989c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f9988b + " to ADDING.");
                    }
                    this.f9987a = c.VISIBLE;
                    this.f9988b = b.ADDING;
                    return;
                }
                return;
            }
            if (i8 == 2) {
                if (w.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9989c + " mFinalState = " + this.f9987a + " -> REMOVED. mLifecycleImpact  = " + this.f9988b + " to REMOVING.");
                }
                this.f9987a = c.REMOVED;
                this.f9988b = b.REMOVING;
                return;
            }
            if (i8 == 3 && this.f9987a != c.REMOVED) {
                if (w.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9989c + " mFinalState = " + this.f9987a + " -> " + cVar + ". ");
                }
                this.f9987a = cVar;
            }
        }

        abstract void l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f9987a + "} {mLifecycleImpact = " + this.f9988b + "} {mFragment = " + this.f9989c + "}";
        }
    }

    K(ViewGroup viewGroup) {
        this.f9975a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, C c8) {
        synchronized (this.f9976b) {
            try {
                v0.e eVar = new v0.e();
                e h8 = h(c8.k());
                if (h8 != null) {
                    h8.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, c8, eVar);
                this.f9976b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private e h(Fragment fragment) {
        Iterator it = this.f9976b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator it = this.f9977c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    static K n(ViewGroup viewGroup, w wVar) {
        return o(viewGroup, wVar.y0());
    }

    static K o(ViewGroup viewGroup, L l8) {
        Object tag = viewGroup.getTag(O0.b.f4228b);
        if (tag instanceof K) {
            return (K) tag;
        }
        K a8 = l8.a(viewGroup);
        viewGroup.setTag(O0.b.f4228b, a8);
        return a8;
    }

    private void q() {
        Iterator it = this.f9976b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.c(eVar.f().M1().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, C c8) {
        if (w.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c8.k());
        }
        a(cVar, e.b.ADDING, c8);
    }

    void c(C c8) {
        if (w.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c8.k());
        }
        a(e.c.GONE, e.b.NONE, c8);
    }

    void d(C c8) {
        if (w.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c8.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, c8);
    }

    void e(C c8) {
        if (w.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c8.k());
        }
        a(e.c.VISIBLE, e.b.NONE, c8);
    }

    abstract void f(List list, boolean z7);

    void g() {
        if (this.f9979e) {
            return;
        }
        if (!X.Q(this.f9975a)) {
            j();
            this.f9978d = false;
            return;
        }
        synchronized (this.f9976b) {
            try {
                if (!this.f9976b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f9977c);
                    this.f9977c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (w.G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f9977c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f9976b);
                    this.f9976b.clear();
                    this.f9977c.addAll(arrayList2);
                    if (w.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f9978d);
                    this.f9978d = false;
                    if (w.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void j() {
        String str;
        String str2;
        if (w.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean Q7 = X.Q(this.f9975a);
        synchronized (this.f9976b) {
            try {
                q();
                Iterator it = this.f9976b.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).l();
                }
                Iterator it2 = new ArrayList(this.f9977c).iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (w.G0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (Q7) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f9975a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    eVar.b();
                }
                Iterator it3 = new ArrayList(this.f9976b).iterator();
                while (it3.hasNext()) {
                    e eVar2 = (e) it3.next();
                    if (w.G0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (Q7) {
                            str = "";
                        } else {
                            str = "Container " + this.f9975a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k() {
        if (this.f9979e) {
            if (w.G0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f9979e = false;
            g();
        }
    }

    e.b l(C c8) {
        e h8 = h(c8.k());
        e.b g8 = h8 != null ? h8.g() : null;
        e i8 = i(c8.k());
        return (i8 == null || !(g8 == null || g8 == e.b.NONE)) ? g8 : i8.g();
    }

    public ViewGroup m() {
        return this.f9975a;
    }

    void p() {
        synchronized (this.f9976b) {
            try {
                q();
                this.f9979e = false;
                int size = this.f9976b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = (e) this.f9976b.get(size);
                    e.c f8 = e.c.f(eVar.f().f9884Z);
                    e.c e8 = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (e8 == cVar && f8 != cVar) {
                        this.f9979e = eVar.f().z0();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void r(boolean z7) {
        this.f9978d = z7;
    }
}
