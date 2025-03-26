package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.qD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3799qD0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25871a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f25872b;

    /* renamed from: c, reason: collision with root package name */
    private final C3363mD0 f25873c;

    /* renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f25874d;

    /* renamed from: e, reason: collision with root package name */
    private final C3472nD0 f25875e;

    /* renamed from: f, reason: collision with root package name */
    private C3254lD0 f25876f;

    /* renamed from: g, reason: collision with root package name */
    private C3907rD0 f25877g;

    /* renamed from: h, reason: collision with root package name */
    private WR f25878h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25879i;

    /* renamed from: j, reason: collision with root package name */
    private final YD0 f25880j;

    C3799qD0(Context context, YD0 yd0, WR wr, C3907rD0 c3907rD0) {
        Context applicationContext = context.getApplicationContext();
        this.f25871a = applicationContext;
        this.f25880j = yd0;
        this.f25878h = wr;
        this.f25877g = c3907rD0;
        byte b8 = 0;
        byte b9 = 0;
        Handler handler = new Handler(AbstractC2301cW.R(), null);
        this.f25872b = handler;
        this.f25873c = AbstractC2301cW.f21206a >= 23 ? new C3363mD0(this, b9 == true ? 1 : 0) : null;
        this.f25874d = new C3581oD0(this, b8 == true ? 1 : 0);
        Uri a8 = C3254lD0.a();
        this.f25875e = a8 != null ? new C3472nD0(this, handler, applicationContext.getContentResolver(), a8) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(C3254lD0 c3254lD0) {
        if (!this.f25879i || c3254lD0.equals(this.f25876f)) {
            return;
        }
        this.f25876f = c3254lD0;
        this.f25880j.f20229a.F(c3254lD0);
    }

    public final C3254lD0 c() {
        C3363mD0 c3363mD0;
        if (this.f25879i) {
            C3254lD0 c3254lD0 = this.f25876f;
            c3254lD0.getClass();
            return c3254lD0;
        }
        this.f25879i = true;
        C3472nD0 c3472nD0 = this.f25875e;
        if (c3472nD0 != null) {
            c3472nD0.a();
        }
        if (AbstractC2301cW.f21206a >= 23 && (c3363mD0 = this.f25873c) != null) {
            Context context = this.f25871a;
            Handler handler = this.f25872b;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.registerAudioDeviceCallback(c3363mD0, handler);
        }
        C3254lD0 d8 = C3254lD0.d(this.f25871a, this.f25871a.registerReceiver(this.f25874d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f25872b), this.f25878h, this.f25877g);
        this.f25876f = d8;
        return d8;
    }

    public final void g(WR wr) {
        this.f25878h = wr;
        j(C3254lD0.c(this.f25871a, wr, this.f25877g));
    }

    public final void h(AudioDeviceInfo audioDeviceInfo) {
        C3907rD0 c3907rD0 = this.f25877g;
        if (Objects.equals(audioDeviceInfo, c3907rD0 == null ? null : c3907rD0.f26139a)) {
            return;
        }
        C3907rD0 c3907rD02 = audioDeviceInfo != null ? new C3907rD0(audioDeviceInfo) : null;
        this.f25877g = c3907rD02;
        j(C3254lD0.c(this.f25871a, this.f25878h, c3907rD02));
    }

    public final void i() {
        C3363mD0 c3363mD0;
        if (this.f25879i) {
            this.f25876f = null;
            if (AbstractC2301cW.f21206a >= 23 && (c3363mD0 = this.f25873c) != null) {
                AudioManager audioManager = (AudioManager) this.f25871a.getSystemService("audio");
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(c3363mD0);
            }
            this.f25871a.unregisterReceiver(this.f25874d);
            C3472nD0 c3472nD0 = this.f25875e;
            if (c3472nD0 != null) {
                c3472nD0.b();
            }
            this.f25879i = false;
        }
    }
}
