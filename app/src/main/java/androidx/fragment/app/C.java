package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.K;
import androidx.lifecycle.AbstractC0922h;
import z0.X;

/* loaded from: classes.dex */
class C {

    /* renamed from: a, reason: collision with root package name */
    private final q f9816a;

    /* renamed from: b, reason: collision with root package name */
    private final D f9817b;

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f9818c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9819d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f9820e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f9821o;

        a(View view) {
            this.f9821o = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f9821o.removeOnAttachStateChangeListener(this);
            X.k0(this.f9821o);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9823a;

        static {
            int[] iArr = new int[AbstractC0922h.b.values().length];
            f9823a = iArr;
            try {
                iArr[AbstractC0922h.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9823a[AbstractC0922h.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9823a[AbstractC0922h.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9823a[AbstractC0922h.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    C(q qVar, D d8, Fragment fragment) {
        this.f9816a = qVar;
        this.f9817b = d8;
        this.f9818c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f9818c.f9884Z) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f9818c.f9884Z) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f9818c.E1(bundle);
        this.f9816a.j(this.f9818c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f9818c.f9884Z != null) {
            s();
        }
        if (this.f9818c.f9905t != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f9818c.f9905t);
        }
        if (this.f9818c.f9906u != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f9818c.f9906u);
        }
        if (!this.f9818c.f9886b0) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f9818c.f9886b0);
        }
        return bundle;
    }

    void a() {
        if (w.G0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f9818c);
        }
        Fragment fragment = this.f9818c;
        fragment.k1(fragment.f9904s);
        q qVar = this.f9816a;
        Fragment fragment2 = this.f9818c;
        qVar.a(fragment2, fragment2.f9904s, false);
    }

    void b() {
        int j8 = this.f9817b.j(this.f9818c);
        Fragment fragment = this.f9818c;
        fragment.f9883Y.addView(fragment.f9884Z, j8);
    }

    void c() {
        if (w.G0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f9818c);
        }
        Fragment fragment = this.f9818c;
        Fragment fragment2 = fragment.f9910y;
        C c8 = null;
        if (fragment2 != null) {
            C n8 = this.f9817b.n(fragment2.f9908w);
            if (n8 == null) {
                throw new IllegalStateException("Fragment " + this.f9818c + " declared target fragment " + this.f9818c.f9910y + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f9818c;
            fragment3.f9911z = fragment3.f9910y.f9908w;
            fragment3.f9910y = null;
            c8 = n8;
        } else {
            String str = fragment.f9911z;
            if (str != null && (c8 = this.f9817b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f9818c + " declared target fragment " + this.f9818c.f9911z + " that does not belong to this FragmentManager!");
            }
        }
        if (c8 != null) {
            c8.m();
        }
        Fragment fragment4 = this.f9818c;
        fragment4.f9870L = fragment4.f9869K.t0();
        Fragment fragment5 = this.f9818c;
        fragment5.f9872N = fragment5.f9869K.w0();
        this.f9816a.g(this.f9818c, false);
        this.f9818c.l1();
        this.f9816a.b(this.f9818c, false);
    }

    int d() {
        Fragment fragment = this.f9818c;
        if (fragment.f9869K == null) {
            return fragment.f9899o;
        }
        int i8 = this.f9820e;
        int i9 = b.f9823a[fragment.f9893i0.ordinal()];
        if (i9 != 1) {
            i8 = i9 != 2 ? i9 != 3 ? i9 != 4 ? Math.min(i8, -1) : Math.min(i8, 0) : Math.min(i8, 1) : Math.min(i8, 5);
        }
        Fragment fragment2 = this.f9818c;
        if (fragment2.f9864F) {
            if (fragment2.f9865G) {
                i8 = Math.max(this.f9820e, 2);
                View view = this.f9818c.f9884Z;
                if (view != null && view.getParent() == null) {
                    i8 = Math.min(i8, 2);
                }
            } else {
                i8 = this.f9820e < 4 ? Math.min(i8, fragment2.f9899o) : Math.min(i8, 1);
            }
        }
        if (!this.f9818c.f9861C) {
            i8 = Math.min(i8, 1);
        }
        Fragment fragment3 = this.f9818c;
        ViewGroup viewGroup = fragment3.f9883Y;
        K.e.b l8 = viewGroup != null ? K.n(viewGroup, fragment3.a0()).l(this) : null;
        if (l8 == K.e.b.ADDING) {
            i8 = Math.min(i8, 6);
        } else if (l8 == K.e.b.REMOVING) {
            i8 = Math.max(i8, 3);
        } else {
            Fragment fragment4 = this.f9818c;
            if (fragment4.f9862D) {
                i8 = fragment4.x0() ? Math.min(i8, 1) : Math.min(i8, -1);
            }
        }
        Fragment fragment5 = this.f9818c;
        if (fragment5.f9885a0 && fragment5.f9899o < 5) {
            i8 = Math.min(i8, 4);
        }
        if (w.G0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i8 + " for " + this.f9818c);
        }
        return i8;
    }

