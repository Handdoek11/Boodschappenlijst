package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
final class Jw0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f16462a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f16463b = Gw0.a(0, 0);

    static /* bridge */ /* synthetic */ void a(Jw0 jw0, int i8, int i9) {
        jw0.f16463b.set(i8, i9);
        jw0.f16462a.setPattern(jw0.f16463b);
    }
}
