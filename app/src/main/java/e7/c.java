package e7;

import Z6.E;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final E f35343a = new E("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    private static final E f35344b = new E("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z7) {
        return new b(z7);
    }

    public static /* synthetic */ a b(boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        return a(z7);
    }
}
