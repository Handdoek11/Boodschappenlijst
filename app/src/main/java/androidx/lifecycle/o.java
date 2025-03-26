package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class o extends Service implements InterfaceC0927m {

    /* renamed from: o, reason: collision with root package name */
    private final F f10325o = new F(this);

    @Override // androidx.lifecycle.InterfaceC0927m
    public AbstractC0922h getLifecycle() {
        return this.f10325o.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        J6.r.e(intent, "intent");
        this.f10325o.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f10325o.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f10325o.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i8) {
        this.f10325o.e();
        super.onStart(intent, i8);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        return super.onStartCommand(intent, i8, i9);
    }
}
