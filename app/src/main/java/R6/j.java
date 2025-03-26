package R6;

import J6.r;
import J6.s;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class j extends i {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f4955a;

        public a(Iterator it) {
            this.f4955a = it;
        }

        @Override // R6.d
        public Iterator iterator() {
            return this.f4955a;
        }
    }

    static final class b extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ I6.a f4956o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(I6.a aVar) {
            super(1);
            this.f4956o = aVar;
        }

        @Override // I6.l
        public final Object invoke(Object obj) {
            r.e(obj, "it");
            return this.f4956o.invoke();
        }
    }

    static final class c extends s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object f4957o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(0);
            this.f4957o = obj;
        }

        @Override // I6.a
        public final Object invoke() {
            return this.f4957o;
        }
    }

    public static d c(Iterator it) {
        r.e(it, "<this>");
        return d(new a(it));
    }

    public static final d d(d dVar) {
        r.e(dVar, "<this>");
        return dVar instanceof R6.a ? dVar : new R6.a(dVar);
    }

    public static d e(I6.a aVar) {
        r.e(aVar, "nextFunction");
        return d(new R6.c(aVar, new b(aVar)));
    }

    public static d f(Object obj, I6.l lVar) {
        r.e(lVar, "nextFunction");
        return obj == null ? R6.b.f4944a : new R6.c(new c(obj), lVar);
    }
}
