package T1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import g.AbstractC5794a;
import o0.AbstractC6278a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f5173a = true;

    public static Drawable a(Context context, int i8, Resources.Theme theme) {
        return c(context, context, i8, theme);
    }

    public static Drawable b(Context context, Context context2, int i8) {
        return c(context, context2, i8, null);
    }

    private static Drawable c(Context context, Context context2, int i8, Resources.Theme theme) {
        try {
            if (f5173a) {
                return e(context2, i8, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e8) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e8;
            }
            return AbstractC6278a.e(context2, i8);
        } catch (NoClassDefFoundError unused2) {
            f5173a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i8, theme);
    }

    private static Drawable d(Context context, int i8, Resources.Theme theme) {
        return p0.h.e(context.getResources(), i8, theme);
    }

    private static Drawable e(Context context, int i8, Resources.Theme theme) {
        if (theme != null) {
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, theme);
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return AbstractC5794a.b(context, i8);
    }
}
