package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4127tE0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f26859a = new Handler(Looper.myLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AudioTrack$StreamEventCallback f26860b = new C3801qE0(this);

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4781zE0 f26861c;

    public C4127tE0(C4781zE0 c4781zE0) {
        this.f26861c = c4781zE0;
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.f26859a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.pE0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f26860b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f26860b);
        this.f26859a.removeCallbacksAndMessages(null);
    }
}
