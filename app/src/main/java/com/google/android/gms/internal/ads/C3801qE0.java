package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* renamed from: com.google.android.gms.internal.ads.qE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3801qE0 extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4127tE0 f25882a;

    C3801qE0(C4127tE0 c4127tE0) {
        this.f25882a = c4127tE0;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i8) {
        audioTrack.equals(this.f25882a.f26861c.f28559q);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f25882a.f26861c.f28559q)) {
            this.f25882a.f26861c.f28529N = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(this.f25882a.f26861c.f28559q);
    }
}
