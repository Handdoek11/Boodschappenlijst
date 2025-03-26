package com.google.firebase.messaging;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.InterfaceC0369c;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5488n {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f33010c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static m0 f33011d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f33012a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f33013b = new Z0.m();

    public C5488n(Context context) {
        this.f33012a = context;
    }

    private static AbstractC0376j e(Context context, Intent intent, boolean z7) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        m0 f8 = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z7) {
            return f8.d(intent).k(new Z0.m(), new InterfaceC0369c() { // from class: com.google.firebase.messaging.m
                @Override // A3.InterfaceC0369c
                public final Object a(AbstractC0376j abstractC0376j) {
                    return C5488n.g(abstractC0376j);
                }
            });
        }
        if (W.b().e(context)) {
            h0.f(context, f8, intent);
        } else {
            f8.d(intent);
        }
        return AbstractC0379m.e(-1);
    }

    private static m0 f(Context context, String str) {
        m0 m0Var;
        synchronized (f33010c) {
            try {
                if (f33011d == null) {
                    f33011d = new m0(context, str);
                }
                m0Var = f33011d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(AbstractC0376j abstractC0376j) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(W.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer i(AbstractC0376j abstractC0376j) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC0376j j(Context context, Intent intent, boolean z7, AbstractC0376j abstractC0376j) {
        return (f3.m.i() && ((Integer) abstractC0376j.o()).intValue() == 402) ? e(context, intent, z7).k(new Z0.m(), new InterfaceC0369c() { // from class: com.google.firebase.messaging.l
            @Override // A3.InterfaceC0369c
            public final Object a(AbstractC0376j abstractC0376j2) {
                return C5488n.i(abstractC0376j2);
            }
        }) : abstractC0376j;
    }

    public AbstractC0376j k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f33012a, intent);
    }

    public AbstractC0376j l(final Context context, final Intent intent) {
        boolean z7 = f3.m.i() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z8 = (intent.getFlags() & 268435456) != 0;
        return (!z7 || z8) ? AbstractC0379m.c(this.f33013b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5488n.h(context, intent);
            }
        }).m(this.f33013b, new InterfaceC0369c() { // from class: com.google.firebase.messaging.k
            @Override // A3.InterfaceC0369c
            public final Object a(AbstractC0376j abstractC0376j) {
                return C5488n.j(context, intent, z8, abstractC0376j);
            }
        }) : e(context, intent, z8);
    }
}
