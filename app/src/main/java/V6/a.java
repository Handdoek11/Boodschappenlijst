package V6;

import U6.G0;
import Z6.s;
import android.os.Looper;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements s {
    @Override // Z6.s
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // Z6.s
    public G0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // Z6.s
    public int c() {
        return 1073741823;
    }
}
