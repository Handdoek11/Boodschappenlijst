package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C6;
import f3.InterfaceC5781e;

/* renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5378n2 extends AbstractC5462z3 {

    /* renamed from: c, reason: collision with root package name */
    private char f31100c;

    /* renamed from: d, reason: collision with root package name */
    private long f31101d;

    /* renamed from: e, reason: collision with root package name */
    private String f31102e;

    /* renamed from: f, reason: collision with root package name */
    private final C5392p2 f31103f;

    /* renamed from: g, reason: collision with root package name */
    private final C5392p2 f31104g;

    /* renamed from: h, reason: collision with root package name */
    private final C5392p2 f31105h;

    /* renamed from: i, reason: collision with root package name */
    private final C5392p2 f31106i;

    /* renamed from: j, reason: collision with root package name */
    private final C5392p2 f31107j;

    /* renamed from: k, reason: collision with root package name */
    private final C5392p2 f31108k;

    /* renamed from: l, reason: collision with root package name */
    private final C5392p2 f31109l;

    /* renamed from: m, reason: collision with root package name */
    private final C5392p2 f31110m;

    /* renamed from: n, reason: collision with root package name */
    private final C5392p2 f31111n;

    C5378n2(S2 s22) {
        super(s22);
        this.f31100c = (char) 0;
        this.f31101d = -1L;
        this.f31103f = new C5392p2(this, 6, false, false);
        this.f31104g = new C5392p2(this, 6, true, false);
        this.f31105h = new C5392p2(this, 6, false, true);
        this.f31106i = new C5392p2(this, 5, false, false);
        this.f31107j = new C5392p2(this, 5, true, false);
        this.f31108k = new C5392p2(this, 5, false, true);
        this.f31109l = new C5392p2(this, 4, false, false);
        this.f31110m = new C5392p2(this, 3, false, false);
        this.f31111n = new C5392p2(this, 2, false, false);
    }

    private static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? (C6.a() && ((Boolean) G.f30385H0.a(null)).booleanValue()) ? "" : str : str.substring(0, lastIndexOf);
    }

    private final String N() {
        String str;
        synchronized (this) {
            try {
                if (this.f31102e == null) {
                    this.f31102e = this.f31239a.M() != null ? this.f31239a.M() : "FA";
                }
                Z2.r.l(this.f31102e);
                str = this.f31102e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    protected static Object t(String str) {
        if (str == null) {
            return null;
        }
        return new C5385o2(str);
    }

    private static String u(boolean z7, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i8 = 0;
        if (obj instanceof Long) {
            if (!z7) {
                return String.valueOf(obj);
            }
            Long l8 = (Long) obj;
            if (Math.abs(l8.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l8.longValue()));
            return str + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C5385o2 ? ((C5385o2) obj).f31126a : z7 ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z7 ? th.getClass().getName() : th.toString());
        String C7 = C(S2.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i8];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(C7)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
            i8++;
        }
        return sb.toString();
    }

    static String v(boolean z7, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String u7 = u(z7, obj);
        String u8 = u(z7, obj2);
        String u9 = u(z7, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(u7)) {
            sb.append(str2);
            sb.append(u7);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(u8)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(u8);
        }
        if (!TextUtils.isEmpty(u9)) {
            sb.append(str3);
            sb.append(u9);
        }
        return sb.toString();
    }

    protected final boolean A(int i8) {
        return Log.isLoggable(N(), i8);
    }

    public final C5392p2 D() {
        return this.f31110m;
    }

    public final C5392p2 E() {
        return this.f31103f;
    }

    public final C5392p2 F() {
        return this.f31105h;
    }

    public final C5392p2 G() {
        return this.f31104g;
    }

    public final C5392p2 H() {
        return this.f31109l;
    }

    public final C5392p2 I() {
        return this.f31111n;
    }

    public final C5392p2 J() {
        return this.f31106i;
    }

    public final C5392p2 K() {
        return this.f31108k;
    }

    public final C5392p2 L() {
        return this.f31107j;
    }

    public final String M() {
        Pair a8;
        if (f().f31287f == null || (a8 = f().f31287f.a()) == null || a8 == C5461z2.f31282B) {
            return null;
        }
        return String.valueOf(a8.second) + ":" + ((String) a8.first);
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

    @Override // com.google.android.gms.measurement.internal.AbstractC5462z3
    protected final boolean r() {
        return false;
    }

    protected final void w(int i8, String str) {
        Log.println(i8, N(), str);
    }

    protected final void x(int i8, boolean z7, boolean z8, String str, Object obj, Object obj2, Object obj3) {
        if (!z7 && A(i8)) {
            w(i8, v(false, str, obj, obj2, obj3));
        }
        if (z8 || i8 < 5) {
            return;
        }
        Z2.r.l(str);
        P2 E7 = this.f31239a.E();
        if (E7 == null) {
            w(6, "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!E7.q()) {
            w(6, "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i8 >= 9) {
            i8 = 8;
        }
        E7.B(new RunnableC5371m2(this, i8, str, obj, obj2, obj3));
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
