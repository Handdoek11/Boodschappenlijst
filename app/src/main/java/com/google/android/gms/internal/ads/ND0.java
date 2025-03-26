package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes.dex */
final class ND0 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f17484a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f17485b = new AudioTimestamp();

    /* renamed from: c, reason: collision with root package name */
    private long f17486c;

    /* renamed from: d, reason: collision with root package name */
    private long f17487d;

    /* renamed from: e, reason: collision with root package name */
    private long f17488e;

    /* renamed from: f, reason: collision with root package name */
    private long f17489f;

    public ND0(AudioTrack audioTrack) {
        this.f17484a = audioTrack;
    }

    public final long a() {
        return this.f17488e;
    }

    public final long b() {
        return this.f17485b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.f17484a.getTimestamp(this.f17485b);
        if (timestamp) {
            long j8 = this.f17485b.framePosition;
            if (this.f17487d > j8) {
                this.f17486c++;
            }
            this.f17487d = j8;
            this.f17488e = j8 + this.f17489f + (this.f17486c << 32);
        }
        return timestamp;
    }
}
