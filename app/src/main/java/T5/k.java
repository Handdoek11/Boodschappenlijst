package T5;

import J6.r;

/* loaded from: classes2.dex */
public abstract class k {
    public static final Throwable a(Throwable th, A6.d dVar) {
        r.e(th, "exception");
        r.e(dVar, "continuation");
        try {
            return j.a(th, th.getCause());
        } catch (Throwable unused) {
            return th;
        }
    }
}
