package com.headcode.ourgroceries.android;

import a6.AbstractC0829f;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.protobuf.InvalidProtocolBufferException;
import com.headcode.ourgroceries.android.C5688z0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import q5.AbstractC6635a;
import s5.C6755v;
import s5.EnumC6743i;
import s5.EnumC6746l;
import t5.AbstractC6803e;
import t5.AbstractC6804f;
import v6.C6845a;

/* loaded from: classes2.dex */
public final class A2 {

    /* renamed from: n0, reason: collision with root package name */
    public static A2 f33140n0;

    /* renamed from: A, reason: collision with root package name */
    private String f33141A;

    /* renamed from: B, reason: collision with root package name */
    private C6755v f33142B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f33143C;

    /* renamed from: D, reason: collision with root package name */
    private int f33144D;

    /* renamed from: E, reason: collision with root package name */
    private int f33145E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f33146F;

    /* renamed from: G, reason: collision with root package name */
    private final SharedPreferences f33147G;

    /* renamed from: H, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f33148H;

    /* renamed from: I, reason: collision with root package name */
    private final String f33149I;

    /* renamed from: J, reason: collision with root package name */
    private final String f33150J;

    /* renamed from: K, reason: collision with root package name */
    private final String f33151K;

    /* renamed from: L, reason: collision with root package name */
    private final String f33152L;

    /* renamed from: M, reason: collision with root package name */
    private final String f33153M;

    /* renamed from: N, reason: collision with root package name */
    private final String f33154N;

    /* renamed from: O, reason: collision with root package name */
    private final String f33155O;

    /* renamed from: P, reason: collision with root package name */
    private final String f33156P;

    /* renamed from: Q, reason: collision with root package name */
    private final String f33157Q;

    /* renamed from: R, reason: collision with root package name */
    private final String f33158R;

    /* renamed from: S, reason: collision with root package name */
    private final String f33159S;

    /* renamed from: T, reason: collision with root package name */
    private final String f33160T;

    /* renamed from: U, reason: collision with root package name */
    private final String f33161U;

    /* renamed from: V, reason: collision with root package name */
    private final String f33162V;

    /* renamed from: W, reason: collision with root package name */
    private final String f33163W;

    /* renamed from: X, reason: collision with root package name */
    private final String f33164X;

    /* renamed from: Y, reason: collision with root package name */
    private final String f33165Y;

    /* renamed from: Z, reason: collision with root package name */
    private final String f33166Z;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f33167a;

    /* renamed from: a0, reason: collision with root package name */
    private final String f33168a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33169b;

    /* renamed from: b0, reason: collision with root package name */
    public final String f33170b0;

    /* renamed from: c, reason: collision with root package name */
    private String f33171c;

    /* renamed from: c0, reason: collision with root package name */
    private final String f33172c0;

    /* renamed from: d, reason: collision with root package name */
    private String f33173d;

    /* renamed from: d0, reason: collision with root package name */
    private final String f33174d0;

    /* renamed from: e, reason: collision with root package name */
    private String f33175e;

    /* renamed from: e0, reason: collision with root package name */
    private final String f33176e0;

    /* renamed from: f, reason: collision with root package name */
    private String f33177f;

    /* renamed from: f0, reason: collision with root package name */
    private final String f33178f0;

    /* renamed from: g, reason: collision with root package name */
    private String f33179g;

    /* renamed from: g0, reason: collision with root package name */
    private final String f33180g0;

    /* renamed from: h, reason: collision with root package name */
    private String f33181h;

    /* renamed from: h0, reason: collision with root package name */
    private final String f33182h0;

    /* renamed from: i, reason: collision with root package name */
    private long f33183i;

    /* renamed from: i0, reason: collision with root package name */
    private final String f33184i0;

    /* renamed from: j, reason: collision with root package name */
    private int f33185j;

    /* renamed from: j0, reason: collision with root package name */
    private final String f33186j0;

