package R6;

import I6.p;
import J6.r;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class h {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f4954a;

        public a(p pVar) {
            this.f4954a = pVar;
        }

        @Override // R6.d
        public Iterator iterator() {
            return h.a(this.f4954a);
        }
    }

    public static final Iterator a(p pVar) {
        r.e(pVar, "block");
        e eVar = new e();
        eVar.i(B6.b.a(pVar, eVar, eVar));
        return eVar;
    }

    public static d b(p pVar) {
        r.e(pVar, "block");
        return new a(pVar);
    }
}
