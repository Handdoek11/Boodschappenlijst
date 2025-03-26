package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.s30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3996s30 {

    /* renamed from: a, reason: collision with root package name */
    private final C4618xo f26536a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26537b;

    public C3996s30(C4618xo c4618xo, int i8) {
        this.f26536a = c4618xo;
        this.f26537b = i8;
    }

    public final int a() {
        return this.f26537b;
    }

    public final PackageInfo b() {
        return this.f26536a.f27921w;
    }

    public final String c() {
        return this.f26536a.f27919u;
    }

    public final String d() {
        return AbstractC3187kg0.c(this.f26536a.f27916o.getString("ms"));
    }

    public final String e() {
        return this.f26536a.f27923y;
    }

    public final List f() {
        return this.f26536a.f27920v;
    }

    final boolean g() {
        return this.f26536a.f27913C;
    }

    final boolean h() {
        return this.f26536a.f27916o.getBoolean("is_gbid");
    }

    final boolean i() {
        return this.f26536a.f27912B;
    }
}
