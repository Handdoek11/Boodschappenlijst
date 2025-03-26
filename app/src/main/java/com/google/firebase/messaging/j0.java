package com.google.firebase.messaging;

import A3.AbstractC0376j;
import A3.InterfaceC0371e;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.m0;

/* loaded from: classes2.dex */
class j0 extends Binder {

    /* renamed from: o, reason: collision with root package name */
    private final a f32996o;

    interface a {
        AbstractC0376j a(Intent intent);
    }

    j0(a aVar) {
        this.f32996o = aVar;
    }

    void c(final m0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f32996o.a(aVar.f33008a).d(new Z0.m(), new InterfaceC0371e() { // from class: com.google.firebase.messaging.i0
            @Override // A3.InterfaceC0371e
            public final void a(AbstractC0376j abstractC0376j) {
                aVar.d();
            }
        });
    }
}
