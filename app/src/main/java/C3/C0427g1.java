package C3;

import X2.InterfaceC0755c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;

/* renamed from: C3.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0427g1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f961a = new HashMap();

    C0427g1() {
    }

    public final void a(Z1 z12, InterfaceC0755c interfaceC0755c, Object obj, g2 g2Var) {
        synchronized (this.f961a) {
            try {
                if (this.f961a.get(obj) != null) {
                    if (Log.isLoggable("WearableClient", 2)) {
                        Log.v("WearableClient", "duplicate listener: " + String.valueOf(obj));
                    }
                    interfaceC0755c.a(new Status(4001));
                    return;
                }
                if (Log.isLoggable("WearableClient", 2)) {
                    Log.v("WearableClient", "new listener: " + String.valueOf(obj));
                }
                this.f961a.put(obj, g2Var);
                try {
                    ((C0415c1) z12.D()).p2(new BinderC0421e1(this.f961a, obj, interfaceC0755c), new K0(g2Var));
                } catch (RemoteException e8) {
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "addListener failed, removing listener: " + String.valueOf(obj));
                    }
                    this.f961a.remove(obj);
                    throw e8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(IBinder iBinder) {
        C0415c1 c0415c1;
        synchronized (this.f961a) {
            if (iBinder == null) {
                c0415c1 = null;
            } else {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                    c0415c1 = queryLocalInterface instanceof C0415c1 ? (C0415c1) queryLocalInterface : new C0415c1(iBinder);
                } catch (Throwable th) {
                    throw th;
                }
            }
            U1 u12 = new U1();
            for (Map.Entry entry : this.f961a.entrySet()) {
                g2 g2Var = (g2) entry.getValue();
                try {
                    c0415c1.p2(u12, new K0(g2Var));
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "onPostInitHandler: added: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(g2Var));
                    }
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(g2Var));
                }
            }
        }
    }

    public final void c(Z1 z12, InterfaceC0755c interfaceC0755c, Object obj) {
        synchronized (this.f961a) {
            try {
                g2 g2Var = (g2) this.f961a.remove(obj);
                if (g2Var == null) {
                    if (Log.isLoggable("WearableClient", 2)) {
                        Log.v("WearableClient", "remove Listener unknown: " + String.valueOf(obj));
                    }
                    interfaceC0755c.a(new Status(4002));
                    return;
                }
                g2Var.t();
                if (Log.isLoggable("WearableClient", 2)) {
                    Log.v("WearableClient", "service.removeListener: " + String.valueOf(obj));
                }
                ((C0415c1) z12.D()).t7(new BinderC0424f1(this.f961a, obj, interfaceC0755c), new C0483z1(g2Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
