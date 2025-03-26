package W0;

import I6.l;
import J6.r;
import J6.s;
import U6.U;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.d;
import java.util.concurrent.CancellationException;
import x6.C6916E;

/* loaded from: classes.dex */
public abstract class b {

    static final class a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ c.a f5806o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ U f5807s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a aVar, U u7) {
            super(1);
            this.f5806o = aVar;
            this.f5807s = u7;
        }

        public final void b(Throwable th) {
            if (th == null) {
                this.f5806o.b(this.f5807s.m());
            } else if (th instanceof CancellationException) {
                this.f5806o.c();
            } else {
                this.f5806o.e(th);
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    public static final d b(final U u7, final Object obj) {
        r.e(u7, "<this>");
        d a8 = c.a(new c.InterfaceC0149c() { // from class: W0.a
            @Override // androidx.concurrent.futures.c.InterfaceC0149c
            public final Object a(c.a aVar) {
                return b.d(u7, obj, aVar);
            }
        });
        r.d(a8, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a8;
    }

    public static /* synthetic */ d c(U u7, Object obj, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(u7, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(U u7, Object obj, c.a aVar) {
        r.e(u7, "$this_asListenableFuture");
        r.e(aVar, "completer");
        u7.D(new a(aVar, u7));
        return obj;
    }
}
