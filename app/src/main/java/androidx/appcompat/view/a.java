package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import f.AbstractC5753b;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f6985a;

    private a(Context context) {
        this.f6985a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f6985a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f6985a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f6985a.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i8 > 600) {
            return 5;
        }
        if (i8 > 960 && i9 > 720) {
            return 5;
        }
        if (i8 > 720 && i9 > 960) {
            return 5;
        }
        if (i8 >= 500) {
            return 4;
        }
        if (i8 > 640 && i9 > 480) {
            return 4;
        }
        if (i8 <= 480 || i9 <= 640) {
            return i8 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.f6985a.getResources().getBoolean(AbstractC5753b.f35400a);
    }

    public boolean f() {
        return true;
    }
}
