package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.zJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class HandlerThreadC4791zJ0 extends HandlerThread implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    private YF f28589o;

    /* renamed from: s, reason: collision with root package name */
    private Handler f28590s;

    /* renamed from: t, reason: collision with root package name */
    private Error f28591t;

    /* renamed from: u, reason: collision with root package name */
    private RuntimeException f28592u;

    /* renamed from: v, reason: collision with root package name */
    private BJ0 f28593v;

    public HandlerThreadC4791zJ0() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final BJ0 a(int i8) {
        boolean z7;
        start();
        this.f28590s = new Handler(getLooper(), this);
        this.f28589o = new YF(this.f28590s, null);
        synchronized (this) {
            z7 = false;
            this.f28590s.obtainMessage(1, i8, 0).sendToTarget();
            while (this.f28593v == null && this.f28592u == null && this.f28591t == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f28592u;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f28591t;
        if (error != null) {
            throw error;
        }
        BJ0 bj0 = this.f28593v;
        bj0.getClass();
        return bj0;
    }

    public final void b() {
        Handler handler = this.f28590s;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        YF yf;
        int i8 = message.what;
        try {
            if (i8 == 1) {
                try {
                    int i9 = message.arg1;
                    YF yf2 = this.f28589o;
                    if (yf2 == null) {
                        throw null;
                    }
                    yf2.b(i9);
                    this.f28593v = new BJ0(this, this.f28589o.a(), i9 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzde e8) {
                    HL.d("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f28592u = new IllegalStateException(e8);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e9) {
                    HL.d("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f28591t = e9;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    HL.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f28592u = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i8 == 2) {
                try {
                    yf = this.f28589o;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (yf == null) {
                    throw null;
                }
                yf.c();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
