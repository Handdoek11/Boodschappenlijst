package com.headcode.ourgroceries.android;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.headcode.ourgroceries.android.R4;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class R4 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f34368a = b.f34374G;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f34369a;

        /* renamed from: b, reason: collision with root package name */
        private final b f34370b;

        /* renamed from: c, reason: collision with root package name */
        private final SharedPreferences.OnSharedPreferenceChangeListener f34371c;

        public a(Activity activity, b bVar) {
            this.f34369a = activity;
            this.f34370b = bVar;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.headcode.ourgroceries.android.Q4
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f34351o.c(sharedPreferences, str);
                }
            };
            this.f34371c = onSharedPreferenceChangeListener;
            A2.T(activity);
            A2.f33140n0.f0(onSharedPreferenceChangeListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(SharedPreferences sharedPreferences, String str) {
            if (str.equals("theme")) {
                d();
            }
        }

        private void d() {
            if (R4.d(this.f34369a) != this.f34370b) {
                this.f34369a.recreate();
            }
        }

        public void b() {
            A2.f33140n0.L0(this.f34371c);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'F' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {

        /* renamed from: E, reason: collision with root package name */
        public static final b f34372E = new b("DARK", 0, "dark", N2.f34250f, M2.f33830A5, E2.f33432u, E2.f33424m, E2.f33427p, E2.f33429r, E2.f33425n, E2.f33428q, E2.f33430s, E2.f33426o, E2.f33378B, E2.f33431t);

        /* renamed from: F, reason: collision with root package name */
        public static final b f34373F;

        /* renamed from: G, reason: collision with root package name */
        public static final b f34374G;

        /* renamed from: H, reason: collision with root package name */
        public static final b f34375H;

        /* renamed from: I, reason: collision with root package name */
        public static final b f34376I;

        /* renamed from: J, reason: collision with root package name */
        public static final b f34377J;

        /* renamed from: K, reason: collision with root package name */
        public static final b f34378K;

        /* renamed from: L, reason: collision with root package name */
        public static final b f34379L;

        /* renamed from: M, reason: collision with root package name */
        public static final b f34380M;

        /* renamed from: N, reason: collision with root package name */
        public static final b f34381N;

        /* renamed from: O, reason: collision with root package name */
        public static final b f34382O;

        /* renamed from: P, reason: collision with root package name */
        public static final b f34383P;

        /* renamed from: Q, reason: collision with root package name */
        public static final b f34384Q;

        /* renamed from: R, reason: collision with root package name */
        public static final b f34385R;

        /* renamed from: S, reason: collision with root package name */
        public static final b f34386S;

        /* renamed from: T, reason: collision with root package name */
        private static final Map f34387T;

        /* renamed from: U, reason: collision with root package name */
        private static final /* synthetic */ b[] f34388U;

        /* renamed from: A, reason: collision with root package name */
        private final int f34389A;

        /* renamed from: B, reason: collision with root package name */
        private final int f34390B;

        /* renamed from: C, reason: collision with root package name */
        private final int f34391C;

        /* renamed from: D, reason: collision with root package name */
        private final int f34392D;

        /* renamed from: o, reason: collision with root package name */
        private final String f34393o;

        /* renamed from: s, reason: collision with root package name */
        private final int f34394s;

        /* renamed from: t, reason: collision with root package name */
        private final int f34395t;

        /* renamed from: u, reason: collision with root package name */
        private final int f34396u;

        /* renamed from: v, reason: collision with root package name */
        private final int f34397v;

        /* renamed from: w, reason: collision with root package name */
        private final int f34398w;

        /* renamed from: x, reason: collision with root package name */
        private final int f34399x;

        /* renamed from: y, reason: collision with root package name */
        private final int f34400y;

        /* renamed from: z, reason: collision with root package name */
        private final int f34401z;

        static {
            int i8 = N2.f34253i;
            int i9 = M2.f33854D5;
            int i10 = E2.f33390N;
            int i11 = E2.f33382F;
            f34373F = new b("LIGHT", 1, "light", i8, i9, i10, i11, E2.f33385I, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i11, E2.f33389M);
            int i12 = N2.f34253i;
            int i13 = M2.f33902J5;
            int i14 = E2.f33390N;
            int i15 = E2.f33382F;
            f34374G = new b("SYSTEM_DEFAULT", 2, "system_default", i12, i13, i14, i15, E2.f33385I, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i15, E2.f33389M);
            int i16 = N2.f34258n;
            int i17 = M2.f33894I5;
            int i18 = E2.f33408c0;
            int i19 = E2.f33404a0;
            f34375H = new b("RED", 3, "red", i16, i17, i18, i19, E2.f33406b0, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i19, E2.f33389M);
            int i20 = N2.f34248d;
            int i21 = M2.f34230y5;
            int i22 = E2.f33419i;
            int i23 = E2.f33415g;
            f34376I = new b("BLUE", 4, "blue", i20, i21, i22, i23, E2.f33417h, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i23, E2.f33389M);
            int i24 = N2.f34259o;
            int i25 = M2.f33918L5;
            int i26 = E2.f33420i0;
            int i27 = E2.f33412e0;
            int i28 = E2.f33416g0;
            int i29 = E2.f33418h0;
            int i30 = E2.f33383G;
            int i31 = E2.f33386J;
            int i32 = E2.f33388L;
            int i33 = E2.f33414f0;
            f34377J = new b("WARM", 5, "warm", i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i27, i33);
            int i34 = N2.f34246b;
            int i35 = M2.f34214w5;
            int i36 = E2.f33407c;
            int i37 = E2.f33403a;
            f34378K = new b("BERRIES_WHITE", 6, "berries", i34, i35, i36, i37, E2.f33405b, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i37, E2.f33389M);
            int i38 = N2.f34249e;
            int i39 = M2.f34238z5;
            int i40 = E2.f33423l;
            int i41 = E2.f33421j;
            f34379L = new b("CITRUS", 7, "citrus", i38, i39, i40, i41, E2.f33422k, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i41, E2.f33389M);
            int i42 = N2.f34251g;
            int i43 = M2.f33838B5;
            int i44 = E2.f33435x;
            int i45 = E2.f33433v;
            f34380M = new b("FESTIVAL", 8, "festival", i42, i43, i44, i45, E2.f33434w, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i45, E2.f33389M);
            int i46 = N2.f34252h;
            int i47 = M2.f33846C5;
            int i48 = E2.f33377A;
            int i49 = E2.f33436y;
            f34381N = new b("GRAPEVINE", 9, "grapevine", i46, i47, i48, i49, E2.f33437z, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i49, E2.f33389M);
            int i50 = N2.f34254j;
            int i51 = M2.f33862E5;
            int i52 = E2.f33393Q;
            int i53 = E2.f33391O;
            f34382O = new b("ORANGE", 10, "orange", i50, i51, i52, i53, E2.f33392P, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i53, E2.f33389M);
            int i54 = N2.f34255k;
            int i55 = M2.f33870F5;
            int i56 = E2.f33396T;
            int i57 = E2.f33394R;
            f34383P = new b("PATRIOT", 11, "patriot", i54, i55, i56, i57, E2.f33395S, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i57, E2.f33389M);
            int i58 = N2.f34256l;
            int i59 = M2.f33878G5;
            int i60 = E2.f33399W;
            int i61 = E2.f33397U;
            f34384Q = new b("PEACOCK", 12, "peacock", i58, i59, i60, i61, E2.f33398V, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i61, E2.f33389M);
            int i62 = N2.f34257m;
            int i63 = M2.f33886H5;
            int i64 = E2.f33402Z;
            int i65 = E2.f33400X;
            f34385R = new b("POOL", 13, "pool", i62, i63, i64, i65, E2.f33401Y, E2.f33387K, E2.f33383G, E2.f33386J, E2.f33388L, E2.f33384H, i65, E2.f33389M);
            f34386S = new b("BLACK", 14, "black", N2.f34247c, M2.f34222x5, E2.f33432u, E2.f33409d, E2.f33411e, E2.f33413f, E2.f33425n, E2.f33428q, E2.f33430s, E2.f33426o, E2.f33378B, E2.f33431t);
            f34388U = c();
            f34387T = new HashMap();
            for (b bVar : values()) {
                f34387T.put(bVar.t(), bVar);
            }
        }

        private b(String str, int i8, String str2, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f34393o = str2;
            this.f34394s = i9;
            this.f34395t = i10;
            this.f34396u = i11;
            this.f34397v = i12;
            this.f34398w = i13;
            this.f34399x = i14;
            this.f34400y = i15;
            this.f34401z = i16;
            this.f34389A = i17;
            this.f34390B = i18;
            this.f34391C = i19;
            this.f34392D = i20;
        }

        private static /* synthetic */ b[] c() {
            return new b[]{f34372E, f34373F, f34374G, f34375H, f34376I, f34377J, f34378K, f34379L, f34380M, f34381N, f34382O, f34383P, f34384Q, f34385R, f34386S};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f34388U.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int y(Context context, b bVar, b bVar2) {
            return context.getString(bVar.s()).compareTo(context.getString(bVar2.s()));
        }

        public static Comparator z(final Context context) {
            return new Comparator() { // from class: com.headcode.ourgroceries.android.S4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return R4.b.y(context, (R4.b) obj, (R4.b) obj2);
                }
            };
        }

        public int g() {
            return this.f34391C;
        }

        public int h() {
            return this.f34397v;
        }

        public int i() {
            return this.f34400y;
        }

        public int k() {
            return this.f34398w;
        }

        public int l() {
            return this.f34401z;
        }

        public int m() {
            return this.f34399x;
        }

        public int p() {
            return this.f34390B;
        }

        public int q() {
            return this.f34389A;
        }

        public int r() {
            return this.f34392D;
        }

        public int s() {
            return this.f34395t;
        }

        public String t() {
            return this.f34393o;
        }

        public int u() {
            return this.f34396u;
        }

        public int v() {
            return this.f34394s;
        }

        public boolean w() {
            return this == f34374G;
        }

        public boolean x() {
            return this == f34373F || this == f34372E || this == f34374G;
        }
    }

    private static b a(Context context) {
        return e(context) ? b.f34386S : b.f34373F;
    }

    public static b b(Context context, b bVar) {
        return bVar == b.f34374G ? a(context) : bVar;
    }

    private static SharedPreferences c(Context context) {
        return androidx.preference.k.b(context.getApplicationContext());
    }

    public static b d(Context context) {
        SharedPreferences c8 = c(context);
        b bVar = f34368a;
        String string = c8.getString("theme", bVar.t());
        if ("fresh".equals(string)) {
            string = b.f34373F.t();
        }
        b bVar2 = (b) b.f34387T.get(string);
        return bVar2 == null ? bVar : bVar2;
    }

    private static boolean e(Context context) {
        return Build.VERSION.SDK_INT >= 29 && (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static a f(Activity activity) {
        b d8 = d(activity);
        activity.setTheme(b(activity, d8).v());
        return new a(activity, d8);
    }

    public static void g(Context context, b bVar) {
        c(context).edit().putString("theme", bVar.t()).apply();
    }
}
