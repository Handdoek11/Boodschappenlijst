package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class T4 {

    /* renamed from: a, reason: collision with root package name */
    private Map f29023a = new HashMap();

    public final InterfaceC5013s a(String str) {
        if (!this.f29023a.containsKey(str)) {
            return InterfaceC5013s.f29548h;
        }
        try {
            return (InterfaceC5013s) ((Callable) this.f29023a.get(str)).call();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(String str, Callable callable) {
        this.f29023a.put(str, callable);
    }
}
