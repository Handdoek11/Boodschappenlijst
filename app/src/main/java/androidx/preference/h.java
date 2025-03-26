package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import androidx.preference.DialogPreference;
import androidx.preference.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class h extends Fragment implements k.c, k.a, k.b, DialogPreference.a {

    /* renamed from: u0, reason: collision with root package name */
    private k f10495u0;

    /* renamed from: v0, reason: collision with root package name */
    RecyclerView f10496v0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f10497w0;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f10498x0;

    /* renamed from: z0, reason: collision with root package name */
    private Runnable f10500z0;

    /* renamed from: t0, reason: collision with root package name */
    private final c f10494t0 = new c();

    /* renamed from: y0, reason: collision with root package name */
    private int f10499y0 = q.f10569c;

    /* renamed from: A0, reason: collision with root package name */
    private final Handler f10492A0 = new a(Looper.getMainLooper());

    /* renamed from: B0, reason: collision with root package name */
    private final Runnable f10493B0 = new b();

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            h.this.d2();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = h.this.f10496v0;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    private class c extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f10503a;

        /* renamed from: b, reason: collision with root package name */
        private int f10504b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10505c = true;

        c() {
        }

        private boolean m(View view, RecyclerView recyclerView) {
            RecyclerView.F m02 = recyclerView.m0(view);
            boolean z7 = false;
            if (!(m02 instanceof m) || !((m) m02).i0()) {
                return false;
            }
            boolean z8 = this.f10505c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z8;
            }
            RecyclerView.F m03 = recyclerView.m0(recyclerView.getChildAt(indexOfChild + 1));
            if ((m03 instanceof m) && ((m) m03).h0()) {
                z7 = true;
            }
            return z7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b8) {
            if (m(view, recyclerView)) {
                rect.bottom = this.f10504b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
            if (this.f10503a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = recyclerView.getChildAt(i8);
                if (m(childAt, recyclerView)) {
                    int y7 = ((int) childAt.getY()) + childAt.getHeight();
                    this.f10503a.setBounds(0, y7, width, this.f10504b + y7);
                    this.f10503a.draw(canvas);
                }
            }
        }

        public void j(boolean z7) {
            this.f10505c = z7;
        }

        public void k(Drawable drawable) {
            if (drawable != null) {
                this.f10504b = drawable.getIntrinsicHeight();
            } else {
                this.f10504b = 0;
            }
            this.f10503a = drawable;
            h.this.f10496v0.C0();
        }

        public void l(int i8) {
            this.f10504b = i8;
            h.this.f10496v0.C0();
        }
    }

    private void n2() {
        if (this.f10492A0.hasMessages(1)) {
            return;
        }
        this.f10492A0.obtainMessage(1).sendToTarget();
    }

    private void o2() {
        if (this.f10495u0 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void t2() {
        f2().setAdapter(null);
        PreferenceScreen g22 = g2();
        if (g22 != null) {
            g22.Y();
        }
        m2();
    }

    @Override // androidx.fragment.app.Fragment
    public void J0(Bundle bundle) {
        super.J0(bundle);
        TypedValue typedValue = new TypedValue();
        L1().getTheme().resolveAttribute(n.f10556i, typedValue, true);
        int i8 = typedValue.resourceId;
        if (i8 == 0) {
            i8 = s.f10576a;
        }
        L1().getTheme().applyStyle(i8, false);
        k kVar = new k(L1());
        this.f10495u0 = kVar;
        kVar.r(this);
        k2(bundle, x() != null ? x().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = L1().obtainStyledAttributes(null, t.f10682v0, n.f10553f, 0);
        this.f10499y0 = obtainStyledAttributes.getResourceId(t.f10684w0, this.f10499y0);
        Drawable drawable = obtainStyledAttributes.getDrawable(t.f10686x0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(t.f10688y0, -1);
        boolean z7 = obtainStyledAttributes.getBoolean(t.f10690z0, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(L1());
        View inflate = cloneInContext.inflate(this.f10499y0, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        RecyclerView l22 = l2(cloneInContext, viewGroup2, bundle);
        if (l22 == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.f10496v0 = l22;
        l22.j(this.f10494t0);
        p2(drawable);
        if (dimensionPixelSize != -1) {
            q2(dimensionPixelSize);
        }
        this.f10494t0.j(z7);
        if (this.f10496v0.getParent() == null) {
            viewGroup2.addView(this.f10496v0);
        }
        this.f10492A0.post(this.f10493B0);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void Q0() {
        this.f10492A0.removeCallbacks(this.f10493B0);
        this.f10492A0.removeMessages(1);
        if (this.f10497w0) {
            t2();
        }
        this.f10496v0 = null;
        super.Q0();
    }

    @Override // androidx.preference.DialogPreference.a
    public Preference c(CharSequence charSequence) {
        k kVar = this.f10495u0;
        if (kVar == null) {
            return null;
        }
        return kVar.a(charSequence);
    }

    void d2() {
        PreferenceScreen g22 = g2();
        if (g22 != null) {
            f2().setAdapter(i2(g22));
            g22.S();
        }
        h2();
    }

    public Fragment e2() {
        return null;
    }

    @Override // androidx.preference.k.a
    public void f(Preference preference) {
        DialogInterfaceOnCancelListenerC0906e B22;
        e2();
        for (Fragment fragment = this; fragment != null; fragment = fragment.Z()) {
        }
        B();
        p();
        if (a0().h0("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            B22 = androidx.preference.a.C2(preference.u());
        } else if (preference instanceof ListPreference) {
            B22 = androidx.preference.c.B2(preference.u());
        } else {
            if (!(preference instanceof MultiSelectListPreference)) {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            B22 = d.B2(preference.u());
        }
        B22.X1(this, 0);
        B22.r2(a0(), "androidx.preference.PreferenceFragment.DIALOG");
    }

    @Override // androidx.fragment.app.Fragment
    public void f1(Bundle bundle) {
        super.f1(bundle);
        PreferenceScreen g22 = g2();
        if (g22 != null) {
            Bundle bundle2 = new Bundle();
            g22.p0(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public final RecyclerView f2() {
        return this.f10496v0;
    }

    @Override // androidx.fragment.app.Fragment
    public void g1() {
        super.g1();
        this.f10495u0.s(this);
        this.f10495u0.q(this);
    }

    public PreferenceScreen g2() {
        return this.f10495u0.k();
    }

    @Override // androidx.preference.k.b
    public void h(PreferenceScreen preferenceScreen) {
        e2();
        for (Fragment fragment = this; fragment != null; fragment = fragment.Z()) {
        }
        B();
        p();
    }

    @Override // androidx.fragment.app.Fragment
    public void h1() {
        super.h1();
        this.f10495u0.s(null);
        this.f10495u0.q(null);
    }

    protected void h2() {
    }

    @Override // androidx.preference.k.c
    public boolean i(Preference preference) {
        if (preference.r() == null) {
            return false;
        }
        e2();
        for (Fragment fragment = this; fragment != null; fragment = fragment.Z()) {
        }
        B();
        p();
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        w a02 = a0();
        Bundle p8 = preference.p();
        Fragment a8 = a02.r0().a(J1().getClassLoader(), preference.r());
        a8.R1(p8);
        a8.X1(this, 0);
        a02.o().n(((View) M1().getParent()).getId(), a8).f(null).g();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen g22;
        super.i1(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (g22 = g2()) != null) {
            g22.o0(bundle2);
        }
        if (this.f10497w0) {
            d2();
            Runnable runnable = this.f10500z0;
            if (runnable != null) {
                runnable.run();
                this.f10500z0 = null;
            }
        }
        this.f10498x0 = true;
    }

    protected RecyclerView.h i2(PreferenceScreen preferenceScreen) {
        return new i(preferenceScreen);
    }

    public RecyclerView.p j2() {
        return new LinearLayoutManager(L1());
    }

    public abstract void k2(Bundle bundle, String str);

    public RecyclerView l2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (L1().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(p.f10562b)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(q.f10570d, viewGroup, false);
        recyclerView2.setLayoutManager(j2());
        recyclerView2.setAccessibilityDelegateCompat(new l(recyclerView2));
        return recyclerView2;
    }

    protected void m2() {
    }

    public void p2(Drawable drawable) {
        this.f10494t0.k(drawable);
    }

    public void q2(int i8) {
        this.f10494t0.l(i8);
    }

    public void r2(PreferenceScreen preferenceScreen) {
        if (!this.f10495u0.t(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        m2();
        this.f10497w0 = true;
        if (this.f10498x0) {
            n2();
        }
    }

    public void s2(int i8, String str) {
        o2();
        PreferenceScreen m8 = this.f10495u0.m(L1(), i8, null);
        PreferenceScreen preferenceScreen = m8;
        if (str != null) {
            Preference M02 = m8.M0(str);
            boolean z7 = M02 instanceof PreferenceScreen;
            preferenceScreen = M02;
            if (!z7) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        r2(preferenceScreen);
    }
}
