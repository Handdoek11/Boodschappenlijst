package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
final class SF0 implements QF0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f18850a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f18851b;

    public SF0(boolean z7, boolean z8) {
        int i8 = 1;
        if (!z7 && !z8) {
            i8 = 0;
        }
        this.f18850a = i8;
    }

    private final void d() {
        if (this.f18851b == null) {
            this.f18851b = new MediaCodecList(this.f18850a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.QF0
    public final MediaCodecInfo A(int i8) {
        d();
        return this.f18851b[i8];
    }

    @Override // com.google.android.gms.internal.ads.QF0
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.QF0
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.QF0
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.QF0
    public final int zza() {
        d();
        return this.f18851b.length;
    }
}
