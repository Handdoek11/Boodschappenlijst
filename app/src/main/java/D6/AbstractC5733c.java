package d6;

import g6.EnumC5815c;
import h6.AbstractC5844b;

/* renamed from: d6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5733c {
    public static InterfaceC5732b a() {
        return EnumC5815c.INSTANCE;
    }

    public static InterfaceC5732b b(Runnable runnable) {
        AbstractC5844b.e(runnable, "run is null");
        return new e(runnable);
    }
}
