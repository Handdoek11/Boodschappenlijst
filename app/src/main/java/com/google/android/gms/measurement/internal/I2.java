package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.B7;
import com.google.android.gms.internal.measurement.C5011r5;
import com.google.android.gms.internal.measurement.F7;
import com.google.android.gms.internal.measurement.H7;
import com.google.android.gms.internal.measurement.R1;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.U1;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.measurement.internal.A3;
import com.google.android.gms.measurement.internal.I2;
import f3.InterfaceC5781e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import q.C6397a;
import q.C6406j;

/* loaded from: classes2.dex */
public final class I2 extends E5 implements InterfaceC5340i {

    /* renamed from: d, reason: collision with root package name */
    private final Map f30536d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f30537e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f30538f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f30539g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f30540h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f30541i;

    /* renamed from: j, reason: collision with root package name */
    final C6406j f30542j;

    /* renamed from: k, reason: collision with root package name */
    final F7 f30543k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f30544l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f30545m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f30546n;

    I2(H5 h52) {
        super(h52);
        this.f30536d = new C6397a();
        this.f30537e = new C6397a();
        this.f30538f = new C6397a();
        this.f30539g = new C6397a();
        this.f30540h = new C6397a();
        this.f30544l = new C6397a();
        this.f30545m = new C6397a();
        this.f30546n = new C6397a();
        this.f30541i = new C6397a();
        this.f30542j = new K2(this, 20);
        this.f30543k = new N2(this);
    }

    private static Map A(com.google.android.gms.internal.measurement.U1 u12) {
        C6397a c6397a = new C6397a();
        if (u12 != null) {
            for (com.google.android.gms.internal.measurement.Y1 y12 : u12.V()) {
                c6397a.put(y12.H(), y12.I());
            }
        }
        return c6397a;
    }

