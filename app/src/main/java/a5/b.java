package A5;

import B5.t;
import E5.d;
import I6.l;
import J6.r;
import J6.s;
import N5.x;
import io.ktor.utils.io.c;
import io.ktor.utils.io.e;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public abstract class b {

    static final class a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ d f240o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.f240o = dVar;
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            return (th != null ? x.a(th) : null) instanceof SocketTimeoutException ? t.b(this.f240o, th) : th;
        }
    }

    public static final c a(d dVar) {
        r.e(dVar, "request");
        return e.d(false, new a(dVar), 1, null);
    }
}
