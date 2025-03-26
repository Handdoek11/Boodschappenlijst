package Z2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class g0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f6354a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC0765d f6355b;

    public g0(AbstractC0765d abstractC0765d, int i8) {
        this.f6355b = abstractC0765d;
        this.f6354a = i8;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC0765d abstractC0765d = this.f6355b;
        if (iBinder == null) {
            AbstractC0765d.d0(abstractC0765d, 16);
            return;
        }
        synchronized (abstractC0765d.f6297n) {
            try {
                AbstractC0765d abstractC0765d2 = this.f6355b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0765d2.f6298o = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0774m)) ? new W(iBinder) : (InterfaceC0774m) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6355b.e0(0, null, this.f6354a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6355b.f6297n) {
            this.f6355b.f6298o = null;
        }
        AbstractC0765d abstractC0765d = this.f6355b;
        int i8 = this.f6354a;
        Handler handler = abstractC0765d.f6295l;
        handler.sendMessage(handler.obtainMessage(6, i8, 1));
    }
}