    private final void D(String str, U1.a aVar) {
        HashSet hashSet = new HashSet();
        C6397a c6397a = new C6397a();
        C6397a c6397a2 = new C6397a();
        C6397a c6397a3 = new C6397a();
        if (aVar != null) {
            Iterator it = aVar.E().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.google.android.gms.internal.measurement.S1) it.next()).H());
            }
            for (int i8 = 0; i8 < aVar.y(); i8++) {
                T1.a aVar2 = (T1.a) aVar.z(i8).y();
                if (aVar2.A().isEmpty()) {
                    h().J().a("EventConfig contained null event name");
                } else {
                    String A7 = aVar2.A();
                    String b8 = w3.q.b(aVar2.A());
                    if (!TextUtils.isEmpty(b8)) {
                        aVar2 = aVar2.z(b8);
                        aVar.A(i8, aVar2);
                    }
                    if (aVar2.D() && aVar2.B()) {
                        c6397a.put(A7, Boolean.TRUE);
                    }
                    if (aVar2.E() && aVar2.C()) {
                        c6397a2.put(aVar2.A(), Boolean.TRUE);
                    }
                    if (aVar2.F()) {
                        if (aVar2.y() < 2 || aVar2.y() > 65535) {
                            h().J().c("Invalid sampling rate. Event name, sample rate", aVar2.A(), Integer.valueOf(aVar2.y()));
                        } else {
                            c6397a3.put(aVar2.A(), Integer.valueOf(aVar2.y()));
                        }
                    }
                }
            }
        }
        this.f30537e.put(str, hashSet);
        this.f30538f.put(str, c6397a);
        this.f30539g.put(str, c6397a2);
        this.f30541i.put(str, c6397a3);
    }

    private final void E(final String str, com.google.android.gms.internal.measurement.U1 u12) {
        if (u12.k() == 0) {
            this.f30542j.e(str);
            return;
        }
        h().I().b("EES programs found", Integer.valueOf(u12.k()));
        com.google.android.gms.internal.measurement.C2 c22 = (com.google.android.gms.internal.measurement.C2) u12.U().get(0);
        try {
            com.google.android.gms.internal.measurement.C c8 = new com.google.android.gms.internal.measurement.C();
            c8.c("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.J2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C5011r5("internal.remoteConfig", new M2(this.f30558o, str));
                }
            });
            c8.c("internal.appMetadata", new Callable() { // from class: w3.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final I2 i22 = this.f44335o;
                    final String str2 = str;
                    return new H7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.H2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            I2 i23 = i22;
                            String str3 = str2;
                            C5301c2 K02 = i23.o().K0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            hashMap.put("gmp_version", 106000L);
                            if (K02 != null) {
                                String o8 = K02.o();
                                if (o8 != null) {
                                    hashMap.put("app_version", o8);
                                }
                                hashMap.put("app_version_int", Long.valueOf(K02.U()));
                                hashMap.put("dynamite_version", Long.valueOf(K02.v0()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            c8.c("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.L2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new B7(this.f30577o.f30543k);
                }
            });
            c8.b(c22);
            this.f30542j.d(str, c8);
            h().I().c("EES program loaded for appId, activities", str, Integer.valueOf(c22.G().k()));
            Iterator it = c22.G().I().iterator();
            while (it.hasNext()) {
                h().I().b("EES program activity", ((com.google.android.gms.internal.measurement.B2) it.next()).H());
            }
        } catch (zzc unused) {
            h().E().b("Failed to load EES program. appId", str);
        }
    }

    private final void e0(String str) {
        s();
        l();
        Z2.r.f(str);
        if (this.f30540h.get(str) == null) {
            C5361l M02 = o().M0(str);
            if (M02 != null) {
                U1.a aVar = (U1.a) y(str, M02.f31057a).y();
                D(str, aVar);
                this.f30536d.put(str, A((com.google.android.gms.internal.measurement.U1) ((AbstractC5010r4) aVar.u())));
                this.f30540h.put(str, (com.google.android.gms.internal.measurement.U1) ((AbstractC5010r4) aVar.u()));
                E(str, (com.google.android.gms.internal.measurement.U1) ((AbstractC5010r4) aVar.u()));
                this.f30544l.put(str, aVar.C());
                this.f30545m.put(str, M02.f31058b);
                this.f30546n.put(str, M02.f31059c);
                return;
            }
            this.f30536d.put(str, null);
            this.f30538f.put(str, null);
            this.f30537e.put(str, null);
            this.f30539g.put(str, null);
            this.f30540h.put(str, null);
            this.f30544l.put(str, null);
            this.f30545m.put(str, null);
            this.f30546n.put(str, null);
            this.f30541i.put(str, null);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.C x(I2 i22, String str) {
        i22.s();
        Z2.r.f(str);
        if (!i22.U(str)) {
            return null;
        }
        if (!i22.f30540h.containsKey(str) || i22.f30540h.get(str) == null) {
            i22.e0(str);
        } else {
            i22.E(str, (com.google.android.gms.internal.measurement.U1) i22.f30540h.get(str));
        }
        return (com.google.android.gms.internal.measurement.C) i22.f30542j.h().get(str);
    }

    private final com.google.android.gms.internal.measurement.U1 y(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.U1.O();
        }
        try {
            com.google.android.gms.internal.measurement.U1 u12 = (com.google.android.gms.internal.measurement.U1) ((AbstractC5010r4) ((U1.a) Z5.E(com.google.android.gms.internal.measurement.U1.M(), bArr)).u());
            h().I().c("Parsed config. version, gmp_app_id", u12.Z() ? Long.valueOf(u12.K()) : null, u12.X() ? u12.Q() : null);
            return u12;
        } catch (zzkb e8) {
            h().J().c("Unable to merge remote config. appId", C5378n2.t(str), e8);
            return com.google.android.gms.internal.measurement.U1.O();
        } catch (RuntimeException e9) {
            h().J().c("Unable to merge remote config. appId", C5378n2.t(str), e9);
            return com.google.android.gms.internal.measurement.U1.O();
        }
    }

    private static A3.a z(R1.e eVar) {
        int i8 = O2.f30629b[eVar.ordinal()];
        if (i8 == 1) {
            return A3.a.AD_STORAGE;
        }
        if (i8 == 2) {
            return A3.a.ANALYTICS_STORAGE;
        }
        if (i8 == 3) {
            return A3.a.AD_USER_DATA;
        }
        if (i8 != 4) {
            return null;
        }
        return A3.a.AD_PERSONALIZATION;
    }

    final w3.p C(String str, A3.a aVar) {
        l();
        e0(str);
        com.google.android.gms.internal.measurement.R1 H7 = H(str);
        if (H7 == null) {
            return w3.p.UNINITIALIZED;
        }
        for (R1.a aVar2 : H7.L()) {
            if (z(aVar2.I()) == aVar) {
                int i8 = O2.f30630c[aVar2.H().ordinal()];
                return i8 != 1 ? i8 != 2 ? w3.p.UNINITIALIZED : w3.p.GRANTED : w3.p.DENIED;
            }
        }
        return w3.p.UNINITIALIZED;
    }

    protected final boolean F(String str, byte[] bArr, String str2, String str3) {
        s();
        l();
        Z2.r.f(str);
        U1.a aVar = (U1.a) y(str, bArr).y();
        if (aVar == null) {
            return false;
        }
        D(str, aVar);
        E(str, (com.google.android.gms.internal.measurement.U1) ((AbstractC5010r4) aVar.u()));
        this.f30540h.put(str, (com.google.android.gms.internal.measurement.U1) ((AbstractC5010r4) aVar.u()));
        this.f30544l.put(str, aVar.C());
        this.f30545m.put(str, str2);
        this.f30546n.put(str, str3);
        this.f30536d.put(str, A((com.google.android.gms.internal.measurement.U1) ((AbstractC5010r4) aVar.u())));
        o().a0(str, new ArrayList(aVar.D()));
        try {
            aVar.B();
            bArr = ((com.google.android.gms.internal.measurement.U1) ((AbstractC5010r4) aVar.u())).j();
        } catch (RuntimeException e8) {
            h().J().c("Unable to serialize reduced-size config. Storing full config instead. appId", C5378n2.t(str), e8);
        }
        C5354k o8 = o();
        Z2.r.f(str);
        o8.l();
        o8.s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (o8.z().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                o8.h().E().b("Failed to update remote config (got 0). appId", C5378n2.t(str));
            }
        } catch (SQLiteException e9) {
            o8.h().E().c("Error storing remote config. appId", C5378n2.t(str), e9);
        }
        this.f30540h.put(str, (com.google.android.gms.internal.measurement.U1) ((AbstractC5010r4) aVar.u()));
        return true;
    }

    final int G(String str, String str2) {
        Integer num;
        l();
        e0(str);
        Map map = (Map) this.f30541i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final com.google.android.gms.internal.measurement.R1 H(String str) {
        l();
        e0(str);
        com.google.android.gms.internal.measurement.U1 J7 = J(str);
        if (J7 == null || !J7.W()) {
            return null;
        }
        return J7.L();
    }

    final A3.a I(String str, A3.a aVar) {
        l();
        e0(str);
        com.google.android.gms.internal.measurement.R1 H7 = H(str);
        if (H7 == null) {
            return null;
        }
        for (R1.c cVar : H7.K()) {
            if (aVar == z(cVar.I())) {
                return z(cVar.H());
            }
        }
        return null;
    }

    protected final com.google.android.gms.internal.measurement.U1 J(String str) {
        s();
        l();
        Z2.r.f(str);
        e0(str);
        return (com.google.android.gms.internal.measurement.U1) this.f30540h.get(str);
    }

    final boolean K(String str, A3.a aVar) {
        l();
        e0(str);
        com.google.android.gms.internal.measurement.R1 H7 = H(str);
        if (H7 == null) {
            return false;
        }
        Iterator it = H7.J().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            R1.a aVar2 = (R1.a) it.next();
            if (aVar == z(aVar2.I())) {
                if (aVar2.H() == R1.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean L(String str, String str2) {
        Boolean bool;
        l();
        e0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f30539g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String M(String str) {
        l();
        return (String) this.f30546n.get(str);
    }

    final boolean N(String str, String str2) {
        Boolean bool;
        l();
        e0(str);
        if (V(str) && d6.H0(str2)) {
            return true;
        }
        if (X(str) && d6.I0(str2)) {
            return true;
        }
        Map map = (Map) this.f30538f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String O(String str) {
        l();
        return (String) this.f30545m.get(str);
    }

    final String P(String str) {
        l();
        e0(str);
        return (String) this.f30544l.get(str);
    }

    final Set Q(String str) {
        l();
        e0(str);
        return (Set) this.f30537e.get(str);
    }

    final SortedSet R(String str) {
        l();
        e0(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.R1 H7 = H(str);
        if (H7 == null) {
            return treeSet;
        }
        Iterator it = H7.I().iterator();
        while (it.hasNext()) {
            treeSet.add(((R1.f) it.next()).H());
        }
        return treeSet;
    }

    protected final void S(String str) {
        l();
        this.f30545m.put(str, null);
    }

    final void T(String str) {
        l();
        this.f30540h.remove(str);
    }

    public final boolean U(String str) {
        com.google.android.gms.internal.measurement.U1 u12;
        return (TextUtils.isEmpty(str) || (u12 = (com.google.android.gms.internal.measurement.U1) this.f30540h.get(str)) == null || u12.k() == 0) ? false : true;
    }

    final boolean V(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_internal"));
    }

    final boolean W(String str) {
        l();
        e0(str);
        com.google.android.gms.internal.measurement.R1 H7 = H(str);
        return H7 == null || !H7.N() || H7.M();
    }

    final boolean X(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_public"));
    }

    final boolean Y(String str) {
        l();
        e0(str);
        return this.f30537e.get(str) != null && ((Set) this.f30537e.get(str)).contains("app_instance_id");
    }

    final boolean Z(String str) {
        l();
        e0(str);
        if (this.f30537e.get(str) != null) {
            return ((Set) this.f30537e.get(str)).contains("device_model") || ((Set) this.f30537e.get(str)).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    final boolean a0(String str) {
        l();
        e0(str);
        return this.f30537e.get(str) != null && ((Set) this.f30537e.get(str)).contains("enhanced_user_id");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5340i
    public final String b(String str, String str2) {
        l();
        e0(str);
        Map map = (Map) this.f30536d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    final boolean b0(String str) {
        l();
        e0(str);
        return this.f30537e.get(str) != null && ((Set) this.f30537e.get(str)).contains("google_signals");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    final boolean c0(String str) {
        l();
        e0(str);
        if (this.f30537e.get(str) != null) {
            return ((Set) this.f30537e.get(str)).contains("os_version") || ((Set) this.f30537e.get(str)).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    final boolean d0(String str) {
        l();
        e0(str);
        return this.f30537e.get(str) != null && ((Set) this.f30537e.get(str)).contains("user_id");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C5354k o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C5353j5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    final long w(String str) {
        String b8 = b(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(b8)) {
            return 0L;
        }
        try {
            return Long.parseLong(b8);
        } catch (NumberFormatException e8) {
            h().J().c("Unable to parse timezone offset. appId", C5378n2.t(str), e8);
            return 0L;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ InterfaceC5781e zzb() {
        return super.zzb();
    }
}
