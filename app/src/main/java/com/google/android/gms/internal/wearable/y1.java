package com.google.android.gms.internal.wearable;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public abstract class y1 extends Handler {
    public y1(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    protected void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        a(message);
    }
}
