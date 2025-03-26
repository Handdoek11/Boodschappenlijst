package Z;

import U.a;
import W.g;
import a0.AbstractC0802a;
import android.text.SpannableString;
import androidx.appcompat.app.E;
import c0.InterfaceC0973e;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    private static final void a(SpannableString spannableString, U.d dVar, int i8, int i9, InterfaceC0973e interfaceC0973e, g.a aVar) {
        throw null;
    }

    public static final SpannableString b(U.a aVar, InterfaceC0973e interfaceC0973e, g.a aVar2, e eVar) {
        SpannableString spannableString = new SpannableString(aVar.d());
        List c8 = aVar.c();
        if (c8 != null) {
            int size = c8.size();
            for (int i8 = 0; i8 < size; i8++) {
                a.C0108a c0108a = (a.C0108a) c8.get(i8);
                E.a(c0108a.a());
                int b8 = c0108a.b();
                int c9 = c0108a.c();
                U.d.a(null, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null);
                a(spannableString, null, b8, c9, interfaceC0973e, aVar2);
            }
        }
        List e8 = aVar.e(0, aVar.length());
        int size2 = e8.size();
        for (int i9 = 0; i9 < size2; i9++) {
            a.C0108a c0108a2 = (a.C0108a) e8.get(i9);
            E.a(c0108a2.a());
            spannableString.setSpan(AbstractC0802a.a(null), c0108a2.b(), c0108a2.c(), 33);
        }
        List f8 = aVar.f(0, aVar.length());
        if (f8.size() <= 0) {
            return spannableString;
        }
        a.C0108a c0108a3 = (a.C0108a) f8.get(0);
        E.a(c0108a3.a());
        c0108a3.b();
        c0108a3.c();
        throw null;
    }
}