    /* renamed from: k, reason: collision with root package name */
    private int f33187k;

    /* renamed from: k0, reason: collision with root package name */
    private final C6845a f33188k0;

    /* renamed from: l0, reason: collision with root package name */
    private final AbstractC0829f f33190l0;

    /* renamed from: m0, reason: collision with root package name */
    private final HashSet f33192m0;

    /* renamed from: q, reason: collision with root package name */
    private String f33196q;

    /* renamed from: r, reason: collision with root package name */
    private String f33197r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f33198s;

    /* renamed from: u, reason: collision with root package name */
    private int f33200u;

    /* renamed from: x, reason: collision with root package name */
    private long f33203x;

    /* renamed from: y, reason: collision with root package name */
    private String f33204y;

    /* renamed from: z, reason: collision with root package name */
    private String f33205z;

    /* renamed from: l, reason: collision with root package name */
    private List f33189l = Collections.emptyList();

    /* renamed from: m, reason: collision with root package name */
    private List f33191m = Collections.emptyList();

    /* renamed from: n, reason: collision with root package name */
    private List f33193n = Collections.emptyList();

    /* renamed from: o, reason: collision with root package name */
    private List f33194o = Collections.emptyList();

    /* renamed from: p, reason: collision with root package name */
    private List f33195p = Collections.emptyList();

    /* renamed from: t, reason: collision with root package name */
    private Z1 f33199t = new Z1();

    /* renamed from: v, reason: collision with root package name */
    private s5.X f33201v = s5.X.NOT_OFFERED;

    /* renamed from: w, reason: collision with root package name */
    private s5.W f33202w = s5.W.UNKNOWN_SCREEN;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33206a;

