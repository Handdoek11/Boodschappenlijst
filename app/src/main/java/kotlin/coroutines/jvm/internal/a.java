package kotlin.coroutines.jvm.internal;

import J6.r;
import java.io.Serializable;
import x6.C6934p;
import x6.q;

/* loaded from: classes2.dex */
public abstract class a implements A6.d, e, Serializable {
    private final A6.d completion;

    public a(A6.d dVar) {
        this.completion = dVar;
    }

    public A6.d create(A6.d dVar) {
        r.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        A6.d dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final A6.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // A6.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        A6.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            A6.d dVar2 = aVar.completion;
            r.b(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                C6934p.a aVar2 = C6934p.f44487s;
                obj = C6934p.b(q.a(th));
            }
            if (invokeSuspend == B6.b.e()) {
                return;
            }
            obj = C6934p.b(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public A6.d create(Object obj, A6.d dVar) {
        r.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
