package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class UD0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19320a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f19321b;

    public UD0(Context context) {
        this.f19320a = context;
    }

    public final C4234uD0 a(D d8, WR wr) {
        boolean booleanValue;
        AudioManager audioManager;
        d8.getClass();
        wr.getClass();
        int i8 = AbstractC2301cW.f21206a;
        if (i8 < 29 || d8.f14312E == -1) {
            return C4234uD0.f27009d;
        }
        Context context = this.f19320a;
        Boolean bool = this.f19321b;
        boolean z7 = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                this.f19321b = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                this.f19321b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            booleanValue = this.f19321b.booleanValue();
        }
        String str = d8.f14334o;
        str.getClass();
        int a8 = AbstractC1650Pc.a(str, d8.f14330k);
        if (a8 == 0 || i8 < AbstractC2301cW.z(a8)) {
            return C4234uD0.f27009d;
        }
        int A7 = AbstractC2301cW.A(d8.f14311D);
        if (A7 == 0) {
            return C4234uD0.f27009d;
        }
        try {
            AudioFormat P7 = AbstractC2301cW.P(d8.f14312E, A7, a8);
            if (i8 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(P7, wr.a().f18545a)) {
                    return C4234uD0.f27009d;
                }
                C4016sD0 c4016sD0 = new C4016sD0();
                c4016sD0.a(true);
                c4016sD0.c(booleanValue);
                return c4016sD0.d();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(P7, wr.a().f18545a);
            if (playbackOffloadSupport == 0) {
                return C4234uD0.f27009d;
            }
            C4016sD0 c4016sD02 = new C4016sD0();
            if (i8 > 32 && playbackOffloadSupport == 2) {
                z7 = true;
            }
            c4016sD02.a(true);
            c4016sD02.b(z7);
            c4016sD02.c(booleanValue);
            return c4016sD02.d();
        } catch (IllegalArgumentException unused) {
            return C4234uD0.f27009d;
        }
    }
}
