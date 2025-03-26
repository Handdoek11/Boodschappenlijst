package G2;

import android.graphics.Bitmap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    final Map f2606a = new ConcurrentHashMap();

    public W() {
        new AtomicInteger(0);
    }

    public final Bitmap a(Integer num) {
        return (Bitmap) this.f2606a.get(num);
    }
}
