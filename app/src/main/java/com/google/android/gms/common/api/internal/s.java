package com.google.android.gms.common.api.internal;

import A3.C0377k;
import X2.C0754b;
import Z2.AbstractC0777p;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import b3.C0962e;
import com.adadapted.android.sdk.constants.Config;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.C1092d;
import f3.AbstractC5778b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import q.C6397a;

/* loaded from: classes.dex */
public final class s implements c.a, c.b {

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ C1091c f13353D;

    /* renamed from: s, reason: collision with root package name */
    private final a.f f13355s;

    /* renamed from: t, reason: collision with root package name */
    private final C0754b f13356t;

    /* renamed from: u, reason: collision with root package name */
    private final C1100l f13357u;

    /* renamed from: x, reason: collision with root package name */
    private final int f13360x;

    /* renamed from: y, reason: collision with root package name */
    private final X2.B f13361y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f13362z;

    /* renamed from: o, reason: collision with root package name */
    private final Queue f13354o = new LinkedList();

    /* renamed from: v, reason: collision with root package name */
    private final Set f13358v = new HashSet();

    /* renamed from: w, reason: collision with root package name */
    private final Map f13359w = new HashMap();

    /* renamed from: A, reason: collision with root package name */
    private final List f13350A = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    private C1103b f13351B = null;

    /* renamed from: C, reason: collision with root package name */
    private int f13352C = 0;

    public s(C1091c c1091c, com.google.android.gms.common.api.b bVar) {
        this.f13353D = c1091c;
        a.f u7 = bVar.u(c1091c.f13298E.getLooper(), this);
        this.f13355s = u7;
        this.f13356t = bVar.p();
        this.f13357u = new C1100l();
        this.f13360x = bVar.t();
        if (u7.o()) {
            this.f13361y = bVar.v(c1091c.f13304v, c1091c.f13298E);
        } else {
            this.f13361y = null;
        }
    }

    private final C1105d c(C1105d[] c1105dArr) {
        if (c1105dArr != null && c1105dArr.length != 0) {
            C1105d[] k8 = this.f13355s.k();
            if (k8 == null) {
                k8 = new C1105d[0];
            }
            C6397a c6397a = new C6397a(k8.length);
            for (C1105d c1105d : k8) {
                c6397a.put(c1105d.getName(), Long.valueOf(c1105d.A0()));
            }
            for (C1105d c1105d2 : c1105dArr) {
                Long l8 = (Long) c6397a.get(c1105d2.getName());
                if (l8 == null || l8.longValue() < c1105d2.A0()) {
                    return c1105d2;
                }
            }
        }
        return null;
    }

