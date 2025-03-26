package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
final class Dy0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f14609a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Fy0 f14610b;

    public Dy0(Fy0 fy0, Handler handler) {
        this.f14610b = fy0;
        this.f14609a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i8) {
        this.f14609a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Cy0
            @Override // java.lang.Runnable
            public final void run() {
                Fy0.c(this.f14303o.f14610b, i8);
            }
        });
    }
}
