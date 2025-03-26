package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;

/* renamed from: com.google.android.gms.common.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1111j {

    /* renamed from: c, reason: collision with root package name */
    private static C1111j f13416c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f13417a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f13418b;

    public C1111j(Context context) {
        this.f13417a = context.getApplicationContext();
    }

    public static C1111j a(Context context) {
        Z2.r.l(context);
        synchronized (C1111j.class) {
            try {
                if (f13416c == null) {
                    z.d(context);
                    f13416c = new C1111j(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f13416c;
    }

    static final v d(PackageInfo packageInfo, v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            w wVar = new w(packageInfo.signatures[0].toByteArray());
            for (int i8 = 0; i8 < vVarArr.length; i8++) {
                if (vVarArr[i8].equals(wVar)) {
                    return vVarArr[i8];
                }
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z7) {
        PackageInfo packageInfo2;
        if (!z7) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z7 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z7 ? d(packageInfo2, y.f13432a) : d(packageInfo2, y.f13432a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    private final J f(String str, boolean z7, boolean z8) {
        J c8;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return J.c("null pkg");
        }
        if (str.equals(this.f13418b)) {
            return J.b();
        }
        if (z.e()) {
            c8 = z.b(str, AbstractC1110i.honorsDebugCertificates(this.f13417a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f13417a.getPackageManager().getPackageInfo(str, 64);
                boolean honorsDebugCertificates = AbstractC1110i.honorsDebugCertificates(this.f13417a);
                if (packageInfo == null) {
                    c8 = J.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        c8 = J.c("single cert required");
                    } else {
                        w wVar = new w(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        J a8 = z.a(str2, wVar, honorsDebugCertificates, false);
                        c8 = (!a8.f13203a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !z.a(str2, wVar, false, true).f13203a) ? a8 : J.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e8) {
                return J.d("no pkg ".concat(str), e8);
            }
        }
        if (c8.f13203a) {
            this.f13418b = str;
        }
        return c8;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (AbstractC1110i.honorsDebugCertificates(this.f13417a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i8) {
        J c8;
        int length;
        String[] packagesForUid = this.f13417a.getPackageManager().getPackagesForUid(i8);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c8 = null;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    Z2.r.l(c8);
                    break;
                }
                c8 = f(packagesForUid[i9], false, false);
                if (c8.f13203a) {
                    break;
                }
                i9++;
            }
        } else {
            c8 = J.c("no pkgs");
        }
        c8.e();
        return c8.f13203a;
    }
}
