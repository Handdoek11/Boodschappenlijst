package R5;

import J6.r;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void a(Throwable th, Throwable th2) {
        r.e(th, "<this>");
        r.e(th2, "cause");
        th.initCause(th2);
    }
}
