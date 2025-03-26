package G2;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.HandlerC1968Yd0;

/* renamed from: G2.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0610q0 extends HandlerC1968Yd0 {
    public HandlerC0610q0(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.HandlerC1968Yd0
    protected final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            C2.v.t();
            D0.n(C2.v.s().e(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e8) {
            C2.v.s().x(e8, "AdMobHandler.handleMessage");
        }
    }
}
