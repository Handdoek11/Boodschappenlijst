package B3;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.wearable.y1;

/* loaded from: classes2.dex */
final class V extends y1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f442a;

    /* renamed from: b, reason: collision with root package name */
    private final U f443b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractServiceC0403w f444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V(AbstractServiceC0403w abstractServiceC0403w, Looper looper) {
        super(looper);
        this.f444c = abstractServiceC0403w;
        this.f443b = new U(abstractServiceC0403w, null);
    }

    private final synchronized void c() {
        try {
            if (this.f442a) {
                return;
            }
            if (Log.isLoggable("WearableLS", 2)) {
                Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.f444c.f483o)));
            }
            AbstractServiceC0403w abstractServiceC0403w = this.f444c;
            abstractServiceC0403w.bindService(abstractServiceC0403w.f486u, this.f443b, 1);
            this.f442a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void d(String str) {
        if (this.f442a) {
            if (Log.isLoggable("WearableLS", 2)) {
                Log.v("WearableLS", "unbindService: " + str + ", " + String.valueOf(this.f444c.f483o));
            }
            try {
                this.f444c.unbindService(this.f443b);
            } catch (RuntimeException e8) {
                Log.e("WearableLS", "Exception when unbinding from local service", e8);
            }
            this.f442a = false;
        }
    }

    @Override // com.google.android.gms.internal.wearable.y1
    protected final void a(Message message) {
        c();
        try {
            super.a(message);
            if (hasMessages(0)) {
                return;
            }
            d("dispatch");
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                d("dispatch");
            }
            throw th;
        }
    }

    final void b() {
        getLooper().quit();
        d("quit");
    }
}
