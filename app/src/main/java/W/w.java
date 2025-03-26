package W;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class w {
    public static final s a() {
        return Build.VERSION.SDK_INT >= 28 ? new u() : new v();
    }
}
