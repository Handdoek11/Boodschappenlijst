package Y6;

import J6.r;
import java.util.Arrays;
import x6.C6916E;
import x6.C6934p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: o, reason: collision with root package name */
    private c[] f6136o;

    /* renamed from: s, reason: collision with root package name */
    private int f6137s;

    /* renamed from: t, reason: collision with root package name */
    private int f6138t;

    /* renamed from: u, reason: collision with root package name */
    private k f6139u;

    protected final c b() {
        c cVar;
        synchronized (this) {
            try {
                c[] cVarArr = this.f6136o;
                if (cVarArr == null) {
                    cVarArr = e(2);
                    this.f6136o = cVarArr;
                } else if (this.f6137s >= cVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                    r.d(copyOf, "copyOf(this, newSize)");
                    this.f6136o = (c[]) copyOf;
                    cVarArr = (c[]) copyOf;
                }
                int i8 = this.f6138t;
                do {
                    cVar = cVarArr[i8];
                    if (cVar == null) {
                        cVar = d();
                        cVarArr[i8] = cVar;
                    }
                    i8++;
                    if (i8 >= cVarArr.length) {
                        i8 = 0;
                    }
                    r.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!cVar.a(this));
                this.f6138t = i8;
                this.f6137s++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    protected abstract c d();

    protected abstract c[] e(int i8);

    protected final void f(c cVar) {
        int i8;
        A6.d[] b8;
        synchronized (this) {
            try {
                int i9 = this.f6137s - 1;
                this.f6137s = i9;
                if (i9 == 0) {
                    this.f6138t = 0;
                }
                r.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b8 = cVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (A6.d dVar : b8) {
            if (dVar != null) {
                C6934p.a aVar = C6934p.f44487s;
                dVar.resumeWith(C6934p.b(C6916E.f44463a));
            }
        }
    }

    protected final c[] g() {
        return this.f6136o;
    }
}
