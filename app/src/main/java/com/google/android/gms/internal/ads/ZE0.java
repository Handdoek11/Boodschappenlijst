package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class ZE0 implements InterfaceC4347vF0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f20433a;

    /* renamed from: b, reason: collision with root package name */
    private final C2715gF0 f20434b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4456wF0 f20435c;

    /* renamed from: d, reason: collision with root package name */
    private final C3803qF0 f20436d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20437e;

    /* renamed from: f, reason: collision with root package name */
    private int f20438f = 0;

    /* synthetic */ ZE0(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC4456wF0 interfaceC4456wF0, C3803qF0 c3803qF0, XE0 xe0) {
        this.f20433a = mediaCodec;
        this.f20434b = new C2715gF0(handlerThread);
        this.f20435c = interfaceC4456wF0;
        this.f20436d = c3803qF0;
    }

    static /* bridge */ /* synthetic */ void p(ZE0 ze0, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i8) {
        C3803qF0 c3803qF0;
        ze0.f20434b.f(ze0.f20433a);
        Trace.beginSection("configureCodec");
        ze0.f20433a.configure(mediaFormat, surface, (MediaCrypto) null, i8);
        Trace.endSection();
        ze0.f20435c.e();
        Trace.beginSection("startCodec");
        ze0.f20433a.start();
        Trace.endSection();
        if (AbstractC2301cW.f21206a >= 35 && (c3803qF0 = ze0.f20436d) != null) {
            c3803qF0.a(ze0.f20433a);
        }
        ze0.f20438f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String q(int i8, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i8 == 1) {
            sb.append("Audio");
        } else if (i8 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i8);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void T(Bundle bundle) {
        this.f20435c.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final MediaFormat a() {
        return this.f20434b.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void b(int i8, int i9, int i10, long j8, int i11) {
        this.f20435c.c(i8, 0, i10, j8, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void c(Surface surface) {
        this.f20433a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void d(int i8, long j8) {
        this.f20433a.releaseOutputBuffer(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final boolean e(InterfaceC4238uF0 interfaceC4238uF0) {
        this.f20434b.g(interfaceC4238uF0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void f() {
        this.f20433a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final ByteBuffer g(int i8) {
        return this.f20433a.getInputBuffer(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void h() {
        this.f20435c.zzb();
        this.f20433a.flush();
        this.f20434b.e();
        this.f20433a.start();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void i(int i8) {
        this.f20433a.setVideoScalingMode(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void j(int i8, boolean z7) {
        this.f20433a.releaseOutputBuffer(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void k() {
        C3803qF0 c3803qF0;
        C3803qF0 c3803qF02;
        C3803qF0 c3803qF03;
        try {
            try {
                if (this.f20438f == 1) {
                    this.f20435c.g();
                    this.f20434b.h();
                }
                this.f20438f = 2;
                if (this.f20437e) {
                    return;
                }
                int i8 = AbstractC2301cW.f21206a;
                if (i8 >= 30 && i8 < 33) {
                    this.f20433a.stop();
                }
                if (i8 >= 35 && (c3803qF03 = this.f20436d) != null) {
                    c3803qF03.c(this.f20433a);
                }
                this.f20433a.release();
                this.f20437e = true;
            } catch (Throwable th) {
                if (!this.f20437e) {
                    int i9 = AbstractC2301cW.f21206a;
                    if (i9 >= 30 && i9 < 33) {
                        this.f20433a.stop();
                    }
                    if (i9 >= 35 && (c3803qF02 = this.f20436d) != null) {
                        c3803qF02.c(this.f20433a);
                    }
                    this.f20433a.release();
                    this.f20437e = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (AbstractC2301cW.f21206a >= 35 && (c3803qF0 = this.f20436d) != null) {
                c3803qF0.c(this.f20433a);
            }
            this.f20433a.release();
            this.f20437e = true;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final void l(int i8, int i9, Lx0 lx0, long j8, int i10) {
        this.f20435c.d(i8, 0, lx0, j8, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final int m(MediaCodec.BufferInfo bufferInfo) {
        this.f20435c.a();
        return this.f20434b.b(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final ByteBuffer z(int i8) {
        return this.f20433a.getOutputBuffer(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4347vF0
    public final int zza() {
        this.f20435c.a();
        return this.f20434b.a();
    }
}
