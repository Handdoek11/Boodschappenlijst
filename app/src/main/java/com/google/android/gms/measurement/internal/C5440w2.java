package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5440w2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final H5 f31236a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31237b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31238c;

    C5440w2(H5 h52) {
        Z2.r.l(h52);
        this.f31236a = h52;
    }

    public final void b() {
        this.f31236a.y0();
        this.f31236a.j().l();
        if (this.f31237b) {
            return;
        }
        this.f31236a.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f31238c = this.f31236a.n0().A();
        this.f31236a.h().I().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f31238c));
        this.f31237b = true;
    }

    public final void c() {
        this.f31236a.y0();
        this.f31236a.j().l();
        this.f31236a.j().l();
        if (this.f31237b) {
            this.f31236a.h().I().a("Unregistering connectivity change receiver");
            this.f31237b = false;
            this.f31238c = false;
            try {
                this.f31236a.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e8) {
                this.f31236a.h().E().b("Failed to unregister the network broadcast receiver", e8);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f31236a.y0();
        String action = intent.getAction();
        this.f31236a.h().I().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f31236a.h().J().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean A7 = this.f31236a.n0().A();
        if (this.f31238c != A7) {
            this.f31238c = A7;
            this.f31236a.j().B(new RunnableC5433v2(this, A7));
        }
    }
}
