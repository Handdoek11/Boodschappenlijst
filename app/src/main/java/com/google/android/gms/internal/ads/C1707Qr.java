package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.Qr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1707Qr implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f18552a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1672Pr f18553b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18554c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18555d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18556e;

    /* renamed from: f, reason: collision with root package name */
    private float f18557f = 1.0f;

    public C1707Qr(Context context, InterfaceC1672Pr interfaceC1672Pr) {
        this.f18552a = (AudioManager) context.getSystemService("audio");
        this.f18553b = interfaceC1672Pr;
    }

    private final void f() {
        if (!this.f18555d || this.f18556e || this.f18557f <= 0.0f) {
            if (this.f18554c) {
                AudioManager audioManager = this.f18552a;
                if (audioManager != null) {
                    this.f18554c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f18553b.l();
                return;
            }
            return;
        }
        if (this.f18554c) {
            return;
        }
        AudioManager audioManager2 = this.f18552a;
        if (audioManager2 != null) {
            this.f18554c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.f18553b.l();
    }

    public final float a() {
        float f8 = this.f18556e ? 0.0f : this.f18557f;
        if (this.f18554c) {
            return f8;
        }
        return 0.0f;
    }

    public final void b() {
        this.f18555d = true;
        f();
    }

    public final void c() {
        this.f18555d = false;
        f();
    }

    public final void d(boolean z7) {
        this.f18556e = z7;
        f();
    }

    public final void e(float f8) {
        this.f18557f = f8;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i8) {
        this.f18554c = i8 > 0;
        this.f18553b.l();
    }
}
