package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.fb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2633fb {

    /* renamed from: a, reason: collision with root package name */
    private final Map f22061a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            try {
                if (!this.f22061a.containsKey(str)) {
                    this.f22061a.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.f22061a.get(str);
    }
}
