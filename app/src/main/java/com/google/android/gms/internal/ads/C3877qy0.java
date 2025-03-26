package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3877qy0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f26037a;

    /* renamed from: b, reason: collision with root package name */
    private final List f26038b;

    /* synthetic */ C3877qy0(int i8, int i9, AbstractC3768py0 abstractC3768py0) {
        this.f26037a = AbstractC2137ay0.c(i8);
        this.f26038b = AbstractC2137ay0.c(i9);
    }

    public final C3877qy0 a(InterfaceC3441my0 interfaceC3441my0) {
        this.f26038b.add(interfaceC3441my0);
        return this;
    }

    public final C3877qy0 b(InterfaceC3441my0 interfaceC3441my0) {
        this.f26037a.add(interfaceC3441my0);
        return this;
    }

    public final C3985ry0 c() {
        return new C3985ry0(this.f26037a, this.f26038b, null);
    }
}
