package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class m extends m3.h {

    /* renamed from: b, reason: collision with root package name */
    private final Context f13423b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1108g f13424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C1108g c1108g, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f13424c = c1108g;
        this.f13423b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i8 = message.what;
        if (i8 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i8);
            return;
        }
        C1108g c1108g = this.f13424c;
        int g8 = c1108g.g(this.f13423b);
        if (c1108g.j(g8)) {
            this.f13424c.o(this.f13423b, g8);
        }
    }
}
