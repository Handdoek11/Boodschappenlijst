package B1;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f337a = s1.j.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z7) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z7 ? 1 : 2, 1);
            s1.j.c().a(f337a, String.format("%s %s", cls.getName(), z7 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e8) {
            s1.j.c().a(f337a, String.format("%s could not be %s", cls.getName(), z7 ? "enabled" : "disabled"), e8);
        }
    }
}
