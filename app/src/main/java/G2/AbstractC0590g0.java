package G2;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.C1773Sn;
import java.util.concurrent.Callable;

/* renamed from: G2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0590g0 {
    public static Object a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            H2.p.e("Unexpected exception.", th);
            C1773Sn.c(context).a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
