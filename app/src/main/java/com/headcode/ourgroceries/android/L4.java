package com.headcode.ourgroceries.android;

import A3.InterfaceC0373g;
import a6.AbstractC0829f;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.SystemClock;
import c6.AbstractC1021a;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.protobuf.InvalidProtocolBufferException;
import com.headcode.ourgroceries.android.C5587k6;
import d6.InterfaceC5732b;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import q5.AbstractC6635a;
import s5.C6734A;
import s5.C6753t;
import s5.C6754u;
import s5.C6756w;
import s5.C6758y;
import s5.C6759z;
import s5.EnumC6747m;
import s5.H;
import s5.L;
import s5.S;
import s5.h0;
import t5.AbstractC6799a;
import t5.AbstractC6803e;
import v6.C6845a;

/* loaded from: classes2.dex */
public final class L4 implements InterfaceC5533e0 {

    /* renamed from: A, reason: collision with root package name */
    private final File f33742A;

    /* renamed from: B, reason: collision with root package name */
    private final ExecutorService f33743B;

    /* renamed from: C, reason: collision with root package name */
    private final C6845a f33744C;

    /* renamed from: D, reason: collision with root package name */
    private final C6845a f33745D;

    /* renamed from: E, reason: collision with root package name */
    private final InterfaceC5533e0 f33746E;

    /* renamed from: F, reason: collision with root package name */
    private final Runnable f33747F;

    /* renamed from: G, reason: collision with root package name */
    private final Runnable f33748G;

    /* renamed from: H, reason: collision with root package name */
    private final Runnable f33749H;

    /* renamed from: a, reason: collision with root package name */
    private final C5587k6 f33750a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f33751b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f33752c;

    /* renamed from: d, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f33753d;

    /* renamed from: e, reason: collision with root package name */
    private C5574j1 f33754e;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorService f33755f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33756g;

    /* renamed from: h, reason: collision with root package name */
    private long f33757h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f33758i;

    /* renamed from: j, reason: collision with root package name */
    private LinkedList f33759j;

    /* renamed from: k, reason: collision with root package name */
    private final C6845a f33760k;

    /* renamed from: l, reason: collision with root package name */
    private long f33761l;

    /* renamed from: m, reason: collision with root package name */
    private final C6845a f33762m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f33763n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractRunnableC5500a f33764o;

    /* renamed from: p, reason: collision with root package name */
    private final C6845a f33765p;

    /* renamed from: q, reason: collision with root package name */
    private final AbstractC0829f f33766q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f33767r;

    /* renamed from: s, reason: collision with root package name */
    private final AbstractC0829f f33768s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC5732b f33769t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC5732b f33770u;

    /* renamed from: v, reason: collision with root package name */
    private final AbstractC0829f f33771v;

    /* renamed from: w, reason: collision with root package name */
    private final C6845a f33772w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC0829f f33773x;

    /* renamed from: y, reason: collision with root package name */
    private long f33774y;

    /* renamed from: z, reason: collision with root package name */
    private final File f33775z;

