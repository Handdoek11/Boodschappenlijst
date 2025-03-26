package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.rI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3917rI0 {

    /* renamed from: a, reason: collision with root package name */
    private final Spatializer f26154a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26155b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f26156c;

    /* renamed from: d, reason: collision with root package name */
    private Spatializer$OnSpatializerStateChangedListener f26157d;

    private C3917rI0(Spatializer spatializer) {
        this.f26154a = spatializer;
        this.f26155b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static C3917rI0 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new C3917rI0(audioManager.getSpatializer());
    }

    public final void b(C4789zI0 c4789zI0, Looper looper) {
        if (this.f26157d == null && this.f26156c == null) {
            this.f26157d = new C3046jI0(this, c4789zI0);
            final Handler handler = new Handler(looper);
            this.f26156c = handler;
            Spatializer spatializer = this.f26154a;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.iI0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f26157d);
        }
    }

    public final void c() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f26157d;
        if (spatializer$OnSpatializerStateChangedListener == null || this.f26156c == null) {
            return;
        }
        this.f26154a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        Handler handler = this.f26156c;
        int i8 = AbstractC2301cW.f21206a;
        handler.removeCallbacksAndMessages(null);
        this.f26156c = null;
        this.f26157d = null;
    }

    public final boolean d(WR wr, D d8) {
        int A7 = AbstractC2301cW.A((Objects.equals(d8.f14334o, "audio/eac3-joc") && d8.f14311D == 16) ? 12 : (Objects.equals(d8.f14334o, "audio/iamf") && d8.f14311D == -1) ? 6 : d8.f14311D);
        if (A7 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(A7);
        int i8 = d8.f14312E;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        return this.f26154a.canBeSpatialized(wr.a().f18545a, channelMask.build());
    }

    public final boolean e() {
        return this.f26154a.isAvailable();
    }

    public final boolean f() {
        return this.f26154a.isEnabled();
    }

    public final boolean g() {
        return this.f26155b;
    }
}
