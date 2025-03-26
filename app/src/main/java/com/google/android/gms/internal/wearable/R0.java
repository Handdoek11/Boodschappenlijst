package com.google.android.gms.internal.wearable;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
final class R0 {

    /* renamed from: c, reason: collision with root package name */
    private static final R0 f30083c = new R0();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f30084d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f30086b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final V0 f30085a = new B0();

    private R0() {
    }

    public static R0 a() {
        return f30083c;
    }

    public final U0 b(Class cls) {
        AbstractC5269s0.c(cls, "messageType");
        U0 u02 = (U0) this.f30086b.get(cls);
        if (u02 == null) {
            u02 = this.f30085a.a(cls);
            AbstractC5269s0.c(cls, "messageType");
            U0 u03 = (U0) this.f30086b.putIfAbsent(cls, u02);
            if (u03 != null) {
                return u03;
            }
        }
        return u02;
    }
}
