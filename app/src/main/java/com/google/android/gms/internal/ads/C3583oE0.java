package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.oE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3583oE0 implements PD0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4781zE0 f25139a;

    /* synthetic */ C3583oE0(C4781zE0 c4781zE0, AbstractC4236uE0 abstractC4236uE0) {
        this.f25139a = c4781zE0;
    }

    @Override // com.google.android.gms.internal.ads.PD0
    public final void a(long j8) {
        HL.f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j8);
    }

    @Override // com.google.android.gms.internal.ads.PD0
    public final void c(long j8) {
        C4781zE0 c4781zE0 = this.f25139a;
        if (c4781zE0.f28555m != null) {
            ((DE0) c4781zE0.f28555m).f14439a.f15103A0.v(j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.PD0
    public final void h(int i8, long j8) {
        C4781zE0 c4781zE0 = this.f25139a;
        if (c4781zE0.f28555m != null) {
            ((DE0) this.f25139a.f28555m).f14439a.f15103A0.x(i8, j8, SystemClock.elapsedRealtime() - c4781zE0.f28534S);
        }
    }

    @Override // com.google.android.gms.internal.ads.PD0
    public final void i(long j8, long j9, long j10, long j11) {
        C4781zE0 c4781zE0 = this.f25139a;
        HL.f("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j8 + ", " + j9 + ", " + j10 + ", " + j11 + ", " + c4781zE0.H() + ", " + c4781zE0.J());
    }

    @Override // com.google.android.gms.internal.ads.PD0
    public final void j(long j8, long j9, long j10, long j11) {
        C4781zE0 c4781zE0 = this.f25139a;
        HL.f("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j8 + ", " + j9 + ", " + j10 + ", " + j11 + ", " + c4781zE0.H() + ", " + c4781zE0.J());
    }
}
