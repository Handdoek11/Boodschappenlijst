package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2503eI0 implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    private final boolean f21773o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f21774s;

    public C2503eI0(D d8, int i8) {
        this.f21773o = 1 == (d8.f14324e & 1);
        this.f21774s = AA0.a(i8, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2503eI0 c2503eI0) {
        return AbstractC2972ih0.i().d(this.f21774s, c2503eI0.f21774s).d(this.f21773o, c2503eI0.f21773o).a();
    }
}
