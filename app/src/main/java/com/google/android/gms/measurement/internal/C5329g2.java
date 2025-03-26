package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.measurement.internal.A3;
import f3.InterfaceC5781e;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5329g2 extends AbstractC5454y2 {

    /* renamed from: c, reason: collision with root package name */
    private String f30954c;

    /* renamed from: d, reason: collision with root package name */
    private String f30955d;

    /* renamed from: e, reason: collision with root package name */
    private int f30956e;

    /* renamed from: f, reason: collision with root package name */
    private String f30957f;

    /* renamed from: g, reason: collision with root package name */
    private long f30958g;

    /* renamed from: h, reason: collision with root package name */
    private long f30959h;

    /* renamed from: i, reason: collision with root package name */
    private List f30960i;

    /* renamed from: j, reason: collision with root package name */
    private String f30961j;

    /* renamed from: k, reason: collision with root package name */
    private int f30962k;

    /* renamed from: l, reason: collision with root package name */
    private String f30963l;

    /* renamed from: m, reason: collision with root package name */
    private String f30964m;

    /* renamed from: n, reason: collision with root package name */
    private String f30965n;

    /* renamed from: o, reason: collision with root package name */
    private long f30966o;

    /* renamed from: p, reason: collision with root package name */
    private String f30967p;

    C5329g2(S2 s22, long j8) {
        super(s22);
        this.f30966o = 0L;
        this.f30967p = null;
        this.f30959h = j8;
    }

    private final String H() {
        if (s7.a() && a().r(G.f30472s0)) {
            h().I().a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zza());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                } catch (Exception unused) {
                    h().K().a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                h().L().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    final int A() {
        t();
        return this.f30962k;
    }

    final int B() {
        t();
        return this.f30956e;
    }

    final String C() {
        t();
        return this.f30964m;
    }

    final String D() {
        t();
        Z2.r.l(this.f30954c);
        return this.f30954c;
    }

    final String E() {
        l();
        t();
        Z2.r.l(this.f30963l);
        return this.f30963l;
    }

    final List F() {
        return this.f30960i;
    }

    final void G() {
        String format;
        l();
        if (f().K().m(A3.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            g().U0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            h().D().a("Analytics Storage consent is not granted");
            format = null;
        }
        h().D().a(String.format("Resetting session stitching token to %s", format == null ? "null" : "not null"));
        this.f30965n = format;
        this.f30966o = zzb().a();
    }

    final boolean I(String str) {
        String str2 = this.f30967p;
        boolean z7 = (str2 == null || str2.equals(str)) ? false : true;
        this.f30967p = str;
        return z7;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0190 A[Catch: IllegalStateException -> 0x01a8, TryCatch #3 {IllegalStateException -> 0x01a8, blocks: (B:49:0x016b, B:53:0x0188, B:55:0x0190, B:59:0x01ac, B:61:0x01c0, B:63:0x01c5, B:62:0x01c3), top: B:89:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac A[Catch: IllegalStateException -> 0x01a8, TryCatch #3 {IllegalStateException -> 0x01a8, blocks: (B:49:0x016b, B:53:0x0188, B:55:0x0190, B:59:0x01ac, B:61:0x01c0, B:63:0x01c5, B:62:0x01c3), top: B:89:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0229  */
    @Override // com.google.android.gms.measurement.internal.AbstractC5454y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void w() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5329g2.w():void");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5454y2
    protected final boolean y() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.google.android.gms.measurement.internal.M5 z(java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5329g2.z(java.lang.String):com.google.android.gms.measurement.internal.M5");
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
