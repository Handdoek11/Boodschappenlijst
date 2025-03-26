package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
abstract class ZD0 {
    public static void a(AudioTrack audioTrack, C3907rD0 c3907rD0) {
        audioTrack.setPreferredDevice(c3907rD0 == null ? null : c3907rD0.f26139a);
    }
}
