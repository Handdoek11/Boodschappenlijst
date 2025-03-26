package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class zzsj extends Exception {

    /* renamed from: o, reason: collision with root package name */
    public final String f28783o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f28784s;

    /* renamed from: t, reason: collision with root package name */
    public final C4565xF0 f28785t;

    /* renamed from: u, reason: collision with root package name */
    public final String f28786u;

    public zzsj(D d8, Throwable th, boolean z7, int i8) {
        this("Decoder init failed: [" + i8 + "], " + d8.toString(), th, d8.f14334o, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i8), null);
    }

    static /* bridge */ /* synthetic */ zzsj a(zzsj zzsjVar, zzsj zzsjVar2) {
        return new zzsj(zzsjVar.getMessage(), zzsjVar.getCause(), zzsjVar.f28783o, false, zzsjVar.f28785t, zzsjVar.f28786u, zzsjVar2);
    }

    public zzsj(D d8, Throwable th, boolean z7, C4565xF0 c4565xF0) {
        this("Decoder init failed: " + c4565xF0.f27773a + ", " + d8.toString(), th, d8.f14334o, false, c4565xF0, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzsj(String str, Throwable th, String str2, boolean z7, C4565xF0 c4565xF0, String str3, zzsj zzsjVar) {
        super(str, th);
        this.f28783o = str2;
        this.f28784s = false;
        this.f28785t = c4565xF0;
        this.f28786u = str3;
    }
}
