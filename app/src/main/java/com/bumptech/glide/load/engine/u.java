package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12861a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f12862b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((L1.c) message.obj).b();
            return true;
        }
    }

    u() {
    }

    synchronized void a(L1.c cVar, boolean z7) {
        try {
            if (this.f12861a || z7) {
                this.f12862b.obtainMessage(1, cVar).sendToTarget();
            } else {
                this.f12861a = true;
                cVar.b();
                this.f12861a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
