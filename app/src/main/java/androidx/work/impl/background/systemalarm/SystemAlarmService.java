package androidx.work.impl.background.systemalarm;

import B1.n;
import android.content.Intent;
import androidx.lifecycle.o;
import androidx.work.impl.background.systemalarm.e;
import s1.j;

/* loaded from: classes.dex */
public class SystemAlarmService extends o implements e.c {

    /* renamed from: u, reason: collision with root package name */
    private static final String f11849u = j.f("SystemAlarmService");

    /* renamed from: s, reason: collision with root package name */
    private e f11850s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f11851t;

    private void e() {
        e eVar = new e(this);
        this.f11850s = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void a() {
        this.f11851t = true;
        j.c().a(f11849u, "All commands completed in dispatcher", new Throwable[0]);
        n.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f11851t = false;
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f11851t = true;
        this.f11850s.j();
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        super.onStartCommand(intent, i8, i9);
        if (this.f11851t) {
            j.c().d(f11849u, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f11850s.j();
            e();
            this.f11851t = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f11850s.a(intent, i9);
        return 3;
    }
}
