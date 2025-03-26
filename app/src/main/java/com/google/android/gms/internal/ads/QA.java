package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class QA {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18383a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f18384b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f18385c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f18386d = new ConcurrentHashMap();

    public final int a(String str) {
        Integer num = (Integer) this.f18384b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long b(String str) {
        Long l8 = (Long) this.f18386d.get(str);
        if (l8 == null) {
            return -1L;
        }
        return l8.longValue();
    }

    public final void c(String str) {
        synchronized (this.f18383a) {
            try {
                Integer num = (Integer) this.f18384b.get(str);
                this.f18384b.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str, String str2, long j8) {
        Long l8 = (Long) this.f18385c.get(str2);
        if (l8 == null) {
            return;
        }
        this.f18385c.remove(str2);
        this.f18386d.put(str, Long.valueOf(j8 - l8.longValue()));
    }

    public final void e(String str, long j8) {
        this.f18385c.put(str, Long.valueOf(j8));
    }
}
