package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ic0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2963ic0 implements Comparable {

    /* renamed from: t, reason: collision with root package name */
    private long f23005t;

    /* renamed from: s, reason: collision with root package name */
    private long f23004s = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private final UQ f23003o = new UQ();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C2963ic0 c2963ic0 = (C2963ic0) obj;
        int compare = Long.compare(this.f23004s, c2963ic0.f23004s);
        return compare != 0 ? compare : Long.compare(this.f23005t, c2963ic0.f23005t);
    }

    public final void f(long j8, long j9, UQ uq) {
        AbstractC3796qC.f(j8 != -9223372036854775807L);
        this.f23004s = j8;
        this.f23005t = j9;
        this.f23003o.i(uq.r());
        System.arraycopy(uq.n(), uq.t(), this.f23003o.n(), 0, uq.r());
    }
}
