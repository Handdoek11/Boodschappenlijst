package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.qF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3803qF0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f25884a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private LoudnessCodecController f25885b;

    public C3803qF0(InterfaceC3258lF0 interfaceC3258lF0) {
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f25885b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC3796qC.f(this.f25884a.add(mediaCodec));
        }
    }

    public final void b() {
        this.f25884a.clear();
        LoudnessCodecController loudnessCodecController = this.f25885b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f25884a.remove(mediaCodec) || (loudnessCodecController = this.f25885b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d(int i8) {
        LoudnessCodecController loudnessCodecController = this.f25885b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f25885b = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i8, AbstractC4284uk0.c(), new C3040jF0(this));
        this.f25885b = create;
        Iterator it = this.f25884a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
