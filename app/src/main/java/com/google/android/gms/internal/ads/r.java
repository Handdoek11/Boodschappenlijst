package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
final class r implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: w, reason: collision with root package name */
    private static final r f26043w = new r();

    /* renamed from: o, reason: collision with root package name */
    public volatile long f26044o = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    private final Handler f26045s;

    /* renamed from: t, reason: collision with root package name */
    private final HandlerThread f26046t;

    /* renamed from: u, reason: collision with root package name */
    private Choreographer f26047u;

    /* renamed from: v, reason: collision with root package name */
    private int f26048v;

    private r() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f26046t = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f26045s = handler;
        handler.sendEmptyMessage(1);
    }

    public static r a() {
        return f26043w;
    }

    public final void b() {
        this.f26045s.sendEmptyMessage(2);
    }

    public final void c() {
        this.f26045s.sendEmptyMessage(3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        this.f26044o = j8;
        Choreographer choreographer = this.f26047u;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 1) {
            try {
                this.f26047u = Choreographer.getInstance();
            } catch (RuntimeException e8) {
                HL.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e8);
            }
            return true;
        }
        if (i8 == 2) {
            Choreographer choreographer = this.f26047u;
            if (choreographer != null) {
                int i9 = this.f26048v + 1;
                this.f26048v = i9;
                if (i9 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i8 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f26047u;
        if (choreographer2 != null) {
            int i10 = this.f26048v - 1;
            this.f26048v = i10;
            if (i10 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f26044o = -9223372036854775807L;
            }
        }
        return true;
    }
}
