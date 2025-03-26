package j$.util.stream;

import java.security.AccessController;

/* loaded from: classes3.dex */
abstract class M3 {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f37518a = ((Boolean) AccessController.doPrivileged(new L3())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
