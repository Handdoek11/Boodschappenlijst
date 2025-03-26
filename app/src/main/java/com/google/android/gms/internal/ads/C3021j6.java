package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3021j6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f23180a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23181b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23182c;

    /* renamed from: d, reason: collision with root package name */
    private int f23183d;

    /* renamed from: e, reason: collision with root package name */
    private String f23184e;

    public C3021j6(int i8, int i9, int i10) {
        String str;
        if (i8 != Integer.MIN_VALUE) {
            str = i8 + "/";
        } else {
            str = "";
        }
        this.f23180a = str;
        this.f23181b = i9;
        this.f23182c = i10;
        this.f23183d = Integer.MIN_VALUE;
        this.f23184e = "";
    }

    private final void d() {
        if (this.f23183d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.f23183d;
    }

    public final String b() {
        d();
        return this.f23184e;
    }

    public final void c() {
        int i8 = this.f23183d;
        int i9 = i8 == Integer.MIN_VALUE ? this.f23181b : i8 + this.f23182c;
        this.f23183d = i9;
        this.f23184e = this.f23180a + i9;
    }
}
