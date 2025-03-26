package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ep0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2553ep0 {

    /* renamed from: b, reason: collision with root package name */
    private static final C2553ep0 f21895b = new C2553ep0();

    /* renamed from: a, reason: collision with root package name */
    private final Map f21896a = new HashMap();

    public static C2553ep0 a() {
        return f21895b;
    }

    public final synchronized void b(InterfaceC2444dp0 interfaceC2444dp0, Class cls) {
        try {
            InterfaceC2444dp0 interfaceC2444dp02 = (InterfaceC2444dp0) this.f21896a.get(cls);
            if (interfaceC2444dp02 != null && !interfaceC2444dp02.equals(interfaceC2444dp0)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f21896a.put(cls, interfaceC2444dp0);
        } catch (Throwable th) {
            throw th;
        }
    }
}
