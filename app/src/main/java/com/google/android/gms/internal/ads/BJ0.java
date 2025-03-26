package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes.dex */
public final class BJ0 extends Surface {

    /* renamed from: u, reason: collision with root package name */
    private static int f13773u;

    /* renamed from: v, reason: collision with root package name */
    private static boolean f13774v;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f13775o;

    /* renamed from: s, reason: collision with root package name */
    private final HandlerThreadC4791zJ0 f13776s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f13777t;

    /* synthetic */ BJ0(HandlerThreadC4791zJ0 handlerThreadC4791zJ0, SurfaceTexture surfaceTexture, boolean z7, AJ0 aj0) {
        super(surfaceTexture);
        this.f13776s = handlerThreadC4791zJ0;
        this.f13775o = z7;
    }

    public static BJ0 a(Context context, boolean z7) {
        boolean z8 = true;
        if (z7 && !b(context)) {
            z8 = false;
        }
        AbstractC3796qC.f(z8);
        return new HandlerThreadC4791zJ0().a(z7 ? f13773u : 0);
    }

    public static synchronized boolean b(Context context) {
        int i8;
        synchronized (BJ0.class) {
            try {
                if (!f13774v) {
                    f13773u = ZG.b(context) ? ZG.c() ? 1 : 2 : 0;
                    f13774v = true;
                }
                i8 = f13773u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i8 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f13776s) {
            try {
                if (!this.f13777t) {
                    this.f13776s.b();
                    this.f13777t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
