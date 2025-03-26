package e7;

import Z6.E;
import Z6.H;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f35355a = H.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* renamed from: b, reason: collision with root package name */
    private static final E f35356b = new E("PERMIT");

    /* renamed from: c, reason: collision with root package name */
    private static final E f35357c = new E("TAKEN");

    /* renamed from: d, reason: collision with root package name */
    private static final E f35358d = new E("BROKEN");

    /* renamed from: e, reason: collision with root package name */
    private static final E f35359e = new E("CANCELLED");

    /* renamed from: f, reason: collision with root package name */
    private static final int f35360f = H.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final f h(long j8, f fVar) {
        return new f(j8, fVar, 0);
    }
}
