package n3;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f39574a;

    public f(Looper looper) {
        super(looper);
        this.f39574a = Looper.getMainLooper();
    }

    public f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f39574a = Looper.getMainLooper();
    }
}
