package Z6;

import kotlinx.coroutines.internal.UndeliveredElementException;
import x6.AbstractC6923e;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class w {

    static final class a extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ I6.l f6508o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f6509s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ A6.g f6510t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I6.l lVar, Object obj, A6.g gVar) {
            super(1);
            this.f6508o = lVar;
            this.f6509s = obj;
            this.f6510t = gVar;
        }

        public final void b(Throwable th) {
            w.b(this.f6508o, this.f6509s, this.f6510t);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    public static final I6.l a(I6.l lVar, Object obj, A6.g gVar) {
        return new a(lVar, obj, gVar);
    }

    public static final void b(I6.l lVar, Object obj, A6.g gVar) {
        UndeliveredElementException c8 = c(lVar, obj, null);
        if (c8 != null) {
            U6.K.a(gVar, c8);
        }
    }

    public static final UndeliveredElementException c(I6.l lVar, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC6923e.a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(I6.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}
