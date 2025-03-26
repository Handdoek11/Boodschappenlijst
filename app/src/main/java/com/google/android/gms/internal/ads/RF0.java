package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
final class RF0 implements QF0 {
    /* synthetic */ RF0(UF0 uf0) {
    }

    @Override // com.google.android.gms.internal.ads.QF0
    public final MediaCodecInfo A(int i8) {
        return MediaCodecList.getCodecInfoAt(i8);
    }

    @Override // com.google.android.gms.internal.ads.QF0
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.QF0
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.QF0
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.QF0
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
