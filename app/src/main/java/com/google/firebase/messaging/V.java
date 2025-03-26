package com.google.firebase.messaging;

import A3.AbstractC0376j;
import A3.InterfaceC0369c;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import q.C6397a;

/* loaded from: classes2.dex */
class V {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f32891a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f32892b = new C6397a();

    interface a {
        AbstractC0376j start();
    }

    V(Executor executor) {
        this.f32891a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC0376j c(String str, AbstractC0376j abstractC0376j) {
        synchronized (this) {
            this.f32892b.remove(str);
        }
        return abstractC0376j;
    }

    synchronized AbstractC0376j b(final String str, a aVar) {
        AbstractC0376j abstractC0376j = (AbstractC0376j) this.f32892b.get(str);
        if (abstractC0376j != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return abstractC0376j;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        AbstractC0376j m8 = aVar.start().m(this.f32891a, new InterfaceC0369c() { // from class: com.google.firebase.messaging.U
            @Override // A3.InterfaceC0369c
            public final Object a(AbstractC0376j abstractC0376j2) {
                return this.f32889a.c(str, abstractC0376j2);
            }
        });
        this.f32892b.put(str, m8);
        return m8;
    }
}
