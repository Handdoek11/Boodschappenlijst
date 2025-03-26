package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import o0.AbstractC6278a;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10527a;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f10529c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences.Editor f10530d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10531e;

    /* renamed from: f, reason: collision with root package name */
    private String f10532f;

    /* renamed from: g, reason: collision with root package name */
    private int f10533g;

    /* renamed from: i, reason: collision with root package name */
    private PreferenceScreen f10535i;

    /* renamed from: j, reason: collision with root package name */
    private c f10536j;

    /* renamed from: k, reason: collision with root package name */
    private a f10537k;

    /* renamed from: l, reason: collision with root package name */
    private b f10538l;

    /* renamed from: b, reason: collision with root package name */
    private long f10528b = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f10534h = 0;

    public interface a {
        void f(Preference preference);
    }

    public interface b {
        void h(PreferenceScreen preferenceScreen);
    }

    public interface c {
        boolean i(Preference preference);
    }

    public static abstract class d {
    }

    public k(Context context) {
        this.f10527a = context;
        v(d(context));
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences(d(context), c());
    }

    private static int c() {
        return 0;
    }

    private static String d(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static void n(Context context, int i8, boolean z7) {
        o(context, d(context), c(), i8, z7);
    }

    public static void o(Context context, String str, int i8, int i9, boolean z7) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("_has_set_default_values", 0);
        if (z7 || !sharedPreferences.getBoolean("_has_set_default_values", false)) {
            k kVar = new k(context);
            kVar.v(str);
            kVar.u(i8);
            kVar.m(context, i9, null);
            sharedPreferences.edit().putBoolean("_has_set_default_values", true).apply();
        }
    }

    private void p(boolean z7) {
        SharedPreferences.Editor editor;
        if (!z7 && (editor = this.f10530d) != null) {
            editor.apply();
        }
        this.f10531e = z7;
    }

    public Preference a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f10535i;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.M0(charSequence);
    }

    SharedPreferences.Editor e() {
        if (!this.f10531e) {
            return l().edit();
        }
        if (this.f10530d == null) {
            this.f10530d = l().edit();
        }
        return this.f10530d;
    }

    long f() {
        long j8;
        synchronized (this) {
            j8 = this.f10528b;
            this.f10528b = 1 + j8;
        }
        return j8;
    }

    public b g() {
        return this.f10538l;
    }

    public c h() {
        return this.f10536j;
    }

    public d i() {
        return null;
    }

    public f j() {
        return null;
    }

    public PreferenceScreen k() {
        return this.f10535i;
    }

    public SharedPreferences l() {
        j();
        if (this.f10529c == null) {
            this.f10529c = (this.f10534h != 1 ? this.f10527a : AbstractC6278a.b(this.f10527a)).getSharedPreferences(this.f10532f, this.f10533g);
        }
        return this.f10529c;
    }

    public PreferenceScreen m(Context context, int i8, PreferenceScreen preferenceScreen) {
        p(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new j(context, this).d(i8, preferenceScreen);
        preferenceScreen2.T(this);
        p(false);
        return preferenceScreen2;
    }

    public void q(a aVar) {
        this.f10537k = aVar;
    }

    public void r(b bVar) {
        this.f10538l = bVar;
    }

    public void s(c cVar) {
        this.f10536j = cVar;
    }

    public boolean t(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f10535i;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.Y();
        }
        this.f10535i = preferenceScreen;
        return true;
    }

    public void u(int i8) {
        this.f10533g = i8;
        this.f10529c = null;
    }

    public void v(String str) {
        this.f10532f = str;
        this.f10529c = null;
    }

    boolean w() {
        return !this.f10531e;
    }

    public void x(Preference preference) {
        a aVar = this.f10537k;
        if (aVar != null) {
            aVar.f(preference);
        }
    }
}
