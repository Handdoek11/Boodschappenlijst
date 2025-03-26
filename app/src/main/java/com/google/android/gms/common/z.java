package com.google.android.gms.common;

import Z2.Y;
import Z2.Z;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import f3.AbstractC5777a;
import i3.BinderC5853b;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
abstract class z {

    /* renamed from: e, reason: collision with root package name */
    private static volatile Z f13437e;

    /* renamed from: g, reason: collision with root package name */
    private static Context f13439g;

    /* renamed from: a, reason: collision with root package name */
    static final x f13433a = new r(v.J0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final x f13434b = new s(v.J0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final x f13435c = new t(v.J0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final x f13436d = new u(v.J0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    private static final Object f13438f = new Object();

    static J a(String str, v vVar, boolean z7, boolean z8) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, vVar, z7, z8);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static J b(String str, boolean z7, boolean z8, boolean z9) {
        return g(str, z7, false, false, true);
    }

    static /* synthetic */ String c(boolean z7, String str, v vVar) {
        String str2 = (z7 || !f(str, vVar, true, false).f13203a) ? "not allowed" : "debug cert rejected";
        MessageDigest b8 = AbstractC5777a.b("SHA-256");
        Z2.r.l(b8);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, f3.j.a(b8.digest(vVar.p2())), Boolean.valueOf(z7), "12451000.false");
    }

    static synchronized void d(Context context) {
        synchronized (z.class) {
            if (f13439g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f13439g = context.getApplicationContext();
            }
        }
    }

    static boolean e() {
        boolean z7;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                z7 = f13437e.f();
            } catch (RemoteException | DynamiteModule.LoadingException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                z7 = false;
            }
            return z7;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static J f(final String str, final v vVar, final boolean z7, boolean z8) {
        try {
            h();
            Z2.r.l(f13439g);
            try {
                return f13437e.f5(new E(str, vVar, z7, z8), BinderC5853b.p2(f13439g.getPackageManager())) ? J.b() : new H(new Callable() { // from class: com.google.android.gms.common.q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return z.c(z7, str, vVar);
                    }
                }, null);
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                return J.d("module call", e8);
            }
        } catch (DynamiteModule.LoadingException e9) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            return J.d("module init: ".concat(String.valueOf(e9.getMessage())), e9);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, i3.a] */
    private static J g(String str, boolean z7, boolean z8, boolean z9, boolean z10) {
        J d8;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Z2.r.l(f13439g);
            try {
                h();
                A a8 = new A(str, z7, false, BinderC5853b.p2(f13439g), false, true);
                try {
                    C A32 = z10 ? f13437e.A3(a8) : f13437e.l4(a8);
                    if (A32.B0()) {
                        d8 = J.f(A32.C0());
                    } else {
                        String A02 = A32.A0();
                        PackageManager.NameNotFoundException nameNotFoundException = A32.D0() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (A02 == null) {
                            A02 = "error checking package certificate";
                        }
                        d8 = J.g(A32.C0(), A32.D0(), A02, nameNotFoundException);
                    }
                } catch (RemoteException e8) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                    d8 = J.d("module call", e8);
                }
            } catch (DynamiteModule.LoadingException e9) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
                d8 = J.d("module init: ".concat(String.valueOf(e9.getMessage())), e9);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d8;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static void h() {
        if (f13437e != null) {
            return;
        }
        Z2.r.l(f13439g);
        synchronized (f13438f) {
            try {
                if (f13437e == null) {
                    f13437e = Y.D0(DynamiteModule.e(f13439g, DynamiteModule.f13446f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
