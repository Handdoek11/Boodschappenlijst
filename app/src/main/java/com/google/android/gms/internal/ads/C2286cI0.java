package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.cI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2286cI0 extends AbstractC4244uI0 implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    private final int f21155A;

    /* renamed from: B, reason: collision with root package name */
    private final int f21156B;

    /* renamed from: C, reason: collision with root package name */
    private final int f21157C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f21158D;

    /* renamed from: E, reason: collision with root package name */
    private final int f21159E;

    /* renamed from: F, reason: collision with root package name */
    private final int f21160F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f21161G;

    /* renamed from: H, reason: collision with root package name */
    private final int f21162H;

    /* renamed from: I, reason: collision with root package name */
    private final int f21163I;

    /* renamed from: J, reason: collision with root package name */
    private final int f21164J;

    /* renamed from: K, reason: collision with root package name */
    private final int f21165K;

    /* renamed from: L, reason: collision with root package name */
    private final boolean f21166L;

    /* renamed from: M, reason: collision with root package name */
    private final boolean f21167M;

    /* renamed from: N, reason: collision with root package name */
    private final boolean f21168N;

    /* renamed from: v, reason: collision with root package name */
    private final int f21169v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f21170w;

    /* renamed from: x, reason: collision with root package name */
    private final String f21171x;

    /* renamed from: y, reason: collision with root package name */
    private final C2721gI0 f21172y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f21173z;

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2286cI0(int r8, com.google.android.gms.internal.ads.C4614xm r9, int r10, com.google.android.gms.internal.ads.C2721gI0 r11, int r12, boolean r13, com.google.android.gms.internal.ads.InterfaceC1797Tf0 r14, int r15) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2286cI0.<init>(int, com.google.android.gms.internal.ads.xm, int, com.google.android.gms.internal.ads.gI0, int, boolean, com.google.android.gms.internal.ads.Tf0, int):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4244uI0
    public final int a() {
        return this.f21169v;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4244uI0
    public final /* bridge */ /* synthetic */ boolean c(AbstractC4244uI0 abstractC4244uI0) {
        String str;
        C2286cI0 c2286cI0 = (C2286cI0) abstractC4244uI0;
        boolean z7 = this.f21172y.f22294K;
        D d8 = this.f27022u;
        int i8 = d8.f14311D;
        if (i8 == -1) {
            return false;
        }
        D d9 = c2286cI0.f27022u;
        if (i8 != d9.f14311D || (str = d8.f14334o) == null || !TextUtils.equals(str, d9.f14334o)) {
            return false;
        }
        boolean z8 = this.f21172y.f22293J;
        int i9 = this.f27022u.f14312E;
        return i9 != -1 && i9 == c2286cI0.f27022u.f14312E && this.f21166L == c2286cI0.f21166L && this.f21167M == c2286cI0.f21167M;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2286cI0 c2286cI0) {
        AbstractC2539ei0 a8 = (this.f21170w && this.f21173z) ? C4789zI0.f28577j : C4789zI0.f28577j.a();
        AbstractC2972ih0 c8 = AbstractC2972ih0.i().d(this.f21173z, c2286cI0.f21173z).c(Integer.valueOf(this.f21156B), Integer.valueOf(c2286cI0.f21156B), AbstractC2539ei0.c().a()).b(this.f21155A, c2286cI0.f21155A).b(this.f21157C, c2286cI0.f21157C).d(this.f21161G, c2286cI0.f21161G).d(this.f21158D, c2286cI0.f21158D).c(Integer.valueOf(this.f21159E), Integer.valueOf(c2286cI0.f21159E), AbstractC2539ei0.c().a()).b(this.f21160F, c2286cI0.f21160F).d(this.f21170w, c2286cI0.f21170w).c(Integer.valueOf(this.f21165K), Integer.valueOf(c2286cI0.f21165K), AbstractC2539ei0.c().a());
        boolean z7 = this.f21172y.f17630z;
        AbstractC2972ih0 c9 = c8.d(this.f21166L, c2286cI0.f21166L).d(this.f21167M, c2286cI0.f21167M).d(this.f21168N, c2286cI0.f21168N).c(Integer.valueOf(this.f21162H), Integer.valueOf(c2286cI0.f21162H), a8).c(Integer.valueOf(this.f21163I), Integer.valueOf(c2286cI0.f21163I), a8);
        if (Objects.equals(this.f21171x, c2286cI0.f21171x)) {
            c9 = c9.c(Integer.valueOf(this.f21164J), Integer.valueOf(c2286cI0.f21164J), a8);
        }
        return c9.a();
    }
}
