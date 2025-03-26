package com.google.firebase.sessions;

import J6.AbstractC0650j;
import J6.r;
import T4.f;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.c;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: u, reason: collision with root package name */
    public static final a f33039u = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final HandlerThread f33040o = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: s, reason: collision with root package name */
    private b f33041s;

    /* renamed from: t, reason: collision with root package name */
    private Messenger f33042t;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33043a;

        /* renamed from: b, reason: collision with root package name */
        private long f33044b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f33045c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            r.e(looper, "looper");
            this.f33045c = new ArrayList();
        }

        private final void a() {
            Log.d("SessionLifecycleService", "Broadcasting new session");
            com.google.firebase.sessions.b.f33048a.a().a(c.f33050f.a().c());
            for (Messenger messenger : new ArrayList(this.f33045c)) {
                r.d(messenger, "it");
                f(messenger);
            }
        }

        private final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f33044b = message.getWhen();
        }

        private final void c(Message message) {
            this.f33045c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            r.d(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f33045c.size());
        }

        private final void d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f33043a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f33043a = true;
                g();
            } else if (e(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                g();
            }
            this.f33044b = message.getWhen();
        }

        private final boolean e(long j8) {
            return j8 - this.f33044b > T6.a.t(f.f5232c.c().c());
        }

        private final void f(Messenger messenger) {
            if (this.f33043a) {
                h(messenger, c.f33050f.a().c().b());
                return;
            }
            String a8 = com.google.firebase.sessions.a.f33046a.a().a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
            if (a8 != null) {
                h(messenger, a8);
            }
        }

        private final void g() {
            c.b bVar = c.f33050f;
            bVar.a().a();
            Log.d("SessionLifecycleService", "Generated new session.");
            a();
            com.google.firebase.sessions.a.f33046a.a().b(bVar.a().c().b());
        }

        private final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f33045c.remove(messenger);
            } catch (Exception e8) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e8);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            r.e(message, "msg");
            if (this.f33044b > message.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.f33044b + '.');
                return;
            }
            int i8 = message.what;
            if (i8 == 1) {
                d(message);
                return;
            }
            if (i8 == 2) {
                b(message);
                return;
            }
            if (i8 == 4) {
                c(message);
                return;
            }
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
            super.handleMessage(message);
        }
    }

    private final Messenger a(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger a8 = a(intent);
        if (a8 != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = a8;
            b bVar = this.f33041s;
            if (bVar != null) {
                bVar.sendMessage(obtain);
            }
        }
        Messenger messenger = this.f33042t;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f33040o.start();
        Looper looper = this.f33040o.getLooper();
        r.d(looper, "handlerThread.looper");
        this.f33041s = new b(looper);
        this.f33042t = new Messenger(this.f33041s);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f33040o.quit();
    }
}
