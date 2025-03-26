package B3;

import A3.AbstractC0376j;
import B3.AbstractC0387f;
import B3.InterfaceC0382a;
import B3.InterfaceC0386e;
import B3.InterfaceC0388g;
import B3.InterfaceC0396o;
import C3.C0446n;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.util.List;

/* renamed from: B3.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC0403w extends Service implements InterfaceC0388g.b, InterfaceC0396o.a, InterfaceC0382a.InterfaceC0007a, InterfaceC0386e.a, InterfaceC0397p {

    /* renamed from: o, reason: collision with root package name */
    private ComponentName f483o;

    /* renamed from: s, reason: collision with root package name */
    private V f484s;

    /* renamed from: t, reason: collision with root package name */
    private IBinder f485t;

    /* renamed from: u, reason: collision with root package name */
    private Intent f486u;

    /* renamed from: v, reason: collision with root package name */
    private Looper f487v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f489x;

    /* renamed from: w, reason: collision with root package name */
    private final Object f488w = new Object();

    /* renamed from: y, reason: collision with root package name */
    private final C0446n f490y = new C0446n(new T(this, null));

    @Override // B3.InterfaceC0397p
    public AbstractC0376j c(String str, String str2, byte[] bArr) {
        return null;
    }

    @Override // B3.InterfaceC0388g.b
    public abstract void e(C0390i c0390i);

    public Looper i() {
        if (this.f487v == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f487v = handlerThread.getLooper();
        }
        return this.f487v;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.IBinder onBind(android.content.Intent r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L4
            goto L86
        L4:
            java.lang.String r0 = r4.getAction()
            if (r0 == 0) goto L86
            int r1 = r0.hashCode()
            r2 = 3
            switch(r1) {
                case -1487371046: goto L4f;
                case -1140095138: goto L45;
                case -786751258: goto L3b;
                case 705066793: goto L31;
                case 915816236: goto L27;
                case 1003809169: goto L1d;
                case 1460975593: goto L13;
                default: goto L12;
            }
        L12:
            goto L59
        L13:
            java.lang.String r1 = "com.google.android.gms.wearable.BIND_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 0
            goto L5a
        L1d:
            java.lang.String r1 = "com.google.android.gms.wearable.CHANNEL_EVENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = r2
            goto L5a
        L27:
            java.lang.String r1 = "com.google.android.gms.wearable.DATA_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L31:
            java.lang.String r1 = "com.google.android.gms.wearable.NODE_MIGRATED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 2
            goto L5a
        L3b:
            java.lang.String r1 = "com.google.android.gms.wearable.MESSAGE_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 5
            goto L5a
        L45:
            java.lang.String r1 = "com.google.android.gms.wearable.REQUEST_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 4
            goto L5a
        L4f:
            java.lang.String r1 = "com.google.android.gms.wearable.CAPABILITY_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 6
            goto L5a
        L59:
            r0 = -1
        L5a:
            switch(r0) {
                case 0: goto L83;
                case 1: goto L83;
                case 2: goto L83;
                case 3: goto L83;
                case 4: goto L83;
                case 5: goto L83;
                case 6: goto L83;
                default: goto L5d;
            }
        L5d:
            java.lang.String r0 = "WearableLS"
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto L86
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onBind: Provided bind intent ("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ") is not allowed"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.d(r0, r4)
            goto L86
        L83:
            android.os.IBinder r4 = r3.f485t
            return r4
        L86:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.AbstractServiceC0403w.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f483o = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.f483o)));
        }
        this.f484s = new V(this, i());
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.f486u = intent;
        intent.setComponent(this.f483o);
        this.f485t = new E(this, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.f483o)));
        }
        synchronized (this.f488w) {
            this.f489x = true;
            V v7 = this.f484s;
            if (v7 == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=" + String.valueOf(this.f483o));
            }
            v7.b();
        }
        super.onDestroy();
    }

    @Override // B3.InterfaceC0382a.InterfaceC0007a
    public void a(InterfaceC0384c interfaceC0384c) {
    }

    @Override // B3.InterfaceC0386e.a
    public void b(InterfaceC0385d interfaceC0385d) {
    }

    @Override // B3.InterfaceC0396o.a
    public void f(InterfaceC0398q interfaceC0398q) {
    }

    public void k(AbstractC0387f.a aVar) {
    }

    public void l(List list) {
    }

    public void m(InterfaceC0405y interfaceC0405y) {
    }

    public void p(G g8) {
    }

    public void r(r rVar) {
    }

    public void s(r rVar) {
    }

    public void o(String str, C0393l c0393l) {
    }

    @Override // B3.InterfaceC0386e.a
    public void d(InterfaceC0385d interfaceC0385d, int i8, int i9) {
    }

    @Override // B3.InterfaceC0386e.a
    public void g(InterfaceC0385d interfaceC0385d, int i8, int i9) {
    }

    @Override // B3.InterfaceC0386e.a
    public void h(InterfaceC0385d interfaceC0385d, int i8, int i9) {
    }

    public void j(AbstractC0387f.a aVar, int i8, int i9) {
    }

    public void n(AbstractC0387f.a aVar, int i8, int i9) {
    }

    public void q(AbstractC0387f.a aVar, int i8, int i9) {
    }
}
