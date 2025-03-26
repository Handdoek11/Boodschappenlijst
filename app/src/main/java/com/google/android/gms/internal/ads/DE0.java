package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class DE0 implements LD0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FE0 f14439a;

    /* synthetic */ DE0(FE0 fe0, EE0 ee0) {
        this.f14439a = fe0;
    }

    @Override // com.google.android.gms.internal.ads.LD0
    public final void a(Exception exc) {
        HL.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f14439a.f15103A0.b(exc);
    }
}
