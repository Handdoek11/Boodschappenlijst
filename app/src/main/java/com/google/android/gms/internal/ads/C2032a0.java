package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2032a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C2032a0 f20611d = new C2032a0(-3, -9223372036854775807L, -1);

    /* renamed from: a, reason: collision with root package name */
    private final int f20612a;

    /* renamed from: b, reason: collision with root package name */
    private final long f20613b;

    /* renamed from: c, reason: collision with root package name */
    private final long f20614c;

    private C2032a0(int i8, long j8, long j9) {
        this.f20612a = i8;
        this.f20613b = j8;
        this.f20614c = j9;
    }

    public static C2032a0 d(long j8, long j9) {
        return new C2032a0(-1, j8, j9);
    }

    public static C2032a0 e(long j8) {
        return new C2032a0(0, -9223372036854775807L, j8);
    }

    public static C2032a0 f(long j8, long j9) {
        return new C2032a0(-2, j8, j9);
    }
}
