package com.headcode.ourgroceries.android;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import com.headcode.ourgroceries.android.C5574j1;
import com.headcode.ourgroceries.android.C5587k6;
import com.headcode.ourgroceries.android.SettingsActivity;
import d6.InterfaceC5732b;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import o5.C6302k;
import o5.C6309s;
import org.json.JSONObject;
import q5.AbstractC6635a;
import s5.EnumC6746l;

/* loaded from: classes2.dex */
public class SettingsActivity extends AbstractActivityC5575j2 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34416a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f34417b;

        static {
            int[] iArr = new int[EnumC6746l.values().length];
            f34417b = iArr;
            try {
                iArr[EnumC6746l.AC_LEAVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34417b[EnumC6746l.AC_ASK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34417b[EnumC6746l.AC_GUESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C5587k6.e.values().length];
            f34416a = iArr2;
            try {
                iArr2[C5587k6.e.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34416a[C5587k6.e.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34416a[C5587k6.e.YEARLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34416a[C5587k6.e.LIFETIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34416a[C5587k6.e.NBO.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34416a[C5587k6.e.TEAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class b extends androidx.preference.h {

        /* renamed from: E0, reason: collision with root package name */
        private InterfaceC5732b f34420E0;

        /* renamed from: C0, reason: collision with root package name */
        private final C5574j1.d f34418C0 = new C5574j1.d() { // from class: com.headcode.ourgroceries.android.h3
            @Override // com.headcode.ourgroceries.android.C5574j1.d
            public final void P(C5688z0 c5688z0) {
                this.f34754o.M2(c5688z0);
            }
        };

        /* renamed from: D0, reason: collision with root package name */
        private final SharedPreferences.OnSharedPreferenceChangeListener f34419D0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.headcode.ourgroceries.android.i3
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                this.f34765o.N2(sharedPreferences, str);
            }
        };

        /* renamed from: F0, reason: collision with root package name */
        private boolean f34421F0 = false;

        /* renamed from: G0, reason: collision with root package name */
        private final Handler f34422G0 = new Handler(Looper.getMainLooper());

        private void H2(Context context) {
            String str = "Settings types: " + new JSONObject((Map) Collection.EL.stream(androidx.preference.k.b(context).getAll().entrySet()).collect(Collectors.toMap(new Function() { // from class: com.headcode.ourgroceries.android.j3
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (String) ((Map.Entry) obj).getKey();
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: com.headcode.ourgroceries.android.k3
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return SettingsActivity.b.L2((Map.Entry) obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }))).toString();
            OurApplication.f34286H.n().u0(str);
            AbstractC6635a.f("OG-SettingsActivity", str);
        }

        private void J2(Preference preference) {
            preference.t0(false);
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                for (int i8 = 0; i8 < preferenceGroup.Q0(); i8++) {
                    J2(preferenceGroup.P0(i8));
                }
            }
        }

        private C5587k6 K2() {
            return OurApplication.f34286H.o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String L2(Map.Entry entry) {
            return entry.getValue().getClass().getSimpleName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void M2(C5688z0 c5688z0) {
            X2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void N2(SharedPreferences sharedPreferences, String str) {
            b3(p());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean O2(Context context, Preference preference) {
            Y1(new Intent(context, (Class<?>) AboutActivity.class));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean P2(Preference preference) {
            Y2();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean Q2(Context context, Preference preference) {
            Y1(new Intent(context, (Class<?>) UpgradeActivity.class));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean R2(Context context, Preference preference) {
            AbstractC5625q.u(context);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean S2(m5.i iVar, Preference preference) {
            AbstractActivityC0911j p8 = p();
            if (p8 == null) {
                return true;
            }
            iVar.v(p8);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean T2(Context context, Preference preference) {
            startActivityForResult(new Intent(context, (Class<?>) CategoriesActivity.class), 9);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean U2(Context context, Preference preference) {
            P1.O(context);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean V2(Context context, Preference preference) {
            P1.Q(context);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void W2() {
            AbstractActivityC0911j p8 = p();
            if (p8 == null) {
                AbstractC6635a.f("OG-SettingsActivity", "Resume SYL callback with null activity");
            } else {
                AbstractC5604n.h(p8);
            }
        }

        private void X2() {
            String w7 = A2.f33140n0.w();
            boolean isEmpty = w7.isEmpty();
            String m02 = !isEmpty ? m0(M2.f34176s) : m0(M2.f34213w4);
            String n02 = !isEmpty ? n0(M2.f34168r, w7) : m0(M2.f34205v4);
            Preference I22 = I2(m0(M2.f34197u4));
            I22.D0(m02);
            I22.A0(n02);
            I2(m0(M2.f34141n4)).A0(!isEmpty ? m0(M2.f34157p4) : m0(M2.f34149o4));
        }

        private void Y2() {
            AbstractActivityC0911j p8 = p();
            if (p8 == null) {
                return;
            }
            if (!A2.f33140n0.w().isEmpty()) {
                AbstractC5604n.h(p8);
                return;
            }
            this.f34421F0 = true;
            try {
                C6309s.u2().r2(p8.getSupportFragmentManager(), "unused");
            } catch (IllegalStateException e8) {
                AbstractC6635a.f("OG-SettingsActivity", "shareYourLists: got exception showing dialog box: " + e8);
            }
        }

        private void Z2(String str) {
            ListPreference listPreference = (ListPreference) I2(str);
            CharSequence[] T02 = listPreference.T0();
            CharSequence[] R02 = listPreference.R0();
            int length = T02.length;
            if (length != R02.length) {
                AbstractC6635a.b("OG-SettingsActivity", "Entries and values are of different sizes: " + str);
                return;
            }
            TreeMap treeMap = new TreeMap(P1.f34314f);
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                treeMap.put(R02[i9], T02[i9]);
            }
            CharSequence[] charSequenceArr = new CharSequence[length];
            CharSequence[] charSequenceArr2 = new CharSequence[length];
            for (Map.Entry entry : treeMap.entrySet()) {
                charSequenceArr[i8] = (CharSequence) entry.getKey();
                charSequenceArr2[i8] = (CharSequence) entry.getValue();
                i8++;
            }
            listPreference.X0(charSequenceArr2);
            listPreference.W0(charSequenceArr);
        }

        private void a3() {
            ListPreference listPreference = (ListPreference) I2(m0(M2.f33913L0));
            A2 a22 = A2.f33140n0;
            int i8 = a.f34417b[a22.e().ordinal()];
            listPreference.z0(i8 != 2 ? i8 != 3 ? M2.f33921M0 : M2.f33905K0 : M2.f33897J0);
            listPreference.Y0(a22.f());
        }

        private void b3(Context context) {
            if (context == null) {
                return;
            }
            a3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c3(C5587k6.b bVar) {
            Preference I22 = I2(m0(M2.f34030Z5));
            I22.C0(M2.f34079f6);
            int i8 = a.f34416a[bVar.f34866c.ordinal()];
            I22.z0((i8 == 2 || i8 == 3) ? M2.f34063d6 : i8 != 4 ? i8 != 5 ? i8 != 6 ? M2.f34039a6 : M2.f34071e6 : M2.f34055c6 : M2.f34047b6);
        }

        @Override // androidx.fragment.app.Fragment
        public void E0(int i8, int i9, Intent intent) {
            if (i8 == 9) {
                C6302k.w2(a0());
            }
        }

        public Preference I2(CharSequence charSequence) {
            Preference c8 = c(charSequence);
            if (c8 != null) {
                return c8;
            }
            throw new IllegalArgumentException("preference \"" + ((Object) charSequence) + "\" not found");
        }

        @Override // androidx.preference.h, androidx.fragment.app.Fragment
        public void J0(Bundle bundle) {
            super.J0(bundle);
            this.f34420E0 = K2().N().E(new f6.d() { // from class: com.headcode.ourgroceries.android.t3
                @Override // f6.d
                public final void accept(Object obj) {
                    this.f35021o.c3((C5587k6.b) obj);
                }
            });
        }

        @Override // androidx.fragment.app.Fragment
        public void O0() {
            this.f34420E0.c();
            super.O0();
        }

        @Override // androidx.fragment.app.Fragment
        public void e1() {
            super.e1();
            if (this.f34421F0) {
                this.f34421F0 = false;
                if (A2.f33140n0.w().isEmpty()) {
                    return;
                }
                this.f34422G0.post(new Runnable() { // from class: com.headcode.ourgroceries.android.s3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35009o.W2();
                    }
                });
            }
        }

        @Override // androidx.preference.h, androidx.preference.k.a
        public void f(Preference preference) {
            if (a0().h0("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            DialogInterfaceOnCancelListenerC0906e Q22 = preference instanceof ThemePreference ? ThemePreferenceDialogFragmentCompat.Q2(preference.u()) : preference instanceof PersonalizedAdsPreference ? C5641s2.A2(preference.u()) : null;
            if (Q22 == null) {
                super.f(preference);
            } else {
                Q22.X1(this, 0);
                Q22.r2(a0(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }

        @Override // androidx.preference.h, androidx.fragment.app.Fragment
        public void f1(Bundle bundle) {
            bundle.putBoolean("signingInForShareYourLists", this.f34421F0);
            super.f1(bundle);
        }

        @Override // androidx.preference.h, androidx.fragment.app.Fragment
        public void g1() {
            super.g1();
            OurApplication.f34286H.i().o(this.f34418C0);
            X2();
            A2.f33140n0.f0(this.f34419D0);
            b3(p());
        }

        @Override // androidx.preference.h, androidx.fragment.app.Fragment
        public void h1() {
            super.h1();
            A2.f33140n0.L0(this.f34419D0);
            OurApplication.f34286H.i().x0(this.f34418C0);
        }

        @Override // androidx.preference.h
        public void k2(Bundle bundle, String str) {
            final AbstractActivityC0911j p8 = p();
            if (p8 == null) {
                return;
            }
            try {
                s2(P2.f34325a, str);
                Z2(m0(M2.f34029Z4));
                J2(g2());
                I2(m0(M2.f34056d)).x0(new Preference.d() { // from class: com.headcode.ourgroceries.android.g3
                    @Override // androidx.preference.Preference.d
                    public final boolean a(Preference preference) {
                        return this.f34742a.O2(p8, preference);
                    }
                });
                I2(m0(M2.f34141n4)).x0(new Preference.d() { // from class: com.headcode.ourgroceries.android.l3
                    @Override // androidx.preference.Preference.d
                    public final boolean a(Preference preference) {
                        return this.f34883a.P2(preference);
                    }
                });
                I2(m0(M2.f34030Z5)).x0(new Preference.d() { // from class: com.headcode.ourgroceries.android.m3
                    @Override // androidx.preference.Preference.d
                    public final boolean a(Preference preference) {
                        return this.f34914a.Q2(p8, preference);
                    }
                });
                I2(m0(M2.f34197u4)).x0(new Preference.d() { // from class: com.headcode.ourgroceries.android.n3
                    @Override // androidx.preference.Preference.d
                    public final boolean a(Preference preference) {
                        return SettingsActivity.b.R2(p8, preference);
                    }
                });
                PreferenceCategory preferenceCategory = (PreferenceCategory) I2(m0(M2.f33948P3));
                Preference I22 = I2(m0(M2.f34200v));
                Preference I23 = I2(m0(M2.f33924M3));
                final m5.i f8 = OurApplication.f34286H.f();
                String K7 = A2.f33140n0.K();
                boolean f9 = OurApplication.f34286H.o().U().f();
                if (f8.t()) {
                    I22.x0(new Preference.d() { // from class: com.headcode.ourgroceries.android.o3
                        @Override // androidx.preference.Preference.d
                        public final boolean a(Preference preference) {
                            return this.f34955a.S2(f8, preference);
                        }
                    });
                    preferenceCategory.E0(true);
                    I22.E0(true);
                } else if (!f9 && (K7 == null || K7.equals("US"))) {
                    preferenceCategory.E0(true);
                    I23.E0(true);
                }
                I2(m0(M2.f34106j1)).x0(new Preference.d() { // from class: com.headcode.ourgroceries.android.p3
                    @Override // androidx.preference.Preference.d
                    public final boolean a(Preference preference) {
                        return this.f34968a.T2(p8, preference);
                    }
                });
                I2(m0(M2.f33943O6)).x0(new Preference.d() { // from class: com.headcode.ourgroceries.android.q3
                    @Override // androidx.preference.Preference.d
                    public final boolean a(Preference preference) {
                        return SettingsActivity.b.U2(p8, preference);
                    }
                });
                I2(m0(M2.f33951P6)).x0(new Preference.d() { // from class: com.headcode.ourgroceries.android.r3
                    @Override // androidx.preference.Preference.d
                    public final boolean a(Preference preference) {
                        return SettingsActivity.b.V2(p8, preference);
                    }
                });
                if (bundle == null || !bundle.containsKey("signingInForShareYourLists")) {
                    return;
                }
                this.f34421F0 = bundle.getBoolean("signingInForShareYourLists");
            } catch (ClassCastException e8) {
                H2(p8);
                throw e8;
            }
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(J2.f33687Q);
        L0();
        if (bundle == null) {
            getSupportFragmentManager().o().n(H2.f33559a0, new b()).g();
        }
    }
}