    void e() {
        if (w.G0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f9818c);
        }
        Fragment fragment = this.f9818c;
        if (fragment.f9891g0) {
            fragment.N1(fragment.f9904s);
            this.f9818c.f9899o = 1;
            return;
        }
        this.f9816a.h(fragment, fragment.f9904s, false);
        Fragment fragment2 = this.f9818c;
        fragment2.o1(fragment2.f9904s);
        q qVar = this.f9816a;
        Fragment fragment3 = this.f9818c;
        qVar.c(fragment3, fragment3.f9904s, false);
    }

    void f() {
        String str;
        if (this.f9818c.f9864F) {
            return;
        }
        if (w.G0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f9818c);
        }
        Fragment fragment = this.f9818c;
        LayoutInflater u12 = fragment.u1(fragment.f9904s);
        Fragment fragment2 = this.f9818c;
        ViewGroup viewGroup = fragment2.f9883Y;
        if (viewGroup == null) {
            int i8 = fragment2.f9874P;
            if (i8 == 0) {
                viewGroup = null;
            } else {
                if (i8 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f9818c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.f9869K.p0().c(this.f9818c.f9874P);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f9818c;
                    if (!fragment3.f9866H) {
                        try {
                            str = fragment3.g0().getResourceName(this.f9818c.f9874P);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f9818c.f9874P) + " (" + str + ") for fragment " + this.f9818c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    P0.b.j(this.f9818c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f9818c;
        fragment4.f9883Y = viewGroup;
        fragment4.q1(u12, viewGroup, fragment4.f9904s);
        View view = this.f9818c.f9884Z;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f9818c;
            fragment5.f9884Z.setTag(O0.b.f4227a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f9818c;
            if (fragment6.f9876R) {
                fragment6.f9884Z.setVisibility(8);
            }
            if (X.Q(this.f9818c.f9884Z)) {
                X.k0(this.f9818c.f9884Z);
            } else {
                View view2 = this.f9818c.f9884Z;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f9818c.H1();
            q qVar = this.f9816a;
            Fragment fragment7 = this.f9818c;
            qVar.m(fragment7, fragment7.f9884Z, fragment7.f9904s, false);
            int visibility = this.f9818c.f9884Z.getVisibility();
            this.f9818c.V1(this.f9818c.f9884Z.getAlpha());
            Fragment fragment8 = this.f9818c;
            if (fragment8.f9883Y != null && visibility == 0) {
                View findFocus = fragment8.f9884Z.findFocus();
                if (findFocus != null) {
                    this.f9818c.S1(findFocus);
                    if (w.G0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f9818c);
                    }
                }
                this.f9818c.f9884Z.setAlpha(0.0f);
            }
        }
        this.f9818c.f9899o = 2;
    }

    void g() {
        Fragment f8;
        if (w.G0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f9818c);
        }
        Fragment fragment = this.f9818c;
        boolean z7 = true;
        boolean z8 = fragment.f9862D && !fragment.x0();
        if (z8) {
            Fragment fragment2 = this.f9818c;
            if (!fragment2.f9863E) {
                this.f9817b.B(fragment2.f9908w, null);
            }
        }
        if (!z8 && !this.f9817b.p().r(this.f9818c)) {
            String str = this.f9818c.f9911z;
            if (str != null && (f8 = this.f9817b.f(str)) != null && f8.f9878T) {
                this.f9818c.f9910y = f8;
            }
            this.f9818c.f9899o = 0;
            return;
        }
        o oVar = this.f9818c.f9870L;
        if (oVar instanceof androidx.lifecycle.L) {
            z7 = this.f9817b.p().o();
        } else if (oVar.f() instanceof Activity) {
            z7 = true ^ ((Activity) oVar.f()).isChangingConfigurations();
        }
        if ((z8 && !this.f9818c.f9863E) || z7) {
            this.f9817b.p().g(this.f9818c);
        }
        this.f9818c.r1();
        this.f9816a.d(this.f9818c, false);
        for (C c8 : this.f9817b.k()) {
            if (c8 != null) {
                Fragment k8 = c8.k();
                if (this.f9818c.f9908w.equals(k8.f9911z)) {
                    k8.f9910y = this.f9818c;
                    k8.f9911z = null;
                }
            }
        }
        Fragment fragment3 = this.f9818c;
        String str2 = fragment3.f9911z;
        if (str2 != null) {
            fragment3.f9910y = this.f9817b.f(str2);
        }
        this.f9817b.s(this);
    }

    void h() {
        View view;
        if (w.G0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f9818c);
        }
        Fragment fragment = this.f9818c;
        ViewGroup viewGroup = fragment.f9883Y;
        if (viewGroup != null && (view = fragment.f9884Z) != null) {
            viewGroup.removeView(view);
        }
        this.f9818c.s1();
        this.f9816a.n(this.f9818c, false);
        Fragment fragment2 = this.f9818c;
        fragment2.f9883Y = null;
        fragment2.f9884Z = null;
        fragment2.f9895k0 = null;
        fragment2.f9896l0.j(null);
        this.f9818c.f9865G = false;
    }

    void i() {
        if (w.G0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f9818c);
        }
        this.f9818c.t1();
        this.f9816a.e(this.f9818c, false);
        Fragment fragment = this.f9818c;
        fragment.f9899o = -1;
        fragment.f9870L = null;
        fragment.f9872N = null;
        fragment.f9869K = null;
        if ((!fragment.f9862D || fragment.x0()) && !this.f9817b.p().r(this.f9818c)) {
            return;
        }
        if (w.G0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f9818c);
        }
        this.f9818c.t0();
    }

    void j() {
        Fragment fragment = this.f9818c;
        if (fragment.f9864F && fragment.f9865G && !fragment.f9867I) {
            if (w.G0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f9818c);
            }
            Fragment fragment2 = this.f9818c;
            fragment2.q1(fragment2.u1(fragment2.f9904s), null, this.f9818c.f9904s);
            View view = this.f9818c.f9884Z;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f9818c;
                fragment3.f9884Z.setTag(O0.b.f4227a, fragment3);
                Fragment fragment4 = this.f9818c;
                if (fragment4.f9876R) {
                    fragment4.f9884Z.setVisibility(8);
                }
                this.f9818c.H1();
                q qVar = this.f9816a;
                Fragment fragment5 = this.f9818c;
                qVar.m(fragment5, fragment5.f9884Z, fragment5.f9904s, false);
                this.f9818c.f9899o = 2;
            }
        }
    }

    Fragment k() {
        return this.f9818c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f9819d) {
            if (w.G0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f9819d = true;
            boolean z7 = false;
            while (true) {
                int d8 = d();
                Fragment fragment = this.f9818c;
                int i8 = fragment.f9899o;
                if (d8 == i8) {
                    if (!z7 && i8 == -1 && fragment.f9862D && !fragment.x0() && !this.f9818c.f9863E) {
                        if (w.G0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f9818c);
                        }
                        this.f9817b.p().g(this.f9818c);
                        this.f9817b.s(this);
                        if (w.G0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f9818c);
                        }
                        this.f9818c.t0();
                    }
                    Fragment fragment2 = this.f9818c;
                    if (fragment2.f9889e0) {
                        if (fragment2.f9884Z != null && (viewGroup = fragment2.f9883Y) != null) {
                            K n8 = K.n(viewGroup, fragment2.a0());
                            if (this.f9818c.f9876R) {
                                n8.c(this);
                            } else {
                                n8.e(this);
                            }
                        }
                        Fragment fragment3 = this.f9818c;
                        w wVar = fragment3.f9869K;
                        if (wVar != null) {
                            wVar.E0(fragment3);
                        }
                        Fragment fragment4 = this.f9818c;
                        fragment4.f9889e0 = false;
                        fragment4.T0(fragment4.f9876R);
                        this.f9818c.f9871M.I();
                    }
                    this.f9819d = false;
                    return;
                }
                if (d8 <= i8) {
                    switch (i8 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.f9863E && this.f9817b.q(fragment.f9908w) == null) {
                                r();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f9818c.f9899o = 1;
                            break;
                        case 2:
                            fragment.f9865G = false;
                            fragment.f9899o = 2;
                            break;
                        case 3:
                            if (w.G0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f9818c);
                            }
                            Fragment fragment5 = this.f9818c;
                            if (fragment5.f9863E) {
                                r();
                            } else if (fragment5.f9884Z != null && fragment5.f9905t == null) {
                                s();
                            }
                            Fragment fragment6 = this.f9818c;
                            if (fragment6.f9884Z != null && (viewGroup2 = fragment6.f9883Y) != null) {
                                K.n(viewGroup2, fragment6.a0()).d(this);
                            }
                            this.f9818c.f9899o = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.f9899o = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i8 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.f9884Z != null && (viewGroup3 = fragment.f9883Y) != null) {
                                K.n(viewGroup3, fragment.a0()).b(K.e.c.c(this.f9818c.f9884Z.getVisibility()), this);
                            }
                            this.f9818c.f9899o = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.f9899o = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z7 = true;
            }
        } catch (Throwable th) {
            this.f9819d = false;
            throw th;
        }
    }

    void n() {
        if (w.G0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f9818c);
        }
        this.f9818c.z1();
        this.f9816a.f(this.f9818c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f9818c.f9904s;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f9818c;
        fragment.f9905t = fragment.f9904s.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f9818c;
        fragment2.f9906u = fragment2.f9904s.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f9818c;
        fragment3.f9911z = fragment3.f9904s.getString("android:target_state");
        Fragment fragment4 = this.f9818c;
        if (fragment4.f9911z != null) {
            fragment4.f9859A = fragment4.f9904s.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f9818c;
        Boolean bool = fragment5.f9907v;
        if (bool != null) {
            fragment5.f9886b0 = bool.booleanValue();
            this.f9818c.f9907v = null;
        } else {
            fragment5.f9886b0 = fragment5.f9904s.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f9818c;
        if (fragment6.f9886b0) {
            return;
        }
        fragment6.f9885a0 = true;
    }

    void p() {
        if (w.G0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f9818c);
        }
        View T7 = this.f9818c.T();
        if (T7 != null && l(T7)) {
            boolean requestFocus = T7.requestFocus();
            if (w.G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(T7);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f9818c);
                sb.append(" resulting in focused view ");
                sb.append(this.f9818c.f9884Z.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f9818c.S1(null);
        this.f9818c.D1();
        this.f9816a.i(this.f9818c, false);
        Fragment fragment = this.f9818c;
        fragment.f9904s = null;
        fragment.f9905t = null;
        fragment.f9906u = null;
    }

    void r() {
        B b8 = new B(this.f9818c);
        Fragment fragment = this.f9818c;
        if (fragment.f9899o <= -1 || b8.f9806D != null) {
            b8.f9806D = fragment.f9904s;
        } else {
            Bundle q8 = q();
            b8.f9806D = q8;
            if (this.f9818c.f9911z != null) {
                if (q8 == null) {
                    b8.f9806D = new Bundle();
                }
                b8.f9806D.putString("android:target_state", this.f9818c.f9911z);
                int i8 = this.f9818c.f9859A;
                if (i8 != 0) {
                    b8.f9806D.putInt("android:target_req_state", i8);
                }
            }
        }
        this.f9817b.B(this.f9818c.f9908w, b8);
    }

    void s() {
        if (this.f9818c.f9884Z == null) {
            return;
        }
        if (w.G0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f9818c + " with view " + this.f9818c.f9884Z);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f9818c.f9884Z.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f9818c.f9905t = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f9818c.f9895k0.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f9818c.f9906u = bundle;
    }

    void t(int i8) {
        this.f9820e = i8;
    }

    void u() {
        if (w.G0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f9818c);
        }
        this.f9818c.F1();
        this.f9816a.k(this.f9818c, false);
    }

    void v() {
        if (w.G0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f9818c);
        }
        this.f9818c.G1();
        this.f9816a.l(this.f9818c, false);
    }

    C(q qVar, D d8, ClassLoader classLoader, n nVar, B b8) {
        this.f9816a = qVar;
        this.f9817b = d8;
        Fragment a8 = b8.a(nVar, classLoader);
        this.f9818c = a8;
        if (w.G0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a8);
        }
    }

    C(q qVar, D d8, Fragment fragment, B b8) {
        this.f9816a = qVar;
        this.f9817b = d8;
        this.f9818c = fragment;
        fragment.f9905t = null;
        fragment.f9906u = null;
        fragment.f9868J = 0;
        fragment.f9865G = false;
        fragment.f9861C = false;
        Fragment fragment2 = fragment.f9910y;
        fragment.f9911z = fragment2 != null ? fragment2.f9908w : null;
        fragment.f9910y = null;
        Bundle bundle = b8.f9806D;
        if (bundle != null) {
            fragment.f9904s = bundle;
        } else {
            fragment.f9904s = new Bundle();
        }
    }
}
