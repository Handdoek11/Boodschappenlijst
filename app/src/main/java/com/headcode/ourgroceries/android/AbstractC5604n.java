package com.headcode.ourgroceries.android;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import androidx.fragment.app.AbstractActivityC0911j;
import com.headcode.ourgroceries.android.AbstractC5604n;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o5.C6311u;
import q5.AbstractC6635a;
import s5.C6740f;
import s5.C6741g;
import s5.C6752s;
import s5.EnumC6751q;
import s5.g0;
import s5.r;
import t5.AbstractC6803e;
import v6.C6845a;
import v6.C6846b;

/* renamed from: com.headcode.ourgroceries.android.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5604n {

    /* renamed from: a, reason: collision with root package name */
    public static final C6846b f34920a = C6846b.O();

    /* renamed from: b, reason: collision with root package name */
    public static final C6845a f34921b = C6845a.P(Boolean.FALSE);

    /* renamed from: com.headcode.ourgroceries.android.n$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34922a;

        static {
            int[] iArr = new int[g0.c.values().length];
            f34922a = iArr;
            try {
                iArr[g0.c.EMAIL_SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34922a[g0.c.CREATED_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34922a[g0.c.INVALID_PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34922a[g0.c.REPARENTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34922a[g0.c.INVALID_INVITATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34922a[g0.c.INVITATION_EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34922a[g0.c.INVITATION_ALREADY_USED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.n$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f34923a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f34924b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f34925c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f34926d;

        public b(boolean z7, boolean z8, boolean z9, boolean z10) {
            this.f34923a = z7;
            this.f34924b = z8;
            this.f34925c = z9;
            this.f34926d = z10;
        }

        public boolean a() {
            return this.f34923a;
        }

        public boolean b() {
            return this.f34924b;
        }

        public boolean c() {
            return this.f34926d;
        }

        public boolean d() {
            return this.f34925c;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.n$c */
    private static class c extends d {
        public c(h hVar, C5676x2 c5676x2) {
            super(hVar, c5676x2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.headcode.ourgroceries.android.AbstractC5604n.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b c(AbstractRunnableC5500a abstractRunnableC5500a) {
            boolean z7;
            boolean z8;
            String p8 = abstractRunnableC5500a.b().K().p();
            boolean z9 = false;
            boolean z10 = true;
            if (abstractRunnableC5500a.d() == s5.o0.RS_SUCCESS) {
                s5.n0 c8 = abstractRunnableC5500a.c();
                if (c8 != null && c8.x()) {
                    C6741g i8 = c8.i();
                    boolean n8 = i8.n();
                    z8 = i8.p();
                    z7 = i8.q();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Account ");
                    sb.append(p8);
                    sb.append(" info: ");
                    sb.append(n8 ? "account exists" : "account does not exist");
                    sb.append(", ");
                    sb.append(z8 ? "has password" : "does not have password");
                    sb.append(", ");
                    sb.append(z7 ? "valid password" : "invalid password");
                    AbstractC6635a.d("OG-AccountManager", sb.toString());
                    z10 = false;
                    z9 = n8;
                }
                return new b(z9, z8, z7, z10);
            }
            AbstractC6635a.f("OG-AccountManager", "Got network error looking up account info for " + p8 + " (" + abstractRunnableC5500a.d() + ")");
            z7 = false;
            z8 = false;
            return new b(z9, z8, z7, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.headcode.ourgroceries.android.n$d */
    static abstract class d extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final h f34927a;

        /* renamed from: b, reason: collision with root package name */
        private final C5676x2 f34928b;

        /* renamed from: com.headcode.ourgroceries.android.n$d$a */
        class a extends AbstractRunnableC5500a {
            a(s5.h0 h0Var) {
                super(h0Var);
            }

            @Override // com.headcode.ourgroceries.android.AbstractRunnableC5500a
            protected boolean f() {
                return d.this.isCancelled();
            }

            @Override // com.headcode.ourgroceries.android.AbstractRunnableC5500a
            public void h(AbstractRunnableC5500a abstractRunnableC5500a) {
            }
        }

        public d(h hVar, C5676x2 c5676x2) {
            this.f34927a = hVar;
            this.f34928b = c5676x2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Object obj) {
            if (obj != null) {
                this.f34927a.onResult(obj);
            }
            g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            cancel(true);
        }

        protected abstract Object c(AbstractRunnableC5500a abstractRunnableC5500a);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object doInBackground(s5.h0... h0VarArr) {
            boolean z7 = false;
            a aVar = new a(h0VarArr[0]);
            while (!z7) {
                aVar.run();
                if (aVar.d() != s5.o0.RS_SUCCESS && aVar.d() != s5.o0.RS_REQUEST_CANCELLED && aVar.g()) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                z7 = true;
            }
            return c(aVar);
        }

        protected void g() {
        }

        @Override // android.os.AsyncTask
        protected void onCancelled(Object obj) {
            onPostExecute(obj);
        }

        @Override // android.os.AsyncTask
        protected void onPostExecute(final Object obj) {
            this.f34928b.d(new Runnable() { // from class: com.headcode.ourgroceries.android.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34950o.e(obj);
                }
            });
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            this.f34928b.f(new Runnable() { // from class: com.headcode.ourgroceries.android.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34963o.f();
                }
            });
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.n$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f34930a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f34931b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f34932c;

        public e(boolean z7, boolean z8, boolean z9) {
            this.f34930a = z7;
            this.f34931b = z8;
            this.f34932c = z9;
        }

        public boolean a() {
            return this.f34930a;
        }

        public boolean b() {
            return this.f34932c;
        }

        public boolean c() {
            return this.f34931b;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.n$f */
    private static class f extends d {
        public f(h hVar, C5676x2 c5676x2) {
            super(hVar, c5676x2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.headcode.ourgroceries.android.AbstractC5604n.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public e c(AbstractRunnableC5500a abstractRunnableC5500a) {
            boolean z7;
            String p8 = abstractRunnableC5500a.b().R().p();
            boolean z8 = false;
            boolean z9 = true;
            if (abstractRunnableC5500a.d() == s5.o0.RS_SUCCESS) {
                s5.n0 c8 = abstractRunnableC5500a.c();
                if (c8 != null && c8.A()) {
                    C6752s l8 = c8.l();
                    boolean m8 = l8.m();
                    z7 = l8.o();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Delete account ");
                    sb.append(p8);
                    sb.append(": ");
                    sb.append(m8 ? "account was found" : "account was not found");
                    sb.append(", ");
                    sb.append(z7 ? "password was valid" : "invalid password");
                    AbstractC6635a.d("OG-AccountManager", sb.toString());
                    z9 = false;
                    z8 = m8;
                }
                return new e(z8, z7, z9);
            }
            AbstractC6635a.f("OG-AccountManager", "Got network error deleting account for " + p8 + " (" + abstractRunnableC5500a.d() + ")");
            z7 = false;
            return new e(z8, z7, z9);
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.n$g */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        private final String f34933a;

        /* renamed from: b, reason: collision with root package name */
        private final String f34934b;

        /* renamed from: c, reason: collision with root package name */
        private final String f34935c;

        private g(String str, String str2, String str3) {
            this.f34933a = str;
            this.f34934b = str2;
            this.f34935c = str3;
        }

        public static g a(Bundle bundle) {
            String string = bundle.getString("invitationId");
            String string2 = bundle.getString("emailAddress");
            String string3 = bundle.getString("friendlyName");
            if (string == null || string2 == null || string3 == null) {
                throw new IllegalArgumentException("bundle is missing required field");
            }
            return new g(string, string2, string3);
        }

        public static g b(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            String queryParameter = uri.getQueryParameter("email");
            String queryParameter2 = uri.getQueryParameter("friendly");
            if (lastPathSegment == null || queryParameter == null || queryParameter2 == null) {
                return null;
            }
            byte[] decode = Base64.decode(queryParameter, 8);
            Charset charset = StandardCharsets.UTF_8;
            return new g(lastPathSegment, new String(decode, charset), new String(Base64.decode(queryParameter2, 8), charset));
        }

        public String c() {
            return this.f34934b;
        }

        public String d() {
            return this.f34935c;
        }

        public String e() {
            return this.f34933a;
        }

        public Bundle f() {
            Bundle bundle = new Bundle();
            bundle.putString("invitationId", e());
            bundle.putString("emailAddress", c());
            bundle.putString("friendlyName", d());
            return bundle;
        }

        public String toString() {
            return "Invitation{mInvitationId='" + this.f34933a + "', mEmailAddress='" + this.f34934b + "', mFriendlyName='" + this.f34935c + "'}";
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.n$h */
    public interface h {
        void onResult(Object obj);
    }

    /* renamed from: com.headcode.ourgroceries.android.n$i */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        private final String f34936a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f34937b;

        public i(String str, boolean z7) {
            this.f34936a = str;
            this.f34937b = z7;
        }

        public boolean a() {
            return this.f34937b;
        }

        public String b() {
            return this.f34936a;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.n$j */
    private static class j extends d {
        public j(h hVar, C5676x2 c5676x2) {
            super(hVar, c5676x2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.headcode.ourgroceries.android.AbstractC5604n.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public i c(AbstractRunnableC5500a abstractRunnableC5500a) {
            s5.V q8;
            String str = null;
            boolean z7 = true;
            if (abstractRunnableC5500a.d() == s5.o0.RS_SUCCESS) {
                s5.n0 c8 = abstractRunnableC5500a.c();
                if (c8 != null && c8.F() && (q8 = c8.q()) != null) {
                    str = q8.n();
                    AbstractC6635a.d("OG-AccountManager", "makeInvite: URL " + str);
                    z7 = false;
                }
            } else {
                AbstractC6635a.f("OG-AccountManager", "makeInvite: got network error making invite + (" + abstractRunnableC5500a.d() + ")");
            }
            return new i(str, z7);
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.n$k */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        private final g0.c f34938a;

        /* renamed from: b, reason: collision with root package name */
        private final s5.I f34939b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f34940c;

        public k(g0.c cVar, s5.I i8, boolean z7) {
            this.f34938a = cVar;
            this.f34939b = i8;
            this.f34940c = z7;
        }

        public boolean a() {
            return this.f34940c;
        }

        public s5.I b() {
            return this.f34939b;
        }

        public g0.c c() {
            return this.f34938a;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.n$l */
    private static class l extends d {
        public l(h hVar, C5676x2 c5676x2) {
            super(hVar, c5676x2);
        }

        @Override // com.headcode.ourgroceries.android.AbstractC5604n.d
        protected void g() {
            AbstractC5604n.f34921b.b(Boolean.FALSE);
            super.g();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.headcode.ourgroceries.android.AbstractC5604n.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public k c(AbstractRunnableC5500a abstractRunnableC5500a) {
            s5.I i8;
            s5.g0 s8;
            String x7 = abstractRunnableC5500a.b().c0().x();
            g0.c cVar = null;
            boolean z7 = true;
            if (abstractRunnableC5500a.d() == s5.o0.RS_SUCCESS) {
                s5.n0 c8 = abstractRunnableC5500a.c();
                if (c8 != null && c8.H() && (s8 = c8.s()) != null && s8.t()) {
                    g0.c q8 = s8.q();
                    s5.I p8 = s8.s() ? s8.p() : null;
                    z7 = s8.o();
                    AbstractC6635a.d("OG-AccountManager", "Sign in attempt for " + x7 + ": " + q8 + " didCopyData=" + z7);
                    i8 = p8;
                    cVar = q8;
                }
                return new k(cVar, i8, z7);
            }
            AbstractC6635a.f("OG-AccountManager", "Got network error attempting to sign in " + x7 + " (" + abstractRunnableC5500a.d() + ")");
            i8 = null;
            return new k(cVar, i8, z7);
        }

        @Override // com.headcode.ourgroceries.android.AbstractC5604n.d, android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            AbstractC5604n.f34921b.b(Boolean.TRUE);
        }
    }

    public static void c(String str, String str2, C5676x2 c5676x2, h hVar) {
        C6740f.b v7 = C6740f.v().v(str);
        if (str2 != null) {
            v7.w(str2);
        }
        new c(hVar, c5676x2).execute(s5.h0.J0().P(A2.f33140n0.h()).Q(EnumC6751q.VERSION_WITH_CATEGORIES.e()).c0(s5.i0.ACCOUNT_LOOKUP).N(v7).m());
    }

    public static void d(String str, String str2, C5676x2 c5676x2, h hVar) {
        r.b v7 = s5.r.v().v(str);
        if (str2 != null) {
            v7.w(str2);
        }
        new f(hVar, c5676x2).execute(s5.h0.J0().P(A2.f33140n0.h()).Q(EnumC6751q.VERSION_WITH_CATEGORIES.e()).c0(s5.i0.DELETE_ACCOUNT).R(v7).m());
    }

    public static void e(final g gVar, boolean z7, final AbstractActivityC0911j abstractActivityC0911j, final X1 x12) {
        A2 a22 = A2.f33140n0;
        new l(new h() { // from class: com.headcode.ourgroceries.android.m
            @Override // com.headcode.ourgroceries.android.AbstractC5604n.h
            public final void onResult(Object obj) {
                AbstractC5604n.f(abstractActivityC0911j, gVar, x12, (AbstractC5604n.k) obj);
            }
        }, new C5676x2(abstractActivityC0911j, abstractActivityC0911j.getString(M2.f33997V4))).execute(s5.h0.J0().P(a22.h()).Q(EnumC6751q.VERSION_WITH_CATEGORIES.e()).c0(s5.i0.REPARENT).Z(s5.f0.J().x(gVar.c()).y(gVar.e()).z(z7).v(a22.e()).m()).m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(AbstractActivityC0911j abstractActivityC0911j, g gVar, X1 x12, k kVar) {
        boolean z7 = false;
        s5.I b8 = kVar.b();
        B b9 = B.NO_CHANGE;
        if (b8 != null) {
            b9 = i(OurApplication.f34286H.i(), b8);
        }
        if (kVar.c() != null) {
            switch (a.f34922a[kVar.c().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    AbstractC5673x.c("error", null, "inviteLogicErr");
                    AbstractC6635a.b("OG-AccountManager", "handleUseInvite: shouldn't have gotten ReparentStatus=" + kVar.c());
                    break;
                case 4:
                    AbstractC5673x.c("invite", "accepted", null);
                    AbstractC6635a.d("OG-AccountManager", "handleUseInvite: accepted invitation successfully");
                    String string = abstractActivityC0911j.getString(M2.f34115k2, gVar.c());
                    String f8 = b9.f(abstractActivityC0911j);
                    if (f8 != null) {
                        string = string + "\n\n" + f8;
                    }
                    o5.T.t2().f(M2.f34010X1).e(string).g(abstractActivityC0911j);
                    z7 = true;
                    break;
                case 5:
                    AbstractC5673x.c("invite", "handling", "invalid");
                    AbstractC6635a.f("OG-AccountManager", "handleUseInvite: got INVALID_INVITATION");
                    o5.T.t2().f(M2.f34131m2).e(abstractActivityC0911j.getString(M2.f34091h2)).g(abstractActivityC0911j);
                    break;
                case 6:
                case 7:
                    g0.c c8 = kVar.c();
                    g0.c cVar = g0.c.INVITATION_EXPIRED;
                    AbstractC5673x.c("invite", "handling", c8 == cVar ? "expired" : "used");
                    AbstractC6635a.f("OG-AccountManager", "handleUseInvite: got INVITATION_EXPIRED or INVITATION_ALREADY_USED " + kVar.c());
                    o5.T.t2().f(kVar.c() == cVar ? M2.f34083g2 : M2.f34035a2).e(abstractActivityC0911j.getString(M2.f34043b2, gVar.c())).g(abstractActivityC0911j);
                    break;
            }
        } else {
            AbstractC5673x.c("invite", "handling", "cancel");
        }
        if (x12 != null) {
            x12.accept(Boolean.valueOf(z7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(AbstractActivityC0911j abstractActivityC0911j, i iVar) {
        if (iVar.a()) {
            return;
        }
        String string = abstractActivityC0911j.getString(M2.f34099i2, iVar.b());
        String string2 = abstractActivityC0911j.getString(M2.f34139n2);
        String string3 = abstractActivityC0911j.getString(M2.f34147o2);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", string);
        intent.putExtra("android.intent.extra.SUBJECT", string2);
        abstractActivityC0911j.startActivity(Intent.createChooser(intent, string3));
    }

    public static void h(final AbstractActivityC0911j abstractActivityC0911j) {
        new j(new h() { // from class: com.headcode.ourgroceries.android.l
            @Override // com.headcode.ourgroceries.android.AbstractC5604n.h
            public final void onResult(Object obj) {
                AbstractC5604n.g(abstractActivityC0911j, (AbstractC5604n.i) obj);
            }
        }, new C5676x2(abstractActivityC0911j, abstractActivityC0911j.getString(M2.f34123l2))).execute(s5.h0.J0().P(A2.f33140n0.h()).Q(EnumC6751q.VERSION_WITH_CATEGORIES.e()).c0(s5.i0.MAKE_INVITE).X(s5.U.q().v(Build.MODEL)).m());
    }

    public static B i(C5574j1 c5574j1, s5.I i8) {
        boolean z7;
        A2 a22 = A2.f33140n0;
        String n8 = i8.z().n();
        if (AbstractC6803e.o(n8)) {
            z7 = false;
        } else {
            a22.v0(n8);
            z7 = true;
        }
        B b8 = B.NO_CHANGE;
        if (i8.B()) {
            b8 = B.c(a22.e(), i8.s());
            a22.h0(i8.s());
        }
        c5574j1.B0(i8.y());
        if (i8.C()) {
            a22.m0(i8.v());
        }
        if (i8.E()) {
            OurApplication.f34286H.o().s0(i8.A());
        }
        if (z7) {
            f34920a.b(n8);
        }
        return b8;
    }

    public static void j(String str, String str2, boolean z7, C5676x2 c5676x2, h hVar) {
        new l(hVar, c5676x2).execute(s5.h0.J0().P(A2.f33140n0.h()).Q(EnumC6751q.VERSION_WITH_CATEGORIES.e()).c0(s5.i0.REPARENT).Z(s5.f0.J().x(str).A(str2).z(z7).v(A2.f33140n0.e()).m()).m());
    }

    public static void k(AbstractActivityC0911j abstractActivityC0911j, Uri uri, X1 x12) {
        String w7 = A2.f33140n0.w();
        g b8 = g.b(uri);
        if (b8 == null) {
            AbstractC6635a.f("OG-AccountManager", "useInvite: Invalid deeplink: " + uri);
            return;
        }
        AbstractC6635a.d("OG-AccountManager", "useInvite: existingEmail=" + w7 + " invitation=" + b8 + " query=" + uri.getQuery());
        boolean o8 = AbstractC6803e.o(w7);
        boolean z7 = o8 ^ true;
        if (!o8 && w7.equalsIgnoreCase(b8.c())) {
            AbstractC5673x.c("invite", "received", "sameAccount");
            o5.T.t2().f(M2.f34177s0).e(abstractActivityC0911j.getString(M2.f34105j0, w7)).g(abstractActivityC0911j);
            return;
        }
        AbstractC5673x.c("invite", "received", !o8 ? "diffAccount" : "noAccount");
        if (x12 != null) {
            x12.accept(b8);
            return;
        }
        try {
            C6311u.u2(b8, z7).r2(abstractActivityC0911j.getSupportFragmentManager(), "unused");
        } catch (IllegalStateException e8) {
            AbstractC6635a.f("OG-AccountManager", "useInvite: got exception showing dialog box: " + e8);
        }
    }
}
