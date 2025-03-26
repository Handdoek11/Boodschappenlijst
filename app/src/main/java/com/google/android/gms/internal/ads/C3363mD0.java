package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3363mD0 extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3799qD0 f24475a;

    /* synthetic */ C3363mD0(C3799qD0 c3799qD0, AbstractC3690pD0 abstractC3690pD0) {
        this.f24475a = c3799qD0;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C3799qD0 c3799qD0 = this.f24475a;
        this.f24475a.j(C3254lD0.c(c3799qD0.f25871a, c3799qD0.f25878h, c3799qD0.f25877g));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C3907rD0 c3907rD0 = this.f24475a.f25877g;
        int i8 = AbstractC2301cW.f21206a;
        int length = audioDeviceInfoArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i9], c3907rD0)) {
                this.f24475a.f25877g = null;
                break;
            }
            i9++;
        }
        C3799qD0 c3799qD0 = this.f24475a;
        c3799qD0.j(C3254lD0.c(c3799qD0.f25871a, c3799qD0.f25878h, c3799qD0.f25877g));
    }
}
