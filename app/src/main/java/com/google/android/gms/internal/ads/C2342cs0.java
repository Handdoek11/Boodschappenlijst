package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2342cs0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f21300a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map f21301b;

    public final synchronized Map a() {
        try {
            if (this.f21301b == null) {
                this.f21301b = DesugarCollections.unmodifiableMap(new HashMap(this.f21300a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21301b;
    }
}
