package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import f3.InterfaceC5781e;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.w4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5442w4 extends AbstractC5454y2 {

    /* renamed from: c, reason: collision with root package name */
    private volatile C5449x4 f31240c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C5449x4 f31241d;

    /* renamed from: e, reason: collision with root package name */
    protected C5449x4 f31242e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f31243f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f31244g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f31245h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C5449x4 f31246i;

    /* renamed from: j, reason: collision with root package name */
    private C5449x4 f31247j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f31248k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f31249l;

    public C5442w4(S2 s22) {
        super(s22);
        this.f31249l = new Object();
        this.f31243f = new ConcurrentHashMap();
    }

    private final String B(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > a().p(null, false) ? str2.substring(0, a().p(null, false)) : str2;
    }

    private final void E(Activity activity, C5449x4 c5449x4, boolean z7) {
        C5449x4 c5449x42;
        C5449x4 c5449x43 = this.f31240c == null ? this.f31241d : this.f31240c;
        if (c5449x4.f31261b == null) {
            c5449x42 = new C5449x4(c5449x4.f31260a, activity != null ? B(activity.getClass(), "Activity") : null, c5449x4.f31262c, c5449x4.f31264e, c5449x4.f31265f);
        } else {
            c5449x42 = c5449x4;
        }
        this.f31241d = this.f31240c;
        this.f31240c = c5449x42;
        j().B(new RunnableC5456y4(this, c5449x42, c5449x43, zzb().b(), z7));
    }

    static /* synthetic */ void H(C5442w4 c5442w4, Bundle bundle, C5449x4 c5449x4, C5449x4 c5449x42, long j8) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c5442w4.L(c5449x4, c5449x42, j8, true, c5442w4.g().D(null, "screen_view", bundle, null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(com.google.android.gms.measurement.internal.C5449x4 r16, com.google.android.gms.measurement.internal.C5449x4 r17, long r18, boolean r20, android.os.Bundle r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r15.l()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L2f
            long r8 = r2.f31262c
            long r10 = r1.f31262c
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L2f
            java.lang.String r8 = r2.f31261b
            java.lang.String r9 = r1.f31261b
            boolean r8 = j$.util.Objects.equals(r8, r9)
            if (r8 == 0) goto L2f
            java.lang.String r8 = r2.f31260a
            java.lang.String r9 = r1.f31260a
            boolean r8 = j$.util.Objects.equals(r8, r9)
            if (r8 != 0) goto L2d
            goto L2f
        L2d:
            r8 = r6
            goto L30
        L2f:
            r8 = r7
        L30:
            if (r20 == 0) goto L37
            com.google.android.gms.measurement.internal.x4 r9 = r0.f31242e
            if (r9 == 0) goto L37
            r6 = r7
        L37:
            if (r8 == 0) goto Lba
            android.os.Bundle r8 = new android.os.Bundle
            if (r5 == 0) goto L42
            r8.<init>(r5)
        L40:
            r14 = r8
            goto L46
        L42:
            r8.<init>()
            goto L40
        L46:
            com.google.android.gms.measurement.internal.d6.V(r1, r14, r7)
            if (r2 == 0) goto L64
            java.lang.String r5 = r2.f31260a
            if (r5 == 0) goto L54
            java.lang.String r8 = "_pn"
            r14.putString(r8, r5)
        L54:
            java.lang.String r5 = r2.f31261b
            if (r5 == 0) goto L5d
            java.lang.String r8 = "_pc"
            r14.putString(r8, r5)
        L5d:
            java.lang.String r5 = "_pi"
            long r8 = r2.f31262c
            r14.putLong(r5, r8)
        L64:
            r8 = 0
            if (r6 == 0) goto L7d
            com.google.android.gms.measurement.internal.p5 r2 = r15.s()
            com.google.android.gms.measurement.internal.u5 r2 = r2.f31155f
            long r10 = r2.a(r3)
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L7d
            com.google.android.gms.measurement.internal.d6 r2 = r15.g()
            r2.K(r14, r10)
        L7d:
            com.google.android.gms.measurement.internal.g r2 = r15.a()
            boolean r2 = r2.T()
            if (r2 != 0) goto L8e
            java.lang.String r2 = "_mst"
            r10 = 1
            r14.putLong(r2, r10)
        L8e:
            boolean r2 = r1.f31264e
            if (r2 == 0) goto L96
            java.lang.String r2 = "app"
        L94:
            r10 = r2
            goto L99
        L96:
            java.lang.String r2 = "auto"
            goto L94
        L99:
            f3.e r2 = r15.zzb()
            long r11 = r2.a()
            boolean r2 = r1.f31264e
            r20 = r11
            if (r2 == 0) goto Laf
            long r11 = r1.f31265f
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 == 0) goto Laf
            r12 = r11
            goto Lb1
        Laf:
            r12 = r20
        Lb1:
            com.google.android.gms.measurement.internal.F3 r9 = r15.p()
            java.lang.String r11 = "_vs"
            r9.a0(r10, r11, r12, r14)
        Lba:
            if (r6 == 0) goto Lc1
            com.google.android.gms.measurement.internal.x4 r2 = r0.f31242e
            r15.M(r2, r7, r3)
        Lc1:
            r0.f31242e = r1
            boolean r2 = r1.f31264e
            if (r2 == 0) goto Lc9
            r0.f31247j = r1
        Lc9:
            com.google.android.gms.measurement.internal.F4 r2 = r15.r()
            r2.H(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5442w4.L(com.google.android.gms.measurement.internal.x4, com.google.android.gms.measurement.internal.x4, long, boolean, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(C5449x4 c5449x4, boolean z7, long j8) {
        m().t(zzb().b());
        if (!s().C(c5449x4 != null && c5449x4.f31263d, z7, j8) || c5449x4 == null) {
            return;
        }
        c5449x4.f31263d = false;
    }

    private final C5449x4 R(Activity activity) {
        Z2.r.l(activity);
        C5449x4 c5449x4 = (C5449x4) this.f31243f.get(Integer.valueOf(activity.hashCode()));
        if (c5449x4 == null) {
            C5449x4 c5449x42 = new C5449x4(null, B(activity.getClass(), "Activity"), g().P0());
            this.f31243f.put(Integer.valueOf(activity.hashCode()), c5449x42);
            c5449x4 = c5449x42;
        }
        return this.f31246i != null ? this.f31246i : c5449x4;
    }

    public final C5449x4 A(boolean z7) {
        t();
        l();
        if (!z7) {
            return this.f31242e;
        }
        C5449x4 c5449x4 = this.f31242e;
        return c5449x4 != null ? c5449x4 : this.f31247j;
    }

    public final void C(Activity activity) {
        synchronized (this.f31249l) {
            try {
                if (activity == this.f31244g) {
                    this.f31244g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a().T()) {
            this.f31243f.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    public final void D(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!a().T() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f31243f.put(Integer.valueOf(activity.hashCode()), new C5449x4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void F(Activity activity, String str, String str2) {
        if (!a().T()) {
            h().K().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C5449x4 c5449x4 = this.f31240c;
        if (c5449x4 == null) {
            h().K().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f31243f.get(Integer.valueOf(activity.hashCode())) == null) {
            h().K().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = B(activity.getClass(), "Activity");
        }
        boolean equals = Objects.equals(c5449x4.f31261b, str2);
        boolean equals2 = Objects.equals(c5449x4.f31260a, str);
        if (equals && equals2) {
            h().K().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > a().p(null, false))) {
            h().K().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > a().p(null, false))) {
            h().K().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        h().I().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C5449x4 c5449x42 = new C5449x4(str, str2, g().P0());
        this.f31243f.put(Integer.valueOf(activity.hashCode()), c5449x42);
        E(activity, c5449x42, true);
    }

    public final void G(Bundle bundle, long j8) {
        String str;
        synchronized (this.f31249l) {
            try {
                if (!this.f31248k) {
                    h().K().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String str2 = null;
                if (bundle != null) {
                    String string = bundle.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > a().p(null, false))) {
                        h().K().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > a().p(null, false))) {
                        h().K().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str = string;
                        str2 = string2;
                    }
                } else {
                    str = null;
                }
                if (str2 == null) {
                    Activity activity = this.f31244g;
                    str2 = activity != null ? B(activity.getClass(), "Activity") : "Activity";
                }
                String str3 = str2;
                C5449x4 c5449x4 = this.f31240c;
                if (this.f31245h && c5449x4 != null) {
                    this.f31245h = false;
                    boolean equals = Objects.equals(c5449x4.f31261b, str3);
                    boolean equals2 = Objects.equals(c5449x4.f31260a, str);
                    if (equals && equals2) {
                        h().K().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                h().I().c("Logging screen view with name, class", str == null ? "null" : str, str3 == null ? "null" : str3);
                C5449x4 c5449x42 = this.f31240c == null ? this.f31241d : this.f31240c;
                C5449x4 c5449x43 = new C5449x4(str, str3, g().P0(), true, j8);
                this.f31240c = c5449x43;
                this.f31241d = c5449x42;
                this.f31246i = c5449x43;
                j().B(new RunnableC5463z4(this, bundle, c5449x43, c5449x42, zzb().b()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C5449x4 N() {
        return this.f31240c;
    }

    public final void O(Activity activity) {
        synchronized (this.f31249l) {
            this.f31248k = false;
            this.f31245h = true;
        }
        long b8 = zzb().b();
        if (!a().T()) {
            this.f31240c = null;
            j().B(new A4(this, b8));
        } else {
            C5449x4 R7 = R(activity);
            this.f31241d = this.f31240c;
            this.f31240c = null;
            j().B(new D4(this, R7, b8));
        }
    }

    public final void P(Activity activity, Bundle bundle) {
        C5449x4 c5449x4;
        if (!a().T() || bundle == null || (c5449x4 = (C5449x4) this.f31243f.get(Integer.valueOf(activity.hashCode()))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c5449x4.f31262c);
        bundle2.putString("name", c5449x4.f31260a);
        bundle2.putString("referrer_name", c5449x4.f31261b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void Q(Activity activity) {
        synchronized (this.f31249l) {
            this.f31248k = true;
            if (activity != this.f31244g) {
                synchronized (this.f31249l) {
                    this.f31244g = activity;
                    this.f31245h = false;
                }
                if (a().T()) {
                    this.f31246i = null;
                    j().B(new C4(this));
                }
            }
        }
        if (!a().T()) {
            this.f31240c = this.f31246i;
            j().B(new B4(this));
        } else {
            E(activity, R(activity), false);
            C5451y m8 = m();
            m8.j().B(new Y(m8, m8.zzb().b()));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
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

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5451y m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5329g2 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5322f2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ F3 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5442w4 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ F4 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5395p5 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5454y2
    protected final boolean y() {
        return false;
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
