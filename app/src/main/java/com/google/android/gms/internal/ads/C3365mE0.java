package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.mE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3365mE0 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f24476a;

    /* renamed from: b, reason: collision with root package name */
    private final C3799qD0 f24477b;

    /* renamed from: c, reason: collision with root package name */
    private AudioRouting$OnRoutingChangedListener f24478c = new AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.hE0
        public final void onRoutingChanged(AudioRouting audioRouting) {
            C3365mE0.a(this.f22505a, audioRouting);
        }
    };

    public C3365mE0(AudioTrack audioTrack, C3799qD0 c3799qD0) {
        this.f24476a = audioTrack;
        this.f24477b = c3799qD0;
        audioTrack.addOnRoutingChangedListener(this.f24478c, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void a(C3365mE0 c3365mE0, AudioRouting audioRouting) {
        if (c3365mE0.f24478c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        c3365mE0.f24477b.h(audioRouting.getRoutedDevice());
    }

    public final void b() {
        AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = this.f24478c;
        audioRouting$OnRoutingChangedListener.getClass();
        this.f24476a.removeOnRoutingChangedListener(AbstractC3038jE0.a(audioRouting$OnRoutingChangedListener));
        this.f24478c = null;
    }
}
