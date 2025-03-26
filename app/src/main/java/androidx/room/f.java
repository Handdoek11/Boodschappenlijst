package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import androidx.room.c;
import androidx.room.e;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    final Context f11336a;

    /* renamed from: b, reason: collision with root package name */
    final String f11337b;

    /* renamed from: c, reason: collision with root package name */
    int f11338c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.room.e f11339d;

    /* renamed from: e, reason: collision with root package name */
    final e.c f11340e;

    /* renamed from: f, reason: collision with root package name */
    androidx.room.c f11341f;

    /* renamed from: g, reason: collision with root package name */
    final Executor f11342g;

    /* renamed from: h, reason: collision with root package name */
    final androidx.room.b f11343h = new a();

    /* renamed from: i, reason: collision with root package name */
    final AtomicBoolean f11344i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    final ServiceConnection f11345j;

    /* renamed from: k, reason: collision with root package name */
    final Runnable f11346k;

    /* renamed from: l, reason: collision with root package name */
    final Runnable f11347l;

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f11348m;

    class a extends b.a {

        /* renamed from: androidx.room.f$a$a, reason: collision with other inner class name */
        class RunnableC0186a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ String[] f11350o;

            RunnableC0186a(String[] strArr) {
                this.f11350o = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f11339d.e(this.f11350o);
            }
        }

        a() {
        }

        @Override // androidx.room.b
        public void G1(String[] strArr) {
            f.this.f11342g.execute(new RunnableC0186a(strArr));
        }
    }

    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.this.f11341f = c.a.w0(iBinder);
            f fVar = f.this;
            fVar.f11342g.execute(fVar.f11346k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f fVar = f.this;
            fVar.f11342g.execute(fVar.f11347l);
            f.this.f11341f = null;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f11341f;
                if (cVar != null) {
                    fVar.f11338c = cVar.t2(fVar.f11343h, fVar.f11337b);
                    f fVar2 = f.this;
                    fVar2.f11339d.a(fVar2.f11340e);
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e8);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f11339d.g(fVar.f11340e);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f11339d.g(fVar.f11340e);
            try {
                f fVar2 = f.this;
                androidx.room.c cVar = fVar2.f11341f;
                if (cVar != null) {
                    cVar.X6(fVar2.f11343h, fVar2.f11338c);
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e8);
            }
            f fVar3 = f.this;
            fVar3.f11336a.unbindService(fVar3.f11345j);
        }
    }

    /* renamed from: androidx.room.f$f, reason: collision with other inner class name */
    class C0187f extends e.c {
        C0187f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.e.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.e.c
        public void b(Set set) {
            if (f.this.f11344i.get()) {
                return;
            }
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f11341f;
                if (cVar != null) {
                    cVar.z6(fVar.f11338c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot broadcast invalidation", e8);
            }
        }
    }

    f(Context context, String str, androidx.room.e eVar, Executor executor) {
        b bVar = new b();
        this.f11345j = bVar;
        this.f11346k = new c();
        this.f11347l = new d();
        this.f11348m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f11336a = applicationContext;
        this.f11337b = str;
        this.f11339d = eVar;
        this.f11342g = executor;
        this.f11340e = new C0187f((String[]) eVar.f11313a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
