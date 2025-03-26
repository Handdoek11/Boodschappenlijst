package j$.util;

import java.security.AccessController;

/* loaded from: classes3.dex */
abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f37856a = ((Boolean) AccessController.doPrivileged(new t0())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
