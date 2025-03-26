package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.yS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4691yS implements AH {

    /* renamed from: a, reason: collision with root package name */
    private Message f28119a;

    /* synthetic */ C4691yS(ZS zs) {
    }

    public final C4691yS a(Message message, AT at) {
        this.f28119a = message;
        return this;
    }

    public final boolean b(Handler handler) {
        Message message = this.f28119a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f28119a = null;
        AT.a(this);
        return sendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.AH
    public final void zza() {
        Message message = this.f28119a;
        message.getClass();
        message.sendToTarget();
        this.f28119a = null;
        AT.a(this);
    }
}