    private final void d(C1103b c1103b) {
        Iterator it = this.f13358v.iterator();
        if (!it.hasNext()) {
            this.f13358v.clear();
            return;
        }
        androidx.appcompat.app.E.a(it.next());
        if (AbstractC0777p.a(c1103b, C1103b.f13385v)) {
            this.f13355s.f();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Status status) {
        Z2.r.d(this.f13353D.f13298E);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z7) {
        Z2.r.d(this.f13353D.f13298E);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f13354o.iterator();
        while (it.hasNext()) {
            H h8 = (H) it.next();
            if (!z7 || h8.f13270a == 2) {
                if (status != null) {
                    h8.a(status);
                } else {
                    h8.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.f13354o);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            H h8 = (H) arrayList.get(i8);
            if (!this.f13355s.h()) {
                return;
            }
            if (m(h8)) {
                this.f13354o.remove(h8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        A();
        d(C1103b.f13385v);
        l();
        Iterator it = this.f13359w.values().iterator();
        while (it.hasNext()) {
            X2.u uVar = (X2.u) it.next();
            if (c(uVar.f5933a.c()) != null) {
                it.remove();
            } else {
                try {
                    uVar.f5933a.d(this.f13355s, new C0377k());
                } catch (DeadObjectException unused) {
                    w0(3);
                    this.f13355s.c("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i8) {
        A();
        this.f13362z = true;
        this.f13357u.e(i8, this.f13355s.m());
        C0754b c0754b = this.f13356t;
        C1091c c1091c = this.f13353D;
        c1091c.f13298E.sendMessageDelayed(Message.obtain(c1091c.f13298E, 9, c0754b), 5000L);
        C0754b c0754b2 = this.f13356t;
        C1091c c1091c2 = this.f13353D;
        c1091c2.f13298E.sendMessageDelayed(Message.obtain(c1091c2.f13298E, 11, c0754b2), 120000L);
        this.f13353D.f13306x.c();
        Iterator it = this.f13359w.values().iterator();
        while (it.hasNext()) {
            ((X2.u) it.next()).f5935c.run();
        }
    }

    private final void j() {
        this.f13353D.f13298E.removeMessages(12, this.f13356t);
        C0754b c0754b = this.f13356t;
        C1091c c1091c = this.f13353D;
        c1091c.f13298E.sendMessageDelayed(c1091c.f13298E.obtainMessage(12, c0754b), this.f13353D.f13300o);
    }

    private final void k(H h8) {
        h8.d(this.f13357u, a());
        try {
            h8.c(this);
        } catch (DeadObjectException unused) {
            w0(1);
            this.f13355s.c("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l() {
        if (this.f13362z) {
            C1091c c1091c = this.f13353D;
            c1091c.f13298E.removeMessages(11, this.f13356t);
            C1091c c1091c2 = this.f13353D;
            c1091c2.f13298E.removeMessages(9, this.f13356t);
            this.f13362z = false;
        }
    }

    private final boolean m(H h8) {
        if (!(h8 instanceof X2.s)) {
            k(h8);
            return true;
        }
        X2.s sVar = (X2.s) h8;
        C1105d c8 = c(sVar.g(this));
        if (c8 == null) {
            k(h8);
            return true;
        }
        Log.w("GoogleApiManager", this.f13355s.getClass().getName() + " could not execute call because it requires feature (" + c8.getName() + ", " + c8.A0() + ").");
        if (!this.f13353D.f13299F || !sVar.f(this)) {
            sVar.b(new UnsupportedApiCallException(c8));
            return true;
        }
        t tVar = new t(this.f13356t, c8, null);
        int indexOf = this.f13350A.indexOf(tVar);
        if (indexOf >= 0) {
            t tVar2 = (t) this.f13350A.get(indexOf);
            this.f13353D.f13298E.removeMessages(15, tVar2);
            C1091c c1091c = this.f13353D;
            c1091c.f13298E.sendMessageDelayed(Message.obtain(c1091c.f13298E, 15, tVar2), 5000L);
            return false;
        }
        this.f13350A.add(tVar);
        C1091c c1091c2 = this.f13353D;
        c1091c2.f13298E.sendMessageDelayed(Message.obtain(c1091c2.f13298E, 15, tVar), 5000L);
        C1091c c1091c3 = this.f13353D;
        c1091c3.f13298E.sendMessageDelayed(Message.obtain(c1091c3.f13298E, 16, tVar), 120000L);
        C1103b c1103b = new C1103b(2, null);
        if (n(c1103b)) {
            return false;
        }
        this.f13353D.e(c1103b, this.f13360x);
        return false;
    }

    private final boolean n(C1103b c1103b) {
        synchronized (C1091c.f13292I) {
            try {
                C1091c c1091c = this.f13353D;
                if (c1091c.f13295B == null || !c1091c.f13296C.contains(this.f13356t)) {
                    return false;
                }
                this.f13353D.f13295B.s(c1103b, this.f13360x);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean o(boolean z7) {
        Z2.r.d(this.f13353D.f13298E);
        if (!this.f13355s.h() || !this.f13359w.isEmpty()) {
            return false;
        }
        if (!this.f13357u.g()) {
            this.f13355s.c("Timing out service connection.");
            return true;
        }
        if (!z7) {
            return false;
        }
        j();
        return false;
    }

    static /* bridge */ /* synthetic */ void y(s sVar, t tVar) {
        if (sVar.f13350A.contains(tVar) && !sVar.f13362z) {
            if (sVar.f13355s.h()) {
                sVar.g();
            } else {
                sVar.B();
            }
        }
    }

    static /* bridge */ /* synthetic */ void z(s sVar, t tVar) {
        C1105d[] g8;
        if (sVar.f13350A.remove(tVar)) {
            sVar.f13353D.f13298E.removeMessages(15, tVar);
            sVar.f13353D.f13298E.removeMessages(16, tVar);
            C1105d c1105d = tVar.f13364b;
            ArrayList arrayList = new ArrayList(sVar.f13354o.size());
            for (H h8 : sVar.f13354o) {
                if ((h8 instanceof X2.s) && (g8 = ((X2.s) h8).g(sVar)) != null && AbstractC5778b.b(g8, c1105d)) {
                    arrayList.add(h8);
                }
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                H h9 = (H) arrayList.get(i8);
                sVar.f13354o.remove(h9);
                h9.b(new UnsupportedApiCallException(c1105d));
            }
        }
    }

    public final void A() {
        Z2.r.d(this.f13353D.f13298E);
        this.f13351B = null;
    }

    public final void B() {
        Z2.r.d(this.f13353D.f13298E);
        if (this.f13355s.h() || this.f13355s.e()) {
            return;
        }
        try {
            C1091c c1091c = this.f13353D;
            int b8 = c1091c.f13306x.b(c1091c.f13304v, this.f13355s);
            if (b8 == 0) {
                C1091c c1091c2 = this.f13353D;
                a.f fVar = this.f13355s;
                v vVar = new v(c1091c2, fVar, this.f13356t);
                if (fVar.o()) {
                    ((X2.B) Z2.r.l(this.f13361y)).I3(vVar);
                }
                try {
                    this.f13355s.l(vVar);
                    return;
                } catch (SecurityException e8) {
                    E(new C1103b(10), e8);
                    return;
                }
            }
            C1103b c1103b = new C1103b(b8, null);
            Log.w("GoogleApiManager", "The service for " + this.f13355s.getClass().getName() + " is not available: " + c1103b.toString());
            E(c1103b, null);
        } catch (IllegalStateException e9) {
            E(new C1103b(10), e9);
        }
    }

    public final void C(H h8) {
        Z2.r.d(this.f13353D.f13298E);
        if (this.f13355s.h()) {
            if (m(h8)) {
                j();
                return;
            } else {
                this.f13354o.add(h8);
                return;
            }
        }
        this.f13354o.add(h8);
        C1103b c1103b = this.f13351B;
        if (c1103b == null || !c1103b.D0()) {
            B();
        } else {
            E(this.f13351B, null);
        }
    }

    final void D() {
        this.f13352C++;
    }

    @Override // X2.InterfaceC0761i
    public final void D0(C1103b c1103b) {
        E(c1103b, null);
    }

    public final void E(C1103b c1103b, Exception exc) {
        Z2.r.d(this.f13353D.f13298E);
        X2.B b8 = this.f13361y;
        if (b8 != null) {
            b8.W4();
        }
        A();
        this.f13353D.f13306x.c();
        d(c1103b);
        if ((this.f13355s instanceof C0962e) && c1103b.A0() != 24) {
            this.f13353D.f13301s = true;
            C1091c c1091c = this.f13353D;
            c1091c.f13298E.sendMessageDelayed(c1091c.f13298E.obtainMessage(19), Config.DEFAULT_AD_POLLING);
        }
        if (c1103b.A0() == 4) {
            e(C1091c.f13291H);
            return;
        }
        if (this.f13354o.isEmpty()) {
            this.f13351B = c1103b;
            return;
        }
        if (exc != null) {
            Z2.r.d(this.f13353D.f13298E);
            f(null, exc, false);
            return;
        }
        if (!this.f13353D.f13299F) {
            e(C1091c.f(this.f13356t, c1103b));
            return;
        }
        f(C1091c.f(this.f13356t, c1103b), null, true);
        if (this.f13354o.isEmpty() || n(c1103b) || this.f13353D.e(c1103b, this.f13360x)) {
            return;
        }
        if (c1103b.A0() == 18) {
            this.f13362z = true;
        }
        if (!this.f13362z) {
            e(C1091c.f(this.f13356t, c1103b));
            return;
        }
        C1091c c1091c2 = this.f13353D;
        c1091c2.f13298E.sendMessageDelayed(Message.obtain(c1091c2.f13298E, 9, this.f13356t), 5000L);
    }

    public final void F(C1103b c1103b) {
        Z2.r.d(this.f13353D.f13298E);
        a.f fVar = this.f13355s;
        fVar.c("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c1103b));
        E(c1103b, null);
    }

    public final void G() {
        Z2.r.d(this.f13353D.f13298E);
        if (this.f13362z) {
            B();
        }
    }

    public final void H() {
        Z2.r.d(this.f13353D.f13298E);
        e(C1091c.f13290G);
        this.f13357u.f();
        for (C1092d.a aVar : (C1092d.a[]) this.f13359w.keySet().toArray(new C1092d.a[0])) {
            C(new G(aVar, new C0377k()));
        }
        d(new C1103b(4));
        if (this.f13355s.h()) {
            this.f13355s.d(new r(this));
        }
    }

    public final void I() {
        Z2.r.d(this.f13353D.f13298E);
        if (this.f13362z) {
            l();
            C1091c c1091c = this.f13353D;
            e(c1091c.f13305w.g(c1091c.f13304v) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f13355s.c("Timing out connection while resuming.");
        }
    }

    @Override // X2.InterfaceC0756d
    public final void J0(Bundle bundle) {
        if (Looper.myLooper() == this.f13353D.f13298E.getLooper()) {
            h();
        } else {
            this.f13353D.f13298E.post(new o(this));
        }
    }

    public final boolean a() {
        return this.f13355s.o();
    }

    public final boolean b() {
        return o(true);
    }

    public final int p() {
        return this.f13360x;
    }

    final int q() {
        return this.f13352C;
    }

    public final a.f s() {
        return this.f13355s;
    }

    public final Map u() {
        return this.f13359w;
    }

    @Override // X2.InterfaceC0756d
    public final void w0(int i8) {
        if (Looper.myLooper() == this.f13353D.f13298E.getLooper()) {
            i(i8);
        } else {
            this.f13353D.f13298E.post(new p(this, i8));
        }
    }
}
