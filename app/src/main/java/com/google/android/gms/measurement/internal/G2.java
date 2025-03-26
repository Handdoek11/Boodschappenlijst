package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC4879c0;
import com.google.android.gms.internal.measurement.InterfaceC4888d0;

/* loaded from: classes2.dex */
public final class G2 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f30487a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E2 f30488b;

    G2(E2 e22, String str) {
        this.f30488b = e22;
        this.f30487a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f30488b.f30336a.h().J().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC4888d0 D02 = AbstractBinderC4879c0.D0(iBinder);
            if (D02 == null) {
                this.f30488b.f30336a.h().J().a("Install Referrer Service implementation was not found");
            } else {
                this.f30488b.f30336a.h().I().a("Install Referrer Service connected");
                this.f30488b.f30336a.j().B(new F2(this, D02, this));
            }
        } catch (RuntimeException e8) {
            this.f30488b.f30336a.h().J().b("Exception occurred while calling Install Referrer API", e8);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f30488b.f30336a.h().I().a("Install Referrer Service disconnected");
    }
}
