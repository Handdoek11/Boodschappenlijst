package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC0912k;
import androidx.fragment.app.K;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q.C6397a;
import v0.e;
import z0.AbstractC7016b0;
import z0.ViewTreeObserverOnPreDrawListenerC7007K;
import z0.X;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0905d extends K {

    /* renamed from: androidx.fragment.app.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10024a;

        static {
            int[] iArr = new int[K.e.c.values().length];
            f10024a = iArr;
            try {
                iArr[K.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10024a[K.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10024a[K.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10024a[K.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ List f10025o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ K.e f10026s;

        b(List list, K.e eVar) {
            this.f10025o = list;
            this.f10026s = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10025o.contains(this.f10026s)) {
                this.f10025o.remove(this.f10026s);
                C0905d.this.s(this.f10026s);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f10028a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f10029b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10030c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K.e f10031d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f10032e;

        c(ViewGroup viewGroup, View view, boolean z7, K.e eVar, k kVar) {
            this.f10028a = viewGroup;
            this.f10029b = view;
            this.f10030c = z7;
            this.f10031d = eVar;
            this.f10032e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10028a.endViewTransition(this.f10029b);
            if (this.f10030c) {
                this.f10031d.e().a(this.f10029b);
            }
            this.f10032e.a();
            if (w.G0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f10031d + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    class C0164d implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f10034a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K.e f10035b;

        C0164d(Animator animator, K.e eVar) {
            this.f10034a = animator;
            this.f10035b = eVar;
        }

        @Override // v0.e.a
        public void a() {
            this.f10034a.end();
            if (w.G0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f10035b + " has been canceled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K.e f10037a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f10038b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f10039c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f10040d;

        /* renamed from: androidx.fragment.app.d$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f10038b.endViewTransition(eVar.f10039c);
                e.this.f10040d.a();
            }
        }

        e(K.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f10037a = eVar;
            this.f10038b = viewGroup;
            this.f10039c = view;
            this.f10040d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f10038b.post(new a());
            if (w.G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f10037a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (w.G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f10037a + " has reached onAnimationStart.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$f */
    class f implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f10043a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f10044b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f10045c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K.e f10046d;

        f(View view, ViewGroup viewGroup, k kVar, K.e eVar) {
            this.f10043a = view;
            this.f10044b = viewGroup;
            this.f10045c = kVar;
            this.f10046d = eVar;
        }

        @Override // v0.e.a
        public void a() {
            this.f10043a.clearAnimation();
            this.f10044b.endViewTransition(this.f10043a);
            this.f10045c.a();
            if (w.G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f10046d + " has been cancelled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$g */
    class g implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ K.e f10048o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ K.e f10049s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f10050t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ C6397a f10051u;

        g(K.e eVar, K.e eVar2, boolean z7, C6397a c6397a) {
            this.f10048o = eVar;
            this.f10049s = eVar2;
            this.f10050t = z7;
            this.f10051u = c6397a;
        }

        @Override // java.lang.Runnable
        public void run() {
            F.a(this.f10048o.f(), this.f10049s.f(), this.f10050t, this.f10051u, false);
        }
    }

    /* renamed from: androidx.fragment.app.d$h */
    class h implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ H f10053o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f10054s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Rect f10055t;

        h(H h8, View view, Rect rect) {
            this.f10053o = h8;
            this.f10054s = view;
            this.f10055t = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10053o.h(this.f10054s, this.f10055t);
        }
    }

    /* renamed from: androidx.fragment.app.d$i */
    class i implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f10057o;

        i(ArrayList arrayList) {
            this.f10057o = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            F.d(this.f10057o, 4);
        }
    }

    /* renamed from: androidx.fragment.app.d$j */
    class j implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ m f10059o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ K.e f10060s;

        j(m mVar, K.e eVar) {
            this.f10059o = mVar;
            this.f10060s = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10059o.a();
            if (w.G0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f10060s + "has completed");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$k */
    private static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private boolean f10062c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f10063d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC0912k.a f10064e;

        k(K.e eVar, v0.e eVar2, boolean z7) {
            super(eVar, eVar2);
            this.f10063d = false;
            this.f10062c = z7;
        }

        AbstractC0912k.a e(Context context) {
            if (this.f10063d) {
                return this.f10064e;
            }
            AbstractC0912k.a b8 = AbstractC0912k.b(context, b().f(), b().e() == K.e.c.VISIBLE, this.f10062c);
            this.f10064e = b8;
            this.f10063d = true;
            return b8;
        }
    }

    /* renamed from: androidx.fragment.app.d$l */
    private static class l {

        /* renamed from: a, reason: collision with root package name */
        private final K.e f10065a;

        /* renamed from: b, reason: collision with root package name */
        private final v0.e f10066b;

        l(K.e eVar, v0.e eVar2) {
            this.f10065a = eVar;
            this.f10066b = eVar2;
        }

        void a() {
            this.f10065a.d(this.f10066b);
        }

        K.e b() {
            return this.f10065a;
        }

        v0.e c() {
            return this.f10066b;
        }

        boolean d() {
            K.e.c cVar;
            K.e.c f8 = K.e.c.f(this.f10065a.f().f9884Z);
            K.e.c e8 = this.f10065a.e();
            return f8 == e8 || !(f8 == (cVar = K.e.c.VISIBLE) || e8 == cVar);
        }
    }

    /* renamed from: androidx.fragment.app.d$m */
    private static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        private final Object f10067c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f10068d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f10069e;

        m(K.e eVar, v0.e eVar2, boolean z7, boolean z8) {
            super(eVar, eVar2);
            if (eVar.e() == K.e.c.VISIBLE) {
                this.f10067c = z7 ? eVar.f().f0() : eVar.f().I();
                this.f10068d = z7 ? eVar.f().u() : eVar.f().q();
            } else {
                this.f10067c = z7 ? eVar.f().h0() : eVar.f().R();
                this.f10068d = true;
            }
            if (!z8) {
                this.f10069e = null;
            } else if (z7) {
                this.f10069e = eVar.f().j0();
            } else {
                this.f10069e = eVar.f().i0();
            }
        }

        private H f(Object obj) {
            if (obj == null) {
                return null;
            }
            H h8 = F.f9856a;
            if (h8 != null && h8.e(obj)) {
                return h8;
            }
            H h9 = F.f9857b;
            if (h9 != null && h9.e(obj)) {
                return h9;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        H e() {
            H f8 = f(this.f10067c);
            H f9 = f(this.f10069e);
            if (f8 == null || f9 == null || f8 == f9) {
                return f8 != null ? f8 : f9;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f10067c + " which uses a different Transition  type than its shared element transition " + this.f10069e);
        }

        public Object g() {
            return this.f10069e;
        }

        Object h() {
            return this.f10067c;
        }

        public boolean i() {
            return this.f10069e != null;
        }

        boolean j() {
            return this.f10068d;
        }
    }

    C0905d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List list, List list2, boolean z7, Map map) {
        int i8;
        boolean z8;
        Context context;
        View view;
        int i9;
        K.e eVar;
        ViewGroup m8 = m();
        Context context2 = m8.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z9 = false;
        while (true) {
            i8 = 2;
            if (!it.hasNext()) {
                break;
            }
            k kVar = (k) it.next();
            if (kVar.d()) {
                kVar.a();
            } else {
                AbstractC0912k.a e8 = kVar.e(context2);
                if (e8 == null) {
                    kVar.a();
                } else {
                    Animator animator = e8.f10098b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        K.e b8 = kVar.b();
                        Fragment f8 = b8.f();
                        if (Boolean.TRUE.equals(map.get(b8))) {
                            if (w.G0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f8 + " as this Fragment was involved in a Transition.");
                            }
                            kVar.a();
                        } else {
                            boolean z10 = b8.e() == K.e.c.GONE;
                            if (z10) {
                                list2.remove(b8);
                            }
                            View view2 = f8.f9884Z;
                            m8.startViewTransition(view2);
                            animator.addListener(new c(m8, view2, z10, b8, kVar));
                            animator.setTarget(view2);
                            animator.start();
                            if (w.G0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Animator from operation ");
                                eVar = b8;
                                sb.append(eVar);
                                sb.append(" has started.");
                                Log.v("FragmentManager", sb.toString());
                            } else {
                                eVar = b8;
                            }
                            kVar.c().b(new C0164d(animator, eVar));
                            z9 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            K.e b9 = kVar2.b();
            Fragment f9 = b9.f();
            if (z7) {
                if (w.G0(i8)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f9 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.a();
            } else if (z9) {
                if (w.G0(i8)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f9 + " as Animations cannot run alongside Animators.");
                }
                kVar2.a();
            } else {
                View view3 = f9.f9884Z;
                Animation animation = (Animation) y0.i.g(((AbstractC0912k.a) y0.i.g(kVar2.e(context2))).f10097a);
                if (b9.e() != K.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar2.a();
                    z8 = z9;
                    context = context2;
                    i9 = i8;
                    view = view3;
                } else {
                    m8.startViewTransition(view3);
                    AbstractC0912k.b bVar = new AbstractC0912k.b(animation, m8, view3);
                    z8 = z9;
                    context = context2;
                    view = view3;
                    bVar.setAnimationListener(new e(b9, m8, view3, kVar2));
                    view.startAnimation(bVar);
                    i9 = 2;
                    if (w.G0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b9 + " has started.");
                    }
                }
                kVar2.c().b(new f(view, m8, kVar2, b9));
                i8 = i9;
                z9 = z8;
                context2 = context;
            }
        }
    }

    private Map x(List list, List list2, boolean z7, K.e eVar, K.e eVar2) {
        String str;
        String str2;
        String str3;
        View view;
        Object obj;
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        HashMap hashMap;
        View view2;
        Object k8;
        C6397a c6397a;
        ArrayList arrayList3;
        K.e eVar3;
        ArrayList arrayList4;
        Rect rect;
        H h8;
        HashMap hashMap2;
        K.e eVar4;
        View view3;
        View view4;
        View view5;
        boolean z8 = z7;
        K.e eVar5 = eVar;
        K.e eVar6 = eVar2;
        HashMap hashMap3 = new HashMap();
        Iterator it = list.iterator();
        H h9 = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.d()) {
                H e8 = mVar.e();
                if (h9 == null) {
                    h9 = e8;
                } else if (e8 != null && h9 != e8) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (h9 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                hashMap3.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap3;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C6397a c6397a2 = new C6397a();
        Iterator it3 = list.iterator();
        Object obj3 = null;
        View view7 = null;
        boolean z9 = false;
        while (true) {
            str = "FragmentManager";
            if (!it3.hasNext()) {
                break;
            }
            m mVar3 = (m) it3.next();
            if (!mVar3.i() || eVar5 == null || eVar6 == null) {
                c6397a = c6397a2;
                arrayList3 = arrayList6;
                eVar3 = eVar5;
                arrayList4 = arrayList5;
                rect = rect2;
                h8 = h9;
                hashMap2 = hashMap3;
                View view8 = view6;
                eVar4 = eVar6;
                view3 = view8;
                view7 = view7;
            } else {
                Object u7 = h9.u(h9.f(mVar3.g()));
                ArrayList k02 = eVar2.f().k0();
                ArrayList k03 = eVar.f().k0();
                ArrayList l02 = eVar.f().l0();
                View view9 = view7;
                int i8 = 0;
                while (i8 < l02.size()) {
                    int indexOf = k02.indexOf(l02.get(i8));
                    ArrayList arrayList7 = l02;
                    if (indexOf != -1) {
                        k02.set(indexOf, (String) k03.get(i8));
                    }
                    i8++;
                    l02 = arrayList7;
                }
                ArrayList l03 = eVar2.f().l0();
                if (z8) {
                    eVar.f().P();
                    eVar2.f().S();
                } else {
                    eVar.f().S();
                    eVar2.f().P();
                }
                int i9 = 0;
                for (int size = k02.size(); i9 < size; size = size) {
                    c6397a2.put((String) k02.get(i9), (String) l03.get(i9));
                    i9++;
                }
                if (w.G0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator it4 = l03.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator it5 = k02.iterator(); it5.hasNext(); it5 = it5) {
                        Log.v("FragmentManager", "Name: " + ((String) it5.next()));
                    }
                }
                C6397a c6397a3 = new C6397a();
                u(c6397a3, eVar.f().f9884Z);
                c6397a3.o(k02);
                c6397a2.o(c6397a3.keySet());
                C6397a c6397a4 = new C6397a();
                u(c6397a4, eVar2.f().f9884Z);
                c6397a4.o(l03);
                c6397a4.o(c6397a2.values());
                F.c(c6397a2, c6397a4);
                v(c6397a3, c6397a2.keySet());
                v(c6397a4, c6397a2.values());
                if (c6397a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c6397a = c6397a2;
                    arrayList3 = arrayList6;
                    eVar3 = eVar5;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    h8 = h9;
                    view7 = view9;
                    obj3 = null;
                    eVar4 = eVar2;
                    hashMap2 = hashMap3;
                } else {
                    F.a(eVar2.f(), eVar.f(), z8, c6397a3, true);
                    HashMap hashMap4 = hashMap3;
                    View view10 = view6;
                    c6397a = c6397a2;
                    ArrayList arrayList8 = arrayList6;
                    ViewTreeObserverOnPreDrawListenerC7007K.a(m(), new g(eVar2, eVar, z7, c6397a4));
                    arrayList5.addAll(c6397a3.values());
                    if (k02.isEmpty()) {
                        view7 = view9;
                    } else {
                        view7 = (View) c6397a3.get((String) k02.get(0));
                        h9.p(u7, view7);
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c6397a4.values());
                    if (l03.isEmpty() || (view5 = (View) c6397a4.get((String) l03.get(0))) == null) {
                        view4 = view10;
                    } else {
                        ViewTreeObserverOnPreDrawListenerC7007K.a(m(), new h(h9, view5, rect2));
                        view4 = view10;
                        z9 = true;
                    }
                    h9.s(u7, view4, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    h8 = h9;
                    h9.n(u7, null, null, null, null, u7, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar3 = eVar;
                    hashMap2 = hashMap4;
                    hashMap2.put(eVar3, bool);
                    eVar4 = eVar2;
                    hashMap2.put(eVar4, bool);
                    obj3 = u7;
                }
            }
            eVar5 = eVar3;
            arrayList5 = arrayList4;
            rect2 = rect;
            hashMap3 = hashMap2;
            c6397a2 = c6397a;
            z8 = z7;
            arrayList6 = arrayList3;
            h9 = h8;
            K.e eVar7 = eVar4;
            view6 = view3;
            eVar6 = eVar7;
        }
        View view11 = view7;
        C6397a c6397a5 = c6397a2;
        ArrayList arrayList9 = arrayList6;
        K.e eVar8 = eVar5;
        ArrayList arrayList10 = arrayList5;
        Rect rect3 = rect2;
        H h10 = h9;
        HashMap hashMap5 = hashMap3;
        View view12 = view6;
        K.e eVar9 = eVar6;
        View view13 = view12;
        ArrayList arrayList11 = new ArrayList();
        Iterator it6 = list.iterator();
        Object obj4 = null;
        Object obj5 = null;
        while (it6.hasNext()) {
            m mVar4 = (m) it6.next();
            if (mVar4.d()) {
                hashMap5.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object f8 = h10.f(mVar4.h());
                K.e b8 = mVar4.b();
                boolean z10 = obj3 != null && (b8 == eVar8 || b8 == eVar9);
                if (f8 == null) {
                    if (!z10) {
                        hashMap5.put(b8, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList9;
                    str3 = str;
                    arrayList = arrayList10;
                    view = view13;
                    k8 = obj4;
                    hashMap = hashMap5;
                    view2 = view11;
                } else {
                    str3 = str;
                    ArrayList arrayList12 = new ArrayList();
                    Object obj6 = obj4;
                    t(arrayList12, b8.f().f9884Z);
                    if (z10) {
                        if (b8 == eVar8) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        h10.a(f8, view13);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view13;
                        obj2 = obj5;
                        hashMap = hashMap5;
                        obj = obj6;
                    } else {
                        h10.b(f8, arrayList12);
                        view = view13;
                        obj = obj6;
                        arrayList = arrayList10;
                        obj2 = obj5;
                        arrayList2 = arrayList9;
                        hashMap = hashMap5;
                        h10.n(f8, f8, arrayList12, null, null, null, null);
                        if (b8.e() == K.e.c.GONE) {
                            list2.remove(b8);
                            ArrayList arrayList13 = new ArrayList(arrayList12);
                            arrayList13.remove(b8.f().f9884Z);
                            h10.m(f8, b8.f().f9884Z, arrayList13);
                            ViewTreeObserverOnPreDrawListenerC7007K.a(m(), new i(arrayList12));
                        }
                    }
                    if (b8.e() == K.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z9) {
                            h10.o(f8, rect3);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        h10.p(f8, view2);
                    }
                    hashMap.put(b8, Boolean.TRUE);
                    if (mVar4.j()) {
                        obj5 = h10.k(obj2, f8, null);
                        k8 = obj;
                    } else {
                        k8 = h10.k(obj, f8, null);
                        obj5 = obj2;
                    }
                }
                eVar9 = eVar2;
                hashMap5 = hashMap;
                obj4 = k8;
                view11 = view2;
                str = str3;
                view13 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList arrayList14 = arrayList9;
        String str4 = str;
        ArrayList arrayList15 = arrayList10;
        HashMap hashMap6 = hashMap5;
        Object j8 = h10.j(obj5, obj4, obj3);
        if (j8 == null) {
            return hashMap6;
        }
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            m mVar5 = (m) it7.next();
            if (!mVar5.d()) {
                Object h11 = mVar5.h();
                K.e b9 = mVar5.b();
                HashMap hashMap7 = hashMap6;
                boolean z11 = obj3 != null && (b9 == eVar8 || b9 == eVar2);
                if (h11 == null && !z11) {
                    str2 = str4;
                } else if (X.R(m())) {
                    str2 = str4;
                    h10.q(mVar5.b().f(), j8, mVar5.c(), new j(mVar5, b9));
                } else {
                    if (w.G0(2)) {
                        str2 = str4;
                        Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b9);
                    } else {
                        str2 = str4;
                    }
                    mVar5.a();
                }
                hashMap6 = hashMap7;
                str4 = str2;
            }
        }
        HashMap hashMap8 = hashMap6;
        String str5 = str4;
        if (!X.R(m())) {
            return hashMap8;
        }
        F.d(arrayList11, 4);
        ArrayList l8 = h10.l(arrayList14);
        if (w.G0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it8 = arrayList15.iterator();
            while (it8.hasNext()) {
                View view14 = (View) it8.next();
                Log.v(str5, "View: " + view14 + " Name: " + X.H(view14));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            Iterator it9 = arrayList14.iterator();
            while (it9.hasNext()) {
                View view15 = (View) it9.next();
                Log.v(str5, "View: " + view15 + " Name: " + X.H(view15));
            }
        }
        h10.c(m(), j8);
        h10.r(m(), arrayList15, arrayList14, l8, c6397a5);
        F.d(arrayList11, 0);
        h10.t(obj3, arrayList15, arrayList14);
        return hashMap8;
    }

    private void y(List list) {
        Fragment f8 = ((K.e) list.get(list.size() - 1)).f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            K.e eVar = (K.e) it.next();
            eVar.f().f9887c0.f9921c = f8.f9887c0.f9921c;
            eVar.f().f9887c0.f9922d = f8.f9887c0.f9922d;
            eVar.f().f9887c0.f9923e = f8.f9887c0.f9923e;
            eVar.f().f9887c0.f9924f = f8.f9887c0.f9924f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    @Override // androidx.fragment.app.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void f(java.util.List r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0905d.f(java.util.List, boolean):void");
    }

    void s(K.e eVar) {
        eVar.e().a(eVar.f().f9884Z);
    }

    void t(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC7016b0.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map map, View view) {
        String H7 = X.H(view);
        if (H7 != null) {
            map.put(H7, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(C6397a c6397a, Collection collection) {
        Iterator it = c6397a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(X.H((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
