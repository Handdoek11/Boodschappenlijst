package Y4;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6075a = new HashMap();

    protected abstract Object a(Object obj);

    public Object b(Object obj) {
        synchronized (this.f6075a) {
            try {
                if (this.f6075a.containsKey(obj)) {
                    return this.f6075a.get(obj);
                }
                Object a8 = a(obj);
                this.f6075a.put(obj, a8);
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
