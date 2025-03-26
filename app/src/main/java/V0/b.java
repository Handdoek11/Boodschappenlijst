package V0;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5503a = new b();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5504a = new a();

        private a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private b() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.f5504a.a();
        }
        return 0;
    }
}
