package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class Lx0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f17172a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f17173b;

    /* renamed from: c, reason: collision with root package name */
    public int f17174c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f17175d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f17176e;

    /* renamed from: f, reason: collision with root package name */
    public int f17177f;

    /* renamed from: g, reason: collision with root package name */
    public int f17178g;

    /* renamed from: h, reason: collision with root package name */
    public int f17179h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f17180i;

    /* renamed from: j, reason: collision with root package name */
    private final Jw0 f17181j;

    public Lx0() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f17180i = cryptoInfo;
        this.f17181j = AbstractC2301cW.f21206a >= 24 ? new Jw0(cryptoInfo, null) : null;
    }

    public final MediaCodec.CryptoInfo a() {
        return this.f17180i;
    }

    public final void b(int i8) {
        if (i8 == 0) {
            return;
        }
        if (this.f17175d == null) {
            int[] iArr = new int[1];
            this.f17175d = iArr;
            this.f17180i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f17175d;
        iArr2[0] = iArr2[0] + i8;
    }

    public final void c(int i8, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i9, int i10, int i11) {
        this.f17177f = i8;
        this.f17175d = iArr;
        this.f17176e = iArr2;
        this.f17173b = bArr;
        this.f17172a = bArr2;
        this.f17174c = i9;
        this.f17178g = i10;
        this.f17179h = i11;
        MediaCodec.CryptoInfo cryptoInfo = this.f17180i;
        cryptoInfo.numSubSamples = i8;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i9;
        if (AbstractC2301cW.f21206a >= 24) {
            Jw0 jw0 = this.f17181j;
            jw0.getClass();
            Jw0.a(jw0, i10, i11);
        }
    }
}
