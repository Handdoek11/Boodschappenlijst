package W;

import android.graphics.Typeface;

/* loaded from: classes.dex */
final class v implements s {
    private final Typeface b(String str, o oVar, int i8) {
        if (m.d(i8, m.f5766a.b()) && J6.r.a(oVar, o.f5781s.a()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int c8 = d.c(oVar, i8);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(c8) : Typeface.create(str, c8);
    }

    @Override // W.s
    public Typeface a(o oVar, int i8) {
        return b(null, oVar, i8);
    }
}
