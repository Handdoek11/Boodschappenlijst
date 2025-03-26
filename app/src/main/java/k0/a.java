package K0;

import I6.l;
import J6.r;
import J6.s;
import U6.C0706b0;
import U6.M;
import U6.N;
import U6.Q0;
import android.content.Context;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0.a$a, reason: collision with other inner class name */
    public static final class C0059a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final C0059a f3587o = new C0059a();

        C0059a() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context context) {
            r.e(context, "it");
            return AbstractC6987o.e();
        }
    }

    public static final M6.a a(String str, J0.b bVar, l lVar, M m8) {
        r.e(str, "name");
        r.e(lVar, "produceMigrations");
        r.e(m8, "scope");
        return new c(str, bVar, lVar, m8);
    }

    public static /* synthetic */ M6.a b(String str, J0.b bVar, l lVar, M m8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bVar = null;
        }
        if ((i8 & 4) != 0) {
            lVar = C0059a.f3587o;
        }
        if ((i8 & 8) != 0) {
            m8 = N.a(C0706b0.b().u(Q0.b(null, 1, null)));
        }
        return a(str, bVar, lVar, m8);
    }
}
