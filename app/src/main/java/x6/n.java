package X6;

import J6.r;
import Z6.E;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x6.C6916E;

/* loaded from: classes2.dex */
final class n extends Y6.a implements k, b {

    /* renamed from: w, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6027w = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: v, reason: collision with root package name */
    private int f6028v;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f6029o;

        /* renamed from: s, reason: collision with root package name */
        Object f6030s;

        /* renamed from: t, reason: collision with root package name */
        Object f6031t;

        /* renamed from: u, reason: collision with root package name */
        Object f6032u;

        /* renamed from: v, reason: collision with root package name */
        Object f6033v;

        /* renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f6034w;

        /* renamed from: y, reason: collision with root package name */
        int f6036y;

        a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6034w = obj;
            this.f6036y |= Integer.MIN_VALUE;
            return n.this.a(null, this);
        }
    }

    public n(Object obj) {
        this._state = obj;
    }

    private final boolean j(Object obj, Object obj2) {
        int i8;
        Y6.c[] g8;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6027w;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !r.a(obj3, obj)) {
                return false;
            }
            if (r.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i9 = this.f6028v;
            if ((i9 & 1) != 0) {
                this.f6028v = i9 + 2;
                return true;
            }
            int i10 = i9 + 1;
            this.f6028v = i10;
            Y6.c[] g9 = g();
            C6916E c6916e = C6916E.f44463a;
            while (true) {
                p[] pVarArr = (p[]) g9;
                if (pVarArr != null) {
                    for (p pVar : pVarArr) {
                        if (pVar != null) {
                            pVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i8 = this.f6028v;
                    if (i8 == i10) {
                        this.f6028v = i10 + 1;
                        return true;
                    }
                    g8 = g();
                    C6916E c6916e2 = C6916E.f44463a;
                }
                g9 = g8;
                i10 = i8;
            }
        }
    }

    /* JADX WARN: Path cross not found for [B:33:0x009c, B:35:0x00a2], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a2, B:33:0x009c], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c1 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d3 -> B:29:0x008f). Please report as a decompilation issue!!! */
    @Override // X6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(X6.c r11, A6.d r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.n.a(X6.c, A6.d):java.lang.Object");
    }

    @Override // X6.c
    public Object c(Object obj, A6.d dVar) {
        setValue(obj);
        return C6916E.f44463a;
    }

    @Override // X6.k
    public Object getValue() {
        E e8 = Y6.g.f6145a;
        Object obj = f6027w.get(this);
        if (obj == e8) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y6.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public p d() {
        return new p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y6.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public p[] e(int i8) {
        return new p[i8];
    }

    @Override // X6.k
    public void setValue(Object obj) {
        if (obj == null) {
            obj = Y6.g.f6145a;
        }
        j(null, obj);
    }
}
