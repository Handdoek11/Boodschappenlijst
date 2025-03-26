package com.headcode.ourgroceries.android;

import a6.AbstractC0829f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import com.headcode.ourgroceries.android.U1;
import d6.InterfaceC5732b;
import o0.AbstractC6278a;
import v6.C6845a;

/* loaded from: classes2.dex */
public class U1 {

    /* renamed from: a, reason: collision with root package name */
    private final C6845a f34532a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0829f f34533b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC0829f f34534c;

    /* renamed from: d, reason: collision with root package name */
    private b f34535d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5732b f34536e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f34537f;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            U1.this.j(context);
        }
    }

    public enum b {
        ONLINE,
        NETWORK_UNREACHABLE,
        SERVER_UNREACHABLE
    }

    public U1(Context context, final L4 l42) {
        C6845a O7 = C6845a.O();
        this.f34532a = O7;
        AbstractC0829f q8 = O7.n().q(X2.l("OG-NetConn", "network unreachable"));
        this.f34533b = q8;
        this.f34535d = b.ONLINE;
        AbstractC6278a.k(context, new a(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
        j(context);
        this.f34537f = q8.E(new f6.d() { // from class: com.headcode.ourgroceries.android.Q1
            @Override // f6.d
            public final void accept(Object obj) {
                U1.f(l42, (Boolean) obj);
            }
        });
        AbstractC0829f n8 = AbstractC0829f.h(l42.T().y(new f6.g() { // from class: com.headcode.ourgroceries.android.R1
            @Override // f6.g
            public final Object apply(Object obj) {
                return U1.g(l42, (Long) obj);
            }
        }), q8, new f6.b() { // from class: com.headcode.ourgroceries.android.S1
            @Override // f6.b
            public final Object apply(Object obj, Object obj2) {
                return U1.h((Boolean) obj, (Boolean) obj2);
            }
        }).n();
        this.f34534c = n8;
        this.f34536e = n8.E(new f6.d() { // from class: com.headcode.ourgroceries.android.T1
            @Override // f6.d
            public final void accept(Object obj) {
                this.f34485o.i((U1.b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(L4 l42, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        l42.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean g(L4 l42, Long l8) {
        long P7 = l42.P();
        if (P7 == 0 || SystemClock.elapsedRealtime() - P7 < 10000) {
            return Boolean.FALSE;
        }
        if (l8.longValue() == Long.MAX_VALUE) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(l8.longValue() > L4.Q() * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b h(Boolean bool, Boolean bool2) {
        return bool2.booleanValue() ? b.NETWORK_UNREACHABLE : bool.booleanValue() ? b.SERVER_UNREACHABLE : b.ONLINE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(b bVar) {
        this.f34535d = bVar;
    }

    public AbstractC0829f e() {
        return this.f34534c;
    }

    public void j(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            this.f34532a.b(Boolean.valueOf(connectivityManager.getActiveNetwork() == null));
        }
    }
}
