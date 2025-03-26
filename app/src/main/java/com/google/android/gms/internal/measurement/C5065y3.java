package com.google.android.gms.internal.measurement;

import c4.AbstractC1014q;

/* renamed from: com.google.android.gms.internal.measurement.y3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5065y3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f29650a;

    public C5065y3(InterfaceC5057x3 interfaceC5057x3) {
        b4.h.j(interfaceC5057x3, "BuildInfo must be non-null");
        this.f29650a = !interfaceC5057x3.zza();
    }

    public final boolean a(String str) {
        b4.h.j(str, "flagName must not be null");
        if (this.f29650a) {
            return ((AbstractC1014q) B3.f28803a.get()).b(str);
        }
        return true;
    }
}
