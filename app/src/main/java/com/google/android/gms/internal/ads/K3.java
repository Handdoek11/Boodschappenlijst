package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class K3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16508b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16509c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16510d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16511e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16512f;

    /* renamed from: g, reason: collision with root package name */
    public final D f16513g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16514h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f16515i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f16516j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16517k;

    /* renamed from: l, reason: collision with root package name */
    private final L3[] f16518l;

    public K3(int i8, int i9, long j8, long j9, long j10, long j11, D d8, int i10, L3[] l3Arr, int i11, long[] jArr, long[] jArr2) {
        this.f16507a = i8;
        this.f16508b = i9;
        this.f16509c = j8;
        this.f16510d = j9;
        this.f16511e = j10;
        this.f16512f = j11;
        this.f16513g = d8;
        this.f16514h = i10;
        this.f16518l = l3Arr;
        this.f16517k = i11;
        this.f16515i = jArr;
        this.f16516j = jArr2;
    }

    public final K3 a(D d8) {
        return new K3(this.f16507a, this.f16508b, this.f16509c, this.f16510d, this.f16511e, this.f16512f, d8, this.f16514h, this.f16518l, this.f16517k, this.f16515i, this.f16516j);
    }

    public final L3 b(int i8) {
        return this.f16518l[i8];
    }
}
