package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Dg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1233Dg {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f14535a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f14536b = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static InterfaceC1161Bg a() {
        return (InterfaceC1161Bg) f14535a.get();
    }

    static InterfaceC1197Cg b() {
        androidx.appcompat.app.E.a(f14536b.get());
        return null;
    }

    public static void c(InterfaceC1161Bg interfaceC1161Bg) {
        f14535a.set(interfaceC1161Bg);
    }
}
