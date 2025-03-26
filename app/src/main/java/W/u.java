package W;

import W.m;
import android.graphics.Typeface;

/* loaded from: classes.dex */
final class u implements s {
    private final Typeface b(String str, o oVar, int i8) {
        m.a aVar = m.f5766a;
        if (m.d(i8, aVar.b()) && J6.r.a(oVar, o.f5781s.a()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), oVar.g(), m.d(i8, aVar.a()));
    }

    @Override // W.s
    public Typeface a(o oVar, int i8) {
        return b(null, oVar, i8);
    }
}
