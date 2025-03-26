package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.dm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2439dm0 extends AbstractC3851ql0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f21644a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21645b = 12;

    /* renamed from: c, reason: collision with root package name */
    private final int f21646c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final C2222bm0 f21647d;

    /* synthetic */ C2439dm0(int i8, int i9, int i10, C2222bm0 c2222bm0, AbstractC2330cm0 abstractC2330cm0) {
        this.f21644a = i8;
        this.f21647d = c2222bm0;
    }

    public static C2113am0 c() {
        return new C2113am0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f21647d != C2222bm0.f20931d;
    }

    public final int b() {
        return this.f21644a;
    }

    public final C2222bm0 d() {
        return this.f21647d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2439dm0)) {
            return false;
        }
        C2439dm0 c2439dm0 = (C2439dm0) obj;
        return c2439dm0.f21644a == this.f21644a && c2439dm0.f21647d == this.f21647d;
    }

    public final int hashCode() {
        return Objects.hash(C2439dm0.class, Integer.valueOf(this.f21644a), 12, 16, this.f21647d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.f21647d) + ", 12-byte IV, 16-byte tag, and " + this.f21644a + "-byte key)";
    }
}
