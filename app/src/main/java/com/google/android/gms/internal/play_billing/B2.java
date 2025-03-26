package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class B2 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile B2 f29680b;

    /* renamed from: c, reason: collision with root package name */
    static final B2 f29681c = new B2(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f29682a = Collections.emptyMap();

    B2(boolean z7) {
    }

    public static B2 a() {
        B2 b22 = f29680b;
        if (b22 != null) {
            return b22;
        }
        synchronized (B2.class) {
            try {
                B2 b23 = f29680b;
                if (b23 != null) {
                    return b23;
                }
                int i8 = C5171p3.f29965d;
                B2 a8 = I2.a(B2.class);
                f29680b = a8;
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final L2 b(InterfaceC5123h3 interfaceC5123h3, int i8) {
        androidx.appcompat.app.E.a(this.f29682a.get(new A2(interfaceC5123h3, i8)));
        return null;
    }
}
