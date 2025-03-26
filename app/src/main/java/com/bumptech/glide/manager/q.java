package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.manager.b;
import d2.AbstractC5704f;
import d2.AbstractC5710l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class q {

    /* renamed from: d, reason: collision with root package name */
    private static volatile q f12999d;

    /* renamed from: a, reason: collision with root package name */
    private final c f13000a;

    /* renamed from: b, reason: collision with root package name */
    final Set f13001b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f13002c;

    class a implements AbstractC5704f.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f13003a;

        a(Context context) {
            this.f13003a = context;
        }

        @Override // d2.AbstractC5704f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f13003a.getSystemService("connectivity");
        }
    }

    class b implements b.a {
        b() {
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z7) {
            ArrayList arrayList;
            AbstractC5710l.a();
            synchronized (q.this) {
                arrayList = new ArrayList(q.this.f13001b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z7);
            }
        }
    }

    private interface c {
        boolean a();

        void b();
    }

    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        boolean f13006a;

        /* renamed from: b, reason: collision with root package name */
        final b.a f13007b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC5704f.b f13008c;

        /* renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f13009d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: com.bumptech.glide.manager.q$d$a$a, reason: collision with other inner class name */
            class RunnableC0223a implements Runnable {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ boolean f13011o;

                RunnableC0223a(boolean z7) {
                    this.f13011o = z7;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f13011o);
                }
            }

            a() {
            }

            private void b(boolean z7) {
                AbstractC5710l.v(new RunnableC0223a(z7));
            }

            void a(boolean z7) {
                AbstractC5710l.a();
                d dVar = d.this;
                boolean z8 = dVar.f13006a;
                dVar.f13006a = z7;
                if (z8 != z7) {
                    dVar.f13007b.a(z7);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(AbstractC5704f.b bVar, b.a aVar) {
            this.f13008c = bVar;
            this.f13007b = aVar;
        }

        @Override // com.bumptech.glide.manager.q.c
        public boolean a() {
            this.f13006a = ((ConnectivityManager) this.f13008c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f13008c.get()).registerDefaultNetworkCallback(this.f13009d);
                return true;
            } catch (RuntimeException e8) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e8);
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.q.c
        public void b() {
            ((ConnectivityManager) this.f13008c.get()).unregisterNetworkCallback(this.f13009d);
        }
    }

    private static final class e implements c {

        /* renamed from: g, reason: collision with root package name */
        static final Executor f13013g = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: a, reason: collision with root package name */
        final Context f13014a;

        /* renamed from: b, reason: collision with root package name */
        final b.a f13015b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC5704f.b f13016c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f13017d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f13018e;

        /* renamed from: f, reason: collision with root package name */
        final BroadcastReceiver f13019f = new a();

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                e.this.e();
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f13017d = eVar.c();
                try {
                    e eVar2 = e.this;
                    eVar2.f13014a.registerReceiver(eVar2.f13019f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.f13018e = true;
                } catch (SecurityException e8) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e8);
                    }
                    e.this.f13018e = false;
                }
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f13018e) {
                    e.this.f13018e = false;
                    e eVar = e.this;
                    eVar.f13014a.unregisterReceiver(eVar.f13019f);
                }
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z7 = e.this.f13017d;
                e eVar = e.this;
                eVar.f13017d = eVar.c();
                if (z7 != e.this.f13017d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f13017d);
                    }
                    e eVar2 = e.this;
                    eVar2.d(eVar2.f13017d);
                }
            }
        }

        /* renamed from: com.bumptech.glide.manager.q$e$e, reason: collision with other inner class name */
        class RunnableC0224e implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f13024o;

            RunnableC0224e(boolean z7) {
                this.f13024o = z7;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f13015b.a(this.f13024o);
            }
        }

        e(Context context, AbstractC5704f.b bVar, b.a aVar) {
            this.f13014a = context.getApplicationContext();
            this.f13016c = bVar;
            this.f13015b = aVar;
        }

        @Override // com.bumptech.glide.manager.q.c
        public boolean a() {
            f13013g.execute(new b());
            return true;
        }

        @Override // com.bumptech.glide.manager.q.c
        public void b() {
            f13013g.execute(new c());
        }

        boolean c() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f13016c.get()).getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e8) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e8);
                }
                return true;
            }
        }

        void d(boolean z7) {
            AbstractC5710l.v(new RunnableC0224e(z7));
        }

        void e() {
            f13013g.execute(new d());
        }
    }

    private q(Context context) {
        AbstractC5704f.b a8 = AbstractC5704f.a(new a(context));
        b bVar = new b();
        this.f13000a = Build.VERSION.SDK_INT >= 24 ? new d(a8, bVar) : new e(context, a8, bVar);
    }

    static q a(Context context) {
        if (f12999d == null) {
            synchronized (q.class) {
                try {
                    if (f12999d == null) {
                        f12999d = new q(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f12999d;
    }

    private void b() {
        if (this.f13002c || this.f13001b.isEmpty()) {
            return;
        }
        this.f13002c = this.f13000a.a();
    }

    private void c() {
        if (this.f13002c && this.f13001b.isEmpty()) {
            this.f13000a.b();
            this.f13002c = false;
        }
    }

    synchronized void d(b.a aVar) {
        this.f13001b.add(aVar);
        b();
    }

    synchronized void e(b.a aVar) {
        this.f13001b.remove(aVar);
        c();
    }
}
