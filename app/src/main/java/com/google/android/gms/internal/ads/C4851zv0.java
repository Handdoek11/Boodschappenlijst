package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.ads.zv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4851zv0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C4851zv0 f28728c = new C4851zv0();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f28729d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f28731b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Jv0 f28730a = new C3108jv0();

    private C4851zv0() {
    }

    public static C4851zv0 a() {
        return f28728c;
    }

    public final Iv0 b(Class cls) {
        AbstractC2131av0.c(cls, "messageType");
        Iv0 iv0 = (Iv0) this.f28731b.get(cls);
        if (iv0 == null) {
            iv0 = this.f28730a.a(cls);
            AbstractC2131av0.c(cls, "messageType");
            Iv0 iv02 = (Iv0) this.f28731b.putIfAbsent(cls, iv0);
            if (iv02 != null) {
                return iv02;
            }
        }
        return iv0;
    }
}
