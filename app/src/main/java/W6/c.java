package W6;

import I6.p;
import J6.o;
import U6.InterfaceC0731o;
import Z6.E;
import Z6.H;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final h f5849a = new h(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f5850b = H.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f5851c = H.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* renamed from: d, reason: collision with root package name */
    public static final E f5852d = new E("BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    private static final E f5853e = new E("SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    private static final E f5854f = new E("S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    private static final E f5855g = new E("RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    private static final E f5856h = new E("POISONED");

    /* renamed from: i, reason: collision with root package name */
    private static final E f5857i = new E("DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    private static final E f5858j = new E("INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    private static final E f5859k = new E("INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    private static final E f5860l = new E("CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    private static final E f5861m = new E("SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    private static final E f5862n = new E("SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    private static final E f5863o = new E("FAILED");

    /* renamed from: p, reason: collision with root package name */
    private static final E f5864p = new E("NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    private static final E f5865q = new E("CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    private static final E f5866r = new E("CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    private static final E f5867s = new E("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends o implements p {

        /* renamed from: A, reason: collision with root package name */
        public static final a f5868A = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).longValue(), (h) obj2);
        }

        public final h j(long j8, h hVar) {
            return c.x(j8, hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i8) {
        if (i8 == 0) {
            return 0L;
        }
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC0731o interfaceC0731o, Object obj, I6.l lVar) {
        Object l8 = interfaceC0731o.l(obj, null, lVar);
        if (l8 == null) {
            return false;
        }
        interfaceC0731o.r(l8);
        return true;
    }

    static /* synthetic */ boolean C(InterfaceC0731o interfaceC0731o, Object obj, I6.l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            lVar = null;
        }
        return B(interfaceC0731o, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j8, boolean z7) {
        return (z7 ? 4611686018427387904L : 0L) + j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j8, int i8) {
        return (i8 << 60) + j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h x(long j8, h hVar) {
        return new h(j8, hVar, hVar.u(), 0);
    }

    public static final Q6.e y() {
        return a.f5868A;
    }

    public static final E z() {
        return f5860l;
    }
}