    class a extends AbstractRunnableC5500a {
        a(s5.h0 h0Var) {
            super(h0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(AbstractRunnableC5500a abstractRunnableC5500a) {
            L4.this.B0(abstractRunnableC5500a);
        }

        @Override // com.headcode.ourgroceries.android.AbstractRunnableC5500a
        public void h(final AbstractRunnableC5500a abstractRunnableC5500a) {
            L4.this.f33751b.post(new Runnable() { // from class: com.headcode.ourgroceries.android.K4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33731o.k(abstractRunnableC5500a);
                }
            });
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33777a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f33778b;

        static {
            int[] iArr = new int[s5.i0.values().length];
            f33778b = iArr;
            try {
                iArr[s5.i0.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33778b[s5.i0.GET_LISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33778b[s5.i0.EDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33778b[s5.i0.REPARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33778b[s5.i0.EDIT_LISTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33778b[s5.i0.DESCRIBE_CLIENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33778b[s5.i0.RESET_CLIENT_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33778b[s5.i0.UPLOAD_PHOTO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33778b[s5.i0.RESET_PASSWORD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33778b[s5.i0.LOG_MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33778b[s5.i0.OVERVIEW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[C5587k6.e.values().length];
            f33777a = iArr2;
            try {
                iArr2[C5587k6.e.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f33777a[C5587k6.e.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f33777a[C5587k6.e.YEARLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f33777a[C5587k6.e.LIFETIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f33777a[C5587k6.e.NBO.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f33777a[C5587k6.e.TEAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private static class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final L4 f33779o;

        /* renamed from: s, reason: collision with root package name */
        private final List f33780s;

        public c(L4 l42, List list) {
            this.f33779o = l42;
            this.f33780s = new ArrayList(list);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                L4.G0(this.f33780s, this.f33779o.f33742A, this.f33779o.f33775z, this.f33779o.S());
            } finally {
                this.f33779o.f33751b.post(this.f33779o.f33749H);
            }
        }
    }

    public L4(Context context, C5587k6 c5587k6, AbstractC0829f abstractC0829f) {
        Handler j8 = OurApplication.j();
        this.f33751b = j8;
        HashSet hashSet = new HashSet();
        this.f33752c = hashSet;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.headcode.ourgroceries.android.u4
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                this.f35049o.f0(sharedPreferences, str);
            }
        };
        this.f33753d = onSharedPreferenceChangeListener;
        this.f33754e = null;
        this.f33755f = null;
        this.f33756g = false;
        this.f33757h = 0L;
        this.f33758i = true;
        this.f33759j = new LinkedList();
        C6845a P7 = C6845a.P(0);
        this.f33760k = P7;
        this.f33761l = 250L;
        C6845a P8 = C6845a.P(250L);
        this.f33762m = P8;
        this.f33763n = P8.n().q(X2.l("OG-SyncManager", "backoff interval")).D();
        AbstractRunnableC5500a abstractRunnableC5500a = AbstractRunnableC5500a.f34637u;
        this.f33764o = abstractRunnableC5500a;
        C6845a P9 = C6845a.P(abstractRunnableC5500a);
        this.f33765p = P9;
        AbstractC0829f n8 = P8.y(new f6.g() { // from class: com.headcode.ourgroceries.android.D4
            @Override // f6.g
            public final Object apply(Object obj) {
                return L4.g0((Long) obj);
            }
        }).n();
        this.f33766q = n8;
        this.f33767r = false;
        C6845a P10 = C6845a.P(0L);
        this.f33772w = P10;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f33773x = AbstractC0829f.w(0L, 1L, timeUnit, AbstractC1021a.a()).L(P10, new f6.b() { // from class: com.headcode.ourgroceries.android.E4
            @Override // f6.b
            public final Object apply(Object obj, Object obj2) {
                return L4.k0((Long) obj, (Long) obj2);
            }
        });
        this.f33774y = 0L;
        this.f33743B = Executors.newSingleThreadExecutor();
        Boolean bool = Boolean.FALSE;
        C6845a P11 = C6845a.P(bool);
        this.f33744C = P11;
        C6845a P12 = C6845a.P(bool);
        this.f33745D = P12;
        this.f33746E = new U4(this, j8, timeUnit.toMillis(1L), TimeUnit.MINUTES.toMillis(1L));
        this.f33747F = new Runnable() { // from class: com.headcode.ourgroceries.android.F4
            @Override // java.lang.Runnable
            public final void run() {
                this.f33448o.h0();
            }
        };
        this.f33748G = new Runnable() { // from class: com.headcode.ourgroceries.android.G4
            @Override // java.lang.Runnable
            public final void run() {
                this.f33468o.i0();
            }
        };
        this.f33749H = new Runnable() { // from class: com.headcode.ourgroceries.android.H4
            @Override // java.lang.Runnable
            public final void run() {
                this.f33636o.j0();
            }
        };
        this.f33750a = c5587k6;
        AbstractC0829f k8 = abstractC0829f.y(new f6.g() { // from class: com.headcode.ourgroceries.android.I4
            @Override // f6.g
            public final Object apply(Object obj) {
                return L4.l0((Integer) obj);
            }
        }).k(X2.f(2000L));
        this.f33768s = k8;
        this.f33771v = AbstractC0829f.f(P11.q(X2.l("OG-SyncManager", "want save requests")), P12.q(X2.l("OG-SyncManager", "saving requests")), P9.y(new f6.g() { // from class: com.headcode.ourgroceries.android.J4
            @Override // f6.g
            public final Object apply(Object obj) {
                return L4.m0((AbstractRunnableC5500a) obj);
            }
        }).q(X2.l("OG-SyncManager", "active request")), P7.y(new f6.g() { // from class: com.headcode.ourgroceries.android.v4
            @Override // f6.g
            public final Object apply(Object obj) {
                return L4.n0((Integer) obj);
            }
        }).q(X2.l("OG-SyncManager", "request queue has items")), k8.q(X2.l("OG-SyncManager", "ui is visible")), n8.q(X2.l("OG-SyncManager", "exceeded backoff")), new f6.f() { // from class: com.headcode.ourgroceries.android.w4
            @Override // f6.f
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return L4.o0((Boolean) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (Boolean) obj5, (Boolean) obj6);
            }
        }).n().q(X2.l("OG-SyncManager", "is active"));
        C0();
        this.f33775z = context.getFilesDir();
        this.f33742A = context.getFileStreamPath("OurGroceriesRequests.data");
        s0();
        this.f33770u = c5587k6.N().B(1L).E(new f6.d() { // from class: com.headcode.ourgroceries.android.B4
            @Override // f6.d
            public final void accept(Object obj) {
                this.f33294o.w0((C5587k6.b) obj);
            }
        });
        this.f33769t = k8.E(new f6.d() { // from class: com.headcode.ourgroceries.android.C4
            @Override // f6.d
            public final void accept(Object obj) {
                this.f33319o.p0((Boolean) obj);
            }
        });
        hashSet.add(A2.f33140n0.f33170b0);
        A2.f33140n0.f0(onSharedPreferenceChangeListener);
    }

    private void B() {
        this.f33772w.b(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(AbstractRunnableC5500a abstractRunnableC5500a) {
        AbstractRunnableC5500a abstractRunnableC5500a2 = AbstractRunnableC5500a.f34637u;
        if (abstractRunnableC5500a == abstractRunnableC5500a2 || abstractRunnableC5500a != this.f33764o) {
            return;
        }
        s5.o0 d8 = abstractRunnableC5500a.d();
        s5.n0 c8 = abstractRunnableC5500a.c();
        if (!abstractRunnableC5500a.g() && this.f33759j.peekFirst() == abstractRunnableC5500a.b()) {
            this.f33759j.removeFirst();
            c1();
            H0();
        }
        s5.o0 o0Var = s5.o0.RS_SUCCESS;
        if (d8 == o0Var) {
            B();
            D0();
            if (c8.w() == o0Var) {
                switch (b.f33778b[c8.t().ordinal()]) {
                    case 1:
                    case 8:
                    case 9:
                    case 10:
                        break;
                    case 2:
                        X(c8);
                        break;
                    case 3:
                        W(c8);
                        break;
                    case 4:
                        Y(c8);
                        break;
                    case 5:
                        V(c8);
                        break;
                    case 6:
                        U(c8);
                        break;
                    case 7:
                        Z(c8);
                        break;
                    default:
                        AbstractC6635a.b("OG-SyncManager", "Received unhandled response type: " + c8.t());
                        break;
                }
            } else {
                AbstractC6635a.f("OG-SyncManager", "Request failed with status " + c8.w() + "; dropping");
            }
        } else if (abstractRunnableC5500a.g()) {
            AbstractC6635a.d("OG-SyncManager", "Request failed with status " + d8 + "; retrying");
            V0();
        } else {
            AbstractC6635a.f("OG-SyncManager", "Request failed with unexpected status " + d8 + "; aborting");
            D0();
        }
        this.f33764o = abstractRunnableC5500a2;
        a1();
        G();
    }

    private C6753t C() {
        OurApplication ourApplication = OurApplication.f34286H;
        A2 a22 = A2.f33140n0;
        C6753t.c x7 = C6753t.x0().B(P1.m(ourApplication)).F(P1.p()).H(P1.q()).I(P1.r()).L(P1.t(ourApplication)).y(P1.l(ourApplication)).N(Locale.getDefault().toLanguageTag()).G(a22.v()).E(a22.r()).x(ourApplication.f().l().c());
        EnumC6747m enumC6747m = EnumC6747m.AUTH_UNKNOWN;
        switch (b.f33777a[this.f33750a.U().ordinal()]) {
            case 1:
                enumC6747m = EnumC6747m.AUTH_NONE;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                enumC6747m = EnumC6747m.AUTH_PLUS;
                break;
            case 6:
                enumC6747m = EnumC6747m.AUTH_TEAM;
                break;
        }
        x7.A(enumC6747m.e());
        for (Y1 y12 : a22.o().i()) {
            s5.c0 c8 = y12.c();
            if (c8 == null) {
                AbstractC6635a.b("OG-SyncManager", "Unrecognized purchase state, ignoring purchase: " + y12.d());
            } else {
                x7.m(s5.J.x().v(y12.e()).x(y12.d()).w(c8).m());
            }
        }
        Boolean P7 = this.f33750a.P();
        if (P7 != null) {
            x7.C(P7.booleanValue());
        }
        String M7 = a22.M();
        if (M7 != null) {
            x7.M(M7);
        }
        String A7 = a22.A();
        if (!AbstractC6803e.o(A7)) {
            x7.J(A7);
        }
        String p8 = a22.p();
        if (!AbstractC6803e.o(p8)) {
            x7.D(p8);
        }
        x7.z(a22.e());
        String K7 = a22.K();
        if (K7 != null) {
            x7.K(K7);
        }
        return x7.p();
    }

    private void C0() {
        FirebaseMessaging.n().q().h(new InterfaceC0373g() { // from class: com.headcode.ourgroceries.android.z4
            @Override // A3.InterfaceC0373g
            public final void b(Object obj) {
                this.f35154a.q0((String) obj);
            }
        });
    }

    private void D0() {
        this.f33761l = 250L;
        b1();
    }

    private void G() {
        if (this.f33764o == AbstractRunnableC5500a.f34637u && !this.f33756g) {
            if (this.f33767r || this.f33761l < 20000) {
                if (!this.f33759j.isEmpty()) {
                    x0();
                    K0((s5.h0) this.f33759j.getFirst());
                    return;
                }
                AbstractC5648t2.b();
                if (this.f33758i) {
                    this.f33758i = false;
                    N();
                } else if (c0()) {
                    I();
                } else {
                    D0();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G0(List list, File file, File file2, InterfaceC5533e0 interfaceC5533e0) {
        File file3;
        if (list.isEmpty()) {
            if (file.delete()) {
                P1.Y(file2);
                return;
            }
            return;
        }
        DataOutputStream dataOutputStream = null;
        try {
            file3 = File.createTempFile("OurGroceriesRQ", ".tmp", file2);
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(fileOutputStream, 4096));
                    try {
                        dataOutputStream2.writeInt(list.size());
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((s5.h0) it.next()).e(dataOutputStream2);
                        }
                        dataOutputStream2.flush();
                        fileOutputStream.getFD().sync();
                        dataOutputStream2.close();
                        if (!file3.renameTo(file)) {
                            interfaceC5533e0.a(S.c.WARN, "Failed to rename while saving requests");
                        }
                        P1.Y(file2);
                        AbstractC6799a.a(dataOutputStream2);
                        if (file3.exists()) {
                            S.c cVar = S.c.WARN;
                            interfaceC5533e0.a(cVar, "Deleted temp file saving requests");
                            if (file3.delete()) {
                                return;
                            }
                            interfaceC5533e0.a(cVar, "Failed to delete temp file while saving requests");
                        }
                    } catch (IOException e8) {
                        e = e8;
                        dataOutputStream = dataOutputStream2;
                        com.google.firebase.crashlytics.a.b().e(e);
                        AbstractC6635a.c("OG-SyncManager", e);
                        S.c cVar2 = S.c.WARN;
                        interfaceC5533e0.a(cVar2, "IOException saving requests: " + e.getMessage());
                        AbstractC6799a.a(dataOutputStream);
                        if (file3 == null || !file3.exists()) {
                            return;
                        }
                        interfaceC5533e0.a(cVar2, "Deleted temp file saving requests");
                        if (file3.delete()) {
                            return;
                        }
                        interfaceC5533e0.a(cVar2, "Failed to delete temp file while saving requests");
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream2;
                        AbstractC6799a.a(dataOutputStream);
                        if (file3 != null && file3.exists()) {
                            S.c cVar3 = S.c.WARN;
                            interfaceC5533e0.a(cVar3, "Deleted temp file saving requests");
                            if (!file3.delete()) {
                                interfaceC5533e0.a(cVar3, "Failed to delete temp file while saving requests");
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e9) {
                e = e9;
            }
        } catch (IOException e10) {
            e = e10;
            file3 = null;
        } catch (Throwable th3) {
            th = th3;
            file3 = null;
        }
    }

    private void H() {
        if (((Boolean) this.f33744C.Q()).booleanValue() && !((Boolean) this.f33745D.Q()).booleanValue()) {
            this.f33745D.b(Boolean.TRUE);
            this.f33744C.b(Boolean.FALSE);
            this.f33743B.submit(new c(this, this.f33759j));
        }
    }

    private void H0() {
        this.f33744C.b(Boolean.TRUE);
        H();
    }

    private void I() {
        this.f33757h = System.currentTimeMillis();
        L(s5.i0.DESCRIBE_CLIENT, s5.h0.J0().S(C()));
    }

    private void I0(List list) {
        H.b w7 = s5.H.w();
        this.f33754e.F0(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s5.P p8 = (s5.P) it.next();
            String p9 = p8.u().p();
            C5688z0 x7 = this.f33754e.x(p9);
            if (x7 == null || !x7.a0().equals(p8.u().r())) {
                w7.m(s5.M.w().v(p9));
            }
        }
        if (w7.v() > 0) {
            L(s5.i0.GET_LISTS, s5.h0.J0().V(w7));
        }
    }

    private void J(L.c cVar, String str, L.b bVar) {
        bVar.w(cVar).x(str).C(P1.x());
        L(s5.i0.EDIT_LISTS, s5.h0.J0().U(C6756w.p().m(bVar)));
    }

    private void K(s5.h0 h0Var) {
        this.f33759j.add(h0Var);
        c1();
        H0();
        G();
    }

    private void K0(s5.h0 h0Var) {
        this.f33764o = new a(h0Var);
        a1();
        if (this.f33755f == null) {
            this.f33755f = Executors.newSingleThreadExecutor();
        }
        this.f33755f.execute(this.f33764o);
    }

    private void L(s5.i0 i0Var, h0.b bVar) {
        K(O(i0Var, bVar));
    }

    private void M(String str) {
        L(s5.i0.RESET_CLIENT_ID, s5.h0.J0().d0(s5.j0.t().x(str).w(C())));
    }

    private void N() {
        H.b w7 = s5.H.w();
        w7.z(true);
        Iterator it = this.f33754e.J().iterator();
        while (it.hasNext()) {
            C5688z0 c5688z0 = (C5688z0) it.next();
            w7.m(s5.M.w().v(c5688z0.T()).w(c5688z0.a0()));
        }
        w7.y(A2.f33140n0.e());
        L(s5.i0.GET_LISTS, s5.h0.J0().V(w7));
    }

    public static s5.h0 O(s5.i0 i0Var, h0.b bVar) {
        return bVar.c0(i0Var).P(A2.f33140n0.h()).Q(7).m();
    }

    public static long Q() {
        return 20000L;
    }

    private void U(s5.n0 n0Var) {
        if (n0Var.B()) {
            A2 a22 = A2.f33140n0;
            C6754u m8 = n0Var.m();
            if (m8.Y()) {
                long M7 = m8.M();
                if (M7 != 0) {
                    AbstractC6635a.d("OG-SyncManager", "First device install: " + new Date(M7));
                    a22.n0(M7);
                }
            }
            List N7 = m8.N();
            a22.t0(N7);
            AbstractC6635a.a("OG-SyncManager", "Using meta-list ad networks: " + N7);
            List Q7 = m8.Q();
            a22.A0(Q7);
            AbstractC6635a.a("OG-SyncManager", "Using shopping list ad networks: " + Q7);
            List R7 = m8.R();
            a22.B0(R7);
            AbstractC6635a.a("OG-SyncManager", "Using shopping list item details ad networks: " + R7);
            List O7 = m8.O();
            a22.x0(O7);
            AbstractC6635a.a("OG-SyncManager", "Using recipe ad networks: " + O7);
            List P7 = m8.P();
            a22.y0(P7);
            AbstractC6635a.a("OG-SyncManager", "Using recipe item details ad networks: " + P7);
            if (m8.L()) {
                AbstractC6635a.d("OG-SyncManager", "Was told in describe client response to refresh push token");
                AbstractC5673x.a("pushTokenInvalidate");
                a22.w0(null);
                C0();
            }
            if (m8.S()) {
                AbstractC6635a.d("OG-SyncManager", "Was told in describe client response to reset client ID");
                AbstractC5673x.a("resetClientIdRequested");
                M(A2.d());
            }
            if (m8.W()) {
                a22.k0(m8.K());
            } else {
                a22.k0(null);
            }
        }
    }

    private void V(s5.n0 n0Var) {
        if (n0Var.D()) {
            if (this.f33759j.size() > 0) {
                this.f33758i = true;
            } else {
                I0(n0Var.o().o());
            }
        }
    }

    private void V0() {
        X0();
        this.f33751b.postDelayed(this.f33748G, this.f33761l);
        this.f33761l = Math.min((long) (this.f33761l * 2.0f), 20000L);
        b1();
        this.f33756g = true;
    }

    private void W(s5.n0 n0Var) {
        if (n0Var.C()) {
            C6734A n8 = n0Var.n();
            if (n8.n() && this.f33759j.size() <= 0) {
                this.f33754e.U0(n8.m());
            }
        }
    }

    private void W0() {
        Y0();
        this.f33751b.postDelayed(this.f33747F, 20000L);
    }

    private void X(s5.n0 n0Var) {
        if (n0Var.E()) {
            this.f33754e.q0();
            try {
                s5.I p8 = n0Var.p();
                if (p8.B()) {
                    A2.f33140n0.h0(p8.s());
                }
                if (p8.D()) {
                    A2.f33140n0.v0(p8.z().n());
                }
                if (this.f33759j.size() > 0) {
                    this.f33758i = true;
                    this.f33754e.C0();
                    return;
                }
                Iterator it = p8.y().iterator();
                while (it.hasNext()) {
                    this.f33754e.U0((s5.K) it.next());
                }
                Iterator it2 = p8.t().iterator();
                while (it2.hasNext()) {
                    this.f33754e.u0((String) it2.next());
                }
                if (p8.C()) {
                    A2.f33140n0.m0(p8.v());
                }
                if (p8.E()) {
                    this.f33750a.s0(p8.A());
                }
                this.f33754e.C0();
            } catch (Throwable th) {
                this.f33754e.C0();
                throw th;
            }
        }
    }

    private void X0() {
        this.f33751b.removeCallbacks(this.f33748G);
        this.f33756g = false;
    }

    private void Y(s5.n0 n0Var) {
        if (n0Var.H()) {
            this.f33758i = true;
        }
    }

    private void Y0() {
        this.f33751b.removeCallbacks(this.f33747F);
    }

    private void Z(s5.n0 n0Var) {
        if (n0Var.I()) {
            String n8 = n0Var.u().n();
            AbstractC6635a.d("OG-SyncManager", "Handling reset client ID response, new client ID is " + n8);
            A2.f33140n0.j0(n8);
        }
    }

    private void Z0() {
        this.f33758i = true;
        G();
    }

    private void a1() {
        this.f33765p.b(this.f33764o);
    }

    private void b1() {
        this.f33762m.b(Long.valueOf(this.f33761l));
    }

    private boolean c0() {
        return this.f33757h == 0 || Math.abs(System.currentTimeMillis() - this.f33757h) > TimeUnit.DAYS.toMillis(1L);
    }

    private void c1() {
        this.f33760k.b(Integer.valueOf(this.f33759j.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0() {
        D0();
        X0();
        Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public void r0(String str) {
        AbstractC5673x.a("pushTokenRefreshSuccess");
        A2.f33140n0.w0(str);
        J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(SharedPreferences sharedPreferences, String str) {
        if (this.f33752c.contains(str)) {
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean g0(Long l8) {
        return Boolean.valueOf(l8.longValue() >= 20000);
    }

    private void g1() {
        Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0() {
        W0();
        Z0();
    }

    private void h1() {
        this.f33758i = true;
        this.f33774y = SystemClock.elapsedRealtime();
        X0();
        D0();
        W0();
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0() {
        this.f33756g = false;
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0() {
        this.f33745D.b(Boolean.FALSE);
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long k0(Long l8, Long l9) {
        return Long.valueOf(l9.longValue() == 0 ? Long.MAX_VALUE : SystemClock.elapsedRealtime() - l9.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean l0(Integer num) {
        return Boolean.valueOf(num.intValue() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean m0(AbstractRunnableC5500a abstractRunnableC5500a) {
        return Boolean.valueOf(abstractRunnableC5500a != AbstractRunnableC5500a.f34637u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean n0(Integer num) {
        return Boolean.valueOf(num.intValue() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean o0(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        if (bool.booleanValue() || bool2.booleanValue()) {
            return Boolean.TRUE;
        }
        if (bool3.booleanValue()) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(bool4.booleanValue() && (bool5.booleanValue() || !bool6.booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(Boolean bool) {
        this.f33767r = bool.booleanValue();
        if (bool.booleanValue()) {
            h1();
        } else {
            g1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(String str) {
        String A7 = A2.f33140n0.A();
        if (AbstractC6803e.c(A7, str)) {
            return;
        }
        AbstractC6635a.d("OG-SyncManager", "Got changed push token at startup old=" + A7 + " new=" + str);
        r0(str);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0041: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:66), block:B:9:0x0041 */
    private void s0() {
        DataInputStream dataInputStream;
        IOException e8;
        InvalidProtocolBufferException e9;
        DataInputStream dataInputStream2;
        this.f33759j.clear();
        DataInputStream dataInputStream3 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                dataInputStream = new DataInputStream(AbstractC6799a.b(this.f33742A, 4096));
                try {
                    int readInt = dataInputStream.readInt();
                    AbstractC6635a.a("OG-SyncManager", "Loading " + readInt + " requests");
                    while (readInt > 0) {
                        this.f33759j.add(s5.h0.L0(dataInputStream));
                        readInt--;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    e9 = e10;
                    com.google.firebase.crashlytics.a.b().e(e9);
                    AbstractC6635a.b("OG-SyncManager", "Error parsing request: " + e9);
                    AbstractC6799a.a(dataInputStream);
                    c1();
                } catch (FileNotFoundException unused) {
                    dataInputStream3 = dataInputStream;
                    AbstractC6635a.d("OG-SyncManager", "Request queue file not found; using empty queue");
                    AbstractC6799a.a(dataInputStream3);
                    c1();
                } catch (IOException e11) {
                    e8 = e11;
                    com.google.firebase.crashlytics.a.b().e(e8);
                    AbstractC6635a.c("OG-SyncManager", e8);
                    AbstractC6799a.a(dataInputStream);
                    c1();
                }
            } catch (InvalidProtocolBufferException e12) {
                dataInputStream = null;
                e9 = e12;
            } catch (FileNotFoundException unused2) {
            } catch (IOException e13) {
                dataInputStream = null;
                e8 = e13;
            }
            AbstractC6799a.a(dataInputStream);
            c1();
        } catch (Throwable th2) {
            th = th2;
            dataInputStream3 = dataInputStream2;
            AbstractC6799a.a(dataInputStream3);
            c1();
            throw th;
        }
    }

    private h0.b v0(S.c cVar, String str, long j8) {
        if (j8 == 0) {
            j8 = System.currentTimeMillis();
        }
        return s5.h0.J0().W(s5.S.w().x(j8).w(cVar).v(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(C5587k6.b bVar) {
        J0();
    }

    private void x0() {
        boolean z7;
        if (this.f33764o != AbstractRunnableC5500a.f34637u) {
            throw new IllegalStateException("cannot merge requests while APIRequest is active");
        }
        if (this.f33759j.isEmpty()) {
            return;
        }
        Iterator it = this.f33759j.iterator();
        s5.h0 h0Var = (s5.h0) it.next();
        while (it.hasNext()) {
            s5.h0 h0Var2 = (s5.h0) it.next();
            if (!h0Var.N().equals(h0Var2.N()) || h0Var.f0() != h0Var2.f0()) {
                break;
            }
            if (h0Var.f0() != s5.i0.EDIT) {
                if (h0Var.f0() != s5.i0.EDIT_LISTS) {
                    break;
                }
                h0Var = s5.h0.K0(h0Var).U(C6756w.q(h0Var.U()).w(h0Var2.U())).m();
                it.remove();
            } else {
                if (!h0Var.T().s().equals(h0Var2.T().s())) {
                    break;
                }
                h0Var = s5.h0.K0(h0Var).T(C6759z.z(h0Var.T()).w(h0Var2.T()).y(h0Var.T().u() | h0Var2.T().u())).m();
                it.remove();
            }
        }
        int i8 = 0;
        boolean z8 = true;
        if (h0Var != this.f33759j.getFirst()) {
            this.f33759j.removeFirst();
            this.f33759j.addFirst(h0Var);
            z7 = true;
        } else {
            z7 = false;
        }
        Iterator it2 = this.f33759j.iterator();
        int i9 = 0;
        while (it2.hasNext()) {
            if (((s5.h0) it2.next()).f0() == s5.i0.LOG_MESSAGE && (i9 = i9 + 1) > 100) {
                it2.remove();
                i8++;
            }
        }
        if (i8 <= 0) {
            z8 = z7;
        } else if (i8 > 1) {
            this.f33759j.add(O(s5.i0.LOG_MESSAGE, v0(S.c.WARN, "Removed " + i8 + " client log messages", 0L)));
        }
        if (z8) {
            c1();
            H0();
        }
    }

    public void A(String str, s5.Q q8, String str2, boolean z7) {
        J(L.c.CREATE_LIST, str, s5.L.N().A(q8).y(str2).B(z7));
    }

    public void A0(s5.N n8, String str, String str2) {
        L(s5.i0.EDIT, s5.h0.J0().T(C6759z.y().x(str).m(C6758y.x0().A(C6758y.d.REORDER).B(n8.N()).L(P1.x()).H(str2))));
    }

    public void D(s5.N n8, String str, boolean z7) {
        O0(n8, str, z7 ? P1.x() : 0L);
    }

    public void E(s5.N n8, String str) {
        L(s5.i0.EDIT, s5.h0.J0().T(C6759z.y().x(str).y(true).m(C6758y.x0().A(C6758y.d.DELETE).B(n8.N()).L(P1.x()))));
    }

    public void E0(String str) {
        L(s5.i0.RESET_PASSWORD, s5.h0.J0().e0(s5.l0.q().v(str)));
    }

    public void F(String str) {
        J(L.c.DELETE_LIST, str, s5.L.N());
    }

    public void F0(s5.N n8, String str, String str2) {
        L(s5.i0.EDIT, s5.h0.J0().T(C6759z.y().x(str).m(C6758y.x0().A(C6758y.d.SET_TARGET_LIST).B(n8.N()).L(P1.x()).D(str2))));
    }

    public void J0() {
        this.f33757h = 0L;
        G();
    }

    public void L0(String str, String str2, boolean z7) {
        L(s5.i0.REPARENT, s5.h0.J0().Y(s5.f0.J().x(str).w(str2).z(z7)));
    }

    public void M0(s5.N n8, String str, String str2) {
        L(s5.i0.EDIT, s5.h0.J0().T(C6759z.y().x(str).m(C6758y.x0().A(C6758y.d.SET_BARCODE).B(n8.N()).L(P1.x()).x(str2))));
    }

    public void N0(s5.N n8, String str, String str2) {
        L(s5.i0.EDIT, s5.h0.J0().T(C6759z.y().x(str).m(C6758y.x0().A(C6758y.d.SET_CATEGORY).B(n8.N()).L(P1.x()).y(str2))));
    }

    public void O0(s5.N n8, String str, long j8) {
        L(s5.i0.EDIT, s5.h0.J0().T(C6759z.y().x(str).m(C6758y.x0().A(C6758y.d.CROSS_OFF).B(n8.N()).L(j8))));
    }

    public long P() {
        return this.f33774y;
    }

    public void P0(s5.N n8, String str, String str2) {
        L(s5.i0.EDIT, s5.h0.J0().T(C6759z.y().x(str).m(C6758y.x0().A(C6758y.d.SET_NOTE).B(n8.N()).L(P1.x()).E(str2))));
    }

    public void Q0(s5.N n8, String str, String str2) {
        L(s5.i0.EDIT, s5.h0.J0().T(C6759z.y().x(str).m(C6758y.x0().A(C6758y.d.SET_PHOTO).B(n8.N()).L(P1.x()).F(str2))));
    }

    public int R() {
        return this.f33759j.size();
    }

    public void R0(s5.N n8, String str, s5.r0 r0Var) {
        L(s5.i0.EDIT, s5.h0.J0().T(C6759z.y().x(str).m(C6758y.x0().A(C6758y.d.SET_STAR).B(n8.N()).L(P1.x()).J(r0Var.e()))));
    }

    public InterfaceC5533e0 S() {
        return this.f33746E;
    }

    public void S0(C5574j1 c5574j1) {
        this.f33754e = c5574j1;
    }

    public AbstractC0829f T() {
        return this.f33773x;
    }

    public void T0(String str, String str2) {
        J(L.c.SET_LIST_NOTES, str, s5.L.N().z(str2));
    }

    public void U0(String str, String str2) {
        L(s5.i0.UPLOAD_PHOTO, s5.h0.J0().h0(s5.t0.x().w(str).x(str2)));
    }

    @Override // com.headcode.ourgroceries.android.InterfaceC5533e0
    public /* synthetic */ void a(S.c cVar, String str) {
        AbstractC5525d0.c(this, cVar, str);
    }

    public void a0() {
        this.f33751b.post(new Runnable() { // from class: com.headcode.ourgroceries.android.A4
            @Override // java.lang.Runnable
            public final void run() {
                this.f33217o.d0();
            }
        });
    }

    @Override // com.headcode.ourgroceries.android.InterfaceC5533e0
    public /* synthetic */ void b(String str) {
        AbstractC5525d0.b(this, str);
    }

    public AbstractC0829f b0() {
        return this.f33771v;
    }

    @Override // com.headcode.ourgroceries.android.InterfaceC5533e0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e0(final S.c cVar, final String str, final long j8) {
        if (P1.D()) {
            L(s5.i0.LOG_MESSAGE, v0(cVar, str, j8));
        } else {
            this.f33751b.post(new Runnable() { // from class: com.headcode.ourgroceries.android.x4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35116o.e0(cVar, str, j8);
                }
            });
        }
    }

    public void e1(final String str) {
        this.f33751b.post(new Runnable() { // from class: com.headcode.ourgroceries.android.y4
            @Override // java.lang.Runnable
            public final void run() {
                this.f35125o.r0(str);
            }
        });
    }

    public void f1(String str, com.google.protobuf.d dVar) {
        L(s5.i0.UPLOAD_PHOTO, s5.h0.J0().h0(s5.t0.x().w(str).v(dVar)));
    }

    public /* synthetic */ void t0(String str) {
        AbstractC5525d0.a(this, str);
    }

    public /* synthetic */ void u0(String str) {
        AbstractC5525d0.d(this, str);
    }

    public void y0(s5.N n8, String str, String str2) {
        L(s5.i0.EDIT, s5.h0.J0().T(C6759z.y().x(str).m(C6758y.x0().A(C6758y.d.RENAME).B(n8.N()).L(P1.x()).M(str2))));
    }

    public void z(s5.N n8, String str, boolean z7) {
        L(s5.i0.EDIT, s5.h0.J0().T(C6759z.y().x(str).m(C6758y.x0().A(C6758y.d.INSERT).B(n8.N()).L(P1.x()).M(n8.Z()).E(n8.Q()).H(n8.U()).y(n8.J()).x(n8.H()).F(n8.S()).z(n8.L()).v(n8.F()).C(n8.P()).w(n8.G()).K(n8.X()).G(z7))));
    }

    public void z0(String str, String str2) {
        J(L.c.RENAME_LIST, str, s5.L.N().y(str2));
    }
}
