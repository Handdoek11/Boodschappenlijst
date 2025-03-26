package com.google.android.gms.cloudmessaging;

import V2.q;
import Z2.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import e3.C5745b;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class g implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    h f13169c;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ l f13172f;

    /* renamed from: a, reason: collision with root package name */
    int f13167a = 0;

    /* renamed from: b, reason: collision with root package name */
    final Messenger f13168b = new Messenger(new n3.f(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.e
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i8 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i8);
            }
            g gVar = this.f13164o;
            synchronized (gVar) {
                try {
                    j jVar = (j) gVar.f13171e.get(i8);
                    if (jVar == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i8);
                        return true;
                    }
                    gVar.f13171e.remove(i8);
                    gVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        jVar.c(new zzt(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    jVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    final Queue f13170d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    final SparseArray f13171e = new SparseArray();

    /* synthetic */ g(l lVar, q qVar) {
        this.f13172f = lVar;
    }

    final synchronized void a(int i8, String str) {
        b(i8, str, null);
    }

    final synchronized void b(int i8, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i9 = this.f13167a;
            if (i9 == 0) {
                throw new IllegalStateException();
            }
            if (i9 != 1 && i9 != 2) {
                if (i9 != 3) {
                    return;
                }
                this.f13167a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f13167a = 4;
            C5745b.b().c(this.f13172f.f13180a, this);
            zzt zztVar = new zzt(i8, str, th);
            Iterator it = this.f13170d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(zztVar);
            }
            this.f13170d.clear();
            for (int i10 = 0; i10 < this.f13171e.size(); i10++) {
                ((j) this.f13171e.valueAt(i10)).c(zztVar);
            }
            this.f13171e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void c() {
        this.f13172f.f13181b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.b
            @Override // java.lang.Runnable
            public final void run() {
                final j jVar;
                while (true) {
                    final g gVar = this.f13161o;
                    synchronized (gVar) {
                        try {
                            if (gVar.f13167a != 2) {
                                return;
                            }
                            if (gVar.f13170d.isEmpty()) {
                                gVar.f();
                                return;
                            } else {
                                jVar = (j) gVar.f13170d.poll();
                                gVar.f13171e.put(jVar.f13175a, jVar);
                                gVar.f13172f.f13181b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        gVar.e(jVar.f13175a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                    }
                    l lVar = gVar.f13172f;
                    Messenger messenger = gVar.f13168b;
                    int i8 = jVar.f13177c;
                    Context context = lVar.f13180a;
                    Message obtain = Message.obtain();
                    obtain.what = i8;
                    obtain.arg1 = jVar.f13175a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", jVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", jVar.f13178d);
                    obtain.setData(bundle);
                    try {
                        gVar.f13169c.a(obtain);
                    } catch (RemoteException e8) {
                        gVar.a(2, e8.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void d() {
        if (this.f13167a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i8) {
        j jVar = (j) this.f13171e.get(i8);
        if (jVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i8);
            this.f13171e.remove(i8);
            jVar.c(new zzt(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        try {
            if (this.f13167a == 2 && this.f13170d.isEmpty() && this.f13171e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f13167a = 3;
                C5745b.b().c(this.f13172f.f13180a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean g(j jVar) {
        int i8 = this.f13167a;
        if (i8 != 0) {
            if (i8 == 1) {
                this.f13170d.add(jVar);
                return true;
            }
            if (i8 != 2) {
                return false;
            }
            this.f13170d.add(jVar);
            c();
            return true;
        }
        this.f13170d.add(jVar);
        r.p(this.f13167a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f13167a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (C5745b.b().a(this.f13172f.f13180a, intent, this, 1)) {
                this.f13172f.f13181b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13162o.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e8) {
            b(0, "Unable to bind to service", e8);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f13172f.f13181b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.a
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = this.f13159o;
                IBinder iBinder2 = iBinder;
                synchronized (gVar) {
                    if (iBinder2 == null) {
                        gVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        gVar.f13169c = new h(iBinder2);
                        gVar.f13167a = 2;
                        gVar.c();
                    } catch (RemoteException e8) {
                        gVar.a(0, e8.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f13172f.f13181b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f13163o.a(2, "Service disconnected");
            }
        });
    }
}
