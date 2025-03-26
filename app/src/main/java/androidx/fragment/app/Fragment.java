package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.C0928n;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0921g;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.N;
import f1.C5763c;
import f1.InterfaceC5764d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import z0.AbstractC7052u;

/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0927m, androidx.lifecycle.L, InterfaceC0921g, InterfaceC5764d {

    /* renamed from: s0, reason: collision with root package name */
    static final Object f9858s0 = new Object();

    /* renamed from: A, reason: collision with root package name */
    int f9859A;

    /* renamed from: C, reason: collision with root package name */
    boolean f9861C;

    /* renamed from: D, reason: collision with root package name */
    boolean f9862D;

    /* renamed from: E, reason: collision with root package name */
    boolean f9863E;

    /* renamed from: F, reason: collision with root package name */
    boolean f9864F;

    /* renamed from: G, reason: collision with root package name */
    boolean f9865G;

    /* renamed from: H, reason: collision with root package name */
    boolean f9866H;

    /* renamed from: I, reason: collision with root package name */
    boolean f9867I;

    /* renamed from: J, reason: collision with root package name */
    int f9868J;

    /* renamed from: K, reason: collision with root package name */
    w f9869K;

    /* renamed from: L, reason: collision with root package name */
    o f9870L;

    /* renamed from: N, reason: collision with root package name */
    Fragment f9872N;

    /* renamed from: O, reason: collision with root package name */
    int f9873O;

    /* renamed from: P, reason: collision with root package name */
    int f9874P;

    /* renamed from: Q, reason: collision with root package name */
    String f9875Q;

    /* renamed from: R, reason: collision with root package name */
    boolean f9876R;

    /* renamed from: S, reason: collision with root package name */
    boolean f9877S;

    /* renamed from: T, reason: collision with root package name */
    boolean f9878T;

    /* renamed from: U, reason: collision with root package name */
    boolean f9879U;

    /* renamed from: V, reason: collision with root package name */
    boolean f9880V;

    /* renamed from: X, reason: collision with root package name */
    private boolean f9882X;

    /* renamed from: Y, reason: collision with root package name */
    ViewGroup f9883Y;

    /* renamed from: Z, reason: collision with root package name */
    View f9884Z;

    /* renamed from: a0, reason: collision with root package name */
    boolean f9885a0;

    /* renamed from: c0, reason: collision with root package name */
    f f9887c0;

    /* renamed from: e0, reason: collision with root package name */
    boolean f9889e0;

    /* renamed from: f0, reason: collision with root package name */
    LayoutInflater f9890f0;

    /* renamed from: g0, reason: collision with root package name */
    boolean f9891g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f9892h0;

    /* renamed from: j0, reason: collision with root package name */
    C0928n f9894j0;

    /* renamed from: k0, reason: collision with root package name */
    I f9895k0;

    /* renamed from: m0, reason: collision with root package name */
    H.b f9897m0;

    /* renamed from: n0, reason: collision with root package name */
    C5763c f9898n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f9900o0;

    /* renamed from: s, reason: collision with root package name */
    Bundle f9904s;

    /* renamed from: t, reason: collision with root package name */
    SparseArray f9905t;

    /* renamed from: u, reason: collision with root package name */
    Bundle f9906u;

    /* renamed from: v, reason: collision with root package name */
    Boolean f9907v;

    /* renamed from: x, reason: collision with root package name */
    Bundle f9909x;

    /* renamed from: y, reason: collision with root package name */
    Fragment f9910y;

    /* renamed from: o, reason: collision with root package name */
    int f9899o = -1;

    /* renamed from: w, reason: collision with root package name */
    String f9908w = UUID.randomUUID().toString();

    /* renamed from: z, reason: collision with root package name */
    String f9911z = null;

    /* renamed from: B, reason: collision with root package name */
    private Boolean f9860B = null;

    /* renamed from: M, reason: collision with root package name */
    w f9871M = new x();

    /* renamed from: W, reason: collision with root package name */
    boolean f9881W = true;

    /* renamed from: b0, reason: collision with root package name */
    boolean f9886b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    Runnable f9888d0 = new a();

    /* renamed from: i0, reason: collision with root package name */
    AbstractC0922h.b f9893i0 = AbstractC0922h.b.RESUMED;

    /* renamed from: l0, reason: collision with root package name */
    androidx.lifecycle.r f9896l0 = new androidx.lifecycle.r();

    /* renamed from: p0, reason: collision with root package name */
    private final AtomicInteger f9901p0 = new AtomicInteger();

    /* renamed from: q0, reason: collision with root package name */
    private final ArrayList f9902q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    private final h f9903r0 = new b();

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.c2();
        }
    }

    class b extends h {
        b() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.h
        void a() {
            Fragment.this.f9898n0.c();
            androidx.lifecycle.A.c(Fragment.this);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.j(false);
        }
    }

    class d implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ K f9916o;

        d(K k8) {
            this.f9916o = k8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9916o.g();
        }
    }

    class e extends AbstractC0913l {
        e() {
        }

        @Override // androidx.fragment.app.AbstractC0913l
        public View c(int i8) {
            View view = Fragment.this.f9884Z;
            if (view != null) {
                return view.findViewById(i8);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0913l
        public boolean d() {
            return Fragment.this.f9884Z != null;
        }
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        View f9919a;

        /* renamed from: b, reason: collision with root package name */
        boolean f9920b;

        /* renamed from: c, reason: collision with root package name */
        int f9921c;

        /* renamed from: d, reason: collision with root package name */
        int f9922d;

        /* renamed from: e, reason: collision with root package name */
        int f9923e;

        /* renamed from: f, reason: collision with root package name */
        int f9924f;

        /* renamed from: g, reason: collision with root package name */
        int f9925g;

        /* renamed from: h, reason: collision with root package name */
        ArrayList f9926h;

        /* renamed from: i, reason: collision with root package name */
        ArrayList f9927i;

        /* renamed from: j, reason: collision with root package name */
        Object f9928j = null;

        /* renamed from: k, reason: collision with root package name */
        Object f9929k;

        /* renamed from: l, reason: collision with root package name */
        Object f9930l;

        /* renamed from: m, reason: collision with root package name */
        Object f9931m;

        /* renamed from: n, reason: collision with root package name */
        Object f9932n;

        /* renamed from: o, reason: collision with root package name */
        Object f9933o;

        /* renamed from: p, reason: collision with root package name */
        Boolean f9934p;

        /* renamed from: q, reason: collision with root package name */
        Boolean f9935q;

        /* renamed from: r, reason: collision with root package name */
        float f9936r;

        /* renamed from: s, reason: collision with root package name */
        View f9937s;

        /* renamed from: t, reason: collision with root package name */
        boolean f9938t;

        f() {
            Object obj = Fragment.f9858s0;
            this.f9929k = obj;
            this.f9930l = null;
            this.f9931m = obj;
            this.f9932n = null;
            this.f9933o = obj;
            this.f9936r = 1.0f;
            this.f9937s = null;
        }
    }

    static class g {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    private static abstract class h {
        private h() {
        }

        abstract void a();

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    public Fragment() {
        s0();
    }

    private void I1(h hVar) {
        if (this.f9899o >= 0) {
            hVar.a();
        } else {
            this.f9902q0.add(hVar);
        }
    }

    private void O1() {
        if (w.G0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f9884Z != null) {
            P1(this.f9904s);
        }
        this.f9904s = null;
    }

    private int X() {
        AbstractC0922h.b bVar = this.f9893i0;
        return (bVar == AbstractC0922h.b.INITIALIZED || this.f9872N == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f9872N.X());
    }

    private f n() {
        if (this.f9887c0 == null) {
            this.f9887c0 = new f();
        }
        return this.f9887c0;
    }

    private Fragment p0(boolean z7) {
        String str;
        if (z7) {
            P0.b.h(this);
        }
        Fragment fragment = this.f9910y;
        if (fragment != null) {
            return fragment;
        }
        w wVar = this.f9869K;
        if (wVar == null || (str = this.f9911z) == null) {
            return null;
        }
        return wVar.e0(str);
    }

    private void s0() {
        this.f9894j0 = new C0928n(this);
        this.f9898n0 = C5763c.a(this);
        this.f9897m0 = null;
        if (this.f9902q0.contains(this.f9903r0)) {
            return;
        }
        I1(this.f9903r0);
    }

    public static Fragment u0(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) n.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.R1(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e8) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (java.lang.InstantiationException e9) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e9);
        } catch (NoSuchMethodException e10) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e10);
        } catch (InvocationTargetException e11) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e11);
        }
    }

    public final boolean A0() {
        return this.f9862D;
    }

    void A1(boolean z7) {
        a1(z7);
    }

    public Context B() {
        o oVar = this.f9870L;
        if (oVar == null) {
            return null;
        }
        return oVar.f();
    }

    public final boolean B0() {
        w wVar = this.f9869K;
        if (wVar == null) {
            return false;
        }
        return wVar.N0();
    }

    boolean B1(Menu menu) {
        boolean z7 = false;
        if (this.f9876R) {
            return false;
        }
        if (this.f9880V && this.f9881W) {
            b1(menu);
            z7 = true;
        }
        return z7 | this.f9871M.O(menu);
    }

    int C() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return 0;
        }
        return fVar.f9921c;
    }

    void C0() {
        this.f9871M.W0();
    }

    void C1() {
        boolean L02 = this.f9869K.L0(this);
        Boolean bool = this.f9860B;
        if (bool == null || bool.booleanValue() != L02) {
            this.f9860B = Boolean.valueOf(L02);
            c1(L02);
            this.f9871M.P();
        }
    }

    public void D0(Bundle bundle) {
        this.f9882X = true;
    }

    void D1() {
        this.f9871M.W0();
        this.f9871M.a0(true);
        this.f9899o = 7;
        this.f9882X = false;
        e1();
        if (!this.f9882X) {
            throw new M("Fragment " + this + " did not call through to super.onResume()");
        }
        C0928n c0928n = this.f9894j0;
        AbstractC0922h.a aVar = AbstractC0922h.a.ON_RESUME;
        c0928n.h(aVar);
        if (this.f9884Z != null) {
            this.f9895k0.a(aVar);
        }
        this.f9871M.Q();
    }

    public void E0(int i8, int i9, Intent intent) {
        if (w.G0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i8 + " resultCode: " + i9 + " data: " + intent);
        }
    }

    void E1(Bundle bundle) {
        f1(bundle);
        this.f9898n0.e(bundle);
        Bundle O02 = this.f9871M.O0();
        if (O02 != null) {
            bundle.putParcelable("android:support:fragments", O02);
        }
    }

    public void F0(Activity activity) {
        this.f9882X = true;
    }

    void F1() {
        this.f9871M.W0();
        this.f9871M.a0(true);
        this.f9899o = 5;
        this.f9882X = false;
        g1();
        if (!this.f9882X) {
            throw new M("Fragment " + this + " did not call through to super.onStart()");
        }
        C0928n c0928n = this.f9894j0;
        AbstractC0922h.a aVar = AbstractC0922h.a.ON_START;
        c0928n.h(aVar);
        if (this.f9884Z != null) {
            this.f9895k0.a(aVar);
        }
        this.f9871M.R();
    }

    public void G0(Context context) {
        this.f9882X = true;
        o oVar = this.f9870L;
        Activity e8 = oVar == null ? null : oVar.e();
        if (e8 != null) {
            this.f9882X = false;
            F0(e8);
        }
    }

    void G1() {
        this.f9871M.T();
        if (this.f9884Z != null) {
            this.f9895k0.a(AbstractC0922h.a.ON_STOP);
        }
        this.f9894j0.h(AbstractC0922h.a.ON_STOP);
        this.f9899o = 4;
        this.f9882X = false;
        h1();
        if (this.f9882X) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onStop()");
    }

    public void H0(Fragment fragment) {
    }

    void H1() {
        i1(this.f9884Z, this.f9904s);
        this.f9871M.U();
    }

    public Object I() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return null;
        }
        return fVar.f9928j;
    }

    public boolean I0(MenuItem menuItem) {
        return false;
    }

    public void J0(Bundle bundle) {
        this.f9882X = true;
        N1(bundle);
        if (this.f9871M.M0(1)) {
            return;
        }
        this.f9871M.B();
    }

    public final AbstractActivityC0911j J1() {
        AbstractActivityC0911j p8 = p();
        if (p8 != null) {
            return p8;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public Animation K0(int i8, boolean z7, int i9) {
        return null;
    }

    public final Bundle K1() {
        Bundle x7 = x();
        if (x7 != null) {
            return x7;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public Animator L0(int i8, boolean z7, int i9) {
        return null;
    }

    public final Context L1() {
        Context B7 = B();
        if (B7 != null) {
            return B7;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void M0(Menu menu, MenuInflater menuInflater) {
    }

    public final View M1() {
        View q02 = q0();
        if (q02 != null) {
            return q02;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8 = this.f9900o0;
        if (i8 != 0) {
            return layoutInflater.inflate(i8, viewGroup, false);
        }
        return null;
    }

    void N1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f9871M.h1(parcelable);
        this.f9871M.B();
    }

    public void O0() {
        this.f9882X = true;
    }

    androidx.core.app.s P() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return null;
        }
        fVar.getClass();
        return null;
    }

    public void P0() {
    }

    final void P1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f9905t;
        if (sparseArray != null) {
            this.f9884Z.restoreHierarchyState(sparseArray);
            this.f9905t = null;
        }
        if (this.f9884Z != null) {
            this.f9895k0.d(this.f9906u);
            this.f9906u = null;
        }
        this.f9882X = false;
        j1(bundle);
        if (this.f9882X) {
            if (this.f9884Z != null) {
                this.f9895k0.a(AbstractC0922h.a.ON_CREATE);
            }
        } else {
            throw new M("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    int Q() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return 0;
        }
        return fVar.f9922d;
    }

    public void Q0() {
        this.f9882X = true;
    }

    void Q1(int i8, int i9, int i10, int i11) {
        if (this.f9887c0 == null && i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) {
            return;
        }
        n().f9921c = i8;
        n().f9922d = i9;
        n().f9923e = i10;
        n().f9924f = i11;
    }

    public Object R() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return null;
        }
        return fVar.f9930l;
    }

    public void R0() {
        this.f9882X = true;
    }

    public void R1(Bundle bundle) {
        if (this.f9869K != null && B0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f9909x = bundle;
    }

    androidx.core.app.s S() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return null;
        }
        fVar.getClass();
        return null;
    }

    public LayoutInflater S0(Bundle bundle) {
        return W(bundle);
    }

    void S1(View view) {
        n().f9937s = view;
    }

    View T() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return null;
        }
        return fVar.f9937s;
    }

    public void T0(boolean z7) {
    }

    void T1(int i8) {
        if (this.f9887c0 == null && i8 == 0) {
            return;
        }
        n();
        this.f9887c0.f9925g = i8;
    }

    public final Object U() {
        o oVar = this.f9870L;
        if (oVar == null) {
            return null;
        }
        return oVar.i();
    }

    public void U0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f9882X = true;
    }

    void U1(boolean z7) {
        if (this.f9887c0 == null) {
            return;
        }
        n().f9920b = z7;
    }

    public final LayoutInflater V() {
        LayoutInflater layoutInflater = this.f9890f0;
        return layoutInflater == null ? u1(null) : layoutInflater;
    }

    public void V0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f9882X = true;
        o oVar = this.f9870L;
        Activity e8 = oVar == null ? null : oVar.e();
        if (e8 != null) {
            this.f9882X = false;
            U0(e8, attributeSet, bundle);
        }
    }

    void V1(float f8) {
        n().f9936r = f8;
    }

    public LayoutInflater W(Bundle bundle) {
        o oVar = this.f9870L;
        if (oVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater j8 = oVar.j();
        AbstractC7052u.a(j8, this.f9871M.u0());
        return j8;
    }

    public void W0(boolean z7) {
    }

    void W1(ArrayList arrayList, ArrayList arrayList2) {
        n();
        f fVar = this.f9887c0;
        fVar.f9926h = arrayList;
        fVar.f9927i = arrayList2;
    }

    public boolean X0(MenuItem menuItem) {
        return false;
    }

    public void X1(Fragment fragment, int i8) {
        if (fragment != null) {
            P0.b.i(this, fragment, i8);
        }
        w wVar = this.f9869K;
        w wVar2 = fragment != null ? fragment.f9869K : null;
        if (wVar != null && wVar2 != null && wVar != wVar2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.p0(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.f9911z = null;
            this.f9910y = null;
        } else if (this.f9869K == null || fragment.f9869K == null) {
            this.f9911z = null;
            this.f9910y = fragment;
        } else {
            this.f9911z = fragment.f9908w;
            this.f9910y = null;
        }
        this.f9859A = i8;
    }

    int Y() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return 0;
        }
        return fVar.f9925g;
    }

    public void Y0(Menu menu) {
    }

    public void Y1(Intent intent) {
        Z1(intent, null);
    }

    public final Fragment Z() {
        return this.f9872N;
    }

    public void Z0() {
        this.f9882X = true;
    }

    public void Z1(Intent intent, Bundle bundle) {
        o oVar = this.f9870L;
        if (oVar != null) {
            oVar.k(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final w a0() {
        w wVar = this.f9869K;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void a1(boolean z7) {
    }

    public void a2(Intent intent, int i8, Bundle bundle) {
        if (this.f9870L != null) {
            a0().T0(this, intent, i8, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    boolean b0() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return false;
        }
        return fVar.f9920b;
    }

    public void b1(Menu menu) {
    }

    public void b2(IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        if (this.f9870L == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (w.G0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i8 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        a0().U0(this, intentSender, i8, intent, i9, i10, i11, bundle);
    }

    int c0() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return 0;
        }
        return fVar.f9923e;
    }

    public void c1(boolean z7) {
    }

    public void c2() {
        if (this.f9887c0 == null || !n().f9938t) {
            return;
        }
        if (this.f9870L == null) {
            n().f9938t = false;
        } else if (Looper.myLooper() != this.f9870L.g().getLooper()) {
            this.f9870L.g().postAtFrontOfQueue(new c());
        } else {
            j(true);
        }
    }

    int d0() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return 0;
        }
        return fVar.f9924f;
    }

    public void d1(int i8, String[] strArr, int[] iArr) {
    }

    float e0() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return 1.0f;
        }
        return fVar.f9936r;
    }

    public void e1() {
        this.f9882X = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Object f0() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.f9931m;
        return obj == f9858s0 ? R() : obj;
    }

    public void f1(Bundle bundle) {
    }

    public final Resources g0() {
        return L1().getResources();
    }

    public void g1() {
        this.f9882X = true;
    }

    @Override // androidx.lifecycle.InterfaceC0921g
    public T0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = L1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && w.G0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + L1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        T0.d dVar = new T0.d();
        if (application != null) {
            dVar.c(H.a.f10239g, application);
        }
        dVar.c(androidx.lifecycle.A.f10204a, this);
        dVar.c(androidx.lifecycle.A.f10205b, this);
        if (x() != null) {
            dVar.c(androidx.lifecycle.A.f10206c, x());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.InterfaceC0927m
    public AbstractC0922h getLifecycle() {
        return this.f9894j0;
    }

    @Override // f1.InterfaceC5764d
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.f9898n0.b();
    }

    @Override // androidx.lifecycle.L
    public androidx.lifecycle.K getViewModelStore() {
        if (this.f9869K == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (X() != AbstractC0922h.b.INITIALIZED.ordinal()) {
            return this.f9869K.B0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public Object h0() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.f9929k;
        return obj == f9858s0 ? I() : obj;
    }

    public void h1() {
        this.f9882X = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public Object i0() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return null;
        }
        return fVar.f9932n;
    }

    public void i1(View view, Bundle bundle) {
    }

    void j(boolean z7) {
        ViewGroup viewGroup;
        w wVar;
        f fVar = this.f9887c0;
        if (fVar != null) {
            fVar.f9938t = false;
        }
        if (this.f9884Z == null || (viewGroup = this.f9883Y) == null || (wVar = this.f9869K) == null) {
            return;
        }
        K n8 = K.n(viewGroup, wVar);
        n8.p();
        if (z7) {
            this.f9870L.g().post(new d(n8));
        } else {
            n8.g();
        }
    }

    public Object j0() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.f9933o;
        return obj == f9858s0 ? i0() : obj;
    }

    public void j1(Bundle bundle) {
        this.f9882X = true;
    }

    AbstractC0913l k() {
        return new e();
    }

    ArrayList k0() {
        ArrayList arrayList;
        f fVar = this.f9887c0;
        return (fVar == null || (arrayList = fVar.f9926h) == null) ? new ArrayList() : arrayList;
    }

    void k1(Bundle bundle) {
        this.f9871M.W0();
        this.f9899o = 3;
        this.f9882X = false;
        D0(bundle);
        if (this.f9882X) {
            O1();
            this.f9871M.x();
        } else {
            throw new M("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f9873O));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f9874P));
        printWriter.print(" mTag=");
        printWriter.println(this.f9875Q);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f9899o);
        printWriter.print(" mWho=");
        printWriter.print(this.f9908w);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f9868J);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f9861C);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f9862D);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f9864F);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f9865G);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f9876R);
        printWriter.print(" mDetached=");
        printWriter.print(this.f9877S);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f9881W);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f9880V);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f9878T);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f9886b0);
        if (this.f9869K != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f9869K);
        }
        if (this.f9870L != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f9870L);
        }
        if (this.f9872N != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f9872N);
        }
        if (this.f9909x != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f9909x);
        }
        if (this.f9904s != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f9904s);
        }
        if (this.f9905t != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f9905t);
        }
        if (this.f9906u != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f9906u);
        }
        Fragment p02 = p0(false);
        if (p02 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(p02);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f9859A);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(b0());
        if (C() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(C());
        }
        if (Q() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(Q());
        }
        if (c0() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(c0());
        }
        if (d0() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(d0());
        }
        if (this.f9883Y != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f9883Y);
        }
        if (this.f9884Z != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f9884Z);
        }
        if (w() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(w());
        }
        if (B() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f9871M + ":");
        this.f9871M.W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    ArrayList l0() {
        ArrayList arrayList;
        f fVar = this.f9887c0;
        return (fVar == null || (arrayList = fVar.f9927i) == null) ? new ArrayList() : arrayList;
    }

    void l1() {
        Iterator it = this.f9902q0.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a();
        }
        this.f9902q0.clear();
        this.f9871M.m(this.f9870L, k(), this);
        this.f9899o = 0;
        this.f9882X = false;
        G0(this.f9870L.f());
        if (this.f9882X) {
            this.f9869K.H(this);
            this.f9871M.y();
        } else {
            throw new M("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public final String m0(int i8) {
        return g0().getString(i8);
    }

    void m1(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public final String n0(int i8, Object... objArr) {
        return g0().getString(i8, objArr);
    }

    boolean n1(MenuItem menuItem) {
        if (this.f9876R) {
            return false;
        }
        if (I0(menuItem)) {
            return true;
        }
        return this.f9871M.A(menuItem);
    }

    Fragment o(String str) {
        return str.equals(this.f9908w) ? this : this.f9871M.i0(str);
    }

    public final Fragment o0() {
        return p0(true);
    }

    void o1(Bundle bundle) {
        this.f9871M.W0();
        this.f9899o = 1;
        this.f9882X = false;
        this.f9894j0.a(new InterfaceC0925k() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.InterfaceC0925k
            public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
                View view;
                if (aVar != AbstractC0922h.a.ON_STOP || (view = Fragment.this.f9884Z) == null) {
                    return;
                }
                g.a(view);
            }
        });
        this.f9898n0.d(bundle);
        J0(bundle);
        this.f9891g0 = true;
        if (this.f9882X) {
            this.f9894j0.h(AbstractC0922h.a.ON_CREATE);
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onCreate()");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f9882X = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        J1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f9882X = true;
    }

    public final AbstractActivityC0911j p() {
        o oVar = this.f9870L;
        if (oVar == null) {
            return null;
        }
        return (AbstractActivityC0911j) oVar.e();
    }

    boolean p1(Menu menu, MenuInflater menuInflater) {
        boolean z7 = false;
        if (this.f9876R) {
            return false;
        }
        if (this.f9880V && this.f9881W) {
            M0(menu, menuInflater);
            z7 = true;
        }
        return z7 | this.f9871M.C(menu, menuInflater);
    }

    public boolean q() {
        Boolean bool;
        f fVar = this.f9887c0;
        if (fVar == null || (bool = fVar.f9935q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View q0() {
        return this.f9884Z;
    }

    void q1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9871M.W0();
        this.f9867I = true;
        this.f9895k0 = new I(this, getViewModelStore());
        View N02 = N0(layoutInflater, viewGroup, bundle);
        this.f9884Z = N02;
        if (N02 == null) {
            if (this.f9895k0.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f9895k0 = null;
        } else {
            this.f9895k0.b();
            androidx.lifecycle.M.a(this.f9884Z, this.f9895k0);
            N.a(this.f9884Z, this.f9895k0);
            f1.e.a(this.f9884Z, this.f9895k0);
            this.f9896l0.j(this.f9895k0);
        }
    }

    public LiveData r0() {
        return this.f9896l0;
    }

    void r1() {
        this.f9871M.D();
        this.f9894j0.h(AbstractC0922h.a.ON_DESTROY);
        this.f9899o = 0;
        this.f9882X = false;
        this.f9891g0 = false;
        O0();
        if (this.f9882X) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void s1() {
        this.f9871M.E();
        if (this.f9884Z != null && this.f9895k0.getLifecycle().b().c(AbstractC0922h.b.CREATED)) {
            this.f9895k0.a(AbstractC0922h.a.ON_DESTROY);
        }
        this.f9899o = 1;
        this.f9882X = false;
        Q0();
        if (this.f9882X) {
            androidx.loader.app.a.b(this).c();
            this.f9867I = false;
        } else {
            throw new M("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public void startActivityForResult(Intent intent, int i8) {
        a2(intent, i8, null);
    }

    void t0() {
        s0();
        this.f9892h0 = this.f9908w;
        this.f9908w = UUID.randomUUID().toString();
        this.f9861C = false;
        this.f9862D = false;
        this.f9864F = false;
        this.f9865G = false;
        this.f9866H = false;
        this.f9868J = 0;
        this.f9869K = null;
        this.f9871M = new x();
        this.f9870L = null;
        this.f9873O = 0;
        this.f9874P = 0;
        this.f9875Q = null;
        this.f9876R = false;
        this.f9877S = false;
    }

    void t1() {
        this.f9899o = -1;
        this.f9882X = false;
        R0();
        this.f9890f0 = null;
        if (this.f9882X) {
            if (this.f9871M.F0()) {
                return;
            }
            this.f9871M.D();
            this.f9871M = new x();
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onDetach()");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f9908w);
        if (this.f9873O != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f9873O));
        }
        if (this.f9875Q != null) {
            sb.append(" tag=");
            sb.append(this.f9875Q);
        }
        sb.append(")");
        return sb.toString();
    }

    public boolean u() {
        Boolean bool;
        f fVar = this.f9887c0;
        if (fVar == null || (bool = fVar.f9934p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    LayoutInflater u1(Bundle bundle) {
        LayoutInflater S02 = S0(bundle);
        this.f9890f0 = S02;
        return S02;
    }

    public final boolean v0() {
        return this.f9870L != null && this.f9861C;
    }

    void v1() {
        onLowMemory();
    }

    View w() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return null;
        }
        return fVar.f9919a;
    }

    public final boolean w0() {
        w wVar;
        return this.f9876R || ((wVar = this.f9869K) != null && wVar.J0(this.f9872N));
    }

    void w1(boolean z7) {
        W0(z7);
    }

    public final Bundle x() {
        return this.f9909x;
    }

    final boolean x0() {
        return this.f9868J > 0;
    }

    boolean x1(MenuItem menuItem) {
        if (this.f9876R) {
            return false;
        }
        if (this.f9880V && this.f9881W && X0(menuItem)) {
            return true;
        }
        return this.f9871M.J(menuItem);
    }

    public final w y() {
        if (this.f9870L != null) {
            return this.f9871M;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final boolean y0() {
        w wVar;
        return this.f9881W && ((wVar = this.f9869K) == null || wVar.K0(this.f9872N));
    }

    void y1(Menu menu) {
        if (this.f9876R) {
            return;
        }
        if (this.f9880V && this.f9881W) {
            Y0(menu);
        }
        this.f9871M.K(menu);
    }

    boolean z0() {
        f fVar = this.f9887c0;
        if (fVar == null) {
            return false;
        }
        return fVar.f9938t;
    }

    void z1() {
        this.f9871M.M();
        if (this.f9884Z != null) {
            this.f9895k0.a(AbstractC0922h.a.ON_PAUSE);
        }
        this.f9894j0.h(AbstractC0922h.a.ON_PAUSE);
        this.f9899o = 6;
        this.f9882X = false;
        Z0();
        if (this.f9882X) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onPause()");
    }
}
