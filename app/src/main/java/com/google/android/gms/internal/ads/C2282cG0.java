package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.cG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2282cG0 implements InterfaceC4347vF0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f21121a;

    /* renamed from: b, reason: collision with root package name */
    private final C3803qF0 f21122b;

    /* synthetic */ C2282cG0(MediaCodec mediaCodec, C3803qF0 c3803qF0, AbstractC2174bG0 abstractC2174bG0) {
        this.f21121a = mediaCodec;
        this.f21122b = c3803qF0;
        if (AbstractC2301cW.f21206a < 35 || c3803qF0 == null) {
            return;
        }
        c3803qF0.a(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void T(Bundle bundle) {
        this.f21121a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final MediaFormat a() {
        return this.f21121a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void b(int i8, int i9, int i10, long j8, int i11) {
        this.f21121a.queueInputBuffer(i8, 0, i10, j8, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void c(Surface surface) {
        this.f21121a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void d(int i8, long j8) {
        this.f21121a.releaseOutputBuffer(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final /* synthetic */ boolean e(InterfaceC4238uF0 interfaceC4238uF0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void f() {
        this.f21121a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final ByteBuffer g(int i8) {
        return this.f21121a.getInputBuffer(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void h() {
        this.f21121a.flush();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void i(int i8) {
        this.f21121a.setVideoScalingMode(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void j(int i8, boolean z7) {
        this.f21121a.releaseOutputBuffer(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void k() {
        C3803qF0 c3803qF0;
        C3803qF0 c3803qF02;
        try {
            int i8 = AbstractC2301cW.f21206a;
            if (i8 >= 30 && i8 < 33) {
                this.f21121a.stop();
            }
            if (i8 >= 35 && (c3803qF02 = this.f21122b) != null) {
                c3803qF02.c(this.f21121a);
            }
            this.f21121a.release();
        } catch (Throwable th) {
            if (AbstractC2301cW.f21206a >= 35 && (c3803qF0 = this.f21122b) != null) {
                c3803qF0.c(this.f21121a);
            }
            this.f21121a.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void l(int i8, int i9, Lx0 lx0, long j8, int i10) {
        this.f21121a.queueSecureInputBuffer(i8, 0, lx0.a(), j8, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final int m(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f21121a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final ByteBuffer z(int i8) {
        return this.f21121a.getOutputBuffer(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final int zza() {
        return this.f21121a.dequeueInputBuffer(0L);
    }
}
