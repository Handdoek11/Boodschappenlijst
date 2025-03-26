package V2;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class i extends n3.f {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f5577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(c cVar, Looper looper) {
        super(looper);
        this.f5577b = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.g(this.f5577b, message);
    }
}
