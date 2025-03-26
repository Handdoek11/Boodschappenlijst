package Z2;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C1103b;

/* loaded from: classes.dex */
final class d0 extends o3.e {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC0765d f6311b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(AbstractC0765d abstractC0765d, Looper looper) {
        super(looper);
        this.f6311b = abstractC0765d;
    }

    private static final void a(Message message) {
        e0 e0Var = (e0) message.obj;
        e0Var.b();
        e0Var.e();
    }

    private static final boolean b(Message message) {
        int i8 = message.what;
        return i8 == 2 || i8 == 1 || i8 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f6311b.f6283C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i8 = message.what;
        if ((i8 == 1 || i8 == 7 || ((i8 == 4 && !this.f6311b.t()) || message.what == 5)) && !this.f6311b.e()) {
            a(message);
            return;
        }
        int i9 = message.what;
        if (i9 == 4) {
            this.f6311b.f6309z = new C1103b(message.arg2);
            if (AbstractC0765d.h0(this.f6311b)) {
                AbstractC0765d abstractC0765d = this.f6311b;
                if (!abstractC0765d.f6281A) {
                    abstractC0765d.i0(3, null);
                    return;
                }
            }
            AbstractC0765d abstractC0765d2 = this.f6311b;
            C1103b c1103b = abstractC0765d2.f6309z != null ? abstractC0765d2.f6309z : new C1103b(8);
            this.f6311b.f6299p.a(c1103b);
            this.f6311b.L(c1103b);
            return;
        }
        if (i9 == 5) {
            AbstractC0765d abstractC0765d3 = this.f6311b;
            C1103b c1103b2 = abstractC0765d3.f6309z != null ? abstractC0765d3.f6309z : new C1103b(8);
            this.f6311b.f6299p.a(c1103b2);
            this.f6311b.L(c1103b2);
            return;
        }
        if (i9 == 3) {
            Object obj = message.obj;
            C1103b c1103b3 = new C1103b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f6311b.f6299p.a(c1103b3);
            this.f6311b.L(c1103b3);
            return;
        }
        if (i9 == 6) {
            this.f6311b.i0(5, null);
            AbstractC0765d abstractC0765d4 = this.f6311b;
            if (abstractC0765d4.f6304u != null) {
                abstractC0765d4.f6304u.w0(message.arg2);
            }
            this.f6311b.M(message.arg2);
            AbstractC0765d.g0(this.f6311b, 5, 1, null);
            return;
        }
        if (i9 == 2 && !this.f6311b.h()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((e0) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
