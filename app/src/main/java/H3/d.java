package h3;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import f3.m;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f36217a;

    public d(Context context) {
        this.f36217a = context;
    }

    public int a(String str) {
        return this.f36217a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f36217a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i8) {
        return this.f36217a.getPackageManager().getApplicationInfo(str, i8);
    }

    public CharSequence d(String str) {
        Context context = this.f36217a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public y0.e e(String str) {
        ApplicationInfo applicationInfo = this.f36217a.getPackageManager().getApplicationInfo(str, 0);
        return y0.e.a(this.f36217a.getPackageManager().getApplicationLabel(applicationInfo), this.f36217a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public PackageInfo f(String str, int i8) {
        return this.f36217a.getPackageManager().getPackageInfo(str, i8);
    }

    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f36217a);
        }
        if (!m.i() || (nameForUid = this.f36217a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f36217a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean h(int i8, String str) {
        if (m.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f36217a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i8, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f36217a.getPackageManager().getPackagesForUid(i8);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
