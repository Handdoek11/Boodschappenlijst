package j$.util;

import java.security.PrivilegedAction;

/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
