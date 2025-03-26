package com.google.android.gms.cloudmessaging;

import A3.C0377k;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
abstract class j {

    /* renamed from: a, reason: collision with root package name */
    final int f13175a;

    /* renamed from: b, reason: collision with root package name */
    final C0377k f13176b = new C0377k();

    /* renamed from: c, reason: collision with root package name */
    final int f13177c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f13178d;

    j(int i8, int i9, Bundle bundle) {
        this.f13175a = i8;
        this.f13177c = i9;
        this.f13178d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.f13176b.b(zztVar);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f13176b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f13177c + " id=" + this.f13175a + " oneWay=" + b() + "}";
    }
}
