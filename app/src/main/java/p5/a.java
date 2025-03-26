package P5;

import J6.r;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y6.AbstractC6971J;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4409a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "current");
    private volatile /* synthetic */ Object current = AbstractC6971J.e();

    public final Object a(Object obj) {
        r.e(obj, "key");
        return ((Map) this.current).get(obj);
    }
}
