package X2;

import A3.C0377k;
import Z2.AbstractC0763b;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class l {
    public static void a(Status status, Object obj, C0377k c0377k) {
        if (status.E0()) {
            c0377k.c(obj);
        } else {
            c0377k.b(AbstractC0763b.a(status));
        }
    }

    public static boolean b(Status status, Object obj, C0377k c0377k) {
        return status.E0() ? c0377k.e(obj) : c0377k.d(AbstractC0763b.a(status));
    }
}
