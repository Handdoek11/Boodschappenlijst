package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* renamed from: com.google.android.gms.internal.measurement.s4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5018s4 implements S4 {

    /* renamed from: a, reason: collision with root package name */
    private static final C5018s4 f29563a = new C5018s4();

    private C5018s4() {
    }

    public static C5018s4 c() {
        return f29563a;
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final U4 a(Class cls) {
        if (!AbstractC5010r4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (U4) AbstractC5010r4.m(cls.asSubclass(AbstractC5010r4.class)).r(AbstractC5010r4.c.f29542c, null, null);
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final boolean b(Class cls) {
        return AbstractC5010r4.class.isAssignableFrom(cls);
    }
}
