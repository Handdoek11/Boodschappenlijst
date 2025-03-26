package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5181r2 extends AbstractC5193t2 {

    /* renamed from: b, reason: collision with root package name */
    private int f29982b;

    /* renamed from: c, reason: collision with root package name */
    private int f29983c;

    /* renamed from: d, reason: collision with root package name */
    private int f29984d;

    /* synthetic */ C5181r2(byte[] bArr, int i8, int i9, boolean z7, AbstractC5187s2 abstractC5187s2) {
        super(null);
        this.f29984d = Integer.MAX_VALUE;
        this.f29982b = 0;
    }

    public final int c(int i8) {
        int i9 = this.f29984d;
        this.f29984d = 0;
        int i10 = this.f29982b + this.f29983c;
        this.f29982b = i10;
        if (i10 > 0) {
            this.f29983c = i10;
            this.f29982b = 0;
        } else {
            this.f29983c = 0;
        }
        return i9;
    }
}
