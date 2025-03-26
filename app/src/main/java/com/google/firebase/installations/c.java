package com.google.firebase.installations;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0377k;
import K4.d;
import K4.f;
import Z2.r;
import android.text.TextUtils;
import androidx.appcompat.app.E;
import com.google.firebase.installations.FirebaseInstallationsException;
import g4.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class c implements I4.e {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f32811m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f32812n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f32813a;

    /* renamed from: b, reason: collision with root package name */
    private final K4.c f32814b;

    /* renamed from: c, reason: collision with root package name */
    private final J4.c f32815c;

    /* renamed from: d, reason: collision with root package name */
    private final h f32816d;

    /* renamed from: e, reason: collision with root package name */
    private final u f32817e;

    /* renamed from: f, reason: collision with root package name */
    private final I4.g f32818f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f32819g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f32820h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f32821i;

    /* renamed from: j, reason: collision with root package name */
    private String f32822j;

    /* renamed from: k, reason: collision with root package name */
    private Set f32823k;

    /* renamed from: l, reason: collision with root package name */
    private final List f32824l;

    class a implements ThreadFactory {

        /* renamed from: o, reason: collision with root package name */
        private final AtomicInteger f32825o = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f32825o.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32826a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f32827b;

        static {
            int[] iArr = new int[f.b.values().length];
            f32827b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32827b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32827b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f32826a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32826a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(final com.google.firebase.f fVar, H4.b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new K4.c(fVar.k(), bVar), new J4.c(fVar), h.c(), new u(new H4.b() { // from class: I4.a
            @Override // H4.b
            public final Object get() {
                return com.google.firebase.installations.c.z(fVar);
            }
        }), new I4.g());
    }

    private void A() {
        r.g(n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.g(u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.g(m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(h.h(n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(h.g(m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String B(J4.d dVar) {
        if ((!this.f32813a.m().equals("CHIME_ANDROID_SDK") && !this.f32813a.u()) || !dVar.m()) {
            return this.f32818f.a();
        }
        String f8 = p().f();
        return TextUtils.isEmpty(f8) ? this.f32818f.a() : f8;
    }

    private J4.d C(J4.d dVar) {
        K4.d d8 = this.f32814b.d(m(), dVar.d(), u(), n(), (dVar.d() == null || dVar.d().length() != 11) ? null : p().i());
        int i8 = b.f32826a[d8.e().ordinal()];
        if (i8 == 1) {
            return dVar.s(d8.c(), d8.d(), this.f32816d.b(), d8.b().c(), d8.b().d());
        }
        if (i8 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }

    private void D(Exception exc) {
        synchronized (this.f32819g) {
            try {
                Iterator it = this.f32824l.iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void E(J4.d dVar) {
        synchronized (this.f32819g) {
            try {
                Iterator it = this.f32824l.iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void F(String str) {
        this.f32822j = str;
    }

    private synchronized void G(J4.d dVar, J4.d dVar2) {
        if (this.f32823k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f32823k.iterator();
            if (it.hasNext()) {
                E.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    private AbstractC0376j g() {
        C0377k c0377k = new C0377k();
        i(new d(this.f32816d, c0377k));
        return c0377k.a();
    }

    private AbstractC0376j h() {
        C0377k c0377k = new C0377k();
        i(new e(c0377k));
        return c0377k.a();
    }

    private void i(g gVar) {
        synchronized (this.f32819g) {
            this.f32824l.add(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void w(boolean z7) {
        J4.d C7;
        J4.d s8 = s();
        try {
            if (s8.i() || s8.l()) {
                C7 = C(s8);
            } else {
                if (!z7 && !this.f32816d.f(s8)) {
                    return;
                }
                C7 = l(s8);
            }
            v(C7);
            G(s8, C7);
            if (C7.k()) {
                F(C7.d());
            }
            if (C7.i()) {
                D(new FirebaseInstallationsException(FirebaseInstallationsException.a.BAD_CONFIG));
            } else if (C7.j()) {
                D(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                E(C7);
            }
        } catch (FirebaseInstallationsException e8) {
            D(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void y(final boolean z7) {
        J4.d t7 = t();
        if (z7) {
            t7 = t7.p();
        }
        E(t7);
        this.f32821i.execute(new Runnable() { // from class: I4.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f3155o.w(z7);
            }
        });
    }

    private J4.d l(J4.d dVar) {
        K4.f e8 = this.f32814b.e(m(), dVar.d(), u(), dVar.f());
        int i8 = b.f32827b[e8.b().ordinal()];
        if (i8 == 1) {
            return dVar.o(e8.c(), e8.d(), this.f32816d.b());
        }
        if (i8 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i8 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        F(null);
        return dVar.r();
    }

    private synchronized String o() {
        return this.f32822j;
    }

    private J4.b p() {
        return (J4.b) this.f32817e.get();
    }

    public static c q() {
        return r(com.google.firebase.f.l());
    }

    public static c r(com.google.firebase.f fVar) {
        r.b(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.j(I4.e.class);
    }

    /* JADX WARN: Finally extract failed */
    private J4.d s() {
        J4.d d8;
        synchronized (f32811m) {
            try {
                com.google.firebase.installations.b a8 = com.google.firebase.installations.b.a(this.f32813a.k(), "generatefid.lock");
                try {
                    d8 = this.f32815c.d();
                    if (a8 != null) {
                        a8.b();
                    }
                } catch (Throwable th) {
                    if (a8 != null) {
                        a8.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d8;
    }

    /* JADX WARN: Finally extract failed */
    private J4.d t() {
        J4.d d8;
        synchronized (f32811m) {
            try {
                com.google.firebase.installations.b a8 = com.google.firebase.installations.b.a(this.f32813a.k(), "generatefid.lock");
                try {
                    d8 = this.f32815c.d();
                    if (d8.j()) {
                        d8 = this.f32815c.b(d8.t(B(d8)));
                    }
                    if (a8 != null) {
                        a8.b();
                    }
                } catch (Throwable th) {
                    if (a8 != null) {
                        a8.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d8;
    }

    /* JADX WARN: Finally extract failed */
    private void v(J4.d dVar) {
        synchronized (f32811m) {
            try {
                com.google.firebase.installations.b a8 = com.google.firebase.installations.b.a(this.f32813a.k(), "generatefid.lock");
                try {
                    this.f32815c.b(dVar);
                    if (a8 != null) {
                        a8.b();
                    }
                } catch (Throwable th) {
                    if (a8 != null) {
                        a8.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        y(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ J4.b z(com.google.firebase.f fVar) {
        return new J4.b(fVar);
    }

    @Override // I4.e
    public AbstractC0376j a(final boolean z7) {
        A();
        AbstractC0376j g8 = g();
        this.f32820h.execute(new Runnable() { // from class: I4.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f3153o.y(z7);
            }
        });
        return g8;
    }

    @Override // I4.e
    public AbstractC0376j d() {
        A();
        String o8 = o();
        if (o8 != null) {
            return AbstractC0379m.e(o8);
        }
        AbstractC0376j h8 = h();
        this.f32820h.execute(new Runnable() { // from class: I4.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f3152o.x();
            }
        });
        return h8;
    }

    String m() {
        return this.f32813a.n().b();
    }

    String n() {
        return this.f32813a.n().c();
    }

    String u() {
        return this.f32813a.n().e();
    }

    c(ExecutorService executorService, Executor executor, com.google.firebase.f fVar, K4.c cVar, J4.c cVar2, h hVar, u uVar, I4.g gVar) {
        this.f32819g = new Object();
        this.f32823k = new HashSet();
        this.f32824l = new ArrayList();
        this.f32813a = fVar;
        this.f32814b = cVar;
        this.f32815c = cVar2;
        this.f32816d = hVar;
        this.f32817e = uVar;
        this.f32818f = gVar;
        this.f32820h = executorService;
        this.f32821i = executor;
    }
}
