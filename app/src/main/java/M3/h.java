package m3;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class h extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f38965a;

    public h(Looper looper) {
        super(looper);
        this.f38965a = Looper.getMainLooper();
    }

    public h(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f38965a = Looper.getMainLooper();
    }
}
