package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class zzsf extends zzhf {

    /* renamed from: o, reason: collision with root package name */
    public final String f28781o;

    /* renamed from: s, reason: collision with root package name */
    public final int f28782s;

    public zzsf(Throwable th, C4565xF0 c4565xF0) {
        super("Decoder failed: ".concat(String.valueOf(c4565xF0 == null ? null : c4565xF0.f27773a)), th);
        boolean z7 = th instanceof MediaCodec.CodecException;
        String diagnosticInfo = z7 ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.f28781o = diagnosticInfo;
        this.f28782s = AbstractC2301cW.f21206a >= 23 ? z7 ? ((MediaCodec.CodecException) th).getErrorCode() : 0 : AbstractC2301cW.E(diagnosticInfo);
    }
}
