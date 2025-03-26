package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2395dI0 extends AbstractC4244uI0 implements Comparable {

    /* renamed from: v, reason: collision with root package name */
    private final int f21512v;

    /* renamed from: w, reason: collision with root package name */
    private final int f21513w;

    public C2395dI0(int i8, C4614xm c4614xm, int i9, C2721gI0 c2721gI0, int i10) {
        super(i8, c4614xm, i9);
        this.f21512v = AA0.a(i10, c2721gI0.f22298O) ? 1 : 0;
        this.f21513w = this.f27022u.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4244uI0
    public final int a() {
        return this.f21512v;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4244uI0
    public final /* bridge */ /* synthetic */ boolean c(AbstractC4244uI0 abstractC4244uI0) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2395dI0 c2395dI0) {
        return Integer.compare(this.f21513w, c2395dI0.f21513w);
    }
}
