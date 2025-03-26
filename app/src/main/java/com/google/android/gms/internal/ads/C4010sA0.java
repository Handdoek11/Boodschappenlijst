package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.sA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4010sA0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f26592a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Looper f26593b = null;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f26594c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f26595d = 0;

    public C4010sA0(Looper looper) {
    }

    public final Looper a() {
        Looper looper;
        synchronized (this.f26592a) {
            try {
                if (this.f26593b == null) {
                    boolean z7 = false;
                    if (this.f26595d == 0 && this.f26594c == null) {
                        z7 = true;
                    }
                    AbstractC3796qC.f(z7);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f26594c = handlerThread;
                    handlerThread.start();
                    this.f26593b = this.f26594c.getLooper();
                }
                this.f26595d++;
                looper = this.f26593b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public final void b() {
        HandlerThread handlerThread;
        synchronized (this.f26592a) {
            try {
                AbstractC3796qC.f(this.f26595d > 0);
                int i8 = this.f26595d - 1;
                this.f26595d = i8;
                if (i8 == 0 && (handlerThread = this.f26594c) != null) {
                    handlerThread.quit();
                    this.f26594c = null;
                    this.f26593b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
