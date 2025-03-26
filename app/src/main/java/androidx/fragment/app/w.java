package androidx.fragment.app;

import P0.b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0927m;
import androidx.savedstate.a;
import d.C5694a;
import d.g;
import e.AbstractC5734a;
import f1.InterfaceC5764d;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o0.InterfaceC6279b;
import o0.InterfaceC6280c;
import y0.InterfaceC6936a;
import z0.InterfaceC6998B;
import z0.InterfaceC7056w;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: S, reason: collision with root package name */
    private static boolean f10127S = false;

    /* renamed from: D, reason: collision with root package name */
    private d.c f10131D;

    /* renamed from: E, reason: collision with root package name */
    private d.c f10132E;

    /* renamed from: F, reason: collision with root package name */
    private d.c f10133F;

    /* renamed from: H, reason: collision with root package name */
    private boolean f10135H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f10136I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f10137J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f10138K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f10139L;

    /* renamed from: M, reason: collision with root package name */
    private ArrayList f10140M;

    /* renamed from: N, reason: collision with root package name */
    private ArrayList f10141N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f10142O;

    /* renamed from: P, reason: collision with root package name */
    private z f10143P;

    /* renamed from: Q, reason: collision with root package name */
    private b.c f10144Q;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10147b;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f10149d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f10150e;

    /* renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f10152g;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f10158m;

    /* renamed from: v, reason: collision with root package name */
    private o f10167v;

    /* renamed from: w, reason: collision with root package name */
    private AbstractC0913l f10168w;

    /* renamed from: x, reason: collision with root package name */
    private Fragment f10169x;

    /* renamed from: y, reason: collision with root package name */
    Fragment f10170y;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f10146a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final D f10148c = new D();

    /* renamed from: f, reason: collision with root package name */
    private final p f10151f = new p(this);

    /* renamed from: h, reason: collision with root package name */
    private final androidx.activity.u f10153h = new b(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f10154i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private final Map f10155j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    private final Map f10156k = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    private final Map f10157l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final q f10159n = new q(this);

    /* renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f10160o = new CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC6936a f10161p = new InterfaceC6936a() { // from class: androidx.fragment.app.r
        @Override // y0.InterfaceC6936a
        public final void accept(Object obj) {
            this.f10116a.P0((Configuration) obj);
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC6936a f10162q = new InterfaceC6936a() { // from class: androidx.fragment.app.s
        @Override // y0.InterfaceC6936a
        public final void accept(Object obj) {
            this.f10117a.Q0((Integer) obj);
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC6936a f10163r = new InterfaceC6936a() { // from class: androidx.fragment.app.t
        @Override // y0.InterfaceC6936a
        public final void accept(Object obj) {
            this.f10124a.R0((androidx.core.app.h) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC6936a f10164s = new InterfaceC6936a() { // from class: androidx.fragment.app.u
        @Override // y0.InterfaceC6936a
        public final void accept(Object obj) {
            this.f10125a.S0((androidx.core.app.q) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC6998B f10165t = new c();

    /* renamed from: u, reason: collision with root package name */
    int f10166u = -1;

    /* renamed from: z, reason: collision with root package name */
    private n f10171z = null;

    /* renamed from: A, reason: collision with root package name */
    private n f10128A = new d();

    /* renamed from: B, reason: collision with root package name */
    private L f10129B = null;

    /* renamed from: C, reason: collision with root package name */
    private L f10130C = new e();

    /* renamed from: G, reason: collision with root package name */
    ArrayDeque f10134G = new ArrayDeque();

    /* renamed from: R, reason: collision with root package name */
    private Runnable f10145R = new f();

    class a implements d.b {
        a() {
        }

        @Override // d.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                iArr[i8] = ((Boolean) arrayList.get(i8)).booleanValue() ? 0 : -1;
            }
            k kVar = (k) w.this.f10134G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = kVar.f10182o;
            int i9 = kVar.f10183s;
            Fragment i10 = w.this.f10148c.i(str);
            if (i10 != null) {
                i10.d1(i9, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends androidx.activity.u {
        b(boolean z7) {
            super(z7);
        }

        @Override // androidx.activity.u
        public void d() {
            w.this.C0();
        }
    }

    class c implements InterfaceC6998B {
        c() {
        }

        @Override // z0.InterfaceC6998B
        public boolean a(MenuItem menuItem) {
            return w.this.J(menuItem);
        }

        @Override // z0.InterfaceC6998B
        public void b(Menu menu) {
            w.this.K(menu);
        }

        @Override // z0.InterfaceC6998B
        public void c(Menu menu, MenuInflater menuInflater) {
            w.this.C(menu, menuInflater);
        }

        @Override // z0.InterfaceC6998B
        public void d(Menu menu) {
            w.this.O(menu);
        }
    }

    class d extends n {
        d() {
        }

        @Override // androidx.fragment.app.n
        public Fragment a(ClassLoader classLoader, String str) {
            return w.this.t0().b(w.this.t0().f(), str, null);
        }
    }

    class e implements L {
        e() {
        }

        @Override // androidx.fragment.app.L
        public K a(ViewGroup viewGroup) {
            return new C0905d(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.a0(true);
        }
    }

    class g implements A {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Fragment f10178o;

        g(Fragment fragment) {
            this.f10178o = fragment;
        }

        @Override // androidx.fragment.app.A
        public void a(w wVar, Fragment fragment) {
            this.f10178o.H0(fragment);
        }
    }

    class h implements d.b {
        h() {
        }

        @Override // d.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5694a c5694a) {
            k kVar = (k) w.this.f10134G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVar.f10182o;
            int i8 = kVar.f10183s;
            Fragment i9 = w.this.f10148c.i(str);
            if (i9 != null) {
                i9.E0(i8, c5694a.b(), c5694a.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements d.b {
        i() {
        }

        @Override // d.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5694a c5694a) {
            k kVar = (k) w.this.f10134G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = kVar.f10182o;
            int i8 = kVar.f10183s;
            Fragment i9 = w.this.f10148c.i(str);
            if (i9 != null) {
                i9.E0(i8, c5694a.b(), c5694a.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends AbstractC5734a {
        j() {
        }

        @Override // e.AbstractC5734a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, d.g gVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a8 = gVar.a();
            if (a8 != null && (bundleExtra = a8.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a8.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a8.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    gVar = new g.a(gVar.d()).b(null).c(gVar.c(), gVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (w.G0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // e.AbstractC5734a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C5694a c(int i8, Intent intent) {
            return new C5694a(i8, intent);
        }
    }

    interface l {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class m implements l {

        /* renamed from: a, reason: collision with root package name */
        final String f10184a;

        /* renamed from: b, reason: collision with root package name */
        final int f10185b;

        /* renamed from: c, reason: collision with root package name */
        final int f10186c;

        m(String str, int i8, int i9) {
            this.f10184a = str;
            this.f10185b = i8;
            this.f10186c = i9;
        }

        @Override // androidx.fragment.app.w.l
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = w.this.f10170y;
            if (fragment == null || this.f10185b >= 0 || this.f10184a != null || !fragment.y().a1()) {
                return w.this.d1(arrayList, arrayList2, this.f10184a, this.f10185b, this.f10186c);
            }
            return false;
        }
    }

    static Fragment A0(View view) {
        Object tag = view.getTag(O0.b.f4227a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean G0(int i8) {
        return f10127S || Log.isLoggable("FragmentManager", i8);
    }

    private boolean H0(Fragment fragment) {
        return (fragment.f9880V && fragment.f9881W) || fragment.f9871M.p();
    }

    private boolean I0() {
        Fragment fragment = this.f10169x;
        if (fragment == null) {
            return true;
        }
        return fragment.v0() && this.f10169x.a0().I0();
    }

    private void L(Fragment fragment) {
        if (fragment == null || !fragment.equals(e0(fragment.f9908w))) {
            return;
        }
        fragment.C1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(Configuration configuration) {
        if (I0()) {
            z(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(Integer num) {
        if (I0() && num.intValue() == 80) {
            F(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(androidx.core.app.h hVar) {
        if (I0()) {
            G(hVar.a(), false);
        }
    }

    private void S(int i8) {
        try {
            this.f10147b = true;
            this.f10148c.d(i8);
            V0(i8, false);
            Iterator it = t().iterator();
            while (it.hasNext()) {
                ((K) it.next()).j();
            }
            this.f10147b = false;
            a0(true);
        } catch (Throwable th) {
            this.f10147b = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(androidx.core.app.q qVar) {
        if (I0()) {
            N(qVar.a(), false);
        }
    }

    private void V() {
        if (this.f10139L) {
            this.f10139L = false;
            q1();
        }
    }

    private void X() {
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((K) it.next()).j();
        }
    }

    private void Z(boolean z7) {
        if (this.f10147b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f10167v == null) {
            if (!this.f10138K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f10167v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z7) {
            q();
        }
        if (this.f10140M == null) {
            this.f10140M = new ArrayList();
            this.f10141N = new ArrayList();
        }
    }

    private static void c0(ArrayList arrayList, ArrayList arrayList2, int i8, int i9) {
        while (i8 < i9) {
            C0902a c0902a = (C0902a) arrayList.get(i8);
            if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                c0902a.q(-1);
                c0902a.v();
            } else {
                c0902a.q(1);
                c0902a.u();
            }
            i8++;
        }
    }

    private boolean c1(String str, int i8, int i9) {
        a0(false);
        Z(true);
        Fragment fragment = this.f10170y;
        if (fragment != null && i8 < 0 && str == null && fragment.y().a1()) {
            return true;
        }
        boolean d12 = d1(this.f10140M, this.f10141N, str, i8, i9);
        if (d12) {
            this.f10147b = true;
            try {
                f1(this.f10140M, this.f10141N);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f10148c.b();
        return d12;
    }

    private void d0(ArrayList arrayList, ArrayList arrayList2, int i8, int i9) {
        boolean z7 = ((C0902a) arrayList.get(i8)).f9845r;
        ArrayList arrayList3 = this.f10142O;
        if (arrayList3 == null) {
            this.f10142O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f10142O.addAll(this.f10148c.o());
        Fragment x02 = x0();
        boolean z8 = false;
        for (int i10 = i8; i10 < i9; i10++) {
            C0902a c0902a = (C0902a) arrayList.get(i10);
            x02 = !((Boolean) arrayList2.get(i10)).booleanValue() ? c0902a.w(this.f10142O, x02) : c0902a.z(this.f10142O, x02);
            z8 = z8 || c0902a.f9836i;
        }
        this.f10142O.clear();
        if (!z7 && this.f10166u >= 1) {
            for (int i11 = i8; i11 < i9; i11++) {
                Iterator it = ((C0902a) arrayList.get(i11)).f9830c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((E.a) it.next()).f9848b;
                    if (fragment != null && fragment.f9869K != null) {
                        this.f10148c.r(v(fragment));
                    }
                }
            }
        }
        c0(arrayList, arrayList2, i8, i9);
        boolean booleanValue = ((Boolean) arrayList2.get(i9 - 1)).booleanValue();
        for (int i12 = i8; i12 < i9; i12++) {
            C0902a c0902a2 = (C0902a) arrayList.get(i12);
            if (booleanValue) {
                for (int size = c0902a2.f9830c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((E.a) c0902a2.f9830c.get(size)).f9848b;
                    if (fragment2 != null) {
                        v(fragment2).m();
                    }
                }
            } else {
                Iterator it2 = c0902a2.f9830c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = ((E.a) it2.next()).f9848b;
                    if (fragment3 != null) {
                        v(fragment3).m();
                    }
                }
            }
        }
        V0(this.f10166u, true);
        for (K k8 : u(arrayList, i8, i9)) {
            k8.r(booleanValue);
            k8.p();
            k8.g();
        }
        while (i8 < i9) {
            C0902a c0902a3 = (C0902a) arrayList.get(i8);
            if (((Boolean) arrayList2.get(i8)).booleanValue() && c0902a3.f10006v >= 0) {
                c0902a3.f10006v = -1;
            }
            c0902a3.y();
            i8++;
        }
        if (z8) {
            g1();
        }
    }

    private int f0(String str, int i8, boolean z7) {
        ArrayList arrayList = this.f10149d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i8 < 0) {
            if (z7) {
                return 0;
            }
            return this.f10149d.size() - 1;
        }
        int size = this.f10149d.size() - 1;
        while (size >= 0) {
            C0902a c0902a = (C0902a) this.f10149d.get(size);
            if ((str != null && str.equals(c0902a.x())) || (i8 >= 0 && i8 == c0902a.f10006v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z7) {
            if (size == this.f10149d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0902a c0902a2 = (C0902a) this.f10149d.get(size - 1);
            if ((str == null || !str.equals(c0902a2.x())) && (i8 < 0 || i8 != c0902a2.f10006v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    private void f1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            if (!((C0902a) arrayList.get(i8)).f9845r) {
                if (i9 != i8) {
                    d0(arrayList, arrayList2, i9, i8);
                }
                i9 = i8 + 1;
                if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                    while (i9 < size && ((Boolean) arrayList2.get(i9)).booleanValue() && !((C0902a) arrayList.get(i9)).f9845r) {
                        i9++;
                    }
                }
                d0(arrayList, arrayList2, i8, i9);
                i8 = i9 - 1;
            }
            i8++;
        }
        if (i9 != size) {
            d0(arrayList, arrayList2, i9, size);
        }
    }

    private void g1() {
        ArrayList arrayList = this.f10158m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        androidx.appcompat.app.E.a(this.f10158m.get(0));
        throw null;
    }

    static int i1(int i8) {
        int i9 = 4097;
        if (i8 == 4097) {
            return 8194;
        }
        if (i8 != 8194) {
            i9 = 8197;
            if (i8 == 8197) {
                return 4100;
            }
            if (i8 == 4099) {
                return 4099;
            }
            if (i8 != 4100) {
                return 0;
            }
        }
        return i9;
    }

    static w j0(View view) {
        AbstractActivityC0911j abstractActivityC0911j;
        Fragment k02 = k0(view);
        if (k02 != null) {
            if (k02.v0()) {
                return k02.y();
            }
            throw new IllegalStateException("The Fragment " + k02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC0911j = null;
                break;
            }
            if (context instanceof AbstractActivityC0911j) {
                abstractActivityC0911j = (AbstractActivityC0911j) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC0911j != null) {
            return abstractActivityC0911j.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private static Fragment k0(View view) {
        while (view != null) {
            Fragment A02 = A0(view);
            if (A02 != null) {
                return A02;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void l0() {
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((K) it.next()).k();
        }
    }

    private boolean m0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f10146a) {
            if (this.f10146a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f10146a.size();
                boolean z7 = false;
                for (int i8 = 0; i8 < size; i8++) {
                    z7 |= ((l) this.f10146a.get(i8)).a(arrayList, arrayList2);
                }
                return z7;
            } finally {
                this.f10146a.clear();
                this.f10167v.g().removeCallbacks(this.f10145R);
            }
        }
    }

    private z o0(Fragment fragment) {
        return this.f10143P.k(fragment);
    }

    private void o1(Fragment fragment) {
        ViewGroup q02 = q0(fragment);
        if (q02 == null || fragment.C() + fragment.Q() + fragment.c0() + fragment.d0() <= 0) {
            return;
        }
        if (q02.getTag(O0.b.f4229c) == null) {
            q02.setTag(O0.b.f4229c, fragment);
        }
        ((Fragment) q02.getTag(O0.b.f4229c)).U1(fragment.b0());
    }

    private void q() {
        if (N0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f9883Y;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f9874P > 0 && this.f10168w.d()) {
            View c8 = this.f10168w.c(fragment.f9874P);
            if (c8 instanceof ViewGroup) {
                return (ViewGroup) c8;
            }
        }
        return null;
    }

    private void q1() {
        Iterator it = this.f10148c.k().iterator();
        while (it.hasNext()) {
            Y0((C) it.next());
        }
    }

    private void r() {
        this.f10147b = false;
        this.f10141N.clear();
        this.f10140M.clear();
    }

    private void r1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new J("FragmentManager"));
        o oVar = this.f10167v;
        if (oVar != null) {
            try {
                oVar.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e8) {
                Log.e("FragmentManager", "Failed dumping state", e8);
                throw runtimeException;
            }
        }
        try {
            W("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e9) {
            Log.e("FragmentManager", "Failed dumping state", e9);
            throw runtimeException;
        }
    }

    private void s() {
        o oVar = this.f10167v;
        if (oVar instanceof androidx.lifecycle.L ? this.f10148c.p().o() : oVar.f() instanceof Activity ? !((Activity) this.f10167v.f()).isChangingConfigurations() : true) {
            Iterator it = this.f10155j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C0904c) it.next()).f10022o.iterator();
                while (it2.hasNext()) {
                    this.f10148c.p().h((String) it2.next());
                }
            }
        }
    }

    private void s1() {
        synchronized (this.f10146a) {
            try {
                if (this.f10146a.isEmpty()) {
                    this.f10153h.j(n0() > 0 && L0(this.f10169x));
                } else {
                    this.f10153h.j(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Set t() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f10148c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C) it.next()).k().f9883Y;
            if (viewGroup != null) {
                hashSet.add(K.o(viewGroup, y0()));
            }
        }
        return hashSet;
    }

    private Set u(ArrayList arrayList, int i8, int i9) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i8 < i9) {
            Iterator it = ((C0902a) arrayList.get(i8)).f9830c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((E.a) it.next()).f9848b;
                if (fragment != null && (viewGroup = fragment.f9883Y) != null) {
                    hashSet.add(K.n(viewGroup, this));
                }
            }
            i8++;
        }
        return hashSet;
    }

    boolean A(MenuItem menuItem) {
        if (this.f10166u < 1) {
            return false;
        }
        for (Fragment fragment : this.f10148c.o()) {
            if (fragment != null && fragment.n1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void B() {
        this.f10136I = false;
        this.f10137J = false;
        this.f10143P.q(false);
        S(1);
    }

    androidx.lifecycle.K B0(Fragment fragment) {
        return this.f10143P.n(fragment);
    }

    boolean C(Menu menu, MenuInflater menuInflater) {
        if (this.f10166u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z7 = false;
        for (Fragment fragment : this.f10148c.o()) {
            if (fragment != null && K0(fragment) && fragment.p1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z7 = true;
            }
        }
        if (this.f10150e != null) {
            for (int i8 = 0; i8 < this.f10150e.size(); i8++) {
                Fragment fragment2 = (Fragment) this.f10150e.get(i8);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.P0();
                }
            }
        }
        this.f10150e = arrayList;
        return z7;
    }

    void C0() {
        a0(true);
        if (this.f10153h.g()) {
            a1();
        } else {
            this.f10152g.k();
        }
    }

    void D() {
        this.f10138K = true;
        a0(true);
        X();
        s();
        S(-1);
        Object obj = this.f10167v;
        if (obj instanceof InterfaceC6280c) {
            ((InterfaceC6280c) obj).removeOnTrimMemoryListener(this.f10162q);
        }
        Object obj2 = this.f10167v;
        if (obj2 instanceof InterfaceC6279b) {
            ((InterfaceC6279b) obj2).removeOnConfigurationChangedListener(this.f10161p);
        }
        Object obj3 = this.f10167v;
        if (obj3 instanceof androidx.core.app.o) {
            ((androidx.core.app.o) obj3).removeOnMultiWindowModeChangedListener(this.f10163r);
        }
        Object obj4 = this.f10167v;
        if (obj4 instanceof androidx.core.app.p) {
            ((androidx.core.app.p) obj4).removeOnPictureInPictureModeChangedListener(this.f10164s);
        }
        Object obj5 = this.f10167v;
        if (obj5 instanceof InterfaceC7056w) {
            ((InterfaceC7056w) obj5).removeMenuProvider(this.f10165t);
        }
        this.f10167v = null;
        this.f10168w = null;
        this.f10169x = null;
        if (this.f10152g != null) {
            this.f10153h.h();
            this.f10152g = null;
        }
        d.c cVar = this.f10131D;
        if (cVar != null) {
            cVar.c();
            this.f10132E.c();
            this.f10133F.c();
        }
    }

    void D0(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f9876R) {
            return;
        }
        fragment.f9876R = true;
        fragment.f9889e0 = true ^ fragment.f9889e0;
        o1(fragment);
    }

    void E() {
        S(1);
    }

    void E0(Fragment fragment) {
        if (fragment.f9861C && H0(fragment)) {
            this.f10135H = true;
        }
    }

    void F(boolean z7) {
        if (z7 && (this.f10167v instanceof InterfaceC6280c)) {
            r1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f10148c.o()) {
            if (fragment != null) {
                fragment.v1();
                if (z7) {
                    fragment.f9871M.F(true);
                }
            }
        }
    }

    public boolean F0() {
        return this.f10138K;
    }

    void G(boolean z7, boolean z8) {
        if (z8 && (this.f10167v instanceof androidx.core.app.o)) {
            r1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f10148c.o()) {
            if (fragment != null) {
                fragment.w1(z7);
                if (z8) {
                    fragment.f9871M.G(z7, true);
                }
            }
        }
    }

    void H(Fragment fragment) {
        Iterator it = this.f10160o.iterator();
        while (it.hasNext()) {
            ((A) it.next()).a(this, fragment);
        }
    }

    void I() {
        for (Fragment fragment : this.f10148c.l()) {
            if (fragment != null) {
                fragment.T0(fragment.w0());
                fragment.f9871M.I();
            }
        }
    }

    boolean J(MenuItem menuItem) {
        if (this.f10166u < 1) {
            return false;
        }
        for (Fragment fragment : this.f10148c.o()) {
            if (fragment != null && fragment.x1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean J0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.w0();
    }

    void K(Menu menu) {
        if (this.f10166u < 1) {
            return;
        }
        for (Fragment fragment : this.f10148c.o()) {
            if (fragment != null) {
                fragment.y1(menu);
            }
        }
    }

    boolean K0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.y0();
    }

    boolean L0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        w wVar = fragment.f9869K;
        return fragment.equals(wVar.x0()) && L0(wVar.f10169x);
    }

    void M() {
        S(5);
    }

    boolean M0(int i8) {
        return this.f10166u >= i8;
    }

    void N(boolean z7, boolean z8) {
        if (z8 && (this.f10167v instanceof androidx.core.app.p)) {
            r1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f10148c.o()) {
            if (fragment != null) {
                fragment.A1(z7);
                if (z8) {
                    fragment.f9871M.N(z7, true);
                }
            }
        }
    }

    public boolean N0() {
        return this.f10136I || this.f10137J;
    }

    boolean O(Menu menu) {
        boolean z7 = false;
        if (this.f10166u < 1) {
            return false;
        }
        for (Fragment fragment : this.f10148c.o()) {
            if (fragment != null && K0(fragment) && fragment.B1(menu)) {
                z7 = true;
            }
        }
        return z7;
    }

    void P() {
        s1();
        L(this.f10170y);
    }

    void Q() {
        this.f10136I = false;
        this.f10137J = false;
        this.f10143P.q(false);
        S(7);
    }

    void R() {
        this.f10136I = false;
        this.f10137J = false;
        this.f10143P.q(false);
        S(5);
    }

    void T() {
        this.f10137J = true;
        this.f10143P.q(true);
        S(4);
    }

    void T0(Fragment fragment, Intent intent, int i8, Bundle bundle) {
        if (this.f10131D == null) {
            this.f10167v.k(fragment, intent, i8, bundle);
            return;
        }
        this.f10134G.addLast(new k(fragment.f9908w, i8));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f10131D.a(intent);
    }

    void U() {
        S(2);
    }

    void U0(Fragment fragment, IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        Intent intent2;
        if (this.f10132E == null) {
            this.f10167v.l(fragment, intentSender, i8, intent, i9, i10, i11, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (G0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        d.g a8 = new g.a(intentSender).b(intent2).c(i10, i9).a();
        this.f10134G.addLast(new k(fragment.f9908w, i8));
        if (G0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f10132E.a(a8);
    }

    void V0(int i8, boolean z7) {
        o oVar;
        if (this.f10167v == null && i8 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z7 || i8 != this.f10166u) {
            this.f10166u = i8;
            this.f10148c.t();
            q1();
            if (this.f10135H && (oVar = this.f10167v) != null && this.f10166u == 7) {
                oVar.m();
                this.f10135H = false;
            }
        }
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f10148c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f10150e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i8 = 0; i8 < size2; i8++) {
                Fragment fragment = (Fragment) this.f10150e.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f10149d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i9 = 0; i9 < size; i9++) {
                C0902a c0902a = (C0902a) this.f10149d.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(c0902a.toString());
                c0902a.s(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f10154i.get());
        synchronized (this.f10146a) {
            try {
                int size3 = this.f10146a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i10 = 0; i10 < size3; i10++) {
                        l lVar = (l) this.f10146a.get(i10);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i10);
                        printWriter.print(": ");
                        printWriter.println(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f10167v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f10168w);
        if (this.f10169x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f10169x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f10166u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f10136I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f10137J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f10138K);
        if (this.f10135H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f10135H);
        }
    }

    void W0() {
        if (this.f10167v == null) {
            return;
        }
        this.f10136I = false;
        this.f10137J = false;
        this.f10143P.q(false);
        for (Fragment fragment : this.f10148c.o()) {
            if (fragment != null) {
                fragment.C0();
            }
        }
    }

    void X0(FragmentContainerView fragmentContainerView) {
        View view;
        for (C c8 : this.f10148c.k()) {
            Fragment k8 = c8.k();
            if (k8.f9874P == fragmentContainerView.getId() && (view = k8.f9884Z) != null && view.getParent() == null) {
                k8.f9883Y = fragmentContainerView;
                c8.b();
            }
        }
    }

    void Y(l lVar, boolean z7) {
        if (!z7) {
            if (this.f10167v == null) {
                if (!this.f10138K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            q();
        }
        synchronized (this.f10146a) {
            try {
                if (this.f10167v == null) {
                    if (!z7) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f10146a.add(lVar);
                    k1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void Y0(C c8) {
        Fragment k8 = c8.k();
        if (k8.f9885a0) {
            if (this.f10147b) {
                this.f10139L = true;
            } else {
                k8.f9885a0 = false;
                c8.m();
            }
        }
    }

    void Z0(int i8, int i9, boolean z7) {
        if (i8 >= 0) {
            Y(new m(null, i8, i9), z7);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i8);
    }

    boolean a0(boolean z7) {
        Z(z7);
        boolean z8 = false;
        while (m0(this.f10140M, this.f10141N)) {
            z8 = true;
            this.f10147b = true;
            try {
                f1(this.f10140M, this.f10141N);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f10148c.b();
        return z8;
    }

    public boolean a1() {
        return c1(null, -1, 0);
    }

    void b0(l lVar, boolean z7) {
        if (z7 && (this.f10167v == null || this.f10138K)) {
            return;
        }
        Z(z7);
        if (lVar.a(this.f10140M, this.f10141N)) {
            this.f10147b = true;
            try {
                f1(this.f10140M, this.f10141N);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f10148c.b();
    }

    public boolean b1(int i8, int i9) {
        if (i8 >= 0) {
            return c1(null, i8, i9);
        }
        throw new IllegalArgumentException("Bad id: " + i8);
    }

    boolean d1(ArrayList arrayList, ArrayList arrayList2, String str, int i8, int i9) {
        int f02 = f0(str, i8, (i9 & 1) != 0);
        if (f02 < 0) {
            return false;
        }
        for (int size = this.f10149d.size() - 1; size >= f02; size--) {
            arrayList.add((C0902a) this.f10149d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    Fragment e0(String str) {
        return this.f10148c.f(str);
    }

    void e1(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f9868J);
        }
        boolean x02 = fragment.x0();
        if (fragment.f9877S && x02) {
            return;
        }
        this.f10148c.u(fragment);
        if (H0(fragment)) {
            this.f10135H = true;
        }
        fragment.f9862D = true;
        o1(fragment);
    }

    public Fragment g0(int i8) {
        return this.f10148c.g(i8);
    }

    public Fragment h0(String str) {
        return this.f10148c.h(str);
    }

    void h1(Parcelable parcelable) {
        C c8;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f10167v.f().getClassLoader());
                this.f10156k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f10167v.f().getClassLoader());
                arrayList.add((B) bundle.getParcelable("state"));
            }
        }
        this.f10148c.x(arrayList);
        y yVar = (y) bundle3.getParcelable("state");
        if (yVar == null) {
            return;
        }
        this.f10148c.v();
        Iterator it = yVar.f10188o.iterator();
        while (it.hasNext()) {
            B B7 = this.f10148c.B((String) it.next(), null);
            if (B7 != null) {
                Fragment j8 = this.f10143P.j(B7.f9808s);
                if (j8 != null) {
                    if (G0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + j8);
                    }
                    c8 = new C(this.f10159n, this.f10148c, j8, B7);
                } else {
                    c8 = new C(this.f10159n, this.f10148c, this.f10167v.f().getClassLoader(), r0(), B7);
                }
                Fragment k8 = c8.k();
                k8.f9869K = this;
                if (G0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k8.f9908w + "): " + k8);
                }
                c8.o(this.f10167v.f().getClassLoader());
                this.f10148c.r(c8);
                c8.t(this.f10166u);
            }
        }
        for (Fragment fragment : this.f10143P.m()) {
            if (!this.f10148c.c(fragment.f9908w)) {
                if (G0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + yVar.f10188o);
                }
                this.f10143P.p(fragment);
                fragment.f9869K = this;
                C c9 = new C(this.f10159n, this.f10148c, fragment);
                c9.t(1);
                c9.m();
                fragment.f9862D = true;
                c9.m();
            }
        }
        this.f10148c.w(yVar.f10189s);
        if (yVar.f10190t != null) {
            this.f10149d = new ArrayList(yVar.f10190t.length);
            int i8 = 0;
            while (true) {
                C0903b[] c0903bArr = yVar.f10190t;
                if (i8 >= c0903bArr.length) {
                    break;
                }
                C0902a b8 = c0903bArr[i8].b(this);
                if (G0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + b8.f10006v + "): " + b8);
                    PrintWriter printWriter = new PrintWriter(new J("FragmentManager"));
                    b8.t("  ", printWriter, false);
                    printWriter.close();
                }
                this.f10149d.add(b8);
                i8++;
            }
        } else {
            this.f10149d = null;
        }
        this.f10154i.set(yVar.f10191u);
        String str3 = yVar.f10192v;
        if (str3 != null) {
            Fragment e02 = e0(str3);
            this.f10170y = e02;
            L(e02);
        }
        ArrayList arrayList2 = yVar.f10193w;
        if (arrayList2 != null) {
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                this.f10155j.put((String) arrayList2.get(i9), (C0904c) yVar.f10194x.get(i9));
            }
        }
        this.f10134G = new ArrayDeque(yVar.f10195y);
    }

    void i(C0902a c0902a) {
        if (this.f10149d == null) {
            this.f10149d = new ArrayList();
        }
        this.f10149d.add(c0902a);
    }

    Fragment i0(String str) {
        return this.f10148c.i(str);
    }

    C j(Fragment fragment) {
        String str = fragment.f9892h0;
        if (str != null) {
            P0.b.f(fragment, str);
        }
        if (G0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C v7 = v(fragment);
        fragment.f9869K = this;
        this.f10148c.r(v7);
        if (!fragment.f9877S) {
            this.f10148c.a(fragment);
            fragment.f9862D = false;
            if (fragment.f9884Z == null) {
                fragment.f9889e0 = false;
            }
            if (H0(fragment)) {
                this.f10135H = true;
            }
        }
        return v7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public Bundle O0() {
        C0903b[] c0903bArr;
        int size;
        Bundle bundle = new Bundle();
        l0();
        X();
        a0(true);
        this.f10136I = true;
        this.f10143P.q(true);
        ArrayList y7 = this.f10148c.y();
        ArrayList m8 = this.f10148c.m();
        if (!m8.isEmpty()) {
            ArrayList z7 = this.f10148c.z();
            ArrayList arrayList = this.f10149d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                c0903bArr = null;
            } else {
                c0903bArr = new C0903b[size];
                for (int i8 = 0; i8 < size; i8++) {
                    c0903bArr[i8] = new C0903b((C0902a) this.f10149d.get(i8));
                    if (G0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i8 + ": " + this.f10149d.get(i8));
                    }
                }
            }
            y yVar = new y();
            yVar.f10188o = y7;
            yVar.f10189s = z7;
            yVar.f10190t = c0903bArr;
            yVar.f10191u = this.f10154i.get();
            Fragment fragment = this.f10170y;
            if (fragment != null) {
                yVar.f10192v = fragment.f9908w;
            }
            yVar.f10193w.addAll(this.f10155j.keySet());
            yVar.f10194x.addAll(this.f10155j.values());
            yVar.f10195y = new ArrayList(this.f10134G);
            bundle.putParcelable("state", yVar);
            for (String str : this.f10156k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f10156k.get(str));
            }
            Iterator it = m8.iterator();
            while (it.hasNext()) {
                B b8 = (B) it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", b8);
                bundle.putBundle("fragment_" + b8.f9808s, bundle2);
            }
        } else if (G0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public void k(A a8) {
        this.f10160o.add(a8);
    }

    void k1() {
        synchronized (this.f10146a) {
            try {
                if (this.f10146a.size() == 1) {
                    this.f10167v.g().removeCallbacks(this.f10145R);
                    this.f10167v.g().post(this.f10145R);
                    s1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    int l() {
        return this.f10154i.getAndIncrement();
    }

    void l1(Fragment fragment, boolean z7) {
        ViewGroup q02 = q0(fragment);
        if (q02 == null || !(q02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) q02).setDrawDisappearingViewsLast(!z7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void m(o oVar, AbstractC0913l abstractC0913l, Fragment fragment) {
        String str;
        if (this.f10167v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f10167v = oVar;
        this.f10168w = abstractC0913l;
        this.f10169x = fragment;
        if (fragment != null) {
            k(new g(fragment));
        } else if (oVar instanceof A) {
            k((A) oVar);
        }
        if (this.f10169x != null) {
            s1();
        }
        if (oVar instanceof androidx.activity.w) {
            androidx.activity.w wVar = (androidx.activity.w) oVar;
            OnBackPressedDispatcher onBackPressedDispatcher = wVar.getOnBackPressedDispatcher();
            this.f10152g = onBackPressedDispatcher;
            InterfaceC0927m interfaceC0927m = wVar;
            if (fragment != null) {
                interfaceC0927m = fragment;
            }
            onBackPressedDispatcher.h(interfaceC0927m, this.f10153h);
        }
        if (fragment != null) {
            this.f10143P = fragment.f9869K.o0(fragment);
        } else if (oVar instanceof androidx.lifecycle.L) {
            this.f10143P = z.l(((androidx.lifecycle.L) oVar).getViewModelStore());
        } else {
            this.f10143P = new z(false);
        }
        this.f10143P.q(N0());
        this.f10148c.A(this.f10143P);
        Object obj = this.f10167v;
        if ((obj instanceof InterfaceC5764d) && fragment == null) {
            androidx.savedstate.a savedStateRegistry = ((InterfaceC5764d) obj).getSavedStateRegistry();
            savedStateRegistry.h("android:support:fragments", new a.c() { // from class: androidx.fragment.app.v
                @Override // androidx.savedstate.a.c
                public final Bundle a() {
                    return this.f10126a.O0();
                }
            });
            Bundle b8 = savedStateRegistry.b("android:support:fragments");
            if (b8 != null) {
                h1(b8);
            }
        }
        Object obj2 = this.f10167v;
        if (obj2 instanceof d.f) {
            d.e activityResultRegistry = ((d.f) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.f9908w + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f10131D = activityResultRegistry.m(str2 + "StartActivityForResult", new e.c(), new h());
            this.f10132E = activityResultRegistry.m(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f10133F = activityResultRegistry.m(str2 + "RequestPermissions", new e.b(), new a());
        }
        Object obj3 = this.f10167v;
        if (obj3 instanceof InterfaceC6279b) {
            ((InterfaceC6279b) obj3).addOnConfigurationChangedListener(this.f10161p);
        }
        Object obj4 = this.f10167v;
        if (obj4 instanceof InterfaceC6280c) {
            ((InterfaceC6280c) obj4).addOnTrimMemoryListener(this.f10162q);
        }
        Object obj5 = this.f10167v;
        if (obj5 instanceof androidx.core.app.o) {
            ((androidx.core.app.o) obj5).addOnMultiWindowModeChangedListener(this.f10163r);
        }
        Object obj6 = this.f10167v;
        if (obj6 instanceof androidx.core.app.p) {
            ((androidx.core.app.p) obj6).addOnPictureInPictureModeChangedListener(this.f10164s);
        }
        Object obj7 = this.f10167v;
        if ((obj7 instanceof InterfaceC7056w) && fragment == null) {
            ((InterfaceC7056w) obj7).addMenuProvider(this.f10165t);
        }
    }

    void m1(Fragment fragment, AbstractC0922h.b bVar) {
        if (fragment.equals(e0(fragment.f9908w)) && (fragment.f9870L == null || fragment.f9869K == this)) {
            fragment.f9893i0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void n(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f9877S) {
            fragment.f9877S = false;
            if (fragment.f9861C) {
                return;
            }
            this.f10148c.a(fragment);
            if (G0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (H0(fragment)) {
                this.f10135H = true;
            }
        }
    }

    public int n0() {
        ArrayList arrayList = this.f10149d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void n1(Fragment fragment) {
        if (fragment == null || (fragment.equals(e0(fragment.f9908w)) && (fragment.f9870L == null || fragment.f9869K == this))) {
            Fragment fragment2 = this.f10170y;
            this.f10170y = fragment;
            L(fragment2);
            L(this.f10170y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public E o() {
        return new C0902a(this);
    }

    boolean p() {
        boolean z7 = false;
        for (Fragment fragment : this.f10148c.l()) {
            if (fragment != null) {
                z7 = H0(fragment);
            }
            if (z7) {
                return true;
            }
        }
        return false;
    }

    AbstractC0913l p0() {
        return this.f10168w;
    }

    void p1(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f9876R) {
            fragment.f9876R = false;
            fragment.f9889e0 = !fragment.f9889e0;
        }
    }

    public n r0() {
        n nVar = this.f10171z;
        if (nVar != null) {
            return nVar;
        }
        Fragment fragment = this.f10169x;
        return fragment != null ? fragment.f9869K.r0() : this.f10128A;
    }

    public List s0() {
        return this.f10148c.o();
    }

    public o t0() {
        return this.f10167v;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f10169x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f10169x)));
            sb.append("}");
        } else {
            o oVar = this.f10167v;
            if (oVar != null) {
                sb.append(oVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f10167v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    LayoutInflater.Factory2 u0() {
        return this.f10151f;
    }

    C v(Fragment fragment) {
        C n8 = this.f10148c.n(fragment.f9908w);
        if (n8 != null) {
            return n8;
        }
        C c8 = new C(this.f10159n, this.f10148c, fragment);
        c8.o(this.f10167v.f().getClassLoader());
        c8.t(this.f10166u);
        return c8;
    }

    q v0() {
        return this.f10159n;
    }

    void w(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f9877S) {
            return;
        }
        fragment.f9877S = true;
        if (fragment.f9861C) {
            if (G0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f10148c.u(fragment);
            if (H0(fragment)) {
                this.f10135H = true;
            }
            o1(fragment);
        }
    }

    Fragment w0() {
        return this.f10169x;
    }

    void x() {
        this.f10136I = false;
        this.f10137J = false;
        this.f10143P.q(false);
        S(4);
    }

    public Fragment x0() {
        return this.f10170y;
    }

    void y() {
        this.f10136I = false;
        this.f10137J = false;
        this.f10143P.q(false);
        S(0);
    }

    L y0() {
        L l8 = this.f10129B;
        if (l8 != null) {
            return l8;
        }
        Fragment fragment = this.f10169x;
        return fragment != null ? fragment.f9869K.y0() : this.f10130C;
    }

    void z(Configuration configuration, boolean z7) {
        if (z7 && (this.f10167v instanceof InterfaceC6279b)) {
            r1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f10148c.o()) {
            if (fragment != null) {
                fragment.m1(configuration);
                if (z7) {
                    fragment.f9871M.z(configuration, true);
                }
            }
        }
    }

    public b.c z0() {
        return this.f10144Q;
    }

    static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        String f10182o;

        /* renamed from: s, reason: collision with root package name */
        int f10183s;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i8) {
                return new k[i8];
            }
        }

        k(String str, int i8) {
            this.f10182o = str;
            this.f10183s = i8;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f10182o);
            parcel.writeInt(this.f10183s);
        }

        k(Parcel parcel) {
            this.f10182o = parcel.readString();
            this.f10183s = parcel.readInt();
        }
    }
}