        static {
            int[] iArr = new int[EnumC6746l.values().length];
            f33206a = iArr;
            try {
                iArr[EnumC6746l.AC_LEAVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33206a[EnumC6746l.AC_ASK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33206a[EnumC6746l.AC_GUESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        NONE,
        FIRST_WORD,
        EVERY_WORD
    }

    public interface c {

        public enum a {
            CLIENT_ID
        }

        void a(a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface d {
        Object a(byte[] bArr);
    }

    public enum e {
        SHORT_PRESS,
        LONG_PRESS,
        SWIPE
    }

    private A2(Context context) {
        C6845a O7 = C6845a.O();
        this.f33188k0 = O7;
        this.f33190l0 = O7.n();
        this.f33192m0 = new HashSet();
        this.f33167a = context.getSharedPreferences("OurGroceriesPreferences", 0);
        Z();
        this.f33147G = androidx.preference.k.b(context);
        this.f33149I = context.getString(M2.f34126l5);
        this.f33150J = context.getString(M2.f34134m5);
        this.f33151K = context.getString(M2.f34142n5);
        this.f33152L = context.getString(M2.f34029Z4);
        this.f33153M = context.getString(M2.f34038a5);
        this.f33154N = context.getString(M2.f34070e5);
        this.f33155O = context.getString(M2.f34062d5);
        this.f33156P = context.getString(M2.f34054c5);
        this.f33157Q = context.getString(M2.f34046b5);
        this.f33158R = context.getString(M2.f33978T1);
        this.f33159S = context.getString(M2.f33994V1);
        this.f33160T = context.getString(M2.f33986U1);
        this.f33161U = context.getString(M2.f34102i5);
        this.f33162V = context.getString(M2.f34110j5);
        this.f33163W = context.getString(M2.f34118k5);
        this.f33164X = context.getString(M2.f34194u1);
        this.f33165Y = context.getString(M2.f34210w1);
        this.f33166Z = context.getString(M2.f34202v1);
        this.f33168a0 = context.getString(M2.f34218x1);
        this.f33170b0 = context.getString(M2.f33913L0);
        this.f33172c0 = context.getString(M2.f33945P0);
        this.f33174d0 = context.getString(M2.f33929N0);
        this.f33176e0 = context.getString(M2.f33937O0);
        this.f33178f0 = context.getString(M2.f34058d1);
        this.f33180g0 = context.getString(M2.f34066e1);
        this.f33182h0 = context.getString(M2.f34074f1);
        this.f33184i0 = context.getString(M2.f34082g1);
        this.f33186j0 = context.getString(M2.f33924M3);
        M0();
        b0();
        c0();
        androidx.preference.k.n(context, P2.f34325a, false);
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.headcode.ourgroceries.android.y2
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                this.f35124o.Y(sharedPreferences, str);
            }
        };
        this.f33148H = onSharedPreferenceChangeListener;
        f0(onSharedPreferenceChangeListener);
    }

    private static List J0(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            try {
                EnumC6743i c8 = EnumC6743i.c(Integer.parseInt(str2, 10));
                if (c8 != null) {
                    arrayList.add(c8);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static Object K0(String str, d dVar) {
        if (str == null) {
            return null;
        }
        try {
            return dVar.a(Base64.decode(str, 0));
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            return null;
        }
    }

    private void M0() {
        this.f33188k0.b(AbstractC6803e.w(this.f33175e));
    }

    public static void T(Context context) {
        if (f33140n0 == null) {
            f33140n0 = new A2(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(SharedPreferences sharedPreferences, String str) {
        AbstractC6635a.a("OG-Preferences", "onSharedPreferenceChanged: " + str);
        if (str.equals(this.f33170b0)) {
            G0();
        }
    }

    private void Z() {
        this.f33171c = this.f33167a.getString("clientID", "");
        this.f33173d = this.f33167a.getString("emailAddress", "");
        this.f33175e = this.f33167a.getString("owningPersonEmailAddress", null);
        this.f33177f = this.f33167a.getString("lastShoppingListID", "");
        this.f33179g = this.f33167a.getString("lastTargetListID", "");
        this.f33181h = this.f33167a.getString("userFriendlyName", "");
        this.f33183i = this.f33167a.getLong("firstDeviceInstall", 0L);
        this.f33185j = this.f33167a.getInt("whatsNewVersionCode", 0);
        this.f33187k = this.f33167a.getInt("privacyPolicyVersion", 0);
        String string = this.f33167a.getString("metaListAdNetworks", null);
        if (string != null) {
            this.f33189l = J0(string);
        }
        String string2 = this.f33167a.getString("shoppingListAdNetworks", null);
        if (string2 != null) {
            this.f33191m = J0(string2);
        }
        String string3 = this.f33167a.getString("shoppingListItemDetailsAdNetworks", null);
        if (string3 != null) {
            this.f33193n = J0(string3);
        }
        String string4 = this.f33167a.getString("recipeAdNetworks", null);
        if (string4 != null) {
            this.f33194o = J0(string4);
        }
        String string5 = this.f33167a.getString("recipeItemDetailsAdNetworks", null);
        if (string5 != null) {
            this.f33195p = J0(string5);
        }
        this.f33196q = this.f33167a.getString("adKeyword", null);
        this.f33197r = this.f33167a.getString("pushToken", "");
        this.f33198s = this.f33167a.getBoolean("userKnowsAboutWatch", false);
        String string6 = this.f33167a.getString("iapIapSet", null);
        if (string6 == null) {
            this.f33199t = new Z1();
        } else {
            try {
                this.f33199t = Z1.e(new JSONObject(string6));
            } catch (JSONException unused) {
                this.f33199t = new Z1();
            }
        }
        this.f33200u = this.f33167a.getInt("features", 0);
        this.f33143C = this.f33167a.getBoolean("userLastChangedAskCategory", false);
        this.f33144D = this.f33167a.getInt("userSetItemCategoryCount", 0);
        this.f33145E = this.f33167a.getInt("userClearedItemCategoryCount", 0);
        s5.X c8 = s5.X.c(this.f33167a.getInt("onboardingState", -1));
        if (c8 == null) {
            c8 = s5.X.NOT_OFFERED;
        }
        this.f33201v = c8;
        s5.W c9 = s5.W.c(this.f33167a.getInt("lastOnboardingScreen", -1));
        if (c9 == null) {
            c9 = s5.W.UNKNOWN_SCREEN;
        }
        this.f33202w = c9;
        this.f33203x = this.f33167a.getLong("teamUpgraded", 0L);
        this.f33204y = this.f33167a.getString("tourAppVersion", null);
        this.f33205z = this.f33167a.getString("installReferrer", null);
        this.f33141A = this.f33167a.getString("storeCountryCode", null);
        this.f33142B = (C6755v) K0(this.f33167a.getString("discountableProduct", null), new d() { // from class: com.headcode.ourgroceries.android.z2
            @Override // com.headcode.ourgroceries.android.A2.d
            public final Object a(byte[] bArr) {
                return C6755v.B(bArr);
            }
        });
        this.f33146F = this.f33167a.getBoolean("eeaukAccelerateUpgradeNagAtLaunch", true);
        boolean isEmpty = this.f33171c.isEmpty();
        this.f33169b = isEmpty;
        if (isEmpty) {
            this.f33171c = d();
            this.f33187k = 2;
            this.f33185j = 60003;
            this.f33201v = s5.X.IN_PROGRESS;
            this.f33146F = false;
            g0();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ClientID is ");
        sb.append(this.f33171c);
        sb.append(this.f33169b ? " (first run)" : "");
        AbstractC6635a.a("OG-Preferences", sb.toString());
    }

    private static boolean a0(com.google.protobuf.a aVar, com.google.protobuf.a aVar2) {
        if (aVar == null && aVar2 == null) {
            return true;
        }
        if (aVar == null || aVar2 == null) {
            return false;
        }
        return Arrays.equals(aVar.d(), aVar2.d());
    }

    private static String b(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC6743i enumC6743i = (EnumC6743i) it.next();
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(enumC6743i.e());
        }
        return sb.toString();
    }

    private void b0() {
        try {
            if (this.f33147G.contains(this.f33170b0)) {
                boolean z7 = this.f33147G.getBoolean(this.f33170b0, false);
                String str = z7 ? this.f33174d0 : this.f33172c0;
                AbstractC6635a.d("OG-Preferences", "Migrating ask for category from " + z7 + " to " + str);
                StringBuilder sb = new StringBuilder();
                sb.append("migCat");
                sb.append(z7 ? "Ask" : "Leave");
                AbstractC5673x.a(sb.toString());
                this.f33147G.edit().putString(this.f33170b0, str).apply();
            }
        } catch (ClassCastException unused) {
        }
    }

    private void c0() {
        try {
            boolean z7 = this.f33147G.getBoolean(this.f33178f0, false);
            String str = z7 ? this.f33182h0 : this.f33180g0;
            AbstractC6635a.d("OG-Preferences", "Migrating capitalize items from " + z7 + " to " + str);
            StringBuilder sb = new StringBuilder();
            sb.append("migCap");
            sb.append(z7 ? "Sentence" : "None");
            AbstractC5673x.a(sb.toString());
            this.f33147G.edit().putString(this.f33178f0, str).apply();
        } catch (ClassCastException unused) {
        }
    }

    public static String d() {
        return AbstractC6804f.a();
    }

    private void d0(c.a aVar) {
        Iterator it = this.f33192m0.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(aVar);
        }
    }

    private static String e0(com.google.protobuf.a aVar) {
        if (aVar == null) {
            return null;
        }
        return Base64.encodeToString(aVar.d(), 2);
    }

    private void g0() {
        this.f33167a.edit().clear().putString("clientID", this.f33171c).putString("emailAddress", this.f33173d).putString("owningPersonEmailAddress", this.f33175e).putString("lastShoppingListID", this.f33177f).putString("lastTargetListID", this.f33179g).putString("userFriendlyName", this.f33181h).putLong("firstDeviceInstall", this.f33183i).putInt("whatsNewVersionCode", this.f33185j).putInt("privacyPolicyVersion", this.f33187k).putString("metaListAdNetworks", b(this.f33189l)).putString("shoppingListAdNetworks", b(this.f33191m)).putString("shoppingListItemDetailsAdNetworks", b(this.f33193n)).putString("recipeAdNetworks", b(this.f33194o)).putString("recipeItemDetailsAdNetworks", b(this.f33195p)).putString("adKeyword", this.f33196q).putString("pushToken", this.f33197r).putBoolean("userKnowsAboutWatch", this.f33198s).putString("iapIapSet", this.f33199t.h().toString()).putInt("features", this.f33200u).putBoolean("userLastChangedAskCategory", this.f33143C).putInt("userSetItemCategoryCount", this.f33144D).putInt("userClearedItemCategoryCount", this.f33145E).putInt("onboardingState", this.f33201v.e()).putInt("lastOnboardingScreen", this.f33202w.e()).putLong("teamUpgraded", this.f33203x).putString("tourAppVersion", this.f33204y).putString("installReferrer", this.f33205z).putString("storeCountryCode", this.f33141A).putString("discountableProduct", e0(this.f33142B)).putBoolean("eeaukAccelerateUpgradeNagAtLaunch", this.f33146F).apply();
    }

    private int l() {
        return this.f33200u;
    }

    public synchronized String A() {
        return this.f33197r;
    }

    public synchronized void A0(List list) {
        if (!this.f33191m.equals(list)) {
            this.f33191m = DesugarCollections.unmodifiableList(new ArrayList(list));
            g0();
        }
    }

    public synchronized List B() {
        return this.f33194o;
    }

    public synchronized void B0(List list) {
        if (!this.f33193n.equals(list)) {
            this.f33193n = DesugarCollections.unmodifiableList(new ArrayList(list));
            g0();
        }
    }

    public synchronized List C() {
        return this.f33195p;
    }

    public boolean C0(String str) {
        if (Objects.equals(str, this.f33141A)) {
            return false;
        }
        this.f33141A = str;
        g0();
        return true;
    }

    public synchronized String D() {
        return this.f33173d;
    }

    public void D0(long j8) {
        if (j8 != this.f33203x) {
            this.f33203x = j8;
            g0();
        }
    }

    public synchronized List E() {
        return this.f33191m;
    }

    public void E0(String str) {
        if (Objects.equals(str, this.f33204y)) {
            return;
        }
        this.f33204y = str;
        g0();
    }

    public synchronized List F() {
        return this.f33193n;
    }

    public void F0(boolean z7) {
        if (z7 != this.f33198s) {
            this.f33198s = z7;
            g0();
        }
    }

    public C5688z0.c G() {
        String string = this.f33147G.getString(this.f33152L, this.f33155O);
        return (string == null || string.equals(this.f33153M)) ? C5688z0.c.ALPHABETICALLY : string.equals(this.f33154N) ? C5688z0.c.RECENT_AT_BOTTOM : string.equals(this.f33156P) ? C5688z0.c.BY_FREQUENCY : string.equals(this.f33157Q) ? C5688z0.c.BY_DRAG_AND_DROP : C5688z0.c.RECENT_AT_TOP;
    }

    public void G0() {
        if (this.f33143C) {
            return;
        }
        this.f33143C = true;
        g0();
    }

    public String H() {
        return this.f33152L;
    }

    public synchronized void H0(int i8) {
        if (i8 != this.f33185j) {
            this.f33185j = i8;
            g0();
        }
    }

    public C5688z0.d I() {
        String string = this.f33147G.getString(this.f33149I, this.f33151K);
        return (string == null || string.equals(this.f33151K)) ? C5688z0.d.BY_DRAG_AND_DROP : C5688z0.d.ALPHABETICALLY;
    }

    public boolean I0() {
        String string = this.f33147G.getString(this.f33161U, this.f33162V);
        return string != null && string.equals(this.f33163W);
    }

    public String J() {
        return this.f33149I;
    }

    public String K() {
        return this.f33141A;
    }

    public long L() {
        return this.f33203x;
    }

    public void L0(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f33147G.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public String M() {
        return this.f33204y;
    }

    public int N() {
        return this.f33145E;
    }

    public synchronized void N0() {
        if (2 != this.f33187k) {
            this.f33187k = 2;
            g0();
        }
    }

    public boolean O() {
        return this.f33143C;
    }

    public boolean O0() {
        return this.f33198s;
    }

    public int P() {
        return this.f33144D;
    }

    public synchronized int Q() {
        return this.f33185j;
    }

    public void R() {
        this.f33145E++;
        g0();
    }

    public void S() {
        this.f33144D++;
        g0();
    }

    public boolean U(s5.G g8) {
        return (g8.e() & l()) != 0;
    }

    public synchronized boolean V() {
        return this.f33169b;
    }

    public synchronized boolean W() {
        return this.f33187k < 2;
    }

    public boolean X() {
        return !w().isEmpty();
    }

    public void c(c cVar) {
        this.f33192m0.add(cVar);
        if (this.f33192m0.size() > 5) {
            AbstractC6635a.f("OG-Preferences", "Possible event listener leak (" + this.f33192m0.size() + " listeners)");
        }
    }

    public EnumC6746l e() {
        String f8 = f();
        return f8.equals(this.f33174d0) ? EnumC6746l.AC_ASK : f8.equals(this.f33176e0) ? EnumC6746l.AC_GUESS : EnumC6746l.AC_LEAVE;
    }

    public String f() {
        String str;
        try {
            str = this.f33147G.getString(this.f33170b0, this.f33176e0);
        } catch (ClassCastException unused) {
            boolean z7 = this.f33147G.getBoolean(this.f33170b0, false);
            String str2 = z7 ? this.f33174d0 : this.f33172c0;
            AbstractC6635a.b("OG-Preferences", "Migrating ask for category from " + z7 + " to " + str2);
            str = str2;
        }
        return str == null ? this.f33176e0 : str;
    }

    public void f0(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f33147G.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public b g() {
        String str;
        try {
            str = this.f33147G.getString(this.f33178f0, this.f33180g0);
        } catch (ClassCastException unused) {
            boolean z7 = this.f33147G.getBoolean(this.f33178f0, false);
            String str2 = z7 ? this.f33182h0 : this.f33180g0;
            AbstractC6635a.b("OG-Preferences", "Migrating capitalize items from " + z7 + " to " + str2);
            str = str2;
        }
        if (str == null) {
            str = this.f33180g0;
        }
        return str.equals(this.f33182h0) ? b.FIRST_WORD : str.equals(this.f33184i0) ? b.EVERY_WORD : b.NONE;
    }

    public synchronized String h() {
        return this.f33171c;
    }

    public void h0(EnumC6746l enumC6746l) {
        i0(enumC6746l);
        this.f33143C = false;
        this.f33144D = 0;
        this.f33145E = 0;
        g0();
    }

    public e i() {
        String string = this.f33147G.getString(this.f33164X, this.f33165Y);
        return (string == null || string.equals(this.f33165Y)) ? e.SHORT_PRESS : string.equals(this.f33166Z) ? e.LONG_PRESS : string.equals(this.f33168a0) ? e.SWIPE : e.SHORT_PRESS;
    }

    public void i0(EnumC6746l enumC6746l) {
        int i8 = a.f33206a[enumC6746l.ordinal()];
        this.f33147G.edit().putString(this.f33170b0, i8 != 2 ? i8 != 3 ? this.f33172c0 : this.f33176e0 : this.f33174d0).apply();
    }

    public C6755v j() {
        return this.f33142B;
    }

    public synchronized void j0(String str) {
        if (AbstractC6803e.o(str)) {
            throw new IllegalArgumentException("clientId must be non-empty");
        }
        if (str.equals(this.f33171c)) {
            return;
        }
        this.f33171c = str;
        g0();
        AbstractC6635a.a("OG-Preferences", "ClientId is " + this.f33171c + " (changed)");
        d0(c.a.CLIENT_ID);
    }

    public boolean k() {
        return this.f33146F;
    }

    public void k0(C6755v c6755v) {
        if (a0(c6755v, this.f33142B)) {
            return;
        }
        this.f33142B = c6755v;
        g0();
    }

    public void l0(boolean z7) {
        if (this.f33146F != z7) {
            this.f33146F = z7;
            g0();
        }
    }

    public boolean m() {
        String string = this.f33147G.getString(this.f33158R, this.f33159S);
        return string != null && string.equals(this.f33160T);
    }

    public void m0(int i8) {
        if (i8 != this.f33200u) {
            this.f33200u = i8;
            g0();
        }
    }

    public String n() {
        return this.f33158R;
    }

    public synchronized void n0(long j8) {
        if (j8 != this.f33183i) {
            this.f33183i = j8;
            g0();
        }
    }

    public Z1 o() {
        return this.f33199t;
    }

    public void o0(Z1 z12) {
        if (z12 == null) {
            z12 = new Z1();
        }
        if (z12.equals(this.f33199t)) {
            return;
        }
        this.f33199t = z12;
        g0();
    }

    public String p() {
        return this.f33205z;
    }

    public void p0(String str) {
        if (Objects.equals(str, this.f33205z)) {
            return;
        }
        this.f33205z = str;
        g0();
    }

    public synchronized String q() {
        String str;
        str = this.f33177f;
        if (str == null) {
            str = "";
        }
        return str;
    }

    public synchronized void q0(String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(this.f33177f)) {
                return;
            }
            this.f33177f = str;
            g0();
        } catch (Throwable th) {
            throw th;
        }
    }

    public s5.W r() {
        return this.f33202w;
    }

    public void r0(s5.W w7) {
        if (w7 != this.f33202w) {
            this.f33202w = w7;
            g0();
        }
    }

    public synchronized String s() {
        return this.f33179g;
    }

    public synchronized void s0(String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(this.f33179g)) {
                return;
            }
            this.f33179g = str;
            g0();
        } catch (Throwable th) {
            throw th;
        }
    }

    public String t() {
        return this.f33161U;
    }

    public synchronized void t0(List list) {
        if (!this.f33189l.equals(list)) {
            this.f33189l = DesugarCollections.unmodifiableList(new ArrayList(list));
            g0();
        }
    }

    public synchronized List u() {
        return this.f33189l;
    }

    public void u0(s5.X x7) {
        if (x7 != this.f33201v) {
            this.f33201v = x7;
            g0();
        }
    }

    public s5.X v() {
        return this.f33201v;
    }

    public synchronized void v0(String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (!str.equals(this.f33175e)) {
                this.f33175e = str;
                g0();
                M0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String w() {
        return AbstractC6803e.w(this.f33175e);
    }

    public synchronized void w0(String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (!str.equals(this.f33197r)) {
                this.f33197r = str;
                g0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public AbstractC0829f x() {
        return this.f33190l0;
    }

    public synchronized void x0(List list) {
        if (!this.f33194o.equals(list)) {
            this.f33194o = DesugarCollections.unmodifiableList(new ArrayList(list));
            g0();
        }
    }

    public boolean y() {
        return this.f33147G.getBoolean(this.f33186j0, true);
    }

    public synchronized void y0(List list) {
        if (!this.f33195p.equals(list)) {
            this.f33195p = DesugarCollections.unmodifiableList(new ArrayList(list));
            g0();
        }
    }

    public String z() {
        return this.f33186j0;
    }

    public synchronized void z0(String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(this.f33173d)) {
                return;
            }
            this.f33173d = str;
            g0();
        } catch (Throwable th) {
            throw th;
        }
    }
}
