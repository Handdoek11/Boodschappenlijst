package androidx.preference;

import A0.z;
import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.preference.k;
import g.AbstractC5794a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import z0.X;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A, reason: collision with root package name */
    private int f10385A;

    /* renamed from: B, reason: collision with root package name */
    private Drawable f10386B;

    /* renamed from: C, reason: collision with root package name */
    private String f10387C;

    /* renamed from: D, reason: collision with root package name */
    private Intent f10388D;

    /* renamed from: E, reason: collision with root package name */
    private String f10389E;

    /* renamed from: F, reason: collision with root package name */
    private Bundle f10390F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f10391G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f10392H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f10393I;

    /* renamed from: J, reason: collision with root package name */
    private String f10394J;

    /* renamed from: K, reason: collision with root package name */
    private Object f10395K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f10396L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f10397M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f10398N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f10399O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f10400P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f10401Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f10402R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f10403S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f10404T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f10405U;

    /* renamed from: V, reason: collision with root package name */
    private int f10406V;

    /* renamed from: W, reason: collision with root package name */
    private int f10407W;

    /* renamed from: X, reason: collision with root package name */
    private c f10408X;

    /* renamed from: Y, reason: collision with root package name */
    private List f10409Y;

    /* renamed from: Z, reason: collision with root package name */
    private PreferenceGroup f10410Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f10411a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f10412b0;

    /* renamed from: c0, reason: collision with root package name */
    private e f10413c0;

    /* renamed from: d0, reason: collision with root package name */
    private f f10414d0;

    /* renamed from: e0, reason: collision with root package name */
    private final View.OnClickListener f10415e0;

    /* renamed from: o, reason: collision with root package name */
    private final Context f10416o;

    /* renamed from: s, reason: collision with root package name */
    private k f10417s;

    /* renamed from: t, reason: collision with root package name */
    private long f10418t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f10419u;

    /* renamed from: v, reason: collision with root package name */
    private d f10420v;

    /* renamed from: w, reason: collision with root package name */
    private int f10421w;

    /* renamed from: x, reason: collision with root package name */
    private int f10422x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f10423y;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f10424z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.h0(view);
        }
    }

    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    interface c {
        void c(Preference preference);

        void l(Preference preference);

        void u(Preference preference);
    }

    public interface d {
        boolean a(Preference preference);
    }

    private static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: o, reason: collision with root package name */
        private final Preference f10426o;

        e(Preference preference) {
            this.f10426o = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence F7 = this.f10426o.F();
            if (!this.f10426o.K() || TextUtils.isEmpty(F7)) {
                return;
            }
            contextMenu.setHeaderTitle(F7);
            contextMenu.add(0, 0, 0, r.f10571a).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f10426o.m().getSystemService("clipboard");
            CharSequence F7 = this.f10426o.F();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", F7));
            Toast.makeText(this.f10426o.m(), this.f10426o.m().getString(r.f10574d, F7), 0).show();
            return true;
        }
    }

    public interface f {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.f10421w = Integer.MAX_VALUE;
        this.f10422x = 0;
        this.f10391G = true;
        this.f10392H = true;
        this.f10393I = true;
        this.f10396L = true;
        this.f10397M = true;
        this.f10398N = true;
        this.f10399O = true;
        this.f10400P = true;
        this.f10402R = true;
        this.f10405U = true;
        this.f10406V = q.f10568b;
        this.f10415e0 = new a();
        this.f10416o = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f10595J, i8, i9);
        this.f10385A = p0.k.n(obtainStyledAttributes, t.f10651h0, t.f10597K, 0);
        this.f10387C = p0.k.o(obtainStyledAttributes, t.f10660k0, t.f10609Q);
        this.f10423y = p0.k.p(obtainStyledAttributes, t.f10676s0, t.f10605O);
        this.f10424z = p0.k.p(obtainStyledAttributes, t.f10674r0, t.f10611R);
        this.f10421w = p0.k.d(obtainStyledAttributes, t.f10664m0, t.f10613S, Integer.MAX_VALUE);
        this.f10389E = p0.k.o(obtainStyledAttributes, t.f10648g0, t.f10623X);
        this.f10406V = p0.k.n(obtainStyledAttributes, t.f10662l0, t.f10603N, q.f10568b);
        this.f10407W = p0.k.n(obtainStyledAttributes, t.f10678t0, t.f10615T, 0);
        this.f10391G = p0.k.b(obtainStyledAttributes, t.f10645f0, t.f10601M, true);
        this.f10392H = p0.k.b(obtainStyledAttributes, t.f10668o0, t.f10607P, true);
        this.f10393I = p0.k.b(obtainStyledAttributes, t.f10666n0, t.f10599L, true);
        this.f10394J = p0.k.o(obtainStyledAttributes, t.f10639d0, t.f10617U);
        int i10 = t.f10630a0;
        this.f10399O = p0.k.b(obtainStyledAttributes, i10, i10, this.f10392H);
        int i11 = t.f10633b0;
        this.f10400P = p0.k.b(obtainStyledAttributes, i11, i11, this.f10392H);
        if (obtainStyledAttributes.hasValue(t.f10636c0)) {
            this.f10395K = Z(obtainStyledAttributes, t.f10636c0);
        } else if (obtainStyledAttributes.hasValue(t.f10619V)) {
            this.f10395K = Z(obtainStyledAttributes, t.f10619V);
        }
        this.f10405U = p0.k.b(obtainStyledAttributes, t.f10670p0, t.f10621W, true);
        boolean hasValue = obtainStyledAttributes.hasValue(t.f10672q0);
        this.f10401Q = hasValue;
        if (hasValue) {
            this.f10402R = p0.k.b(obtainStyledAttributes, t.f10672q0, t.f10625Y, true);
        }
        this.f10403S = p0.k.b(obtainStyledAttributes, t.f10654i0, t.f10627Z, false);
        int i12 = t.f10657j0;
        this.f10398N = p0.k.b(obtainStyledAttributes, i12, i12, true);
        int i13 = t.f10642e0;
        this.f10404T = p0.k.b(obtainStyledAttributes, i13, i13, false);
        obtainStyledAttributes.recycle();
    }

    private void H0(SharedPreferences.Editor editor) {
        if (this.f10417s.w()) {
            editor.apply();
        }
    }

    private void I0() {
        Preference l8;
        String str = this.f10394J;
        if (str == null || (l8 = l(str)) == null) {
            return;
        }
        l8.J0(this);
    }

    private void J0(Preference preference) {
        List list = this.f10409Y;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void k() {
        C();
        if (G0() && E().contains(this.f10387C)) {
            f0(true, null);
            return;
        }
        Object obj = this.f10395K;
        if (obj != null) {
            f0(false, obj);
        }
    }

    private void m0() {
        if (TextUtils.isEmpty(this.f10394J)) {
            return;
        }
        Preference l8 = l(this.f10394J);
        if (l8 != null) {
            l8.n0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f10394J + "\" not found for preference \"" + this.f10387C + "\" (title: \"" + ((Object) this.f10423y) + "\"");
    }

    private void n0(Preference preference) {
        if (this.f10409Y == null) {
            this.f10409Y = new ArrayList();
        }
        this.f10409Y.add(preference);
        preference.X(this, F0());
    }

    private void q0(View view, boolean z7) {
        view.setEnabled(z7);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                q0(viewGroup.getChildAt(childCount), z7);
            }
        }
    }

    protected String A(String str) {
        if (!G0()) {
            return str;
        }
        C();
        return this.f10417s.l().getString(this.f10387C, str);
    }

    public void A0(CharSequence charSequence) {
        if (G() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f10424z, charSequence)) {
            return;
        }
        this.f10424z = charSequence;
        P();
    }

    public Set B(Set set) {
        if (!G0()) {
            return set;
        }
        C();
        return this.f10417s.l().getStringSet(this.f10387C, set);
    }

    public final void B0(f fVar) {
        this.f10414d0 = fVar;
        P();
    }

    public androidx.preference.f C() {
        k kVar = this.f10417s;
        if (kVar != null) {
            kVar.j();
        }
        return null;
    }

    public void C0(int i8) {
        D0(this.f10416o.getString(i8));
    }

    public k D() {
        return this.f10417s;
    }

    public void D0(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f10423y)) {
            return;
        }
        this.f10423y = charSequence;
        P();
    }

    public SharedPreferences E() {
        if (this.f10417s == null) {
            return null;
        }
        C();
        return this.f10417s.l();
    }

    public final void E0(boolean z7) {
        if (this.f10398N != z7) {
            this.f10398N = z7;
            c cVar = this.f10408X;
            if (cVar != null) {
                cVar.l(this);
            }
        }
    }

    public CharSequence F() {
        return G() != null ? G().a(this) : this.f10424z;
    }

    public boolean F0() {
        return !L();
    }

    public final f G() {
        return this.f10414d0;
    }

    protected boolean G0() {
        return this.f10417s != null && M() && J();
    }

    public CharSequence H() {
        return this.f10423y;
    }

    public final int I() {
        return this.f10407W;
    }

    public boolean J() {
        return !TextUtils.isEmpty(this.f10387C);
    }

    public boolean K() {
        return this.f10404T;
    }

    public boolean L() {
        return this.f10391G && this.f10396L && this.f10397M;
    }

    public boolean M() {
        return this.f10393I;
    }

    public boolean N() {
        return this.f10392H;
    }

    public final boolean O() {
        return this.f10398N;
    }

    protected void P() {
        c cVar = this.f10408X;
        if (cVar != null) {
            cVar.u(this);
        }
    }

    public void Q(boolean z7) {
        List list = this.f10409Y;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((Preference) list.get(i8)).X(this, z7);
        }
    }

    protected void R() {
        c cVar = this.f10408X;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void S() {
        m0();
    }

    protected void T(k kVar) {
        this.f10417s = kVar;
        if (!this.f10419u) {
            this.f10418t = kVar.f();
        }
        k();
    }

    protected void U(k kVar, long j8) {
        this.f10418t = j8;
        this.f10419u = true;
        try {
            T(kVar);
        } finally {
            this.f10419u = false;
        }
    }

    public void V(m mVar) {
        Integer num;
        View view = mVar.f10944a;
        view.setOnClickListener(this.f10415e0);
        view.setId(this.f10422x);
        TextView textView = (TextView) mVar.g0(R.id.summary);
        if (textView != null) {
            CharSequence F7 = F();
            if (TextUtils.isEmpty(F7)) {
                textView.setVisibility(8);
                num = null;
            } else {
                textView.setText(F7);
                textView.setVisibility(0);
                num = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            num = null;
        }
        TextView textView2 = (TextView) mVar.g0(R.id.title);
        if (textView2 != null) {
            CharSequence H7 = H();
            if (TextUtils.isEmpty(H7)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(H7);
                textView2.setVisibility(0);
                if (this.f10401Q) {
                    textView2.setSingleLine(this.f10402R);
                }
                if (!N() && L() && num != null) {
                    textView2.setTextColor(num.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) mVar.g0(R.id.icon);
        if (imageView != null) {
            int i8 = this.f10385A;
            if (i8 != 0 || this.f10386B != null) {
                if (this.f10386B == null) {
                    this.f10386B = AbstractC5794a.b(this.f10416o, i8);
                }
                Drawable drawable = this.f10386B;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f10386B != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.f10403S ? 4 : 8);
            }
        }
        View g02 = mVar.g0(p.f10561a);
        if (g02 == null) {
            g02 = mVar.g0(R.id.icon_frame);
        }
        if (g02 != null) {
            if (this.f10386B != null) {
                g02.setVisibility(0);
            } else {
                g02.setVisibility(this.f10403S ? 4 : 8);
            }
        }
        if (this.f10405U) {
            q0(view, L());
        } else {
            q0(view, true);
        }
        boolean N7 = N();
        view.setFocusable(N7);
        view.setClickable(N7);
        mVar.k0(this.f10399O);
        mVar.l0(this.f10400P);
        boolean K7 = K();
        if (K7 && this.f10413c0 == null) {
            this.f10413c0 = new e(this);
        }
        view.setOnCreateContextMenuListener(K7 ? this.f10413c0 : null);
        view.setLongClickable(K7);
        if (!K7 || N7) {
            return;
        }
        X.r0(view, null);
    }

    protected void W() {
    }

    public void X(Preference preference, boolean z7) {
        if (this.f10396L == z7) {
            this.f10396L = !z7;
            Q(F0());
            P();
        }
    }

    public void Y() {
        I0();
        this.f10411a0 = true;
    }

    protected Object Z(TypedArray typedArray, int i8) {
        return null;
    }

    void a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.f10410Z != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f10410Z = preferenceGroup;
    }

    public void b0(Preference preference, boolean z7) {
        if (this.f10397M == z7) {
            this.f10397M = !z7;
            Q(F0());
            P();
        }
    }

    public boolean c(Object obj) {
        return true;
    }

    protected void c0(Parcelable parcelable) {
        this.f10412b0 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    protected Parcelable d0() {
        this.f10412b0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    protected void e0(Object obj) {
    }

    final void f() {
        this.f10411a0 = false;
    }

    protected void f0(boolean z7, Object obj) {
        e0(obj);
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i8 = this.f10421w;
        int i9 = preference.f10421w;
        if (i8 != i9) {
            return i8 - i9;
        }
        CharSequence charSequence = this.f10423y;
        CharSequence charSequence2 = preference.f10423y;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f10423y.toString());
    }

    public void g0() {
        k.c h8;
        if (L() && N()) {
            W();
            d dVar = this.f10420v;
            if (dVar == null || !dVar.a(this)) {
                k D7 = D();
                if ((D7 == null || (h8 = D7.h()) == null || !h8.i(this)) && this.f10388D != null) {
                    m().startActivity(this.f10388D);
                }
            }
        }
    }

    void h(Bundle bundle) {
        Parcelable parcelable;
        if (!J() || (parcelable = bundle.getParcelable(this.f10387C)) == null) {
            return;
        }
        this.f10412b0 = false;
        c0(parcelable);
        if (!this.f10412b0) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    protected void h0(View view) {
        g0();
    }

    void i(Bundle bundle) {
        if (J()) {
            this.f10412b0 = false;
            Parcelable d02 = d0();
            if (!this.f10412b0) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (d02 != null) {
                bundle.putParcelable(this.f10387C, d02);
            }
        }
    }

    protected boolean i0(boolean z7) {
        if (!G0()) {
            return false;
        }
        if (z7 == y(!z7)) {
            return true;
        }
        C();
        SharedPreferences.Editor e8 = this.f10417s.e();
        e8.putBoolean(this.f10387C, z7);
        H0(e8);
        return true;
    }

    protected boolean j0(int i8) {
        if (!G0()) {
            return false;
        }
        if (i8 == z(~i8)) {
            return true;
        }
        C();
        SharedPreferences.Editor e8 = this.f10417s.e();
        e8.putInt(this.f10387C, i8);
        H0(e8);
        return true;
    }

    protected boolean k0(String str) {
        if (!G0()) {
            return false;
        }
        if (TextUtils.equals(str, A(null))) {
            return true;
        }
        C();
        SharedPreferences.Editor e8 = this.f10417s.e();
        e8.putString(this.f10387C, str);
        H0(e8);
        return true;
    }

    protected Preference l(String str) {
        k kVar = this.f10417s;
        if (kVar == null) {
            return null;
        }
        return kVar.a(str);
    }

    public boolean l0(Set set) {
        if (!G0()) {
            return false;
        }
        if (set.equals(B(null))) {
            return true;
        }
        C();
        SharedPreferences.Editor e8 = this.f10417s.e();
        e8.putStringSet(this.f10387C, set);
        H0(e8);
        return true;
    }

    public Context m() {
        return this.f10416o;
    }

    public void o0(Bundle bundle) {
        h(bundle);
    }

    public Bundle p() {
        if (this.f10390F == null) {
            this.f10390F = new Bundle();
        }
        return this.f10390F;
    }

    public void p0(Bundle bundle) {
        i(bundle);
    }

    StringBuilder q() {
        StringBuilder sb = new StringBuilder();
        CharSequence H7 = H();
        if (!TextUtils.isEmpty(H7)) {
            sb.append(H7);
            sb.append(' ');
        }
        CharSequence F7 = F();
        if (!TextUtils.isEmpty(F7)) {
            sb.append(F7);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String r() {
        return this.f10389E;
    }

    public void r0(int i8) {
        s0(AbstractC5794a.b(this.f10416o, i8));
        this.f10385A = i8;
    }

    long s() {
        return this.f10418t;
    }

    public void s0(Drawable drawable) {
        if (this.f10386B != drawable) {
            this.f10386B = drawable;
            this.f10385A = 0;
            P();
        }
    }

    public Intent t() {
        return this.f10388D;
    }

    public void t0(boolean z7) {
        if (this.f10403S != z7) {
            this.f10403S = z7;
            P();
        }
    }

    public String toString() {
        return q().toString();
    }

    public String u() {
        return this.f10387C;
    }

    public void u0(Intent intent) {
        this.f10388D = intent;
    }

    public final int v() {
        return this.f10406V;
    }

    public void v0(int i8) {
        this.f10406V = i8;
    }

    public int w() {
        return this.f10421w;
    }

    final void w0(c cVar) {
        this.f10408X = cVar;
    }

    public PreferenceGroup x() {
        return this.f10410Z;
    }

    public void x0(d dVar) {
        this.f10420v = dVar;
    }

    protected boolean y(boolean z7) {
        if (!G0()) {
            return z7;
        }
        C();
        return this.f10417s.l().getBoolean(this.f10387C, z7);
    }

    public void y0(int i8) {
        if (i8 != this.f10421w) {
            this.f10421w = i8;
            R();
        }
    }

    protected int z(int i8) {
        if (!G0()) {
            return i8;
        }
        C();
        return this.f10417s.l().getInt(this.f10387C, i8);
    }

    public void z0(int i8) {
        A0(this.f10416o.getString(i8));
    }

    public void a0(z zVar) {
    }

    public Preference(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p0.k.a(context, n.f10555h, R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
