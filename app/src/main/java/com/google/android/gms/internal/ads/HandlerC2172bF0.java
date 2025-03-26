package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.bF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class HandlerC2172bF0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2497eF0 f20840a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC2172bF0(C2497eF0 c2497eF0, Looper looper) {
        super(looper);
        this.f20840a = c2497eF0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C2497eF0.f(this.f20840a, message);
    }
}
