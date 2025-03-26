package Z2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class r0 implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ s0 f6401o;

    /* synthetic */ r0(s0 s0Var, q0 q0Var) {
        this.f6401o = s0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 0) {
            synchronized (this.f6401o.f6405f) {
                try {
                    n0 n0Var = (n0) message.obj;
                    p0 p0Var = (p0) this.f6401o.f6405f.get(n0Var);
                    if (p0Var != null && p0Var.i()) {
                        if (p0Var.j()) {
                            p0Var.g("GmsClientSupervisor");
                        }
                        this.f6401o.f6405f.remove(n0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i8 != 1) {
            return false;
        }
        synchronized (this.f6401o.f6405f) {
            try {
                n0 n0Var2 = (n0) message.obj;
                p0 p0Var2 = (p0) this.f6401o.f6405f.get(n0Var2);
                if (p0Var2 != null && p0Var2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(n0Var2), new Exception());
                    ComponentName b8 = p0Var2.b();
                    if (b8 == null) {
                        b8 = n0Var2.a();
                    }
                    if (b8 == null) {
                        String c8 = n0Var2.c();
                        r.l(c8);
                        b8 = new ComponentName(c8, "unknown");
                    }
                    p0Var2.onServiceDisconnected(b8);
                }
            } finally {
            }
        }
        return true;
    }
}
