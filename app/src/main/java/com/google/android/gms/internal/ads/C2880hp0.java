package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.hp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2880hp0 {

    /* renamed from: b, reason: collision with root package name */
    private static final C2880hp0 f22624b = new C2880hp0();

    /* renamed from: c, reason: collision with root package name */
    private static final C2662fp0 f22625c = new C2662fp0(null);

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f22626a = new AtomicReference();

    public static C2880hp0 b() {
        return f22624b;
    }

    public final So0 a() {
        So0 so0 = (So0) this.f22626a.get();
        return so0 == null ? f22625c : so0;
    }
}
