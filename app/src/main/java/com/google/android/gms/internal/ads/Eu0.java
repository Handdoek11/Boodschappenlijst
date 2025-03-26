package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class Eu0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Eu0 f14789b;

    /* renamed from: c, reason: collision with root package name */
    static final Eu0 f14790c = new Eu0(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f14791a = Collections.emptyMap();

    Eu0(boolean z7) {
    }

    public static Eu0 a() {
        int i8 = C4851zv0.f28729d;
        return f14790c;
    }

    public static Eu0 b() {
        Eu0 eu0 = f14789b;
        if (eu0 != null) {
            return eu0;
        }
        synchronized (Eu0.class) {
            try {
                Eu0 eu02 = f14789b;
                if (eu02 != null) {
                    return eu02;
                }
                int i8 = C4851zv0.f28729d;
                Eu0 a8 = Ku0.a(Eu0.class);
                f14789b = a8;
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Ou0 c(InterfaceC3871qv0 interfaceC3871qv0, int i8) {
        androidx.appcompat.app.E.a(this.f14791a.get(new Du0(interfaceC3871qv0, i8)));
        return null;
    }
}
