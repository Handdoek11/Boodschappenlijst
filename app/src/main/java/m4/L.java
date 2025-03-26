package m4;

import android.content.Context;

/* loaded from: classes2.dex */
class L {

    /* renamed from: a, reason: collision with root package name */
    private String f39016a;

    L() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.f39016a == null) {
                this.f39016a = b(context);
            }
        } finally {
        }
        return "".equals(this.f39016a) ? null : this.f39016a;
    }
}
