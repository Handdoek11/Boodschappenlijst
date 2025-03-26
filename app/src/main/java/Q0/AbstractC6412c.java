package q0;

import android.graphics.Paint;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6412c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f40901a = new ThreadLocal();

    /* renamed from: q0.c$a */
    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }
}
