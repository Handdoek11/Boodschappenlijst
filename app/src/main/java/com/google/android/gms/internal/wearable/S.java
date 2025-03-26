package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
final class S extends U {

    /* renamed from: b, reason: collision with root package name */
    private int f30087b;

    /* renamed from: c, reason: collision with root package name */
    private int f30088c;

    /* renamed from: d, reason: collision with root package name */
    private int f30089d;

    /* synthetic */ S(byte[] bArr, int i8, int i9, boolean z7, T t7) {
        super(null);
        this.f30089d = Integer.MAX_VALUE;
        this.f30087b = 0;
    }

    public final int c(int i8) {
        int i9 = this.f30089d;
        this.f30089d = 0;
        int i10 = this.f30087b + this.f30088c;
        this.f30087b = i10;
        if (i10 > 0) {
            this.f30088c = i10;
            this.f30087b = 0;
        } else {
            this.f30088c = 0;
        }
        return i9;
    }
}
