package z0;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: z0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7008L {

    /* renamed from: a, reason: collision with root package name */
    private final PointerIcon f44684a;

    /* renamed from: z0.L$a */
    static class a {
        static PointerIcon a(Context context, int i8) {
            return PointerIcon.getSystemIcon(context, i8);
        }
    }

    private C7008L(PointerIcon pointerIcon) {
        this.f44684a = pointerIcon;
    }

    public static C7008L b(Context context, int i8) {
        return Build.VERSION.SDK_INT >= 24 ? new C7008L(a.a(context, i8)) : new C7008L(null);
    }

    public Object a() {
        return this.f44684a;
    }
}
