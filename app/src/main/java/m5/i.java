package m5;

import a4.AbstractC0822f;
import a4.C0817a;
import a4.C0820d;
import a4.C0821e;
import a4.InterfaceC0818b;
import a4.InterfaceC0819c;
import a6.AbstractC0829f;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.AbstractC5595l6;
import com.headcode.ourgroceries.android.AbstractC5604n;
import com.headcode.ourgroceries.android.AbstractC5673x;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.OurApplication;
import d6.InterfaceC5732b;
import m5.E;
import m5.i;
import q5.AbstractC6635a;
import s5.EnumC6742h;
import v6.C6845a;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0819c f39182a;

    /* renamed from: b, reason: collision with root package name */
    private final C6845a f39183b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC0829f f39184c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5732b f39185d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5732b f39186e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f39187f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39188a;

        static {
            int[] iArr = new int[E.a.values().length];
            f39188a = iArr;
            try {
                iArr[E.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39188a[E.a.NON_PERSONALIZED_ADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39188a[E.a.PERSONALIZED_ADS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'u' uses external variables
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

        /* renamed from: s, reason: collision with root package name */
        public static final b f39189s = new b("UNKNOWN", 0, EnumC6742h.AD_CONSENT_UNKNOWN);

        /* renamed from: t, reason: collision with root package name */
        public static final b f39190t = new b("CONSENT_NOT_REQUIRED", 1, EnumC6742h.AD_CONSENT_NOT_REQUIRED);

        /* renamed from: u, reason: collision with root package name */
        public static final b f39191u;

        /* renamed from: v, reason: collision with root package name */
        public static final b f39192v;

        /* renamed from: w, reason: collision with root package name */
        private static final /* synthetic */ b[] f39193w;

        /* renamed from: o, reason: collision with root package name */
        private final EnumC6742h f39194o;

        static {
            EnumC6742h enumC6742h = EnumC6742h.AD_CONSENT_REQUIRED;
            f39191u = new b("ASKING_USER", 2, enumC6742h);
            f39192v = new b("ANSWER_RECEIVED", 3, enumC6742h);
            f39193w = a();
        }

        private b(String str, int i8, EnumC6742h enumC6742h) {
            this.f39194o = enumC6742h;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{f39189s, f39190t, f39191u, f39192v};
        }

        public static b f(int i8) {
            if (i8 == 0) {
                return f39189s;
            }
            if (i8 == 1) {
                return f39190t;
            }
            if (i8 == 2) {
                return f39191u;
            }
            if (i8 == 3) {
                return f39192v;
            }
            AbstractC6635a.b("OG-AdConsent", "Unknown consent status " + i8);
            return f39189s;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f39193w.clone();
        }

        public EnumC6742h c() {
            return this.f39194o;
        }
    }

    public i(Context context) {
        C6845a O7 = C6845a.O();
        this.f39183b = O7;
        AbstractC0829f n8 = O7.n();
        this.f39184c = n8;
        this.f39185d = n8.E(new f6.d() { // from class: m5.e
            @Override // f6.d
            public final void accept(Object obj) {
                i.p((i.b) obj);
            }
        });
        this.f39186e = AbstractC5604n.f34920a.E(new f6.d() { // from class: m5.f
            @Override // f6.d
            public final void accept(Object obj) {
                this.f39177o.q((String) obj);
            }
        });
        this.f39187f = false;
        this.f39182a = AbstractC0822f.a(context);
    }

    private void j(Activity activity) {
        E.a a8 = E.g(OurApplication.f34286H).a();
        if (this.f39182a.a() == 3 && a.f39188a[a8.ordinal()] == 1) {
            u(activity);
        }
    }

    private static C0817a k(Context context) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(Activity activity, C0821e c0821e) {
        if (c0821e == null) {
            AbstractC5673x.a("cmpAskSuccess");
            j(activity);
        } else {
            AbstractC5673x.a("cmpAskError" + c0821e.a());
            AbstractC6635a.b("OG-AdConsent", String.format("loadAndShowConsentFormIfRequired failed: %s %s", Integer.valueOf(c0821e.a()), c0821e.b()));
        }
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(C0821e c0821e) {
        this.f39187f = false;
        AbstractC5673x.a("cmpUpdateError" + c0821e.a());
        AbstractC6635a.b("OG-AdConsent", String.format("requestConsentInfoUpdate failed: %s %s", Integer.valueOf(c0821e.a()), c0821e.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(b bVar) {
        AbstractC6635a.d("OG-AdConsent", "status update: " + bVar);
        AbstractC5673x.a("cmpStatus" + bVar.name());
        OurApplication.f34286H.n().J0();
        A2 a22 = A2.f33140n0;
        if (a22.k()) {
            a22.l0(false);
            if (bVar == b.f39191u) {
                AbstractC5673x.a("cmpShowSoonExisting");
                AbstractC5595l6.c(OurApplication.f34286H);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(String str) {
        if (OurApplication.f34286H.o().U().f() || this.f39183b.Q() != b.f39191u) {
            return;
        }
        AbstractC5673x.a("cmpShowSoonSignIn");
        AbstractC5595l6.c(OurApplication.f34286H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(Activity activity, View view) {
        AbstractC5673x.a("cmpGuiltAllowAds");
        v(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(Activity activity, C0821e c0821e) {
        w();
        if (c0821e == null) {
            AbstractC5673x.a("cmpSettingsSuccess");
            j(activity);
            return;
        }
        AbstractC5673x.a("cmpSettingsError" + c0821e.a());
        AbstractC6635a.b("OG-AdConsent", String.format("showPrivacyOptionsForm failed: %s %s", Integer.valueOf(c0821e.a()), c0821e.b()));
    }

    private void u(final Activity activity) {
        View rootView = activity.getWindow().getDecorView().getRootView();
        if (rootView == null) {
            AbstractC5673x.a("cmpGuiltNoView");
            return;
        }
        AbstractC5673x.a("cmpGuiltShow");
        Snackbar.o0(rootView, activity.getString(M2.f34192u, activity.getString(M2.f34208w)), 0).q0(M2.f34184t, new View.OnClickListener() { // from class: m5.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39180o.r(activity, view);
            }
        }).Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        b f8 = b.f(this.f39182a.a());
        AbstractC6635a.d("OG-AdConsent", "CMP status: " + f8);
        this.f39183b.b(f8);
        if (f8 == b.f39192v) {
            E.a a8 = E.g(OurApplication.f34286H).a();
            AbstractC6635a.d("OG-AdConsent", "CMP consent level: " + a8);
            AbstractC5673x.a("cmpLevel" + a8);
        }
    }

    public void h(final Activity activity) {
        AbstractC5673x.a("cmpAsk");
        AbstractC0822f.b(activity, new InterfaceC0818b.a() { // from class: m5.g
            @Override // a4.InterfaceC0818b.a
            public final void a(C0821e c0821e) {
                this.f39178a.n(activity, c0821e);
            }
        });
    }

    public boolean i() {
        this.f39182a.a();
        return true;
    }

    public b l() {
        b bVar = (b) this.f39183b.Q();
        return bVar == null ? b.f39189s : bVar;
    }

    public void m(Activity activity) {
        if (this.f39187f) {
            return;
        }
        this.f39187f = true;
        this.f39182a.c(activity, new C0820d.a().c(false).b(k(activity)).a(), new InterfaceC0819c.b() { // from class: m5.b
            @Override // a4.InterfaceC0819c.b
            public final void a() {
                this.f39173a.w();
            }
        }, new InterfaceC0819c.a() { // from class: m5.c
            @Override // a4.InterfaceC0819c.a
            public final void a(C0821e c0821e) {
                this.f39174a.o(c0821e);
            }
        });
        w();
    }

    public boolean t() {
        return this.f39182a.b() == InterfaceC0819c.EnumC0131c.REQUIRED;
    }

    public void v(final Activity activity) {
        AbstractC5673x.a("cmpSettings");
        AbstractC0822f.c(activity, new InterfaceC0818b.a() { // from class: m5.d
            @Override // a4.InterfaceC0818b.a
            public final void a(C0821e c0821e) {
                this.f39175a.s(activity, c0821e);
            }
        });
    }
}
